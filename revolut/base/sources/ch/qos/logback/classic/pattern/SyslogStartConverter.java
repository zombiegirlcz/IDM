package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.util.LevelToSyslogSeverity;
import ch.qos.logback.core.net.SyslogAppenderBase;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class SyslogStartConverter extends ClassicConverter {
    int facility;
    SimpleDateFormat simpleMonthFormat;
    SimpleDateFormat simpleTimeFormat;
    long lastTimestamp = -1;
    String timesmapStr = null;
    private final Calendar calendar = Calendar.getInstance(Locale.US);
    final String localHostName = "localhost";

    public String computeTimeStampString(long j2) {
        String str;
        synchronized (this) {
            try {
                if (j2 / 1000 != this.lastTimestamp) {
                    this.lastTimestamp = j2 / 1000;
                    Date date = new Date(j2);
                    this.calendar.setTime(date);
                    this.timesmapStr = String.format("%s %2d %s", this.simpleMonthFormat.format(date), Integer.valueOf(this.calendar.get(5)), this.simpleTimeFormat.format(date));
                }
                str = this.timesmapStr;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return str;
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        return "<" + (LevelToSyslogSeverity.convert(iLoggingEvent) + this.facility) + ">" + computeTimeStampString(iLoggingEvent.getTimeStamp()) + " localhost ";
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String firstOption = getFirstOption();
        if (firstOption == null) {
            addError("was expecting a facility string as an option");
            return;
        }
        this.facility = SyslogAppenderBase.facilityStringToint(firstOption);
        try {
            Locale locale = Locale.US;
            this.simpleMonthFormat = new SimpleDateFormat("MMM", locale);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", locale);
            this.simpleTimeFormat = simpleDateFormat;
            simpleDateFormat.setDateFormatSymbols(new DateFormatSymbols(locale));
            this.simpleMonthFormat.setDateFormatSymbols(new DateFormatSymbols(locale));
            super.start();
        } catch (IllegalArgumentException e) {
            addError("Could not instantiate SimpleDateFormat", e);
        }
    }
}
