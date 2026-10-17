package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zzb();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    Messenger f37593zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    IMessengerCompat f37594zzb;

    public zzd(IBinder iBinder) {
        this.f37593zza = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        try {
            return zza().equals(((zzd) obj2).zza());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return zza().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f37593zza;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f37594zzb.asBinder());
        }
    }

    public final IBinder zza() {
        Messenger messenger = this.f37593zza;
        return messenger != null ? messenger.getBinder() : this.f37594zzb.asBinder();
    }

    public final void zzb(Message message) throws RemoteException {
        Messenger messenger = this.f37593zza;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f37594zzb.send(message);
        }
    }
}
