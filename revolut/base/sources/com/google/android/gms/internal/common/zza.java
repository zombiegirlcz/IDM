package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public class zza implements IInterface {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final IBinder f39223zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f39224zzb;

    public zza(IBinder iBinder, String str) {
        this.f39223zza = iBinder;
        this.f39224zzb = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f39223zza;
    }

    public final Parcel zzB(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f39223zza.transact(i, parcel, parcelObtain, 0);
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

    public final void zzC(int i, Parcel parcel) throws RemoteException {
        try {
            this.f39223zza.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final void zzD(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f39223zza.transact(1, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public final Parcel zza() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f39224zzb);
        return parcelObtain;
    }
}
