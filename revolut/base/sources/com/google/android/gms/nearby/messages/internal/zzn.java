package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzn extends com.google.android.gms.internal.nearby.zzb implements zzo {
    public zzn() {
        super("com.google.android.gms.nearby.messages.internal.IMessageListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1 || i == 2) {
            com.google.android.gms.internal.nearby.zzc.zzc(parcel);
        } else {
            if (i != 4) {
                return false;
            }
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Update.CREATOR);
            com.google.android.gms.internal.nearby.zzc.zzc(parcel);
            zzd(arrayListCreateTypedArrayList);
        }
        return true;
    }
}
