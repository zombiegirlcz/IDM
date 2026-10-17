package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzpl extends zzb implements zzpm {
    public zzpl() {
        super("com.google.android.gms.nearby.uwb.internal.IRangingCapabilitiesResultListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzqn zzqnVar = (zzqn) zzc.zza(parcel, zzqn.CREATOR);
        zzc.zzc(parcel);
        zzd(zzqnVar);
        return true;
    }
}
