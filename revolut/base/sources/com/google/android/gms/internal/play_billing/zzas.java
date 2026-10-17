package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public class zzas implements IInterface {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final IBinder f45819zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f45820zzb;

    public zzas(IBinder iBinder, String str) {
        this.f45819zza = iBinder;
        this.f45820zzb = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f45819zza;
    }

    public final Parcel zzt() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f45820zzb);
        return parcelObtain;
    }

    public final Parcel zzu(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f45819zza.transact(i, parcel, parcelObtain, 0);
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

    public final void zzv(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f45819zza.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public final void zzw(int i, Parcel parcel) throws RemoteException {
        try {
            this.f45819zza.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
