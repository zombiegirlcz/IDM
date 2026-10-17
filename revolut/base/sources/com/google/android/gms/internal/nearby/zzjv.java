package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzjv extends zzb implements zzjw {
    public zzjv() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzkt zzktVar = (zzkt) zzc.zza(parcel, zzkt.CREATOR);
            zzc.zzc(parcel);
            zzc(zzktVar);
            return true;
        }
        if (i == 3) {
            zzkz zzkzVar = (zzkz) zzc.zza(parcel, zzkz.CREATOR);
            zzc.zzc(parcel);
            zzd(zzkzVar);
            return true;
        }
        if (i == 4) {
            zzlb zzlbVar = (zzlb) zzc.zza(parcel, zzlb.CREATOR);
            zzc.zzc(parcel);
            zze(zzlbVar);
            return true;
        }
        if (i != 5) {
            return false;
        }
        zzkr zzkrVar = (zzkr) zzc.zza(parcel, zzkr.CREATOR);
        zzc.zzc(parcel);
        zzb(zzkrVar);
        return true;
    }
}
