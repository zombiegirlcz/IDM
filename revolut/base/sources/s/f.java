package s;

import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Request.Listener f258718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RequestMetadata f258719c;

    public /* synthetic */ f(Request.Listener listener, RequestMetadata requestMetadata, int i) {
        this.f258717a = i;
        this.f258718b = listener;
        this.f258719c = requestMetadata;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f258717a) {
            case 0:
                this.f258718b.onRequestSequenceAborted(this.f258719c);
                break;
            case 1:
                this.f258718b.onRequestSequenceCreated(this.f258719c);
                break;
            default:
                this.f258718b.onRequestSequenceSubmitted(this.f258719c);
                break;
        }
    }
}
