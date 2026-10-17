package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public class zba implements IInterface {

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    private final IBinder f38817zba;

    /* JADX INFO: renamed from: zbb, reason: collision with root package name */
    private final String f38818zbb;

    public zba(IBinder iBinder, String str) {
        this.f38817zba = iBinder;
        this.f38818zbb = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f38817zba;
    }

    public final Parcel zba() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f38818zbb);
        return parcelObtain;
    }

    public final void zbb(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f38817zba.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
