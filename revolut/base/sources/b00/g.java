package b00;

import android.graphics.Rect;
import bw.t;
import bw.v;
import c10.h;
import com.revolut.camerakit.validators.config.BrightnessValidatorConfig;
import com.revolut.camerakit.validators.exceptions.CameraKitValidatorException;
import com.revolut.camerakit.vision_framework.generated.Core;
import com.revolut.camerakit.vision_framework.generated.Imgproc;
import com.revolut.camerakit.vision_framework.generated.Mat;
import com.revolut.camerakit.vision_framework.generated.Size;
import dx.l;
import dx.n;
import java.nio.ByteBuffer;
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
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f11538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BrightnessValidatorConfig f11539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f11540c;
    public final e00.a d;

    public g(b brightnessCalculator, BrightnessValidatorConfig config, l previewMetadata, e00.a openCvImageConverter) {
        Intrinsics.checkNotNullParameter(brightnessCalculator, "brightnessCalculator");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(previewMetadata, "previewMetadata");
        Intrinsics.checkNotNullParameter(openCvImageConverter, "openCvImageConverter");
        this.f11538a = brightnessCalculator;
        this.f11539b = config;
        this.f11540c = previewMetadata;
        this.d = openCvImageConverter;
    }

    @Override // xv.p
    public final Object b(List list, Continuation continuation, i iVar, m mVar) {
        try {
            return c(mVar);
        } catch (Throwable th10) {
            return new d(null, new CameraKitValidatorException("Brightness calculation failed", th10, 4));
        }
    }

    public final f c(m frame) throws InterruptedException {
        double d;
        double d5;
        double d6;
        int i;
        Rect rectA;
        BrightnessValidatorConfig brightnessValidatorConfig = this.f11539b;
        float f = brightnessValidatorConfig.f50901a;
        float f4 = brightnessValidatorConfig.f50902b;
        if (frame == null) {
            return new d(null, new CameraKitValidatorException("Frame should be provided in RGBA_8888 format", null, 6));
        }
        int i2 = frame.f309129c;
        int i3 = frame.f309128b;
        l lVar = this.f11540c;
        if (lVar instanceof n) {
            u f50856a = ((n) lVar).f120507a.getF50856a();
            if (f50856a == null) {
                throw new CameraKitValidatorException("Preview should be initialised", null, 6);
            }
            rectA = f50856a.a();
            czi.c.I(rectA, f50856a.f258459c, f50856a.d, i3, i2);
            i = i2;
        } else {
            if (!(lVar instanceof dx.m)) {
                throw new NoWhenBranchMatchedException();
            }
            rz.a aVarA = ((dx.m) lVar).a();
            u uVar = aVarA.f258438a;
            if (uVar == null) {
                throw new CameraKitValidatorException("Preview should be initialised", null, 6);
            }
            int i5 = uVar.d;
            int i6 = uVar.f258459c;
            u uVar2 = aVarA.f258439b;
            if (uVar2 == null) {
                throw new CameraKitValidatorException("Mask should be initialised", null, 6);
            }
            Rect rectA2 = uVar2.a();
            double dWidth = ((double) rectA2.left) - (((double) rectA2.width()) * 0.067d);
            double dHeight = (((double) rectA2.height()) * 0.028d) + ((double) rectA2.bottom);
            double dWidth2 = ((double) rectA2.width()) * 1.15d;
            double dHeight2 = ((double) rectA2.height()) * 1.13d;
            if (dHeight2 > dWidth2) {
                double d10 = dHeight2 - dWidth2;
                d5 = dWidth2 + d10;
                d6 = dWidth - (d10 / ((double) 2));
                d = dHeight2;
            } else {
                double d15 = dWidth2 - dHeight2;
                dHeight -= d15 / ((double) 2);
                d = dHeight2 + d15;
                d5 = dWidth2;
                d6 = dWidth;
            }
            int i21 = (int) d6;
            if (i21 < 0) {
                i21 = 0;
            }
            rectA2.left = i21;
            int i22 = (int) (dHeight - d);
            if (i22 < 0) {
                i22 = 0;
            }
            rectA2.top = i22;
            int i32 = (int) (d6 + d5);
            if (i32 > i6) {
                i32 = i6;
            }
            rectA2.right = i32;
            int i33 = (int) dHeight;
            if (i33 > i5) {
                i33 = i5;
            }
            rectA2.bottom = i33;
            i = i2;
            czi.c.I(rectA2, i6, i5, i3, i);
            rectA = rectA2;
        }
        e00.a aVar = this.d;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(frame, "frame");
        t tVar = aVar.f121373a;
        ByteBuffer byteBuffer = frame.f309127a;
        v vVar = (v) tVar;
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        ((h) vVar.f19164a).a();
        Mat matD = vVar.d(i, i3, 24);
        byte[] bArrArray = byteBuffer.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        vVar.g(matD, bArrArray);
        Mat bgrMat = vVar.d(i, i3, 16);
        vVar.f(matD, bgrMat, 3);
        int i43 = rectA.left;
        int i59 = rectA.top;
        int iWidth = rectA.width();
        int iHeight = rectA.height();
        b bVar = this.f11538a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(bgrMat, "bgrMat");
        v vVar2 = (v) bVar.f11534a;
        c10.g gVar = vVar2.f19164a;
        Mat src2 = vVar2.e(bgrMat, i43, i59, iWidth, iHeight);
        Intrinsics.checkNotNullParameter(src2, "src");
        h hVar = (h) gVar;
        hVar.a();
        Mat dst = vVar2.c();
        hVar.a();
        Size dsize = new Size(256.0d, 256.0d);
        Intrinsics.checkNotNullParameter(src2, "src");
        Intrinsics.checkNotNullParameter(dst, "dst");
        Intrinsics.checkNotNullParameter(dsize, "dsize");
        hVar.a();
        Imgproc.resize(src2, dst, dsize);
        ArrayList channels = new ArrayList();
        Mat src3 = vVar2.c();
        vVar2.f(dst, src3, 44);
        Intrinsics.checkNotNullParameter(src3, "src");
        Intrinsics.checkNotNullParameter(channels, "channels");
        ((h) gVar).a();
        ArrayList<Mat> arrayListSplit = Core.split(src3);
        Intrinsics.h(arrayListSplit);
        channels.addAll(arrayListSplit);
        Mat src4 = (Mat) channels.get(0);
        Mat src5 = vVar2.c();
        Intrinsics.checkNotNullParameter(src4, "src");
        Intrinsics.checkNotNullParameter(src5, "dst");
        ((h) gVar).a();
        src4.convertTo(src5, 5, 0.00392156862745098d);
        Intrinsics.checkNotNullParameter(src5, "src");
        ((h) gVar).a();
        double dMeanFirstChannel = Core.meanFirstChannel(src5);
        if (dMeanFirstChannel < f4) {
            return new d(new a(dMeanFirstChannel, c.TOO_DARK), new CameraKitValidatorException("Darkness threshold of " + f4 + " is violated: " + dMeanFirstChannel, null, 6));
        }
        if (dMeanFirstChannel <= f) {
            return new e(new a(dMeanFirstChannel, c.NORMAL));
        }
        return new d(new a(dMeanFirstChannel, c.TOO_BRIGHT), new CameraKitValidatorException("Brightness threshold of " + f + " is violated: " + dMeanFirstChannel, null, 6));
    }
}
