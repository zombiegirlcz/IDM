package com.google.android.gms.internal.tapandpay;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tapandpay.issuer.CreatePushProvisionSessionRequest;
import com.google.android.gms.tapandpay.issuer.IsTokenizedRequest;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest;
import com.google.android.gms.tapandpay.issuer.ViewTokenRequest;

/* JADX INFO: loaded from: classes16.dex */
public final class zzd extends zza implements IInterface {
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tapandpay.internal.ITapAndPayService");
    }

    public final void zzd(CreatePushProvisionSessionRequest createPushProvisionSessionRequest, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, createPushProvisionSessionRequest);
        zzc.zzd(parcelZza, zzfVar);
        zzb(67, parcelZza);
    }

    public final void zze(zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzfVar);
        zzb(29, parcelZza);
    }

    public final void zzf(zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzfVar);
        zzb(21, parcelZza);
    }

    public final void zzg(zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzfVar);
        zzb(31, parcelZza);
    }

    public final void zzh(String str, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzc.zzd(parcelZza, zzfVar);
        zzb(61, parcelZza);
    }

    public final void zzi(zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzfVar);
        zzb(30, parcelZza);
    }

    public final void zzj(int i, String str, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        zzc.zzd(parcelZza, zzfVar);
        zzb(22, parcelZza);
    }

    public final void zzk(IsTokenizedRequest isTokenizedRequest, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, isTokenizedRequest);
        zzc.zzd(parcelZza, zzfVar);
        zzb(75, parcelZza);
    }

    public final void zzl(zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzfVar);
        zzb(74, parcelZza);
    }

    public final void zzm(PushTokenizeRequest pushTokenizeRequest, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, pushTokenizeRequest);
        zzc.zzd(parcelZza, zzfVar);
        zzb(28, parcelZza);
    }

    public final void zzn(zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzfVar);
        zzb(10, parcelZza);
    }

    public final void zzo(int i, String str, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        zzc.zzd(parcelZza, zzfVar);
        zzb(25, parcelZza);
    }

    public final void zzp(int i, String str, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        zzc.zzd(parcelZza, zzfVar);
        zzb(24, parcelZza);
    }

    public final void zzq(ServerPushProvisionRequest serverPushProvisionRequest, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, serverPushProvisionRequest);
        zzc.zzd(parcelZza, zzfVar);
        zzb(68, parcelZza);
    }

    public final void zzr(int i, String str, String str2, int i2, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeInt(i2);
        zzc.zzd(parcelZza, zzfVar);
        zzb(23, parcelZza);
    }

    public final void zzs(ViewTokenRequest viewTokenRequest, zzf zzfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, viewTokenRequest);
        zzc.zzd(parcelZza, zzfVar);
        zzb(79, parcelZza);
    }
}
