package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzpx extends zzb implements zzpy {
    public zzpx() {
        super("com.google.android.gms.nearby.uwb.internal.IUwbComplexChannelResultListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        zzsc zzscVar = (zzsc) zzc.zza(parcel, zzsc.CREATOR);
        zzc.zzc(parcel);
        zzd(zzscVar);
        return true;
    }
}
