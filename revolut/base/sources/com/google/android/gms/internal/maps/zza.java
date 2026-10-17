package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public class zza implements IInterface {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final IBinder f39780zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f39781zzb;

    public zza(IBinder iBinder, String str) {
        this.f39780zza = iBinder;
        this.f39781zzb = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f39780zza;
    }

    public final Parcel zzJ(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f39780zza.transact(i, parcel, parcelObtain, 0);
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

    public final Parcel zza() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f39781zzb);
        return parcelObtain;
    }

    public final void zzc(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f39780zza.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
