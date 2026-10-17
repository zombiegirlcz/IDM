package com.google.android.gms.measurement.internal;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class zzph {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f47652zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Map f47653zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final zzmf f47654zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.zzim f47655zzd;

    public zzph(String str, Map map, zzmf zzmfVar, com.google.android.gms.internal.measurement.zzim zzimVar) {
        this.f47652zza = str;
        this.f47653zzb = map;
        this.f47654zzc = zzmfVar;
        this.f47655zzd = zzimVar;
    }

    public final zzmf zza() {
        return this.f47654zzc;
    }

    public final com.google.android.gms.internal.measurement.zzim zzb() {
        return this.f47655zzd;
    }

    public final String zzc() {
        return this.f47652zza;
    }

    public final Map zzd() {
        Map map = this.f47653zzb;
        return map == null ? Collections.EMPTY_MAP : map;
    }
}
