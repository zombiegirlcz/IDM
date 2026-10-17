package ch.qos.logback.core.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class CachingDateFormatter {
    String cachedStr;
    long lastTimestamp;

    /* JADX INFO: renamed from: sdf, reason: collision with root package name */
    final SimpleDateFormat f24082sdf;

    public CachingDateFormatter(String str) {
        this(str, Locale.US);
    }

    public final String format(long j2) {
        String str;
        synchronized (this) {
            try {
                if (j2 != this.lastTimestamp) {
                    this.lastTimestamp = j2;
                    this.cachedStr = this.f24082sdf.format(new Date(j2));
                }
                str = this.cachedStr;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return str;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.f24082sdf.setTimeZone(timeZone);
    }

    public CachingDateFormatter(String str, Locale locale) {
        this.lastTimestamp = -1L;
        this.cachedStr = null;
        this.f24082sdf = new SimpleDateFormat(str, locale);
    }
}
