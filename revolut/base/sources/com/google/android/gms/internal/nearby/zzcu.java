package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzcu extends zzb implements zzcv {
    public zzcu() {
        super("com.google.android.gms.nearby.exposurenotification.internal.IDiagnosisKeyFileSupplier");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            boolean zZzc = zzc();
            parcel2.writeNoException();
            int i3 = zzc.f45118zza;
            parcel2.writeInt(zZzc ? 1 : 0);
        } else if (i == 2) {
            ParcelFileDescriptor parcelFileDescriptorZzb = zzb();
            parcel2.writeNoException();
            int i5 = zzc.f45118zza;
            if (parcelFileDescriptorZzb == null) {
                parcel2.writeInt(0);
            } else {
                parcel2.writeInt(1);
                parcelFileDescriptorZzb.writeToParcel(parcel2, 1);
            }
        } else {
            if (i != 3) {
                return false;
            }
            parcel2.writeNoException();
            int i6 = zzc.f45118zza;
            parcel2.writeInt(1);
        }
        return true;
    }
}
