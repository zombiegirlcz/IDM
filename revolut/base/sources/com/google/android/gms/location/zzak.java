package com.google.android.gms.location;

import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.core.location.LocationCompat;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.internal.identity.zzeo;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public final class zzak {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f46545zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final DecimalFormat f46546zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final DecimalFormat f46547zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final StringBuilder f46548zzd;

    static {
        Locale locale = Locale.ROOT;
        f46546zzb = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        f46547zzc = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        f46548zzd = new StringBuilder();
    }

    public static StringBuilder zza(Location location, StringBuilder sb6) {
        sb6.ensureCapacity(100);
        if (location == null) {
            sb6.append((String) null);
            return sb6;
        }
        sb6.append("{");
        sb6.append(location.getProvider());
        sb6.append(", ");
        if (LocationCompat.isMock(location)) {
            sb6.append("mock, ");
        }
        DecimalFormat decimalFormat = f46546zzb;
        sb6.append(decimalFormat.format(location.getLatitude()));
        sb6.append(",");
        sb6.append(decimalFormat.format(location.getLongitude()));
        if (location.hasAccuracy()) {
            sb6.append("±");
            sb6.append(f46547zzc.format(location.getAccuracy()));
            sb6.append("m");
        }
        if (location.hasAltitude()) {
            sb6.append(", alt=");
            DecimalFormat decimalFormat2 = f46547zzc;
            sb6.append(decimalFormat2.format(location.getAltitude()));
            if (LocationCompat.hasVerticalAccuracy(location)) {
                sb6.append("±");
                sb6.append(decimalFormat2.format(LocationCompat.getVerticalAccuracyMeters(location)));
            }
            sb6.append("m");
        }
        if (location.hasSpeed()) {
            sb6.append(", spd=");
            DecimalFormat decimalFormat3 = f46547zzc;
            sb6.append(decimalFormat3.format(location.getSpeed()));
            if (LocationCompat.hasSpeedAccuracy(location)) {
                sb6.append("±");
                sb6.append(decimalFormat3.format(LocationCompat.getSpeedAccuracyMetersPerSecond(location)));
            }
            sb6.append("m/s");
        }
        if (location.hasBearing()) {
            sb6.append(", brg=");
            DecimalFormat decimalFormat4 = f46547zzc;
            sb6.append(decimalFormat4.format(location.getBearing()));
            if (LocationCompat.hasBearingAccuracy(location)) {
                sb6.append("±");
                sb6.append(decimalFormat4.format(LocationCompat.getBearingAccuracyDegrees(location)));
            }
            sb6.append("°");
        }
        Bundle extras = location.getExtras();
        String string = extras != null ? extras.getString("floorLabel") : null;
        if (string != null) {
            sb6.append(", fl=");
            sb6.append(string);
        }
        Bundle extras2 = location.getExtras();
        String string2 = extras2 != null ? extras2.getString("levelId") : null;
        if (string2 != null) {
            sb6.append(", lv=");
            sb6.append(string2);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        sb6.append(", ert=");
        sb6.append(zzeo.zza(LocationCompat.getElapsedRealtimeMillis(location) + jCurrentTimeMillis));
        sb6.append(CoreConstants.CURLY_RIGHT);
        return sb6;
    }
}
