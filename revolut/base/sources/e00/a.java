package e00;

import bw.t;
import bw.v;
import c10.h;
import com.revolut.camerakit.vision_framework.generated.Mat;
import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xv.m;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f121373a;

    public a(t openCvProxy) {
        Intrinsics.checkNotNullParameter(openCvProxy, "openCvProxy");
        this.f121373a = openCvProxy;
    }

    public final Mat a(m frame) throws InterruptedException {
        Intrinsics.checkNotNullParameter(frame, "frame");
        if (frame == null) {
            throw new NoWhenBranchMatchedException();
        }
        ByteBuffer byteBuffer = frame.f309127a;
        int i = frame.f309128b;
        int i2 = frame.f309129c;
        v vVar = (v) this.f121373a;
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        ((h) vVar.f19164a).a();
        Mat matD = vVar.d(i2, i, 24);
        byte[] bArrArray = byteBuffer.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        vVar.g(matD, bArrArray);
        Mat matD2 = vVar.d(i2, i, 16);
        vVar.f(matD, matD2, 1);
        return matD2;
    }
}
