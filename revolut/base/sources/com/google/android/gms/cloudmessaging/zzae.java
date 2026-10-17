package com.google.android.gms.cloudmessaging;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
final class zzae extends com.google.android.gms.internal.cloudmessaging.zzf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Rpc f37592zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzae(Rpc rpc2, Looper looper) {
        super(looper);
        this.f37592zza = rpc2;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Rpc.zzc(this.f37592zza, message);
    }
}
