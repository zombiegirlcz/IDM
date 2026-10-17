package mx0;

import android.view.ScaleGestureDetector;

/* JADX INFO: loaded from: classes20.dex */
public final class c5 extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b5 f209629a;

    public c5(b5 b5Var) {
        this.f209629a = b5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x001e A[PHI: r3
      0x001e: PHI (r3v4 float) = (r3v0 float), (r3v1 float) binds: [B:3:0x001c, B:6:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onScale(android.view.ScaleGestureDetector r6) {
        /*
            r5 = this;
            java.lang.String r0 = "detector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            mx0.b5 r0 = r5.f209629a
            android.graphics.Matrix r1 = r0.f209598r
            float[] r2 = r0.v
            r1.getValues(r2)
            float[] r1 = r0.v
            r2 = 0
            r1 = r1[r2]
            float r2 = r6.getScaleFactor()
            float r2 = r2 * r1
            float r3 = r0.f209599t
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L20
        L1e:
            float r3 = r3 / r1
            goto L2b
        L20:
            float r3 = r0.u
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L27
            goto L1e
        L27:
            float r3 = r6.getScaleFactor()
        L2b:
            android.graphics.Matrix r0 = r0.f209598r
            float r1 = r6.getFocusX()
            float r6 = r6.getFocusY()
            r0.postScale(r3, r3, r1, r6)
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mx0.c5.onScale(android.view.ScaleGestureDetector):boolean");
    }
}
