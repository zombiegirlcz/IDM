package androidx.camera.core.impl;

import androidx.camera.core.impl.CameraPresenceProvider;
import java.util.Set;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraPresenceProvider.ListenerWrapper f6867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f6868c;

    public /* synthetic */ b(CameraPresenceProvider.ListenerWrapper listenerWrapper, Set set, int i) {
        this.f6866a = i;
        this.f6867b = listenerWrapper;
        this.f6868c = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6866a) {
            case 0:
                CameraPresenceProvider.notifyPublicCamerasRemoved$lambda$0$0(this.f6867b, this.f6868c);
                break;
            default:
                CameraPresenceProvider.notifyPublicCamerasAdded$lambda$0$0(this.f6867b, this.f6868c);
                break;
        }
    }
}
