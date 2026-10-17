package hu0;

import android.view.ScaleGestureDetector;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import nyl.b;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements ScaleGestureDetector.OnScaleGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f155478b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f155477a = i;
        this.f155478b = obj2;
    }

    private final void a(ScaleGestureDetector scaleGestureDetector) {
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        int i = this.f155477a;
        Object obj2 = this.f155478b;
        switch (i) {
            case 0:
                float scaleFactor = detector.getScaleFactor();
                if (!Float.isNaN(scaleFactor) && !Float.isInfinite(scaleFactor)) {
                    if (scaleFactor >= BitmapDescriptorFactory.HUE_RED) {
                        f61.a aVar = ((c) obj2).f155484j;
                        float focusX = detector.getFocusX();
                        float focusY = detector.getFocusY();
                        f fVar = (f) aVar.f132372b;
                        if (fVar.d() < fVar.e || scaleFactor < 1.0f) {
                            fVar.f155496m.postScale(scaleFactor, scaleFactor, focusX, focusY);
                            fVar.a();
                        }
                    }
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(detector, "detector");
                nyl.b bVar = (nyl.b) obj2;
                float scaleFactor2 = detector.getScaleFactor();
                float focusX2 = detector.getFocusX();
                float focusY2 = detector.getFocusY();
                b.a aVar2 = nyl.b.Companion;
                bVar.c(scaleFactor2, focusX2, focusY2);
                bVar.invalidate();
                break;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector detector) {
        switch (this.f155477a) {
            case 0:
                break;
            default:
                Intrinsics.checkNotNullParameter(detector, "detector");
                ((nyl.b) this.f155478b).i = true;
                break;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector detector) {
        switch (this.f155477a) {
            case 0:
                break;
            default:
                Intrinsics.checkNotNullParameter(detector, "detector");
                ((nyl.b) this.f155478b).i = false;
                break;
        }
    }
}
