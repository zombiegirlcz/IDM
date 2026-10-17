package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzv extends zzai {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzz f40703zza;

    public zzv(zzz zzzVar) {
        super("internal.registerCallback");
        this.f40703zza = zzzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzh.zzh(this.f39826zzd, 3, list);
        String strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
        zzap zzapVarZzb = zzgVar.zzb((zzap) list.get(1));
        if (!(zzapVarZzb instanceof zzao)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        zzap zzapVarZzb2 = zzgVar.zzb((zzap) list.get(2));
        if (!(zzapVarZzb2 instanceof zzam)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        zzam zzamVar = (zzam) zzapVarZzb2;
        if (!zzamVar.zzt("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f40703zza.zza(strZzi, zzamVar.zzt("priority") ? zzh.zzb(zzamVar.zzf("priority").zzh().doubleValue()) : 1000, (zzao) zzapVarZzb, zzamVar.zzf("type").zzi());
        return zzap.f39833zzf;
    }
}
