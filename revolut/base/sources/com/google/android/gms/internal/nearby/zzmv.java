package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.DiscoveryOptions;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Reserved({1000})
public final class zzmv {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzmx f45487zza = new zzmx(null);

    public final zzmv zza(zzkd zzkdVar) {
        this.f45487zza.f45492zze = zzkdVar;
        return this;
    }

    public final zzmv zzb(long j2) {
        this.f45487zza.f45490zzc = j2;
        return this;
    }

    public final zzmv zzc(DiscoveryOptions discoveryOptions) {
        this.f45487zza.f45491zzd = discoveryOptions;
        return this;
    }

    public final zzmv zzd(zzkk zzkkVar) {
        this.f45487zza.f45488zza = zzkkVar;
        return this;
    }

    public final zzmv zze(String str) {
        this.f45487zza.f45489zzb = str;
        return this;
    }

    public final zzmx zzf() {
        return this.f45487zza;
    }
}
