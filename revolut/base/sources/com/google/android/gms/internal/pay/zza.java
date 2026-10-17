package com.google.android.gms.internal.pay;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public class zza implements IInterface {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final IBinder f45786zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f45787zzb;

    public zza(IBinder iBinder, String str) {
        this.f45786zza = iBinder;
        this.f45787zzb = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f45786zza;
    }

    public final Parcel zza() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f45787zzb);
        return parcelObtain;
    }

    public final void zzb(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f45786zza.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
