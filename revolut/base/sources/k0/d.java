package k0;

import androidx.camera.core.impl.DeferrableSurface;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeferrableSurface f179887b;

    public /* synthetic */ d(DeferrableSurface deferrableSurface, int i) {
        this.f179886a = i;
        this.f179887b = deferrableSurface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f179886a) {
            case 0:
                this.f179887b.close();
                break;
            default:
                this.f179887b.decrementUseCount();
                break;
        }
    }
}
