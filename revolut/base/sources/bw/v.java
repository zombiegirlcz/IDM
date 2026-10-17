package bw;

import android.graphics.Bitmap;
import com.revolut.camerakit.vision_framework.generated.Imgproc;
import com.revolut.camerakit.vision_framework.generated.Mat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class v implements t {

    @NotNull
    private static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c10.g f19164a;

    public v(c10.g visionInitialization) {
        Intrinsics.checkNotNullParameter(visionInitialization, "visionInitialization");
        this.f19164a = visionInitialization;
    }

    public final void a(List images, List channels, Mat mask, Mat histogram, List histSize, List ranges) throws InterruptedException {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(channels, "channels");
        Intrinsics.checkNotNullParameter(mask, "mask");
        Intrinsics.checkNotNullParameter(histogram, "histogram");
        Intrinsics.checkNotNullParameter(histSize, "histSize");
        Intrinsics.checkNotNullParameter(ranges, "ranges");
        ((c10.h) this.f19164a).a();
        Imgproc.calcHist(new ArrayList(images), new ArrayList(channels), mask, histogram, new ArrayList(histSize), new ArrayList(ranges));
    }

    public final Bitmap b(Mat mat) throws InterruptedException {
        Intrinsics.checkNotNullParameter(mat, "mat");
        c10.g gVar = this.f19164a;
        c10.h hVar = (c10.h) gVar;
        hVar.a();
        Intrinsics.checkNotNullParameter(mat, "mat");
        hVar.a();
        int iCols = mat.cols();
        Intrinsics.checkNotNullParameter(mat, "mat");
        ((c10.h) gVar).a();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCols, mat.rows(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(mat.matToArgb8888Bytes()));
        return bitmapCreateBitmap;
    }

    public final Mat c() {
        ((c10.h) this.f19164a).a();
        Mat matCreate = Mat.create();
        Intrinsics.checkNotNullExpressionValue(matCreate, "create(...)");
        return matCreate;
    }

    public final Mat d(int i, int i2, int i3) throws InterruptedException {
        ((c10.h) this.f19164a).a();
        Mat matCreateMatWithSize = Mat.createMatWithSize(i, i2, i3);
        Intrinsics.checkNotNullExpressionValue(matCreateMatWithSize, "createMatWithSize(...)");
        return matCreateMatWithSize;
    }

    public final Mat e(Mat mat, int i, int i2, int i3, int i5) throws InterruptedException {
        Intrinsics.checkNotNullParameter(mat, "mat");
        c10.g gVar = this.f19164a;
        ((c10.h) gVar).a();
        Intrinsics.checkNotNullParameter(mat, "mat");
        ((c10.h) gVar).a();
        Mat matCreateSubMat = Mat.createSubMat(mat, i, i2, i3, i5);
        Intrinsics.checkNotNullExpressionValue(matCreateSubMat, "createSubMat(...)");
        return matCreateSubMat;
    }

    public final void f(Mat src2, Mat dst, int i) throws InterruptedException {
        Intrinsics.checkNotNullParameter(src2, "src");
        Intrinsics.checkNotNullParameter(dst, "dst");
        ((c10.h) this.f19164a).a();
        Imgproc.cvtColor(src2, dst, i);
    }

    public final void g(Mat mat, byte[] data) throws InterruptedException {
        Intrinsics.checkNotNullParameter(mat, "mat");
        Intrinsics.checkNotNullParameter(data, "data");
        ((c10.h) this.f19164a).a();
        mat.put(0, 0, data);
    }

    public final void h(Mat mat) {
        Intrinsics.checkNotNullParameter(mat, "mat");
        ((c10.h) this.f19164a).a();
        mat.release();
    }
}
