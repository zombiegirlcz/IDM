package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7518b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f7517a = i;
        this.f7518b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7517a) {
            case 0:
                ((DefaultDrmSessionManager.PreacquiredSessionReference) this.f7518b).lambda$release$1();
                break;
            default:
                ((DefaultDrmSession) this.f7518b).release(null);
                break;
        }
    }
}
