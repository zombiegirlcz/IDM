package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public class zza implements IInterface {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final IBinder f39265zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f39266zzb;

    public zza(IBinder iBinder, String str) {
        this.f39265zza = iBinder;
        this.f39266zzb = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f39265zza;
    }

    public final Parcel zza() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f39266zzb);
        return parcelObtain;
    }

    public final void zzb(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f39265zza.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
