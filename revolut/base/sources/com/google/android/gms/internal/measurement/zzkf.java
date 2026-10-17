package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.base.Function;

/* JADX INFO: loaded from: classes16.dex */
public final class zzkf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Uri f40346zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final String f40347zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final String f40348zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final boolean f40349zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final boolean f40350zze;

    private zzkf(String str, Uri uri2, String str2, String str3, boolean z, boolean z3, boolean z4, boolean z6, Function function) {
        this.f40346zza = uri2;
        this.f40347zzb = "";
        this.f40348zzc = "";
        this.f40349zzd = z;
        this.f40350zze = z4;
    }

    public final zzkf zza() {
        return new zzkf(null, this.f40346zza, this.f40347zzb, this.f40348zzc, this.f40349zzd, false, true, false, null);
    }

    public final zzkf zzb() {
        String str = this.f40347zzb;
        if (str.isEmpty()) {
            return new zzkf(null, this.f40346zza, str, this.f40348zzc, true, false, this.f40350zze, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzki zzc(String str, double d) {
        Double dValueOf = Double.valueOf(-3.0d);
        int i = zzki.f40351zzc;
        return new zzkd(this, "measurement.test.double_flag", dValueOf, true);
    }

    public final zzki zzd(String str, long j2) {
        Long lValueOf = Long.valueOf(j2);
        int i = zzki.f40351zzc;
        return new zzkb(this, str, lValueOf, true);
    }

    public final zzki zze(String str, String str2) {
        int i = zzki.f40351zzc;
        return new zzke(this, str, str2, true);
    }

    public final zzki zzf(String str, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        int i = zzki.f40351zzc;
        return new zzkc(this, str, boolValueOf, true);
    }

    public zzkf(Uri uri2) {
        this(null, uri2, "", "", false, false, false, false, null);
    }
}
