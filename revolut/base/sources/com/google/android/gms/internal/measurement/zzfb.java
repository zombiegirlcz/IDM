package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class zzfb extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Activity f40027zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzfe f40028zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfb(zzfe zzfeVar, Activity activity) {
        super(zzfeVar.f40034zza, true);
        this.f40027zza = activity;
        this.f40028zzb = zzfeVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f40028zzb.f40034zza.f40044zzj)).onActivityStoppedByScionActivityInfo(zzdj.zza(this.f40027zza), this.f40009zzi);
    }
}
