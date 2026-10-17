package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzjy extends zzb implements zzjz {
    public zzjy() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        zzkx zzkxVar = (zzkx) zzc.zza(parcel, zzkx.CREATOR);
        zzc.zzc(parcel);
        zzb(zzkxVar);
        return true;
    }
}
