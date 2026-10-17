package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes16.dex */
final class zzjl extends ContentObserver {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzjm f40322zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjl(zzjm zzjmVar, Handler handler) {
        super(null);
        this.f40322zza = zzjmVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f40322zza.zzf();
    }
}
