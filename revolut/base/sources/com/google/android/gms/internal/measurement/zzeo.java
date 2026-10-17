package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzeo extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Bundle f39991zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzff f39992zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeo(zzff zzffVar, Bundle bundle) {
        super(zzffVar, true);
        this.f39991zza = bundle;
        this.f39992zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39992zzb.f40044zzj)).setDefaultEventParameters(this.f39991zza);
    }
}
