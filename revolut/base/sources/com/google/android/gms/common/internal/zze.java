package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class zze implements ServiceConnection {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ BaseGmsClient f38151zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final int f38152zzb;

    public zze(BaseGmsClient baseGmsClient, int i) {
        java.util.Objects.requireNonNull(baseGmsClient);
        this.f38151zza = baseGmsClient;
        this.f38152zzb = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        BaseGmsClient baseGmsClient = this.f38151zza;
        if (iBinder == null) {
            baseGmsClient.zzf(16);
            return;
        }
        synchronized (baseGmsClient.zzh()) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                baseGmsClient.zzi((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IGmsServiceBroker)) ? new zzaa(iBinder) : (IGmsServiceBroker) iInterfaceQueryLocalInterface);
            } catch (Throwable th10) {
                throw th10;
            }
        }
        this.f38151zza.zzb(0, null, this.f38152zzb);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        BaseGmsClient baseGmsClient = this.f38151zza;
        synchronized (baseGmsClient.zzh()) {
            baseGmsClient.zzi(null);
        }
        BaseGmsClient baseGmsClient2 = this.f38151zza;
        int i = this.f38152zzb;
        Handler handler = baseGmsClient2.f38017zzb;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
