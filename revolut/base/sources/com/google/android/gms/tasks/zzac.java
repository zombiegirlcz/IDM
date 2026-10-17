package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
final class zzac<T> implements zzad<T> {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final CountDownLatch f48759zza = new CountDownLatch(1);

    private zzac() {
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f48759zza.countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc2) {
        this.f48759zza.countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
    public final void onSuccess(T t2) {
        this.f48759zza.countDown();
    }

    public final void zza() throws InterruptedException {
        this.f48759zza.await();
    }

    public final boolean zzb(long j2, TimeUnit timeUnit) throws InterruptedException {
        return this.f48759zza.await(j2, timeUnit);
    }

    public /* synthetic */ zzac(zzaf zzafVar) {
    }
}
