package e0;

import androidx.camera.core.impl.CameraPresenceProvider;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraPresenceProvider f121361b;

    public /* synthetic */ c(CameraPresenceProvider cameraPresenceProvider, int i) {
        this.f121360a = i;
        this.f121361b = cameraPresenceProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f121360a) {
            case 0:
                CameraPresenceProvider.startup$lambda$1(this.f121361b);
                break;
            default:
                this.f121361b.triggerRefreshWithRetries();
                break;
        }
    }
}
