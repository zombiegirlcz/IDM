package mx0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class hd extends FrameLayout implements ny0.h {

    @NotNull
    public static final a Companion = new a();
    public static final Interpolator i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f209739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f209740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f209741c;
    public View d;
    public final wb e;
    public final Paint f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ValueAnimator f209742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Path f209743h;

    public static final class a {
        private a() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public static boolean a(HomeOverlayConfig homeOverlayConfig) {
            return ((Boolean) jo0.g.f176838x.getValue()).booleanValue() && homeOverlayConfig != null;
        }
    }

    static {
        Interpolator interpolator = jq0.r.f177392a;
        i = jq0.r.f177393b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hd(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void b(hd hdVar, aw0.gb view, View expandedView, pe2.c onFinish) {
        hdVar.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(expandedView, "expandedView");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        View view2 = view.f10327a;
        ValueAnimator valueAnimator = hdVar.f209742g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorF = new jy0.m(view2, hdVar, expandedView, hdVar.e, hdVar.f209743h, false, null).f();
        valueAnimatorF.addListener(new id(hdVar, valueAnimatorF, expandedView, onFinish, null));
        valueAnimatorF.start();
    }

    public final boolean a(ppi.a onFinish, ppi.a aVar) {
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        View view = this.d;
        if (this.e.f210088j == null || view == null) {
            return false;
        }
        ValueAnimator valueAnimator = this.f209742g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorF = new jy0.m(null, this, view, this.e, this.f209743h, true, null).f();
        valueAnimatorF.addListener(new id(this, valueAnimatorF, view, onFinish, aVar));
        valueAnimatorF.start();
        return true;
    }

    public final void c() {
        ValueAnimator valueAnimator = this.f209742g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // ny0.h
    public boolean getFitsReadableArea() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        wb wbVar = this.e;
        float f = wbVar.f210083a;
        if ((f == BitmapDescriptorFactory.HUE_RED && wbVar.f210084b == BitmapDescriptorFactory.HUE_RED && wbVar.f210085c == 1.0f && wbVar.d == 1.0f && wbVar.k == 0) || (bitmap = wbVar.f210088j) == null) {
            return;
        }
        int i2 = (int) (255 * wbVar.d);
        float f4 = wbVar.f210084b;
        int i3 = wbVar.f210091n;
        float f5 = wbVar.f210085c;
        float f6 = (i3 * f5) + f4;
        float f32 = (wbVar.o * f5) + f;
        float f35 = ((i3 + wbVar.f210092p) * f5) + f4;
        float f36 = ((r8 + wbVar.f210093q) * f5) + f;
        RectF rectF = this.f209740b;
        rectF.set(f6, f32, f35, f36);
        Paint paint = this.f209739a;
        paint.setAlpha(i2);
        Path path = this.f209743h;
        if (!path.isEmpty()) {
            canvas.clipPath(path);
        }
        int i5 = wbVar.k;
        if (i5 == 0) {
            canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
            return;
        }
        int iB = io0.a.b(wbVar.d, i5);
        Paint paint2 = this.f;
        paint2.setColor(iB);
        float f37 = wbVar.i;
        float f41 = wbVar.f210085c;
        float f42 = f37 * f41;
        float f57 = wbVar.f210084b;
        float f69 = wbVar.f210083a;
        float f75 = (wbVar.f210089l * f41) + f57;
        float f77 = (wbVar.f210090m * f41) + f69;
        RectF rectF2 = this.f209741c;
        rectF2.set(f57, f69, f75, f77);
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
        canvas.drawRoundRect(rectF2, f42, f42, paint2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hd(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd(@NotNull Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f209739a = new Paint();
        this.f209740b = new RectF();
        this.f209741c = new RectF();
        this.e = new wb(0);
        this.f = new Paint(1);
        this.f209743h = new Path();
        setWillNotDraw(false);
    }

    public /* synthetic */ hd(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }
}
