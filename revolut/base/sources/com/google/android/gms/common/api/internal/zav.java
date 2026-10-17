package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zav implements Runnable {
    final /* synthetic */ zaaa zaa;

    public zav(zaaa zaaaVar) {
        this.zaa = zaaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zaa.f37825zam.lock();
        try {
            zaaa.zap(this.zaa);
        } finally {
            this.zaa.f37825zam.unlock();
        }
    }
}
