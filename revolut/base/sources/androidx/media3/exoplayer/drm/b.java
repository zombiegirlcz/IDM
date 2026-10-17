package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7514b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f7513a = i;
        this.f7514b = obj2;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj2) {
        switch (this.f7513a) {
            case 0:
                ((DrmSessionEventListener.EventDispatcher) obj2).drmKeysLoaded((KeyRequestInfo) this.f7514b);
                break;
            default:
                DefaultDrmSession.lambda$onError$2((Exception) this.f7514b, (DrmSessionEventListener.EventDispatcher) obj2);
                break;
        }
    }
}
