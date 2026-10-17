package com.google.android.gms.internal.pay;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.pay.zzag;
import com.google.android.gms.pay.zzay;
import com.google.android.gms.pay.zzbc;
import com.google.android.gms.pay.zzbz;
import com.google.android.gms.pay.zzcd;

/* JADX INFO: loaded from: classes16.dex */
public final class zzg extends zza implements IInterface {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.pay.internal.IThirdPartyPayService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(com.google.android.gms.pay.zzg zzgVar, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzgVar);
        parcelZza.writeStrongBinder(zzfVar);
        zzb(8, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(com.google.android.gms.pay.zzy zzyVar, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzyVar);
        parcelZza.writeStrongBinder(zzfVar);
        zzb(2, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zzag zzagVar, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzagVar);
        parcelZza.writeStrongBinder(zzfVar);
        zzb(5, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzf(zzay zzayVar, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzayVar);
        parcelZza.writeStrongBinder(zzfVar);
        zzb(7, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzg(zzbc zzbcVar, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzbcVar);
        parcelZza.writeStrongBinder(zzfVar);
        zzb(10, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzh(zzbz zzbzVar, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzbzVar);
        parcelZza.writeStrongBinder(zzfVar);
        zzb(9, parcelZza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzi(zzcd zzcdVar, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzcdVar);
        parcelZza.writeStrongBinder(zzfVar);
        zzb(3, parcelZza);
    }
}
