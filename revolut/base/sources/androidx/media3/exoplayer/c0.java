package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.MediaSourceList;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaSourceList.ForwardingEventListener f7498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f7499c;

    public /* synthetic */ c0(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, int i) {
        this.f7497a = i;
        this.f7498b = forwardingEventListener;
        this.f7499c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7497a) {
            case 0:
                this.f7498b.lambda$onDrmSessionReleased$11(this.f7499c);
                break;
            case 1:
                this.f7498b.lambda$onDrmKeysRemoved$10(this.f7499c);
                break;
            default:
                this.f7498b.lambda$onDrmKeysRestored$9(this.f7499c);
                break;
        }
    }
}
