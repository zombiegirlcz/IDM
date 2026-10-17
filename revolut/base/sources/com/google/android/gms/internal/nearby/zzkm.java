package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzkm extends zzb implements zzkn {
    public zzkm() {
        super("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        zzln zzlnVar = (zzln) zzc.zza(parcel, zzln.CREATOR);
        zzc.zzc(parcel);
        zzb(zzlnVar);
        return true;
    }
}
