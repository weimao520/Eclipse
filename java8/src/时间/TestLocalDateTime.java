package 时间;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Comparator;

import org.junit.Test;

public class TestLocalDateTime {
	
	
	
	/**
	 *  时间 校正器 TemporalAdjuster
	 *  
	 */
	@Test
	public void TestTemporalAdjuster() {
		//下周日
		LocalDateTime i=LocalDateTime.now().with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		System.out.println(i);
		
		 
		
	}
	
	
	/**
	 * Duration  : 计算两个时间之间的间隔
	 * Period : 计算 两个日期之间的间隔
	 * @throws InterruptedException 
	 */
	@Test
	public void TestDiffer() throws InterruptedException {
		Instant i=Instant.now();
			Thread.sleep(1000);
		Instant i2=Instant.now();
		
		System.out.println(Duration.between(i, i2).toDays());
		
		
		LocalDate ld=LocalDate.of(2018, 12, 31);
		LocalDate ld2=LocalDate.now();
		System.out.println(Period.between(ld, ld2).getDays());
		
		
		
	}
	
	/**
	 * 时间 戳
	 */
	@Test
	public void TestInstant() {
		Instant i=Instant.now();// 默认获取UTC时区
		System.out.println(i);
		
		
		
		
		
	}
	
	
		public static void main(String[] args) {
			// 获取当前时间
			LocalDateTime ldt=LocalDateTime.now();
			System.out.println(ldt);
			
			// 换取指定时间
			LocalDateTime ldt2=LocalDateTime.of(2017, 9, 29, 12, 0);
			System.out.println(ldt2);

			// 加时间 plus
			System.out.println(ldt2.plusMonths(6));
			// 减 minus
		}

}
