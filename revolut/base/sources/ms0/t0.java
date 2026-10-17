package ms0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.ProgressStepHorizontalV2Delegate;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class t0 extends LinearLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f208427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f208428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f208429c;
    public float d;
    public final Paint e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f208430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Path f208431h;
    public final Paint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f208432j;
    public final Paint k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f208433l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f208434m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f208435n;
    public final float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f208436p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f208437q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f208438r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f208439s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f208440t;
    public z0 u;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t0(@NotNull Context context) {
        this(context, null, 0, 14);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final float getCenterX() {
        return getWidth() / 2.0f;
    }

    private final float getProgressCenterY() {
        return getPaddingTop() + this.o;
    }

    public final float a(z0 z0Var) {
        if (z0Var instanceof w0) {
            return this.f208437q * 2;
        }
        if (z0Var instanceof x0) {
            return this.f208436p * 2;
        }
        if (z0Var instanceof y0) {
            return this.f208427a.getWidth();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b() {
        int i;
        float width;
        float fA;
        float fA2;
        z0 z0Var = this.u;
        if (z0Var == null) {
            return;
        }
        boolean z = z0Var instanceof x0;
        float f = this.f208436p;
        float f4 = z ? f : this.f208437q;
        int i2 = this.f208440t;
        this.d = i2 != 3 ? i2 != 5 ? getCenterX() : (getWidth() - getPaddingEnd()) - f4 : f4 + getPaddingStart();
        int i3 = this.f208440t;
        this.f = i3 != 3 ? i3 != 5 ? getCenterX() : (getWidth() - getPaddingEnd()) - f : getPaddingStart() + f;
        v0 v0VarA = z0Var.a();
        float f5 = this.f208434m;
        float f6 = this.f208439s;
        float f32 = this.f208438r;
        int i5 = this.f208433l;
        float fFloor = -1.0f;
        if (v0VarA != null && (i = this.f208440t) != 3) {
            if (i != 5) {
                width = getCenterX() - f5;
                fA = a(z0Var) / 2;
            } else {
                width = (getWidth() - f5) - getPaddingEnd();
                fA = a(z0Var);
            }
            fFloor = width - fA;
            int i6 = a1.f208174a[v0VarA.f208463b.ordinal()];
            if (i6 == 1) {
                fFloor = ((i5 + f32) * ((float) Math.floor((fFloor - f6) / r2))) + f6;
            } else if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        float f35 = fFloor;
        v0 v0VarA2 = z0Var.a();
        float centerX = BitmapDescriptorFactory.HUE_RED;
        float f36 = this.f208435n;
        if (v0VarA2 != null) {
            Path path = this.f208431h;
            path.reset();
            int i21 = a1.f208174a[v0VarA2.f208463b.ordinal()];
            if (i21 == 1) {
                for (float f37 = 0.0f; f37 < f35; f37 += i5 + f32) {
                    path.addCircle(f37, getProgressCenterY(), f6, Path.Direction.CW);
                }
            } else {
                if (i21 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                float f41 = f36 / 2;
                float progressCenterY = getProgressCenterY() - f41;
                float f42 = progressCenterY + f36;
                path.addRect(BitmapDescriptorFactory.HUE_RED, progressCenterY, f35 - f41, f42, Path.Direction.CW);
                path.addArc(f35 - f36, progressCenterY, f35, f42, 270.0f, 180.0f);
            }
        }
        v0 v0VarB = z0Var.b();
        if (v0VarB == null) {
            return;
        }
        int i22 = this.f208440t;
        if (i22 == 1) {
            v0 v0VarA3 = z0Var.a();
            if ((v0VarA3 != null ? v0VarA3.f208463b : null) == u0.DOTTED) {
                centerX = ((getCenterX() - f5) - (a(z0Var) / 2)) - f35;
            }
            fA2 = (a(z0Var) / 2) + getCenterX() + f5 + centerX;
        } else if (i22 != 3) {
            return;
        } else {
            fA2 = a(z0Var) + getPaddingStart() + f5;
        }
        float f57 = fA2;
        Path path2 = this.f208432j;
        path2.reset();
        float width2 = getWidth();
        float f69 = f36 / 2;
        float progressCenterY2 = getProgressCenterY() - f69;
        float f75 = progressCenterY2 + f36;
        int i32 = a1.f208174a[v0VarB.f208463b.ordinal()];
        if (i32 == 1) {
            while (width2 > f57) {
                path2.addCircle(width2, getProgressCenterY(), f6, Path.Direction.CW);
                width2 -= i5 + f32;
            }
        } else {
            if (i32 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            path2.addArc(f57, progressCenterY2, f57 + f36, f75, 90.0f, 180.0f);
            path2.addRect(f69 + f57, progressCenterY2, width2, f75, Path.Direction.CW);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        z0 z0Var = this.u;
        if (z0Var == null) {
            return;
        }
        if (this.f208440t != 3 && z0Var.a() != null) {
            canvas.drawPath(this.f208431h, this.i);
        }
        boolean z = z0Var instanceof w0;
        Paint paint = this.e;
        float f = this.f208437q;
        if (z) {
            canvas.drawCircle(this.d, getProgressCenterY(), f, paint);
        } else if (z0Var instanceof x0) {
            canvas.drawCircle(this.f, getProgressCenterY(), this.f208436p, this.f208430g);
            canvas.drawCircle(this.d, getProgressCenterY(), f, paint);
        } else if (!(z0Var instanceof y0)) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.f208440t == 5 || z0Var.b() == null) {
            return;
        }
        canvas.drawPath(this.f208432j, this.k);
    }

    public final z0 getState() {
        return this.u;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        b();
    }

    @Override // android.widget.LinearLayout
    public void setGravity(int i) {
        if (i != 1 && i != 3 && i != 5) {
            throw new UnsupportedOperationException(a0.d.n("Unsupported gravity ", i));
        }
        super.setGravity(i);
        this.f208440t = i;
        TextView textView = this.f208428b;
        textView.setGravity(i);
        TextView textView2 = this.f208429c;
        textView2.setGravity(i);
        int iK = 0;
        if (i == 3) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            setPadding(kli.a.k(context, 8.0f), getPaddingTop(), 0, getPaddingBottom());
        } else if (i != 5) {
            setPadding(0, getPaddingTop(), 0, getPaddingBottom());
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            setPadding(0, getPaddingTop(), kli.a.k(context2, 8.0f), getPaddingBottom());
        }
        if (i != 3 && i != 5) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            iK = kli.a.k(context3, 4.0f);
        }
        textView.setPadding(iK, textView.getPaddingTop(), iK, textView.getPaddingBottom());
        textView2.setPadding(iK, textView2.getPaddingTop(), iK, textView2.getPaddingBottom());
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new UnsupportedOperationException(a0.d.n("Unsupported orientation ", i));
        }
        super.setOrientation(i);
    }

    public final void setState(z0 z0Var) {
        v0 v0VarB;
        v0 v0VarA;
        if (Intrinsics.f(this.u, z0Var)) {
            return;
        }
        this.u = z0Var;
        boolean z = z0Var instanceof y0;
        ImageView imageView = this.f208427a;
        if (z) {
            zi0.c.g(imageView, new ResourceImage(R$drawable.uikit_icn_24_exclamation_mark, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246));
        } else {
            imageView.setVisibility(4);
        }
        if (z0Var != null && (v0VarA = z0Var.a()) != null) {
            Color.Solid solid = v0VarA.f208462a;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.i.setColor(io0.a.c(context, solid));
        }
        if (z0Var != null && (v0VarB = z0Var.b()) != null) {
            Color.Solid solid2 = v0VarB.f208462a;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            this.k.setColor(io0.a.c(context2, solid2));
        }
        boolean z3 = z0Var instanceof w0;
        Paint paint = this.e;
        if (z3) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            paint.setColor(io0.a.c(context3, ((w0) z0Var).f208472a));
        } else if (z0Var instanceof x0) {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            paint.setColor(io0.a.c(context4, ProgressStepHorizontalV2Delegate.d));
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            this.f208430g.setColor(io0.a.c(context5, ProgressStepHorizontalV2Delegate.e));
        }
        if (isLaidOut()) {
            b();
        }
        invalidate();
    }

    public final void setSubtitle(@NotNull Clause subtitleClause) {
        Intrinsics.checkNotNullParameter(subtitleClause, "subtitleClause");
        kli.a.b(this.f208429c, subtitleClause, ty0.f.f275450a);
    }

    public final void setTitle(@NotNull Clause titleClause, @NotNull Color color) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(color, "color");
        TextView textView = this.f208428b;
        kli.a.b(textView, titleClause, ty0.f.f275450a);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(io0.a.c(context, color));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t0(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t0(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t0(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        int i3 = 4;
        i = (i2 & 4) != 0 ? 0 : i;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, i, 0);
        this.d = -1.0f;
        this.e = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        this.f = -1.0f;
        this.f208430g = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        this.f208431h = new Path();
        this.i = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        this.f208432j = new Path();
        this.k = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        this.f208433l = kli.a.k(context, 3.5f);
        this.f208434m = kli.a.l(context, 8.0f);
        float fL = kli.a.l(context, 4.0f);
        this.f208435n = fL;
        this.o = kli.a.l(context, 10.0f);
        this.f208436p = kli.a.l(context, 8.0f);
        this.f208437q = kli.a.l(context, 4.0f);
        this.f208438r = fL;
        this.f208439s = fL / 2;
        this.f208440t = 1;
        View.inflate(context, R$layout.internal_view_horizontal_progress_step, this);
        View viewFindViewById = findViewById(R$id.viewHorizontalProgressStep_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f208427a = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.viewHorizontalProgressStep_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f208428b = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.viewHorizontalProgressStep_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f208429c = (TextView) viewFindViewById3;
        setOrientation(1);
        setGravity(this.f208440t);
        setPadding(getPaddingLeft(), kli.a.k(context, 4.0f), getPaddingRight(), getPaddingBottom());
        RoundedBackgroundDrawable roundedBackgroundDrawable = new RoundedBackgroundDrawable(context, kli.a.s(R$attr.uikit_colorTransparent, context), i3);
        roundedBackgroundDrawable.f(kli.a.k(context, 12.0f));
        fp0.b surface = fp0.b.f137017a;
        Intrinsics.checkNotNullParameter(surface, "surface");
        dr0.z zVar = new dr0.z(surface);
        if (!Intrinsics.f(roundedBackgroundDrawable.i, zVar)) {
            roundedBackgroundDrawable.i = zVar;
            roundedBackgroundDrawable.f56010m = true;
        }
        setBackground(roundedBackgroundDrawable);
    }
}
