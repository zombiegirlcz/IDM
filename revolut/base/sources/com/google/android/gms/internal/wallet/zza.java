package com.google.android.gms.internal.wallet;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public class zza implements IInterface {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final IBinder f46373zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f46374zzb;

    public zza(IBinder iBinder, String str) {
        this.f46373zza = iBinder;
        this.f46374zzb = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f46373zza;
    }

    public final Parcel zza() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f46374zzb);
        return parcelObtain;
    }

    public final Parcel zzb(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f46373zza.transact(1, parcel, parcelObtain, 0);
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
        try {
            this.f46373zza.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
