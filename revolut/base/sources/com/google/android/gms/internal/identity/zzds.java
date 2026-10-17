package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes16.dex */
final class zzds implements ListenerHolder.Notifier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ LocationResult f39704zza;

    public zzds(zzdv zzdvVar, LocationResult locationResult) {
        this.f39704zza = locationResult;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj2) {
        ((LocationCallback) obj2).onLocationResult(this.f39704zza);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
