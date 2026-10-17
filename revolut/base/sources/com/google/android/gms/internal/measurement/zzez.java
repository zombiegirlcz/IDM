package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class zzez extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Activity f40019zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzfe f40020zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzez(zzfe zzfeVar, Activity activity) {
        super(zzfeVar.f40034zza, true);
        this.f40019zza = activity;
        this.f40020zzb = zzfeVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f40020zzb.f40034zza.f40044zzj)).onActivityResumedByScionActivityInfo(zzdj.zza(this.f40019zza), this.f40009zzi);
    }
}
