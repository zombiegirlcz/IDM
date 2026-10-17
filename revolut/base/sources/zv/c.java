package zv;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.ImageInfo;
import androidx.camera.core.ImageProxy;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements ImageProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f325564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f325565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f325566c;
    public final Rect d;
    public final a76.c e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f325567g;

    public c(ByteBuffer byteBuffer, int i, int i2, Rect cropRect, a76.c closeCallback) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        Intrinsics.checkNotNullParameter(cropRect, "cropRect");
        Intrinsics.checkNotNullParameter(closeCallback, "closeCallback");
        this.f325564a = byteBuffer;
        this.f325565b = i;
        this.f325566c = i2;
        this.d = cropRect;
        this.e = closeCallback;
        this.f = j.b(new zh0.b(this, 21));
        this.f325567g = new b();
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public final void close() {
        this.e.invoke();
    }

    @Override // androidx.camera.core.ImageProxy
    public final Rect getCropRect() {
        return this.d;
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getFormat() {
        return 1;
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getHeight() {
        return this.f325566c;
    }

    @Override // androidx.camera.core.ImageProxy
    public final Image getImage() {
        return null;
    }

    @Override // androidx.camera.core.ImageProxy
    public final ImageInfo getImageInfo() {
        return this.f325567g;
    }

    @Override // androidx.camera.core.ImageProxy
    public final ImageProxy.PlaneProxy[] getPlanes() {
        return new ImageProxy.PlaneProxy[]{new a(this)};
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getWidth() {
        return this.f325565b;
    }

    @Override // androidx.camera.core.ImageProxy
    public final void setCropRect(Rect rect) {
        Intrinsics.checkNotNullParameter("Not implemented", "message");
        throw new NotImplementedError("Not implemented");
    }

    @Override // androidx.camera.core.ImageProxy
    public final Bitmap toBitmap() {
        return (Bitmap) this.f.getValue();
    }
}
