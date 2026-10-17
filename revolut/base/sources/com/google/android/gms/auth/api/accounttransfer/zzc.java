package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzau;
import com.google.android.gms.internal.auth.zzaz;

/* JADX INFO: loaded from: classes16.dex */
final class zzc extends zzn {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzaz f37317zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(AccountTransferClient accountTransferClient, int i, zzaz zzazVar) {
        super(1606);
        this.f37317zza = zzazVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.zzl
    public final void zza(zzau zzauVar) throws RemoteException {
        zzauVar.zzh(this.f37327zzc, this.f37317zza);
    }
}
