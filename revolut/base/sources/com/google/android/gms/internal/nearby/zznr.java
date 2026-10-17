package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.messages.StatusCallback;

/* JADX INFO: loaded from: classes16.dex */
final class zznr extends zznq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ boolean f45524zza;

    public zznr(zzns zznsVar, boolean z) {
        this.f45524zza = z;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(Object obj2) {
        ((StatusCallback) obj2).onPermissionChanged(this.f45524zza);
    }
}
