package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class zzds extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Bundle f39940zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzff f39941zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzff zzffVar, Bundle bundle) {
        super(zzffVar, true);
        this.f39940zza = bundle;
        this.f39941zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39941zzb.f40044zzj)).setConsentThirdParty(this.f39940zza, this.f40008zzh);
    }
}
