package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzpo extends zzb implements zzpp {
    public zzpo() {
        super("com.google.android.gms.nearby.uwb.internal.IRangingSessionCallback");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzqd zzqdVar = (zzqd) zzc.zza(parcel, zzqd.CREATOR);
            zzc.zzc(parcel);
            zzd(zzqdVar);
            return true;
        }
        if (i == 3) {
            zzqf zzqfVar = (zzqf) zzc.zza(parcel, zzqf.CREATOR);
            zzc.zzc(parcel);
            zze(zzqfVar);
            return true;
        }
        if (i != 4) {
            return false;
        }
        zzqh zzqhVar = (zzqh) zzc.zza(parcel, zzqh.CREATOR);
        zzc.zzc(parcel);
        zzf(zzqhVar);
        return true;
    }
}
