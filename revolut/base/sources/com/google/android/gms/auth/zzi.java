package com.google.android.gms.auth;

import android.os.IBinder;
import android.os.RemoteException;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
final class zzi implements zzk {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ AccountChangeEventsRequest f37559zza;

    public zzi(AccountChangeEventsRequest accountChangeEventsRequest) {
        this.f37559zza = accountChangeEventsRequest;
    }

    @Override // com.google.android.gms.auth.zzk
    public final /* bridge */ /* synthetic */ Object zza(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        AccountChangeEventsResponse accountChangeEventsResponseZzh = com.google.android.gms.internal.auth.zze.zzb(iBinder).zzh(this.f37559zza);
        zzl.zzc(accountChangeEventsResponseZzh);
        return accountChangeEventsResponseZzh.getEvents();
    }
}
