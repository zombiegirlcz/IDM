package rp0;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v1 extends ColorDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f256204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f256205b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(z1 z1Var, View targetView, int i) {
        super(i);
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        this.f256204a = targetView;
        View decorView = z1Var.f256230a.getWindow().getDecorView();
        Intrinsics.i(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f256205b = (ViewGroup) decorView;
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.draw(canvas);
        canvas.save();
        View view = this.f256204a;
        ViewGroup viewGroup = this.f256205b;
        canvas.translate(knm.b.f(view, viewGroup), knm.b.h(view, viewGroup));
        view.draw(canvas);
        canvas.restore();
    }
}
