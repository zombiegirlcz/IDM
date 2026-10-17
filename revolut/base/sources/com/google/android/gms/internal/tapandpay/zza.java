package com.google.android.gms.internal.tapandpay;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public class zza implements IInterface {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final IBinder f46295zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f46296zzb;

    public zza(IBinder iBinder, String str) {
        this.f46295zza = iBinder;
        this.f46296zzb = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f46295zza;
    }

    public final Parcel zza() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f46296zzb);
        return parcelObtain;
    }

    public final void zzb(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f46295zza.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public final void zzc(int i, Parcel parcel) throws RemoteException {
        try {
            this.f46295zza.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
