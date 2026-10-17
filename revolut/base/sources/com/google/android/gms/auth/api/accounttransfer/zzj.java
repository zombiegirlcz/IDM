package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzan;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
class zzj extends zzan {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final zzl f37324zzb;

    public zzj(zzl zzlVar) {
        this.f37324zzb = zzlVar;
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zzd(Status status) {
        TaskCompletionSource taskCompletionSource = this.f37324zzb.f37325zzb;
        int i = AccountTransferClient.f37309zza;
        taskCompletionSource.setException(new AccountTransferException(status));
    }
}
