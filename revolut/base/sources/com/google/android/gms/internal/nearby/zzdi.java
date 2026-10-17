package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.exposurenotification.ExposureWindow;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzdi extends zzb implements zzdj {
    public zzdi() {
        super("com.google.android.gms.nearby.exposurenotification.internal.IExposureWindowListCallback");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(ExposureWindow.CREATOR);
        zzc.zzc(parcel);
        zzb(status, arrayListCreateTypedArrayList);
        return true;
    }
}
