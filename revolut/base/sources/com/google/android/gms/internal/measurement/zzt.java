package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzt extends zzai {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzr f40701zza;

    public zzt(zzr zzrVar) {
        super("internal.logger");
        this.f40701zza = zzrVar;
        this.f39827zze.put("log", new zzs(this, false, true));
        this.f39827zze.put("silent", new zzp(this, "silent"));
        ((zzai) this.f39827zze.get("silent")).zzr("log", new zzs(this, true, true));
        this.f39827zze.put("unmonitored", new zzq(this, "unmonitored"));
        ((zzai) this.f39827zze.get("unmonitored")).zzr("log", new zzs(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        return zzap.f39833zzf;
    }
}
