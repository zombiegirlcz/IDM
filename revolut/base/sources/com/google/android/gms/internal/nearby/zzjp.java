package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzjp extends zzb implements zzjq {
    public zzjp() {
        super("com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzkv zzkvVar = (zzkv) zzc.zza(parcel, zzkv.CREATOR);
            zzc.zzc(parcel);
            zzb(zzkvVar);
            return true;
        }
        if (i != 3) {
            return false;
        }
        zzc.zzc(parcel);
        return true;
    }
}
