package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzpu extends zzb implements zzpv {
    public zzpu() {
        super("com.google.android.gms.nearby.uwb.internal.IUwbAddressResultListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        zzrx zzrxVar = (zzrx) zzc.zza(parcel, zzrx.CREATOR);
        zzc.zzc(parcel);
        zzd(zzrxVar);
        return true;
    }
}
