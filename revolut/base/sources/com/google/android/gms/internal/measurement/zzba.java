package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes16.dex */
final class zzba implements Comparator {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzai f39851zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzg f39852zzb;

    public zzba(zzai zzaiVar, zzg zzgVar) {
        this.f39851zza = zzaiVar;
        this.f39852zzb = zzgVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj2, Object obj3) {
        zzap zzapVar = (zzap) obj2;
        zzap zzapVar2 = (zzap) obj3;
        if (zzapVar instanceof zzau) {
            return !(zzapVar2 instanceof zzau) ? 1 : 0;
        }
        if (zzapVar2 instanceof zzau) {
            return -1;
        }
        zzai zzaiVar = this.f39851zza;
        return zzaiVar == null ? zzapVar.zzi().compareTo(zzapVar2.zzi()) : (int) zzh.zza(zzaiVar.zza(this.f39852zzb, Arrays.asList(zzapVar, zzapVar2)).zzh().doubleValue());
    }
}
