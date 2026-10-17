package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzjs extends zzb implements zzjt {
    public zzjs() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzlj zzljVar = (zzlj) zzc.zza(parcel, zzlj.CREATOR);
            zzc.zzc(parcel);
            zzd(zzljVar);
            return true;
        }
        if (i == 3) {
            zzlb zzlbVar = (zzlb) zzc.zza(parcel, zzlb.CREATOR);
            zzc.zzc(parcel);
            zzc(zzlbVar);
            return true;
        }
        if (i != 4) {
            return false;
        }
        zzc.zzc(parcel);
        return true;
    }
}
