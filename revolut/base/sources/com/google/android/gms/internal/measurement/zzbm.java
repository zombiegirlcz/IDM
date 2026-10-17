package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public class zzbm implements IInterface {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final IBinder f39871zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f39872zzb;

    public zzbm(IBinder iBinder, String str) {
        this.f39871zza = iBinder;
        this.f39872zzb = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f39871zza;
    }

    public final Parcel zza() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f39872zzb);
        return parcelObtain;
    }

    public final Parcel zzb(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f39871zza.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final void zzc(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f39871zza.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public final void zzd(int i, Parcel parcel) throws RemoteException {
        try {
            this.f39871zza.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
