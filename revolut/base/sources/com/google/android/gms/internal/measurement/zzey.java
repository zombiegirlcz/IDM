package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class zzey extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Activity f40017zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzfe f40018zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzey(zzfe zzfeVar, Activity activity) {
        super(zzfeVar.f40034zza, true);
        this.f40017zza = activity;
        this.f40018zzb = zzfeVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f40018zzb.f40034zza.f40044zzj)).onActivityStartedByScionActivityInfo(zzdj.zza(this.f40017zza), this.f40009zzi);
    }
}
