package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzau;
import com.google.android.gms.internal.auth.zzbb;

/* JADX INFO: loaded from: classes16.dex */
final class zzh extends zzn {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzbb f37322zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(AccountTransferClient accountTransferClient, int i, zzbb zzbbVar) {
        super(1609);
        this.f37322zza = zzbbVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.zzl
    public final void zza(zzau zzauVar) throws RemoteException {
        zzauVar.zze(this.f37327zzc, this.f37322zza);
    }
}
