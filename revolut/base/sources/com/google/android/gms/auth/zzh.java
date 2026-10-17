package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
final class zzh implements zzk {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f37557zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ Bundle f37558zzb;

    public zzh(String str, Bundle bundle) {
        this.f37557zza = str;
        this.f37558zzb = bundle;
    }

    @Override // com.google.android.gms.auth.zzk
    public final /* bridge */ /* synthetic */ Object zza(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        Bundle bundleZzd = com.google.android.gms.internal.auth.zze.zzb(iBinder).zzd(this.f37557zza, this.f37558zzb);
        zzl.zzc(bundleZzd);
        String string = bundleZzd.getString("Error");
        if (bundleZzd.getBoolean("booleanResult")) {
            return null;
        }
        throw new GoogleAuthException(string);
    }
}
