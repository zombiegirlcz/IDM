package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.internal.ListenerHolder;

/* JADX INFO: loaded from: classes16.dex */
final class zzdu implements ListenerHolder.Notifier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzdv f39706zza;

    public zzdu(zzdv zzdvVar) {
        this.f39706zza = zzdvVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj2) {
        this.f39706zza.zzh().zzc();
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
