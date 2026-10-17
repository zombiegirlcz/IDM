package com.revolut.camerakit.ui.views.view;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import au0.l5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.camerakit.ui.views.view.TrackingFaceMaskView;
import jb3.l;
import jji.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;
import rz.u;
import sz.a;
import uz.j0;
import uz.k0;
import x9m.b;
import x9m.j;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R.\u0010\u001d\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/revolut/camerakit/ui/views/view/TrackingFaceMaskView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lrz/b;", "face", "", "setFace", "(Lrz/b;)V", "", "enabled", "Lrz/u;", "targetLocation", "setMaskBorderActivated", "(ZLrz/u;)V", "Lsz/a;", "value", "u", "Lsz/a;", "getModelsSource$camera_kit_ui_views_release", "()Lsz/a;", "setModelsSource$camera_kit_ui_views_release", "(Lsz/a;)V", "modelsSource", "Companion", "uz/k0", "a", "camera_kit_ui_views_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrackingFaceMaskView extends View {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f50875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f50876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f50877c;
    public final AccelerateInterpolator d;
    public final b e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f50878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f50879h;
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f50880j;
    public final k0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k0 f50881l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f50882m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ValueAnimator f50883n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f50884p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f50885q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ValueAnimator f50886r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ValueAnimator f50887s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ValueAnimator f50888t;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public a modelsSource;
    public final RectF v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Path f50889w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Matrix f50890x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public rz.b f50891y;
    public final Paint z;

    /* JADX INFO: renamed from: com.revolut.camerakit.ui.views.view.TrackingFaceMaskView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrackingFaceMaskView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        a aVar;
        if (this.o || (aVar = this.modelsSource) == null) {
            return;
        }
        Path pathB = ((sz.b) aVar).b();
        rz.b bVar = this.f50891y;
        if (bVar == null) {
            return;
        }
        Rect rect = bVar.f258440a;
        RectF rectF = this.v;
        pathB.computeBounds(rectF, true);
        if (rectF.height() == BitmapDescriptorFactory.HUE_RED || rectF.width() == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        k0 k0Var = this.k;
        float f = k0Var.f284532a;
        float f4 = k0Var.f284533b;
        float f5 = k0Var.d;
        float f6 = k0Var.f284534c;
        boolean z = this.f50880j;
        k0 k0Var2 = this.f50881l;
        float fExactCenterX = !z ? rect.exactCenterX() : k0Var2.f284532a;
        float fExactCenterY = !this.f50880j ? rect.exactCenterY() : k0Var2.f284533b;
        boolean z3 = this.f50880j;
        float f32 = !z3 ? bVar.f258441b : k0Var2.d;
        float fHeight = !z3 ? rect.height() / rectF.height() : k0Var2.f284534c;
        b bVar2 = this.e;
        bVar2.f303748a = fExactCenterX - f;
        bVar2.f303749b = fExactCenterY - f4;
        float fSqrt = ((float) Math.sqrt((r12 * r12) + (r10 * r10))) / this.f50875a;
        AccelerateInterpolator accelerateInterpolator = this.d;
        float f35 = f.f(accelerateInterpolator.getInterpolation(fSqrt), BitmapDescriptorFactory.HUE_RED, 1.0f);
        float f36 = bVar2.f303748a * f35;
        float f37 = bVar2.f303749b * f35;
        b bVar3 = this.f;
        bVar3.f303748a = f36;
        bVar3.f303749b = f37;
        float f41 = f32 - f5;
        float f42 = f.f(accelerateInterpolator.getInterpolation(Math.abs(f41) / this.f50876b), BitmapDescriptorFactory.HUE_RED, 1.0f) * f41;
        float f57 = fHeight - f6;
        float f69 = f.f(accelerateInterpolator.getInterpolation(Math.abs(f57) / this.f50877c), BitmapDescriptorFactory.HUE_RED, 1.0f) * f57;
        ValueAnimator valueAnimator = this.f50886r;
        valueAnimator.cancel();
        valueAnimator.setDuration(this.A ? 0L : 100L);
        j jVar = j.X;
        float f75 = k0Var.f284532a;
        b bVar4 = this.f50878g;
        bVar4.a(jVar, f75);
        j jVar2 = j.Y;
        bVar4.a(jVar2, k0Var.f284533b);
        Unit unit = Unit.f186387a;
        float f77 = k0Var.f284532a + bVar3.f303748a;
        b bVar5 = this.f50879h;
        bVar5.a(jVar, f77);
        bVar5.a(jVar2, k0Var.f284533b + bVar3.f303749b);
        valueAnimator.setObjectValues(bVar4, bVar5);
        valueAnimator.start();
        ValueAnimator valueAnimator2 = this.f50887s;
        valueAnimator2.cancel();
        valueAnimator2.setDuration(this.A ? 0L : 100L);
        float f81 = k0Var.d;
        valueAnimator2.setFloatValues(f81, f81 + f42);
        valueAnimator2.start();
        ValueAnimator valueAnimator3 = this.f50888t;
        valueAnimator3.cancel();
        valueAnimator3.setDuration(this.A ? 0L : 100L);
        float f82 = k0Var.f284534c;
        valueAnimator3.setFloatValues(f82, f82 + f69);
        valueAnimator3.start();
        k0Var.d += f42;
        k0Var.f284534c += f69;
    }

    /* JADX INFO: renamed from: getModelsSource$camera_kit_ui_views_release, reason: from getter */
    public final a getModelsSource() {
        return this.modelsSource;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        a aVar = this.modelsSource;
        Path path = this.f50889w;
        if (aVar != null) {
            Path pathB = ((sz.b) aVar).b();
            RectF rectF = this.v;
            pathB.computeBounds(rectF, true);
            Matrix matrix = this.f50890x;
            matrix.reset();
            k0 k0Var = this.k;
            matrix.preTranslate(k0Var.f284532a, k0Var.f284533b);
            matrix.preRotate(k0Var.d);
            float f = k0Var.f284534c;
            matrix.preScale(f, f);
            float f4 = 2;
            matrix.preTranslate((-rectF.width()) / f4, (-rectF.height()) / f4);
            path.rewind();
            path.set(pathB);
            path.transform(matrix);
        }
        if (this.f50891y != null) {
            int i = this.f50885q;
            Paint paint = this.z;
            paint.setColor(i);
            canvas.drawPath(path, paint);
        }
    }

    public final void setFace(rz.b face) {
        this.A = face != null && this.f50891y == null;
        this.f50891y = face;
        a();
        invalidate();
    }

    public final void setMaskBorderActivated(boolean enabled, u targetLocation) {
        if (targetLocation == null) {
            return;
        }
        int i = targetLocation.f258458b;
        int i2 = targetLocation.f258459c;
        int i3 = targetLocation.f258457a;
        int i5 = targetLocation.d;
        if (enabled == this.f50880j) {
            return;
        }
        this.f50880j = enabled;
        k0 k0Var = this.f50881l;
        k0 k0Var2 = this.k;
        RectF rectF = this.v;
        if (enabled) {
            a aVar = this.modelsSource;
            if (aVar != null) {
                ((sz.b) aVar).b().computeBounds(rectF, true);
                k0Var.f284532a = (i2 / 2.0f) + i3;
                k0Var.f284533b = (i5 / 2.0f) + i;
                k0Var.f284534c = i5 / rectF.height();
                k0Var.d = BitmapDescriptorFactory.HUE_RED;
            }
        } else {
            a();
            k0Var.f284532a = k0Var2.f284532a;
            k0Var.f284533b = k0Var2.f284533b;
            k0Var.f284534c = k0Var2.f284534c;
            k0Var.d = k0Var2.d;
            k0Var2.f284532a = (i2 / 2.0f) + i3;
            k0Var2.f284533b = (i5 / 2.0f) + i;
            k0Var2.f284534c = i5 / rectF.height();
            k0Var2.d = BitmapDescriptorFactory.HUE_RED;
        }
        k0 k0VarA = k0.a(k0Var2);
        k0 k0VarA2 = k0.a(k0Var);
        ValueAnimator valueAnimator = this.f50882m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new d(this, 4, k0VarA, k0VarA2));
        valueAnimatorOfFloat.addListener(new l5(this, 28));
        valueAnimatorOfFloat.start();
        this.f50882m = valueAnimatorOfFloat;
        int i6 = this.f50885q;
        int i21 = enabled ? 0 : this.f50884p;
        ValueAnimator valueAnimator2 = this.f50883n;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(i6, i21);
        valueAnimatorOfArgb.setDuration(100L);
        valueAnimatorOfArgb.addUpdateListener(new j0(this, 3));
        valueAnimatorOfArgb.start();
        this.f50883n = valueAnimatorOfArgb;
        invalidate();
    }

    public final void setModelsSource$camera_kit_ui_views_release(a aVar) {
        this.modelsSource = aVar;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrackingFaceMaskView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingFaceMaskView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f50875a = l.g(context, 2.5f);
        this.f50876b = 5.0f;
        this.f50877c = 0.1f;
        this.d = new AccelerateInterpolator();
        this.e = new b();
        this.f = new b();
        b bVar = new b();
        this.f50878g = bVar;
        this.f50879h = new b();
        this.i = new b();
        k0 k0Var = new k0(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED);
        this.k = k0Var;
        this.f50881l = k0.a(k0Var);
        int color = Color.parseColor("#80FF9F0A");
        this.f50884p = color;
        this.f50885q = color;
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new TypeEvaluator() { // from class: uz.i0
            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f, Object obj2, Object obj3) {
                TrackingFaceMaskView.Companion companion = TrackingFaceMaskView.INSTANCE;
                Intrinsics.i(obj2, "null cannot be cast to non-null type dev.romainguy.kotlin.math.Float2");
                x9m.b bVar2 = (x9m.b) obj2;
                Intrinsics.i(obj3, "null cannot be cast to non-null type dev.romainguy.kotlin.math.Float2");
                x9m.b bVar3 = (x9m.b) obj3;
                TrackingFaceMaskView trackingFaceMaskView = this.f284525a;
                float f4 = 1 - f;
                trackingFaceMaskView.i.a(x9m.j.X, (bVar3.f303748a * f) + (bVar2.f303748a * f4));
                x9m.b bVar4 = trackingFaceMaskView.i;
                bVar4.a(x9m.j.Y, (f * bVar3.f303749b) + (f4 * bVar2.f303749b));
                return bVar4;
            }
        }, bVar, bVar);
        valueAnimatorOfObject.setDuration(100L);
        valueAnimatorOfObject.addUpdateListener(new j0(this, 0));
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfObject, "apply(...)");
        this.f50886r = valueAnimatorOfObject;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(new float[0]);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new j0(this, 1));
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
        this.f50887s = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(new float[0]);
        valueAnimatorOfFloat2.setDuration(100L);
        valueAnimatorOfFloat2.addUpdateListener(new j0(this, 2));
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat2, "apply(...)");
        this.f50888t = valueAnimatorOfFloat2;
        this.v = new RectF();
        this.f50889w = new Path();
        this.f50890x = new Matrix();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(l.g(context, 4.0f));
        paint.setAntiAlias(true);
        this.z = paint;
    }

    public /* synthetic */ TrackingFaceMaskView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
