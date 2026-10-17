package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzaq;
import com.google.android.gms.internal.auth.zzau;

/* JADX INFO: loaded from: classes16.dex */
final class zzg extends zzl {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzaq f37321zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(AccountTransferClient accountTransferClient, int i, zzaq zzaqVar) {
        super(1608, null);
        this.f37321zza = zzaqVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.zzl
    public final void zza(zzau zzauVar) throws RemoteException {
        zzauVar.zzd(new zzf(this, this), this.f37321zza);
    }
}
