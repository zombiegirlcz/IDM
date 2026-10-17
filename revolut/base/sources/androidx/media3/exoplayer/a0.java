package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.drm.KeyRequestInfo;
import androidx.media3.exoplayer.source.MediaLoadData;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaSourceList.ForwardingEventListener f7482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f7483c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a0(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, Object obj2, int i) {
        this.f7481a = i;
        this.f7482b = forwardingEventListener;
        this.f7483c = pair;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7481a) {
            case 0:
                this.f7482b.lambda$onUpstreamDiscarded$4(this.f7483c, (MediaLoadData) this.d);
                break;
            case 1:
                this.f7482b.lambda$onDrmKeysLoaded$7(this.f7483c, (KeyRequestInfo) this.d);
                break;
            default:
                this.f7482b.lambda$onDrmSessionManagerError$8(this.f7483c, (Exception) this.d);
                break;
        }
    }
}
