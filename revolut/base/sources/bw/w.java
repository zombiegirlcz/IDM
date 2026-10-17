package bw;

import com.revolut.camerakit.vision_framework.generated.Mat;

/* JADX INFO: loaded from: classes16.dex */
public final class w implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Mat f19165a;

    public w(Mat mat) {
        this.f19165a = mat;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f19165a.release();
    }
}
