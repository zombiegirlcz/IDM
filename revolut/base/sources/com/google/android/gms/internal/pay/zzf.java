package com.google.android.gms.internal.pay;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.EmoneyReadiness;
import com.google.android.gms.pay.zzac;
import com.google.android.gms.pay.zzai;
import com.google.android.gms.pay.zzak;
import com.google.android.gms.pay.zzam;
import com.google.android.gms.pay.zzao;
import com.google.android.gms.pay.zzaq;
import com.google.android.gms.pay.zzau;
import com.google.android.gms.pay.zzbm;
import com.google.android.gms.pay.zzbv;
import com.google.android.gms.pay.zzcr;
import com.google.android.gms.pay.zzct;

/* JADX INFO: loaded from: classes16.dex */
public interface zzf extends IInterface {
    void zzb(Status status, boolean z) throws RemoteException;

    void zzc(Status status, byte[] bArr) throws RemoteException;

    void zzd(Status status, com.google.android.gms.pay.zzo zzoVar) throws RemoteException;

    void zze(com.google.android.gms.pay.zzi zziVar) throws RemoteException;

    void zzf(Status status, EmoneyReadiness emoneyReadiness) throws RemoteException;

    void zzg(Status status, zzau zzauVar) throws RemoteException;

    void zzh(Status status) throws RemoteException;

    void zzi(Status status, int i) throws RemoteException;

    void zzj(Status status, long j2) throws RemoteException;

    void zzk(Status status, com.google.android.gms.pay.zzs zzsVar) throws RemoteException;

    void zzl(Status status, com.google.android.gms.pay.zzu zzuVar) throws RemoteException;

    void zzm(zzbm zzbmVar) throws RemoteException;

    void zzn(Status status, com.google.android.gms.pay.zzaa zzaaVar) throws RemoteException;

    void zzo(Status status, zzac zzacVar) throws RemoteException;

    void zzp(Status status, PendingIntent pendingIntent) throws RemoteException;

    void zzq(Status status, zzbv zzbvVar) throws RemoteException;

    void zzr(Status status, zzai zzaiVar) throws RemoteException;

    void zzs(Status status, zzak zzakVar) throws RemoteException;

    void zzt(Status status) throws RemoteException;

    void zzu(Status status, zzcr zzcrVar) throws RemoteException;

    void zzv(Status status, zzam zzamVar) throws RemoteException;

    void zzw(Status status, zzct zzctVar) throws RemoteException;

    void zzx(Status status, zzao zzaoVar) throws RemoteException;

    void zzy(Status status, com.google.android.gms.pay.zzq zzqVar) throws RemoteException;

    void zzz(Status status, zzaq zzaqVar) throws RemoteException;
}
