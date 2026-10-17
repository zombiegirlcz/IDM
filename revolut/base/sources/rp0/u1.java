package rp0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u1 extends ColorDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f256197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f256198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f256199c;
    public final float d;
    public final RectF e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(z1 z1Var, View targetView, int i, Integer num) {
        float f;
        super(i);
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        this.f256197a = targetView;
        View decorView = z1Var.f256230a.getWindow().getDecorView();
        Intrinsics.i(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f256198b = (ViewGroup) decorView;
        this.f256199c = new Path();
        this.e = new RectF();
        ViewOutlineProvider outlineProvider = targetView.getOutlineProvider();
        if (num != null) {
            Context context = targetView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            f = kli.a.w(num.intValue(), context);
        } else if (outlineProvider != null) {
            float width = targetView.getWidth();
            float height = targetView.getHeight();
            Outline outline = new Outline();
            outlineProvider.getOutline(targetView, outline);
            f = kotlin.ranges.f.f(outline.getRadius(), BitmapDescriptorFactory.HUE_RED, Math.min(width, height) * 0.5f);
        } else {
            f = 0.0f;
        }
        this.d = f;
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        View view = this.f256197a;
        ViewGroup viewGroup = this.f256198b;
        float f = knm.b.f(view, viewGroup);
        float fH = knm.b.h(view, viewGroup);
        float width = f + view.getWidth();
        float height = fH + view.getHeight();
        RectF rectF = this.e;
        float f4 = rectF.left;
        Path path = this.f256199c;
        if (f != f4 || fH != rectF.top || width != rectF.right || height != rectF.bottom) {
            path.reset();
            float f5 = this.d;
            path.addRoundRect(f, fH, width, height, f5, f5, Path.Direction.CW);
            rectF.set(f, fH, width, height);
        }
        canvas.clipOutPath(path);
        super.draw(canvas);
        canvas.restore();
    }
}
