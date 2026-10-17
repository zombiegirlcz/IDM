package kt0;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.revolut.core.ui_kit.internal.views.barchart.BarChartView;
import com.revolut.core.ui_kit.internal.views.epschart.EpsChartView;
import ip0.i3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f189495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f189496c;
    public boolean d;
    public final Runnable e;
    public final /* synthetic */ Object f;

    public e(ps0.d dVar) {
        this.f189494a = 1;
        this.f = dVar;
        this.f189495b = new PointF();
        this.f189496c = new int[2];
        this.e = new o6.a(this, 8);
    }

    public final void a(MotionEvent motionEvent, View view) {
        switch (this.f189494a) {
            case 0:
                view.getLocationOnScreen(this.f189496c);
                this.f189495b.set(motionEvent.getRawX() - r0[0], motionEvent.getRawY() - r0[1]);
                break;
            default:
                view.getLocationOnScreen(this.f189496c);
                this.f189495b.set(motionEvent.getRawX() - r0[0], motionEvent.getRawY() - r0[1]);
                break;
        }
    }

    public final int b() {
        switch (this.f189494a) {
            case 0:
                int i = 0;
                for (Object obj2 : ((f) this.f).f189497a.getChartEntriesRect$ui_kit_components_release().values()) {
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    PointF pointF = this.f189495b;
                    if (((RectF) obj2).contains(pointF.x, pointF.y)) {
                        return i;
                    }
                    i++;
                }
                return -1;
            default:
                ps0.d dVar = (ps0.d) this.f;
                Map<i3, RectF> categoryRects$ui_kit_components_release = dVar.f239352a.getCategoryRects$ui_kit_components_release();
                ArrayList<RectF> arrayList = new ArrayList(categoryRects$ui_kit_components_release.size());
                Iterator<Map.Entry<i3, RectF>> it8 = categoryRects$ui_kit_components_release.entrySet().iterator();
                while (it8.hasNext()) {
                    arrayList.add(it8.next().getValue());
                }
                int i2 = 0;
                for (RectF rectF : arrayList) {
                    float f = rectF.left;
                    PointF pointF2 = this.f189495b;
                    float f4 = pointF2.x;
                    if (f <= f4 && rectF.right >= f4 && pointF2.y < dVar.f239352a.getDrawRect$ui_kit_components_release().bottom) {
                        return i2;
                    }
                    i2++;
                }
                return -1;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e) {
        switch (this.f189494a) {
            case 0:
                Intrinsics.checkNotNullParameter(e, "e");
                f fVar = (f) this.f;
                EpsChartView epsChartView = fVar.f189497a;
                d dVar = (d) this.e;
                epsChartView.removeCallbacks(dVar);
                EpsChartView epsChartView2 = fVar.f189497a;
                a(e, epsChartView2);
                epsChartView2.postDelayed(dVar, 500L);
                break;
            default:
                Intrinsics.checkNotNullParameter(e, "e");
                ps0.d dVar2 = (ps0.d) this.f;
                BarChartView barChartView = dVar2.f239352a;
                o6.a aVar = (o6.a) this.e;
                barChartView.removeCallbacks(aVar);
                BarChartView barChartView2 = dVar2.f239352a;
                a(e, barChartView2);
                barChartView2.postDelayed(aVar, 500L);
                break;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent e2, float f, float f4) {
        switch (this.f189494a) {
            case 0:
                Intrinsics.checkNotNullParameter(e2, "e2");
                ((f) this.f).f189497a.removeCallbacks((d) this.e);
                break;
            default:
                Intrinsics.checkNotNullParameter(e2, "e2");
                ((ps0.d) this.f).f239352a.removeCallbacks((o6.a) this.e);
                break;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e2, float f, float f4) {
        switch (this.f189494a) {
            case 0:
                f fVar = (f) this.f;
                Intrinsics.checkNotNullParameter(e2, "e2");
                if (!this.d) {
                    fVar.f189497a.removeCallbacks((d) this.e);
                } else {
                    a(e2, fVar.f189497a);
                    int iB = b();
                    if (iB >= 0) {
                        fVar.f189497a.setSelectedPosition$ui_kit_components_release(iB);
                    }
                }
                break;
            default:
                ps0.d dVar = (ps0.d) this.f;
                Intrinsics.checkNotNullParameter(e2, "e2");
                if (!this.d) {
                    dVar.f239352a.removeCallbacks((o6.a) this.e);
                } else {
                    a(e2, dVar.f239352a);
                    int iB2 = b();
                    if (iB2 >= 0) {
                        dVar.f239352a.setSelectedPosition(iB2);
                    }
                }
                break;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e) {
        switch (this.f189494a) {
            case 0:
                f fVar = (f) this.f;
                Intrinsics.checkNotNullParameter(e, "e");
                if (!this.d) {
                    a(e, fVar.f189497a);
                    int iB = b();
                    if (iB >= 0) {
                        fVar.f189497a.setSelectedPosition$ui_kit_components_release(iB);
                    }
                }
                this.d = false;
                fVar.f189497a.removeCallbacks((d) this.e);
                break;
            default:
                ps0.d dVar = (ps0.d) this.f;
                Intrinsics.checkNotNullParameter(e, "e");
                if (!this.d) {
                    a(e, dVar.f239352a);
                    int iB2 = b();
                    if (iB2 >= 0) {
                        dVar.f239352a.m(iB2);
                    }
                }
                this.d = false;
                dVar.f239352a.removeCallbacks((o6.a) this.e);
                break;
        }
        return true;
    }

    public e(f fVar) {
        this.f189494a = 0;
        this.f = fVar;
        this.f189495b = new PointF();
        this.f189496c = new int[2];
        this.e = new d(this, 0);
    }
}
