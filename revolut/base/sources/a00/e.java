package a00;

import android.graphics.Rect;
import bw.v;
import c10.g;
import c10.h;
import com.revolut.camerakit.validators.config.BlurValidatorConfig;
import com.revolut.camerakit.validators.exceptions.CameraKitValidatorException;
import com.revolut.camerakit.vision_framework.generated.Core;
import com.revolut.camerakit.vision_framework.generated.Imgproc;
import com.revolut.camerakit.vision_framework.generated.Mat;
import com.revolut.camerakit.vision_framework.generated.Size;
import dx.l;
import dx.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rz.u;
import xv.i;
import xv.m;
import xv.p;

/* JADX INFO: loaded from: classes16.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f96a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlurValidatorConfig f97b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f98c;
    public final e00.a d;

    public e(a blurCalculator, BlurValidatorConfig config, l previewMetadata, e00.a openCvImageConverter) {
        Intrinsics.checkNotNullParameter(blurCalculator, "blurCalculator");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(previewMetadata, "previewMetadata");
        Intrinsics.checkNotNullParameter(openCvImageConverter, "openCvImageConverter");
        this.f96a = blurCalculator;
        this.f97b = config;
        this.f98c = previewMetadata;
        this.d = openCvImageConverter;
    }

    @Override // xv.p
    public final Object b(List list, Continuation continuation, i iVar, m mVar) {
        try {
            return c(mVar);
        } catch (Throwable th10) {
            return new b(null, new CameraKitValidatorException("Blur calculation failed", th10, 4));
        }
    }

    public final d c(m mVar) throws InterruptedException {
        Rect rectA;
        int i = this.f97b.f50900a;
        if (mVar == null) {
            return new b(null, new CameraKitValidatorException("Frame should be provided in RGBA_8888 format", null, 6));
        }
        int i2 = mVar.f309129c;
        int i3 = mVar.f309128b;
        l lVar = this.f98c;
        if (lVar instanceof n) {
            u f50856a = ((n) lVar).f120507a.getF50856a();
            if (f50856a == null) {
                throw new CameraKitValidatorException("Preview should be initialised", null, 6);
            }
            rectA = f50856a.a();
            czi.c.I(rectA, f50856a.f258459c, f50856a.d, i3, i2);
        } else {
            if (!(lVar instanceof dx.m)) {
                throw new NoWhenBranchMatchedException();
            }
            rz.a aVarA = ((dx.m) lVar).a();
            u uVar = aVarA.f258438a;
            if (uVar == null) {
                throw new CameraKitValidatorException("Preview should be initialised", null, 6);
            }
            u uVar2 = aVarA.f258439b;
            if (uVar2 == null) {
                throw new CameraKitValidatorException("Mask should be initialised", null, 6);
            }
            Rect rectA2 = uVar2.a();
            czi.c.I(rectA2, uVar.f258459c, uVar.d, i3, i2);
            rectA = rectA2;
        }
        Mat rgbMat = this.d.a(mVar);
        int i5 = rectA.left;
        int i6 = rectA.top;
        int iWidth = rectA.width();
        int iHeight = rectA.height();
        a aVar = this.f96a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(rgbMat, "rgbMat");
        v vVar = (v) aVar.f92a;
        g gVar = vVar.f19164a;
        Mat src2 = vVar.e(rgbMat, i5, i6, iWidth, iHeight);
        Intrinsics.checkNotNullParameter(src2, "src");
        h hVar = (h) gVar;
        hVar.a();
        Mat src3 = vVar.c();
        hVar.a();
        Size dsize = new Size(256.0d, 256.0d);
        Intrinsics.checkNotNullParameter(src2, "src");
        Intrinsics.checkNotNullParameter(src3, "dst");
        Intrinsics.checkNotNullParameter(dsize, "dsize");
        hVar.a();
        Imgproc.resize(src2, src3, dsize);
        Mat dst = vVar.c();
        ((h) gVar).a();
        Size size = new Size(3.0d, 3.0d);
        Intrinsics.checkNotNullParameter(src3, "src");
        Intrinsics.checkNotNullParameter(dst, "dst");
        Intrinsics.checkNotNullParameter(size, "size");
        ((h) gVar).a();
        Imgproc.gaussianBlur(src3, dst, size, 0.0d);
        Mat src4 = vVar.c();
        vVar.f(dst, src4, 7);
        Mat src5 = vVar.c();
        Intrinsics.checkNotNullParameter(src4, "src");
        Intrinsics.checkNotNullParameter(src5, "dst");
        ((h) gVar).a();
        Imgproc.laplacian(src4, src5, 6);
        Mat mean = vVar.c();
        Mat src6 = vVar.c();
        Intrinsics.checkNotNullParameter(src5, "src");
        Intrinsics.checkNotNullParameter(mean, "mean");
        Intrinsics.checkNotNullParameter(src6, "stddev");
        ((h) gVar).a();
        Core.meanStdDev(src5, mean, src6);
        Intrinsics.checkNotNullParameter(src6, "src");
        ((h) gVar).a();
        int width = (int) src6.size().getWidth();
        ArrayList arrayList = new ArrayList(width);
        for (int i21 = 0; i21 < width; i21++) {
            arrayList.add(Double.valueOf(czi.c.m(src6, i21)[0]));
        }
        int iDoubleValue = (int) (((Number) arrayList.get(0)).doubleValue() * ((Number) arrayList.get(0)).doubleValue());
        return iDoubleValue < i ? new b(Integer.valueOf(iDoubleValue), new CameraKitValidatorException(a0.d.g(i, iDoubleValue, "Blur threshold of ", " is violated: "), null, 6)) : new c(iDoubleValue);
    }
}
