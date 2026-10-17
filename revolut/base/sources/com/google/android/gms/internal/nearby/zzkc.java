package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzkc extends zzb implements zzkd {
    public zzkc() {
        super("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzlf zzlfVar = (zzlf) zzc.zza(parcel, zzlf.CREATOR);
            zzc.zzc(parcel);
            zzc(zzlfVar);
            return true;
        }
        if (i == 3) {
            zzlh zzlhVar = (zzlh) zzc.zza(parcel, zzlh.CREATOR);
            zzc.zzc(parcel);
            zzd(zzlhVar);
            return true;
        }
        if (i == 4) {
            zzc.zzc(parcel);
            return true;
        }
        if (i != 5) {
            return false;
        }
        zzld zzldVar = (zzld) zzc.zza(parcel, zzld.CREATOR);
        zzc.zzc(parcel);
        zzb(zzldVar);
        return true;
    }
}
