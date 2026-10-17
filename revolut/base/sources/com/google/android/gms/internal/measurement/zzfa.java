package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class zzfa extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Activity f40025zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzfe f40026zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfa(zzfe zzfeVar, Activity activity) {
        super(zzfeVar.f40034zza, true);
        this.f40025zza = activity;
        this.f40026zzb = zzfeVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f40026zzb.f40034zza.f40044zzj)).onActivityPausedByScionActivityInfo(zzdj.zza(this.f40025zza), this.f40009zzi);
    }
}
