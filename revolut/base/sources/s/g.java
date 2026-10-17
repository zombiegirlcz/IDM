package s;

import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Request.Listener f258721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RequestMetadata f258722c;
    public final /* synthetic */ long d;
    public final /* synthetic */ FrameInfo e;

    public /* synthetic */ g(Request.Listener listener, RequestMetadata requestMetadata, long j2, FrameInfo frameInfo, int i) {
        this.f258720a = i;
        this.f258721b = listener;
        this.f258722c = requestMetadata;
        this.d = j2;
        this.e = frameInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f258720a) {
            case 0:
                this.f258721b.mo8onTotalCaptureResultCcXjc1I(this.f258722c, this.d, this.e);
                break;
            default:
                this.f258721b.mo6onCompleteCcXjc1I(this.f258722c, this.d, this.e);
                break;
        }
    }
}
