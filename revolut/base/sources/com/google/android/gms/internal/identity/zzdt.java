package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;

/* JADX INFO: loaded from: classes16.dex */
final class zzdt implements ListenerHolder.Notifier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ LocationAvailability f39705zza;

    public zzdt(zzdv zzdvVar, LocationAvailability locationAvailability) {
        this.f39705zza = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj2) {
        ((LocationCallback) obj2).onLocationAvailability(this.f39705zza);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
