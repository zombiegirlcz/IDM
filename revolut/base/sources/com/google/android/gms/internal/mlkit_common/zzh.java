package com.google.android.gms.internal.mlkit_common;

import android.content.Context;

/* JADX INFO: loaded from: classes16.dex */
public final class zzh {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzh f40920zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final boolean f40921zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final boolean f40922zzc = false;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzaf f40923zzd;

    static {
        zze zzeVar = null;
        zzf zzfVar = new zzf(zzeVar);
        zzfVar.zzb();
        f40920zza = zzfVar.zzd();
        zzf zzfVar2 = new zzf(zzeVar);
        zzfVar2.zzb();
        zzfVar2.zza(new zzd());
        zzfVar2.zzd();
        zzf zzfVar3 = new zzf(zzeVar);
        zzfVar3.zzc();
        zzfVar3.zzd();
    }

    public /* synthetic */ zzh(boolean z, boolean z3, zzaf zzafVar, zzg zzgVar) {
        this.f40921zzb = z;
        this.f40923zzd = zzafVar;
    }

    public static /* bridge */ /* synthetic */ boolean zza(zzh zzhVar) {
        boolean z = zzhVar.f40922zzc;
        return false;
    }

    public static /* bridge */ /* synthetic */ int zzc(zzh zzhVar, Context context, zzj zzjVar) {
        zzaf zzafVar = zzhVar.f40923zzd;
        int size = zzafVar.size();
        int i = 0;
        while (i < size) {
            int iZza = ((zzk) zzafVar.get(i)).zza(context, zzjVar, zzhVar.f40921zzb) - 1;
            i++;
            if (iZza == 1) {
                return 2;
            }
        }
        return 3;
    }
}
