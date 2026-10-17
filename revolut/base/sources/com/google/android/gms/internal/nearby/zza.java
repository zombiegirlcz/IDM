package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public class zza implements IInterface {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final IBinder f45063zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f45064zzb;

    public zza(IBinder iBinder, String str) {
        this.f45063zza = iBinder;
        this.f45064zzb = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f45063zza;
    }

    public final Parcel zza() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f45064zzb);
        return parcelObtain;
    }

    public final void zzu(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f45063zza.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public final void zzv(int i, Parcel parcel) throws RemoteException {
        try {
            this.f45063zza.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
