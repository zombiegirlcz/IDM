package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzau;
import com.google.android.gms.internal.auth.zzax;

/* JADX INFO: loaded from: classes16.dex */
final class zze extends zzl {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzax f37319zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zze(AccountTransferClient accountTransferClient, int i, zzax zzaxVar) {
        super(1607, null);
        this.f37319zza = zzaxVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.zzl
    public final void zza(zzau zzauVar) throws RemoteException {
        zzauVar.zzg(new zzd(this, this), this.f37319zza);
    }
}
