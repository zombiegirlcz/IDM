package zv;

import androidx.camera.core.ImageProxy;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements ImageProxy.PlaneProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f325563a;

    public a(c cVar) {
        this.f325563a = cVar;
    }

    @Override // androidx.camera.core.ImageProxy.PlaneProxy
    public final ByteBuffer getBuffer() {
        return this.f325563a.f325564a;
    }

    @Override // androidx.camera.core.ImageProxy.PlaneProxy
    public final int getPixelStride() {
        return 4;
    }

    @Override // androidx.camera.core.ImageProxy.PlaneProxy
    public final int getRowStride() {
        return this.f325563a.f325565b * 4;
    }
}
