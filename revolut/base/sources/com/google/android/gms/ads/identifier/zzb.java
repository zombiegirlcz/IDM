package com.google.android.gms.ads.identifier;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
@VisibleForTesting
final class zzb extends Thread {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final CountDownLatch f37263zza = new CountDownLatch(1);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    boolean f37264zzb = false;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final WeakReference<AdvertisingIdClient> f37265zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final long f37266zzd;

    public zzb(AdvertisingIdClient advertisingIdClient, long j2) {
        this.f37265zzc = new WeakReference<>(advertisingIdClient);
        this.f37266zzd = j2;
        start();
    }

    private final void zza() {
        AdvertisingIdClient advertisingIdClient = this.f37265zzc.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.zza();
            this.f37264zzb = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f37263zza.await(this.f37266zzd, TimeUnit.MILLISECONDS)) {
                return;
            }
            zza();
        } catch (InterruptedException unused) {
            zza();
        }
    }
}
