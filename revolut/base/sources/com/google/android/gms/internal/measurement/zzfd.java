package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class zzfd extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Activity f40032zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzfe f40033zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfd(zzfe zzfeVar, Activity activity) {
        super(zzfeVar.f40034zza, true);
        this.f40032zza = activity;
        this.f40033zzb = zzfeVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f40033zzb.f40034zza.f40044zzj)).onActivityDestroyedByScionActivityInfo(zzdj.zza(this.f40032zza), this.f40009zzi);
    }
}
