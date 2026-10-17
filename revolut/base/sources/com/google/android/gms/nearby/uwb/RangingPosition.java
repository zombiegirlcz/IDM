package com.google.android.gms.nearby.uwb;

import a0.d;
import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class RangingPosition {
    public static final int RSSI_MAX = -1;
    public static final int RSSI_MIN = -127;
    public static final int RSSI_UNKNOWN = -128;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final RangingMeasurement f48240zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final RangingMeasurement f48241zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final RangingMeasurement f48242zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final long f48243zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final int f48244zze;

    public RangingPosition(@NonNull RangingMeasurement rangingMeasurement, RangingMeasurement rangingMeasurement2, RangingMeasurement rangingMeasurement3, long j2, int i) {
        this.f48240zza = rangingMeasurement;
        this.f48241zzb = rangingMeasurement2;
        this.f48242zzc = rangingMeasurement3;
        this.f48243zzd = j2;
        this.f48244zze = i;
    }

    public RangingMeasurement getAzimuth() {
        return this.f48241zzb;
    }

    @NonNull
    public RangingMeasurement getDistance() {
        return this.f48240zza;
    }

    public long getElapsedRealtimeNanos() {
        return this.f48243zzd;
    }

    public RangingMeasurement getElevation() {
        return this.f48242zzc;
    }

    public int getRssiDbm() {
        return this.f48244zze;
    }

    @NonNull
    public String toString() {
        long j2 = this.f48243zzd;
        Locale locale = Locale.US;
        String strConcat = String.format(locale, "elapsedRealtime (ms) %d | distance (m) %f", Long.valueOf(j2 / 1000000), Float.valueOf(this.f48240zza.getValue()));
        RangingMeasurement rangingMeasurement = this.f48241zzb;
        if (rangingMeasurement != null) {
            strConcat = strConcat.concat(String.format(locale, " | azimuth: %f", Float.valueOf(rangingMeasurement.getValue())));
        }
        RangingMeasurement rangingMeasurement2 = this.f48242zzc;
        if (rangingMeasurement2 != null) {
            strConcat = String.valueOf(strConcat).concat(String.format(locale, " | elevation: %f", Float.valueOf(rangingMeasurement2.getValue())));
        }
        return String.valueOf(strConcat).concat(d.n(" | rssi: ", this.f48244zze));
    }
}
