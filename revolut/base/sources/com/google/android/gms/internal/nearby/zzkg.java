package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzkg extends zzb implements zzkh {
    public zzkg() {
        super("com.google.android.gms.nearby.internal.connection.IPayloadListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzlj zzljVar = (zzlj) zzc.zza(parcel, zzlj.CREATOR);
            zzc.zzc(parcel);
            zzb(zzljVar);
            return true;
        }
        if (i != 3) {
            return false;
        }
        zzll zzllVar = (zzll) zzc.zza(parcel, zzll.CREATOR);
        zzc.zzc(parcel);
        zzc(zzllVar);
        return true;
    }
}
