package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.DeviceOrientation;
import com.google.android.gms.location.zzs;

/* JADX INFO: loaded from: classes16.dex */
final class zzdq extends zzs {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private ListenerHolder f39703zza;

    public zzdq(ListenerHolder listenerHolder) {
        this.f39703zza = listenerHolder;
    }

    public final synchronized void zzc(ListenerHolder listenerHolder) {
        ListenerHolder listenerHolder2 = this.f39703zza;
        if (listenerHolder2 != listenerHolder) {
            listenerHolder2.clear();
            this.f39703zza = listenerHolder;
        }
    }

    @Override // com.google.android.gms.location.zzt
    public final void zzd(DeviceOrientation deviceOrientation) {
        ListenerHolder listenerHolder;
        synchronized (this) {
            listenerHolder = this.f39703zza;
        }
        listenerHolder.notifyListener(new zzdp(this, deviceOrientation));
    }

    public final synchronized void zze() {
        this.f39703zza.clear();
    }
}
