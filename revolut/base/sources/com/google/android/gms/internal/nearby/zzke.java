package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;

/* JADX INFO: loaded from: classes16.dex */
public final class zzke extends zza implements IInterface {
    public zzke(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
    }

    public final void zzd(zzfj zzfjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzfjVar);
        zzu(2006, parcelZza);
    }

    public final void zze(zzfn zzfnVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzfnVar);
        zzu(YearClass.CLASS_2012, parcelZza);
    }

    public final void zzf(zzfp zzfpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzfpVar);
        zzu(YearClass.CLASS_2011, parcelZza);
    }

    public final void zzg(zzjm zzjmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzjmVar);
        zzu(YearClass.CLASS_2009, parcelZza);
    }

    public final void zzh(zzmh zzmhVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzmhVar);
        zzu(2007, parcelZza);
    }

    public final void zzi(zzml zzmlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzmlVar);
        zzu(2005, parcelZza);
    }

    public final void zzj(zzmp zzmpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzmpVar);
        zzu(YearClass.CLASS_2008, parcelZza);
    }

    public final void zzk(zzmt zzmtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzmtVar);
        zzu(2001, parcelZza);
    }

    public final void zzl(zzmx zzmxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzmxVar);
        zzu(2003, parcelZza);
    }

    public final void zzm(zzmz zzmzVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzmzVar);
        zzu(2002, parcelZza);
    }

    public final void zzn(zznb zznbVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zznbVar);
        zzu(YearClass.CLASS_2010, parcelZza);
    }

    public final void zzo(zznd zzndVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzndVar);
        zzu(2004, parcelZza);
    }
}
