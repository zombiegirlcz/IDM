package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.pattern.DynamicConverter;
import ch.qos.logback.core.util.CachingDateFormatter;
import ch.qos.logback.core.util.DatePatternToRegexUtil;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class DateTokenConverter<E> extends DynamicConverter<E> implements MonoTypedConverter {

    /* JADX INFO: renamed from: cdf, reason: collision with root package name */
    private CachingDateFormatter f24079cdf;
    private String datePattern;
    private boolean primary = true;
    private TimeZone timeZone;
    public static final String CONVERTER_KEY = "d";
    public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";
    public static final String AUXILIARY_TOKEN = "AUX";

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(Object obj2) {
        if (obj2 == null) {
            throw new IllegalArgumentException("Null argument forbidden");
        }
        if (obj2 instanceof Date) {
            return convert((Date) obj2);
        }
        throw new IllegalArgumentException("Cannot convert " + obj2 + " of type" + obj2.getClass().getName());
    }

    public String getDatePattern() {
        return this.datePattern;
    }

    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    @Override // ch.qos.logback.core.rolling.helper.MonoTypedConverter
    public boolean isApplicable(Object obj2) {
        return obj2 instanceof Date;
    }

    public boolean isPrimary() {
        return this.primary;
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String firstOption = getFirstOption();
        this.datePattern = firstOption;
        if (firstOption == null) {
            this.datePattern = "yyyy-MM-dd";
        }
        List<String> optionList = getOptionList();
        if (optionList != null) {
            for (int i = 1; i < optionList.size(); i++) {
                String str = optionList.get(i);
                if ("AUX".equalsIgnoreCase(str)) {
                    this.primary = false;
                } else {
                    this.timeZone = TimeZone.getTimeZone(str);
                }
            }
        }
        CachingDateFormatter cachingDateFormatter = new CachingDateFormatter(this.datePattern);
        this.f24079cdf = cachingDateFormatter;
        TimeZone timeZone = this.timeZone;
        if (timeZone != null) {
            cachingDateFormatter.setTimeZone(timeZone);
        }
    }

    public String toRegex() {
        return new DatePatternToRegexUtil(this.datePattern).toRegex();
    }

    public String convert(Date date) {
        return this.f24079cdf.format(date.getTime());
    }
}
