package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes16.dex */
final class zzjf extends ContentObserver {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzjh f40307zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjf(zzjh zzjhVar, Handler handler) {
        super(null);
        this.f40307zza = zzjhVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f40307zza.f40308zza.set(true);
    }
}
