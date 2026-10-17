package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaSourceList.ForwardingEventListener f7522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f7523c;
    public final /* synthetic */ LoadEventInfo d;
    public final /* synthetic */ MediaLoadData e;

    public /* synthetic */ e0(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.f7521a = i;
        this.f7522b = forwardingEventListener;
        this.f7523c = pair;
        this.d = loadEventInfo;
        this.e = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7521a) {
            case 0:
                this.f7522b.lambda$onLoadCanceled$2(this.f7523c, this.d, this.e);
                break;
            default:
                this.f7522b.lambda$onLoadCompleted$1(this.f7523c, this.d, this.e);
                break;
        }
    }
}
