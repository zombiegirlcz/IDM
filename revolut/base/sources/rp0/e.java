package rp0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$attr;
import ix0.j2;
import kotlin.jvm.internal.Intrinsics;
import mx0.w5;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f256065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f256066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f256067c;
    public final Path d;
    public final Rect e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f256068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ValueAnimator f256069h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f256070j;
    public j2 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f256071l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public fu0.l f256072m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f256073n;

    public e(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f256065a = recyclerView;
        this.d = new Path();
        this.e = new Rect();
        Intrinsics.checkNotNullExpressionValue(recyclerView.getContext(), "getContext(...)");
        this.f256068g = kli.a.k(r0, 16.0f);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i = R$attr.internal_colorPopupOverlayAlpha;
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        this.i = ResourcesCompat.getFloat(context.getResources(), typedValue.resourceId);
        Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iS = kli.a.s(R$attr.internal_colorPopupOverlay, context2);
        this.f256070j = iS;
        Paint paint = new Paint(1);
        paint.setColor(iS);
        this.f256071l = paint;
    }

    public final void a(boolean z) {
        ValueAnimator valueAnimator = this.f256069h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f, z ? this.i : BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.addUpdateListener(new w5(this, 4));
        valueAnimatorOfFloat.addListener(new mx0.l0(z, this));
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.start();
        this.f256069h = valueAnimatorOfFloat;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas c2, RecyclerView parent, RecyclerView.State state) {
        float f;
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        View view = this.f256067c;
        if (view == null || this.f <= BitmapDescriptorFactory.HUE_RED || !view.isAttachedToWindow() || view.getParent() == null) {
            this.f256073n = false;
            return;
        }
        this.f256073n = true;
        float f4 = this.f;
        int alphaComponent = this.f256070j;
        if (f4 != 1.0f) {
            alphaComponent = ColorUtils.setAlphaComponent(alphaComponent, rim.d.c(((alphaComponent >> 24) & 255) * f4));
        }
        Paint paint = this.f256071l;
        paint.setColor(alphaComponent);
        fu0.l lVar = this.f256072m;
        Rect rect = this.e;
        if (lVar != null) {
            fu0.g gVar = lVar.f;
            lVar.B();
            gVar.getClass();
            Intrinsics.checkNotNullParameter(rect, "rect");
            rect.set(gVar.f138063a);
            rect.offset(view.getLeft(), view.getTop());
            f = gVar.f138065c;
        } else {
            view.getHitRect(rect);
            f = this.f256068g;
        }
        float f5 = f;
        Path path = this.d;
        path.reset();
        path.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, f5, f5, Path.Direction.CW);
        c2.drawPath(path, paint);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f256073n) {
            int iSave = canvas.save();
            try {
                canvas.clipOutPath(this.d);
                canvas.drawColor(this.f256071l.getColor());
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }
}
