package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes16.dex */
abstract class zaav implements Runnable {

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    final /* synthetic */ zaaw f37839zab;

    @Override // java.lang.Runnable
    public final void run() {
        this.f37839zab.f37840zab.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    zaa();
                }
            } catch (RuntimeException e) {
                this.f37839zab.zaa.zam(e);
            }
        } finally {
            this.f37839zab.f37840zab.unlock();
        }
    }

    public abstract void zaa();
}
