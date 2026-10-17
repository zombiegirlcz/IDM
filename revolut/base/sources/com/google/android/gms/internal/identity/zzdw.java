package com.google.android.gms.internal.identity;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationListener;

/* JADX INFO: loaded from: classes16.dex */
final class zzdw implements ListenerHolder.Notifier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Location f39708zza;

    public zzdw(zzdy zzdyVar, Location location) {
        this.f39708zza = location;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj2) {
        ((LocationListener) obj2).onLocationChanged(this.f39708zza);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
