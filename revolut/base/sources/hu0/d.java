package hu0;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements GestureDetector.OnDoubleTapListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f155485a;

    public d(f fVar) {
        this.f155485a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[Catch: ArrayIndexOutOfBoundsException -> 0x002c, TRY_LEAVE, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x002c, blocks: (B:3:0x0003, B:5:0x0015, B:8:0x001d, B:10:0x0023, B:11:0x0027), top: B:15:0x0003 }] */
    @Override // android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onDoubleTap(android.view.MotionEvent r7) {
        /*
            r6 = this;
            hu0.f r0 = r6.f155485a
            r1 = 1
            float r2 = r0.d()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2c
            float r3 = r7.getX()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2c
            float r7 = r7.getY()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2c
            float r4 = r0.d     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2c
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 >= 0) goto L19
            r0.e(r4, r3, r7, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2c
            goto L2c
        L19:
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L27
            float r4 = r0.e     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2c
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L27
            r0.e(r4, r3, r7, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2c
            goto L2c
        L27:
            float r2 = r0.f155491c     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2c
            r0.e(r2, r3, r7, r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2c
        L2c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hu0.d.onDoubleTap(android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        f fVar = this.f155485a;
        g gVar = fVar.f155493h;
        View.OnClickListener onClickListener = fVar.f155498p;
        if (onClickListener != null) {
            onClickListener.onClick(gVar);
        }
        fVar.b();
        Matrix matrixC = fVar.c();
        RectF rectF = fVar.f155497n;
        if (gVar.getDrawable() != null) {
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, r1.getIntrinsicWidth(), r1.getIntrinsicHeight());
            matrixC.mapRect(rectF);
        }
        motionEvent.getX();
        motionEvent.getY();
        return false;
    }
}
