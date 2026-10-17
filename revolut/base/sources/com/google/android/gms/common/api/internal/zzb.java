package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzb implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f37954zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f37955zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzc f37956zzc;

    public zzb(zzc zzcVar, LifecycleCallback lifecycleCallback, String str) {
        this.f37954zza = lifecycleCallback;
        this.f37955zzb = str;
        Objects.requireNonNull(zzcVar);
        this.f37956zzc = zzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        zzc zzcVar = this.f37956zzc;
        if (zzcVar.zzm() > 0) {
            LifecycleCallback lifecycleCallback = this.f37954zza;
            if (zzcVar.zzn() != null) {
                bundle = zzcVar.zzn().getBundle(this.f37955zzb);
            } else {
                bundle = null;
            }
            lifecycleCallback.onCreate(bundle);
        }
        if (zzcVar.zzm() >= 2) {
            this.f37954zza.onStart();
        }
        if (zzcVar.zzm() >= 3) {
            this.f37954zza.onResume();
        }
        if (zzcVar.zzm() >= 4) {
            this.f37954zza.onStop();
        }
        if (zzcVar.zzm() >= 5) {
            this.f37954zza.onDestroy();
        }
    }
}
