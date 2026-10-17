package e0;

import androidx.camera.core.impl.CameraPresenceProvider;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraPresenceProvider f121363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f121364c;
    public final /* synthetic */ int d;

    public /* synthetic */ d(CameraPresenceProvider cameraPresenceProvider, List list, int i, int i2) {
        this.f121362a = i2;
        this.f121363b = cameraPresenceProvider;
        this.f121364c = list;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f121362a) {
            case 0:
                CameraPresenceProvider.scheduleRetryAttempt$lambda$0$0(this.f121363b, this.f121364c, this.d);
                break;
            default:
                CameraPresenceProvider.scheduleRetryAttempt$lambda$0(this.f121363b, this.f121364c, this.d);
                break;
        }
    }
}
