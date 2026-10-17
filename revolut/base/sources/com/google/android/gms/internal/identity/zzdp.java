package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.DeviceOrientation;
import com.google.android.gms.location.DeviceOrientationListener;

/* JADX INFO: loaded from: classes16.dex */
final class zzdp implements ListenerHolder.Notifier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ DeviceOrientation f39702zza;

    public zzdp(zzdq zzdqVar, DeviceOrientation deviceOrientation) {
        this.f39702zza = deviceOrientation;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj2) {
        ((DeviceOrientationListener) obj2).onDeviceOrientationChanged(this.f39702zza);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
