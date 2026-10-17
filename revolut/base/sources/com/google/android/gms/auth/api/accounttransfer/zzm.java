package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzan;

/* JADX INFO: loaded from: classes16.dex */
final class zzm extends zzan {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzn f37326zza;

    public zzm(zzn zznVar) {
        this.f37326zza = zznVar;
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zzd(Status status) {
        this.f37326zza.f37325zzb.setException(new AccountTransferException(status));
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zze() {
        this.f37326zza.f37325zzb.setResult(null);
    }
}
