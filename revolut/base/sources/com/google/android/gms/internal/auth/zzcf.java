package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes16.dex */
final class zzcf extends ContentObserver {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzcg f38940zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcf(zzcg zzcgVar, Handler handler) {
        super(null);
        this.f38940zza = zzcgVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f38940zza.zze();
    }
}
