package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Messenger f37619zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzd f37620zzb;

    public zzq(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f37619zza = new Messenger(iBinder);
            this.f37620zzb = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor));
                throw new RemoteException();
            }
            this.f37620zzb = new zzd(iBinder);
            this.f37619zza = null;
        }
    }

    public final void zza(Message message) throws RemoteException {
        Messenger messenger = this.f37619zza;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzd zzdVar = this.f37620zzb;
        if (zzdVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        zzdVar.zzb(message);
    }
}
