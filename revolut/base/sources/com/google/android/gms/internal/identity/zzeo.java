package com.google.android.gms.internal.identity;

import ch.qos.logback.core.CoreConstants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public final class zzeo {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final SimpleDateFormat f39753zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final SimpleDateFormat f39754zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final StringBuilder f39755zzc;

    static {
        Locale locale = Locale.ROOT;
        f39753zza = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        f39754zzb = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        f39755zzc = new StringBuilder(33);
    }

    public static String zza(long j2) {
        return j2 >= 0 ? f39753zza.format(new Date(j2)) : Long.toString(j2);
    }

    public static String zzb(long j2) {
        String string;
        StringBuilder sb6 = f39755zzc;
        synchronized (sb6) {
            sb6.setLength(0);
            zzc(j2, sb6);
            string = sb6.toString();
        }
        return string;
    }

    public static StringBuilder zzc(long j2, StringBuilder sb6) {
        if (j2 == 0) {
            sb6.append("0s");
            return sb6;
        }
        sb6.ensureCapacity(sb6.length() + 27);
        boolean z = false;
        if (j2 < 0) {
            sb6.append("-");
            if (j2 != Long.MIN_VALUE) {
                j2 = -j2;
            } else {
                j2 = Long.MAX_VALUE;
                z = true;
            }
        }
        if (j2 >= CoreConstants.MILLIS_IN_ONE_DAY) {
            sb6.append(j2 / CoreConstants.MILLIS_IN_ONE_DAY);
            sb6.append("d");
            j2 %= CoreConstants.MILLIS_IN_ONE_DAY;
        }
        if (true == z) {
            j2 = 25975808;
        }
        if (j2 >= CoreConstants.MILLIS_IN_ONE_HOUR) {
            sb6.append(j2 / CoreConstants.MILLIS_IN_ONE_HOUR);
            sb6.append("h");
            j2 %= CoreConstants.MILLIS_IN_ONE_HOUR;
        }
        if (j2 >= 60000) {
            sb6.append(j2 / 60000);
            sb6.append("m");
            j2 %= 60000;
        }
        if (j2 >= 1000) {
            sb6.append(j2 / 1000);
            sb6.append("s");
            j2 %= 1000;
        }
        if (j2 > 0) {
            sb6.append(j2);
            sb6.append("ms");
        }
        return sb6;
    }
}
