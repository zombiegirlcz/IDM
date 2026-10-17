package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class zzfc extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Activity f40029zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzcs f40030zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzfe f40031zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfc(zzfe zzfeVar, Activity activity, zzcs zzcsVar) {
        super(zzfeVar.f40034zza, true);
        this.f40029zza = activity;
        this.f40030zzb = zzcsVar;
        this.f40031zzc = zzfeVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f40031zzc.f40034zza.f40044zzj)).onActivitySaveInstanceStateByScionActivityInfo(zzdj.zza(this.f40029zza), this.f40030zzb, this.f40009zzi);
    }
}
