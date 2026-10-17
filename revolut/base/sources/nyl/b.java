package nyl;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import androidx.core.view.GestureDetectorCompat;
import androidx.recyclerview.widget.RecyclerView;
import bx0.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.ui_kit_pdf.recycler.ZoomableLinearLayoutManager;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import nya.b0;
import nyl.b;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends RecyclerView {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f220919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f220920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f220921c;
    public final PointF d;
    public final PointF e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f220922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ValueAnimator f220923h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f220924j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f220925l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Function1 f220926m;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final GestureDetectorCompat getGestureDetector() {
        return (GestureDetectorCompat) this.f220920b.getValue();
    }

    private final ScaleGestureDetector getScaleDetector() {
        return (ScaleGestureDetector) this.f220919a.getValue();
    }

    public final void c(float f, float f4, float f5) {
        float f6 = this.f;
        this.f220922g = f6;
        float f32 = f6 * f;
        this.f = f32;
        float f35 = f.f(f32, 1.0f, this.f220925l);
        this.f = f35;
        setOverScrollMode(f35 > 1.0f ? 2 : 1);
        Function1 function1 = this.f220926m;
        if (function1 != null) {
            function1.invoke(Float.valueOf(this.f));
        }
        float width = (getWidth() * this.f) - getWidth();
        float height = (getHeight() * this.f) - getHeight();
        PointF pointF = this.e;
        pointF.set(width, height);
        PointF pointF2 = this.f220921c;
        pointF2.set(f4, f5);
        PointF pointF3 = this.d;
        float f36 = pointF3.x;
        float f37 = pointF2.x;
        float f41 = this.f220922g - this.f;
        float f42 = (f37 * f41) + f36;
        pointF3.x = f42;
        pointF3.y = (f41 * pointF2.y) + pointF3.y;
        pointF3.x = f.f(f42, -pointF.x, BitmapDescriptorFactory.HUE_RED);
        pointF3.y = f.f(pointF3.y, -pointF.y, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        PointF pointF = this.d;
        canvas.translate(pointF.x, pointF.y);
        float f = this.f;
        canvas.scale(f, f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float getMaxZoom() {
        return this.f220925l;
    }

    public final Function1<Float, Unit> getZoomChanged() {
        return this.f220926m;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent ev10) {
        Intrinsics.checkNotNullParameter(ev10, "ev");
        if (this.f220924j) {
            return super.onTouchEvent(ev10) || (getGestureDetector().onTouchEvent(ev10) || getScaleDetector().onTouchEvent(ev10));
        }
        return super.onTouchEvent(ev10);
    }

    public final void setDoubleTapZoomEnabled(boolean z) {
        this.k = z;
    }

    public final void setMaxZoom(float f) {
        this.f220925l = f;
    }

    public final void setZoomChanged(Function1<? super Float, Unit> function1) {
        this.f220926m = function1;
    }

    public final void setZoomEnabled(boolean z) {
        this.f220924j = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i2 = 0;
        this.f220919a = j.b(new Function0() { // from class: nyl.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                b bVar = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        b.a aVar = b.Companion;
                        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context2, new hu0.b(bVar, 1));
                        scaleGestureDetector.setQuickScaleEnabled(false);
                        return scaleGestureDetector;
                    default:
                        b.a aVar2 = b.Companion;
                        return new GestureDetectorCompat(context2, new q(bVar, 9));
                }
            }
        });
        final int i3 = 1;
        this.f220920b = j.b(new Function0() { // from class: nyl.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                b bVar = this;
                Context context2 = context;
                switch (i32) {
                    case 0:
                        b.a aVar = b.Companion;
                        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context2, new hu0.b(bVar, 1));
                        scaleGestureDetector.setQuickScaleEnabled(false);
                        return scaleGestureDetector;
                    default:
                        b.a aVar2 = b.Companion;
                        return new GestureDetectorCompat(context2, new q(bVar, 9));
                }
            }
        });
        this.f220921c = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.d = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.e = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.f = 1.0f;
        this.f220922g = 1.0f;
        this.f220924j = true;
        this.k = true;
        this.f220925l = 3.0f;
        setLayoutManager(new ZoomableLinearLayoutManager(context, new b0(this, 8)));
    }

    public /* synthetic */ b(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
