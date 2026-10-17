package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzau;
import com.google.android.gms.internal.auth.zzav;

/* JADX INFO: loaded from: classes16.dex */
final class zzi extends zzn {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzav f37323zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzi(AccountTransferClient accountTransferClient, int i, zzav zzavVar) {
        super(1610);
        this.f37323zza = zzavVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.zzl
    public final void zza(zzau zzauVar) throws RemoteException {
        zzauVar.zzf(this.f37327zzc, this.f37323zza);
    }
}
