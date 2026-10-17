package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzeq extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Intent f39995zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzff f39996zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeq(zzff zzffVar, Intent intent) {
        super(zzffVar, true);
        this.f39995zza = intent;
        this.f39996zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() throws RemoteException {
        ((zzcv) Preconditions.checkNotNull(this.f39996zzb.f40044zzj)).setSgtmDebugInfo(this.f39995zza);
    }
}
