package com.google.android.gms.internal.play_billing;

import a0.d;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public class zzat extends Binder implements IInterface {
    private static zzav globalInterceptor;

    public zzat(String str) {
        attachInterface(this, str);
    }

    public static synchronized void installTransactionInterceptorPackagePrivate(zzav zzavVar) {
        if (zzavVar == null) {
            throw new IllegalArgumentException("null interceptor");
        }
        if (globalInterceptor != null) {
            throw new IllegalStateException("Duplicate TransactionInterceptor installation.");
        }
        globalInterceptor = zzavVar;
    }

    private boolean routeToSuperOrEnforceInterface(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i > 16777215) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        return false;
    }

    public void enforceNoDataAvail(Parcel parcel) {
        zzav zzavVar = globalInterceptor;
        if (zzavVar != null) {
            zzavVar.zza();
            return;
        }
        int i = zzau.f45821zza;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(d.n("Parcel data not fully consumed, unread size: ", iDataAvail));
        }
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        zzav zzavVar = globalInterceptor;
        return zzavVar == null ? dispatchTransaction(i, parcel, parcel2, i2) : zzavVar.zzb();
    }
}
