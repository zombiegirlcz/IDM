package q4;

import androidx.media3.exoplayer.drm.DrmSessionEventListener;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DrmSessionEventListener.EventDispatcher f241990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DrmSessionEventListener f241991c;

    public /* synthetic */ a(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, int i) {
        this.f241989a = i;
        this.f241990b = eventDispatcher;
        this.f241991c = drmSessionEventListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f241989a) {
            case 0:
                this.f241990b.lambda$drmSessionReleased$5(this.f241991c);
                break;
            case 1:
                this.f241990b.lambda$drmKeysRemoved$4(this.f241991c);
                break;
            default:
                this.f241990b.lambda$drmKeysRestored$3(this.f241991c);
                break;
        }
    }
}
