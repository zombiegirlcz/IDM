package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.GeofenceStatusCodes;

/* JADX INFO: loaded from: classes16.dex */
public final class zzpj extends zza implements IInterface {
    public zzpj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.uwb.internal.INearbyUwbService");
    }

    public final void zzd(zzok zzokVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzokVar);
        zzv(1008, parcelZza);
    }

    public final void zze(zzoo zzooVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzooVar);
        zzv(1012, parcelZza);
    }

    public final void zzf(zzoq zzoqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzoqVar);
        zzv(1007, parcelZza);
    }

    public final void zzg(zzow zzowVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzowVar);
        zzv(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, parcelZza);
    }

    public final void zzh(zzpa zzpaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzpaVar);
        zzv(1003, parcelZza);
    }

    public final void zzi(zzpe zzpeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzpeVar);
        zzv(1002, parcelZza);
    }

    public final void zzj(zzqb zzqbVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzqbVar);
        zzv(1001, parcelZza);
    }

    public final void zzk(zzrd zzrdVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzrdVar);
        zzv(1014, parcelZza);
    }

    public final void zzl(zzrh zzrhVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzrhVar);
        zzv(1013, parcelZza);
    }

    public final void zzm(zzrl zzrlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzrlVar);
        zzv(1009, parcelZza);
    }

    public final void zzn(zzrp zzrpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzrpVar);
        zzv(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, parcelZza);
    }

    public final void zzo(zzrt zzrtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzrtVar);
        zzv(1006, parcelZza);
    }
}
