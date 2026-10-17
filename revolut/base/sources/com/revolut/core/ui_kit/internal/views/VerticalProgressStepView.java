package com.revolut.core.ui_kit.internal.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import au0.b5;
import aw0.v1;
import bp0.y;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalSmallButton;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ms0.a6;
import ms0.h4;
import ms0.l5;
import ms0.m5;
import ms0.n5;
import ms0.p5;
import ms0.q5;
import ms0.r5;
import ms0.s5;
import ms0.t5;
import ms0.u5;
import ms0.v5;
import ms0.w5;
import ms0.x5;
import ms0.y5;
import ms0.z5;
import mx0.bb;
import mx0.cb;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0007\u00059:\u001d;<=J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0011J/\u0010\u0017\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\n2\b\u0010\"\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\u00020\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\nH\u0002¢\u0006\u0004\b+\u0010\rR$\u00103\u001a\u0004\u0018\u00010,8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006>"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/VerticalProgressStepView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqp0/a;", "Lur0/a;", "Lms0/t5;", "state", "", "setState", "(Lms0/t5;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "title", "setTitle", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui/models/Color;", "color", "setTitleColor", "(Lcom/revolut/core/ui/models/Color;)V", "setSubtitleColor", "subtitle", "Lkotlin/Function1;", "Lty0/a;", "onClick", "setSubtitle", "(Lcom/revolut/core/ui_kit/models/Clause;Lkotlin/jvm/functions/Function1;)V", "", "maxLines", "setSubtitleMaxLines", "(I)V", "Lms0/m5;", "component", "setEndComponent", "(Lms0/m5;)V", "primaryActionClause", "secondaryActionClause", "setTwinButtonsTexts", "(Lcom/revolut/core/ui_kit/models/Clause;Lcom/revolut/core/ui_kit/models/Clause;)V", "", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "icons", "setEndIcons", "(Ljava/util/List;)V", "text", "setEndPrimaryActionButton", "Landroid/os/Parcelable;", "G", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "Landroid/content/Context;", "getDynamicContext", "()Landroid/content/Context;", "dynamicContext", "Companion", "ms0/w5", "ms0/z5", "ms0/n5", "ms0/o5", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VerticalProgressStepView extends ConstraintLayout implements TrackableItem, qp0.a, ur0.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final Paint A;
    public t5 B;
    public z5 C;
    public Color D;
    public Color E;
    public boolean F;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a5h.g f56478b;
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UIKitTextView f56479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UIKitTextView f56480h;
    public final TwinHorizontalSmallButton i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final OverlappedIconsView f56481j;
    public final SmallActionButton k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final FrameLayout f56482l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f56483m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f56484n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f56485p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f56486q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f56487r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RectF f56488s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Paint f56489t;
    public final RectF u;
    public final Paint v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Paint f56490w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f56491x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f56492y;
    public ValueAnimator z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.VerticalProgressStepView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalProgressStepView(@NotNull Context context) {
        this(context, null, 0, 14, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setEndIcons(List<? extends Image> icons) {
        if (icons.size() > 3) {
            int size = icons.size() - 2;
            aim.e eVarB = u.b();
            a0.x(icons.subList(0, 2), eVarB);
            Context context = this.f56481j.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            eVarB.add(new TextImage(a0.d.n("+", size), kli.a.s(R$attr.uikit_colorGrey50, context), kli.a.s(R$attr.uikit_colorGrey10, context), 0, 16, 40, 200));
            icons = u.a(eVarB);
        }
        bb bbVar = bb.REGULAR20;
        cb cbVar = cb.TOP_TO_BOTTOM;
        OverlappedIconsView.setIcons$default(this.f56481j, icons, bbVar, cbVar, 0, false, 16, null);
        if (this.F) {
            return;
        }
        this.F = true;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        Intrinsics.checkNotNullParameter(constraintSet, "<this>");
        FrameLayout source = this.f56482l;
        Intrinsics.checkNotNullParameter(source, "source");
        UIKitTextView target = this.f56480h;
        Intrinsics.checkNotNullParameter(target, "target");
        constraintSet.connect(source.getId(), 4, target.getId(), 4, 0);
        constraintSet.applyTo(this);
    }

    private final void setEndPrimaryActionButton(Clause text) {
        h4 h4Var = h4.ACCENT;
        SmallActionButton smallActionButton = this.k;
        smallActionButton.i(h4Var);
        smallActionButton.setText(text);
        if (this.F) {
            this.F = false;
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(this);
            Intrinsics.checkNotNullParameter(constraintSet, "<this>");
            FrameLayout view = this.f56482l;
            Intrinsics.checkNotNullParameter(view, "view");
            constraintSet.clear(view.getId(), 4);
            constraintSet.applyTo(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setSubtitle$default(VerticalProgressStepView verticalProgressStepView, Clause clause, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        verticalProgressStepView.setSubtitle(clause, function1);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        n5 n5VarD;
        n5 n5VarD2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        t5 t5Var = this.B;
        boolean z = t5Var instanceof q5;
        Paint paint = this.A;
        float f = this.f56486q;
        if (z) {
            canvas.drawCircle(this.f56485p, this.o, f, paint);
        } else if (t5Var instanceof r5) {
            canvas.drawCircle(this.f56485p, this.o, this.f56492y, this.f56490w);
            canvas.drawCircle(this.f56485p, this.o, f, paint);
        }
        t5 t5Var2 = this.B;
        float f4 = this.f56487r;
        if (t5Var2 != null && (n5VarD2 = t5Var2.d()) != null && (n5VarD2 == n5.TOP || n5VarD2 == n5.TOP_BOTTOM)) {
            RectF rectF = this.f56488s;
            if (!rectF.isEmpty()) {
                canvas.drawRoundRect(rectF, f4, f4, this.f56489t);
            }
        }
        t5 t5Var3 = this.B;
        if (t5Var3 == null || (n5VarD = t5Var3.d()) == null) {
            return;
        }
        if (n5VarD == n5.BOTTOM || n5VarD == n5.TOP_BOTTOM) {
            RectF rectF2 = this.u;
            if (rectF2.isEmpty()) {
                return;
            }
            canvas.drawRoundRect(rectF2, f4, f4, this.v);
        }
    }

    public final void f0(t5 t5Var) {
        w5 w5VarA = t5Var.a();
        int iG0 = w5VarA != null ? g0(w5VarA) : 0;
        w5 w5VarC = t5Var.c();
        int iG02 = w5VarC != null ? g0(w5VarC) : 0;
        this.f56489t.setColor(iG0);
        this.v.setColor(iG02);
        boolean z = t5Var instanceof q5;
        Paint paint = this.A;
        if (z) {
            paint.setColor(g0(((q5) t5Var).f208387a));
        } else if (t5Var instanceof r5) {
            r5 r5Var = (r5) t5Var;
            paint.setColor(g0(r5Var.f208406a));
            this.f56490w.setColor(g0(r5Var.f208407b));
        }
        zi0.c.g(this.f, t5Var instanceof p5 ? new ResourceImage(R$drawable.uikit_icn_24_exclamation_mark, (Integer) null, Integer.valueOf(g0(((p5) t5Var).f208371a)), (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, Constants.TAG_SUPPORTED_LOCALE_LIST) : t5Var instanceof s5 ? new ResourceImage(R$drawable.uikit_icn_24_time, (Integer) null, Integer.valueOf(g0(((s5) t5Var).f208423a)), (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, Constants.TAG_SUPPORTED_LOCALE_LIST) : null);
    }

    public final int g0(w5 w5Var) {
        Color.Solid solid;
        z5 z5Var = this.C;
        if (Intrinsics.f(z5Var, y5.f208500a)) {
            Context dynamicContext = getDynamicContext();
            if (w5Var instanceof v5) {
                solid = ((v5) w5Var).f208470a;
            } else {
                if (!(w5Var instanceof u5)) {
                    throw new NoWhenBranchMatchedException();
                }
                solid = ((u5) w5Var).f208460a;
            }
            return io0.a.c(dynamicContext, solid);
        }
        if (!(z5Var instanceof x5)) {
            throw new NoWhenBranchMatchedException();
        }
        if (w5Var instanceof u5) {
            return io0.a.b(((u5) w5Var).f208461b, kli.a.s(((x5) z5Var).f208489a.a(), getDynamicContext()));
        }
        if (w5Var instanceof v5) {
            return io0.a.c(getDynamicContext(), ((v5) w5Var).f208470a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public Parcelable getAnalyticsContext() {
        return this.analyticsContext;
    }

    @Override // qp0.a
    @NotNull
    public Context getDynamicContext() {
        return (Context) this.f56478b.f;
    }

    public final void h0() {
        int i;
        float fL;
        float height;
        float fL2;
        float f;
        float fL3;
        t5 t5Var = this.B;
        if (t5Var == null) {
            return;
        }
        int i2 = a6.f208180b[t5Var.getSize().ordinal()];
        if (i2 == 1) {
            i = this.f56483m;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = this.f56484n;
        }
        float paddingTop = getPaddingTop() + i;
        float f4 = this.f56486q;
        float f5 = paddingTop + f4;
        int i3 = a6.f208179a[t5Var.d().ordinal()];
        if (i3 == 1) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            fL = kli.a.l(context, 10.0f);
        } else {
            if (i3 != 2 && i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            fL = kli.a.l(context2, 6.0f);
        }
        this.o = f5 + fL;
        int layoutDirection = getLayoutDirection();
        UIKitTextView uIKitTextView = this.f56479g;
        this.f56485p = (layoutDirection == 1 ? getWidth() + uIKitTextView.getRight() : uIKitTextView.getLeft()) / 2.0f;
        Paint paint = this.f56489t;
        int color = paint.getColor();
        RectF rectF = this.u;
        RectF rectF2 = this.f56488s;
        Paint paint2 = this.v;
        if (color == 0 && paint2.getColor() == 0) {
            rectF2.setEmpty();
            rectF.setEmpty();
            return;
        }
        n5 n5VarD = t5Var.d();
        n5 n5Var = n5.TOP;
        float f6 = this.f56487r;
        if (n5VarD == n5Var) {
            float paddingTop2 = getPaddingTop() + i;
            if ((t5Var instanceof q5) || (t5Var instanceof r5)) {
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                fL3 = kli.a.l(context3, 2.0f);
            } else {
                if (!(t5Var instanceof s5) && !(t5Var instanceof p5)) {
                    throw new NoWhenBranchMatchedException();
                }
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                fL3 = -kli.a.l(context4, 2.0f);
            }
            float f32 = paddingTop2 + fL3;
            float f35 = this.f56485p;
            float f36 = f35 - f6;
            float f37 = f35 + f6;
            if (f32 < BitmapDescriptorFactory.HUE_RED) {
                f32 = 0.0f;
            }
            rectF2.set(f36, BitmapDescriptorFactory.HUE_RED, f37, f32);
        }
        n5 n5VarD2 = t5Var.d();
        n5 n5Var2 = n5.TOP_BOTTOM;
        if (n5VarD2 == n5Var2) {
            float f41 = this.f56485p;
            float f42 = f41 - f6;
            float f57 = f41 + f6;
            float paddingTop3 = getPaddingTop() + i;
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            float fL4 = paddingTop3 - kli.a.l(context5, 6.0f);
            if (fL4 < BitmapDescriptorFactory.HUE_RED) {
                fL4 = 0.0f;
                f = 0.0f;
            } else {
                f = 0.0f;
            }
            rectF2.set(f42, f, f57, fL4);
        }
        n5 n5VarD3 = t5Var.d();
        n5 n5Var3 = n5.BOTTOM;
        if (n5VarD3 == n5Var3 || t5Var.d() == n5Var2) {
            if ((t5Var instanceof q5) || (t5Var instanceof r5)) {
                height = this.o + f4;
                Context context6 = getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                fL2 = kli.a.l(context6, 8.0f);
            } else {
                if (!(t5Var instanceof s5) && !(t5Var instanceof p5)) {
                    throw new NoWhenBranchMatchedException();
                }
                int paddingTop4 = getPaddingTop();
                ImageView imageView = this.f;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                height = imageView.getHeight() + paddingTop4 + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                Context context7 = getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                fL2 = kli.a.l(context7, 6.0f);
            }
            float f69 = fL2 + height;
            float f75 = this.f56485p;
            rectF.set(f75 - f6, f69, f75 + f6, getHeight());
        }
        if (!t5Var.b()) {
            paint.setShader(null);
            paint2.setShader(null);
            return;
        }
        int color2 = paint.getColor();
        n5 n5VarD4 = t5Var.d();
        paint.setShader(((n5VarD4 == n5Var || n5VarD4 == n5Var2) && color2 != 0) ? new LinearGradient(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, new int[]{0, io0.a.b(0.4f, color2), color2}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.4f, 1.0f}, Shader.TileMode.CLAMP) : null);
        int color3 = paint2.getColor();
        n5 n5VarD5 = t5Var.d();
        paint2.setShader(((n5VarD5 == n5Var3 || n5VarD5 == n5Var2) && color3 != 0) ? new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, new int[]{color3, io0.a.b(0.4f, color3), 0}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.4f, 1.0f}, Shader.TileMode.CLAMP) : null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ValueAnimator valueAnimator = this.z;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        h0();
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.C = new x5(colorScheme);
        this.f56478b.b(colorScheme);
        x();
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    public final void setEndComponent(m5 component) {
        boolean z = component instanceof l5;
        SmallActionButton smallActionButton = this.k;
        OverlappedIconsView overlappedIconsView = this.f56481j;
        if (z) {
            overlappedIconsView.setVisibility(8);
            smallActionButton.setVisibility(0);
            setEndPrimaryActionButton(((l5) component).f208333a);
        } else {
            if (component != null) {
                throw new NoWhenBranchMatchedException();
            }
            overlappedIconsView.setVisibility(8);
            smallActionButton.setVisibility(8);
        }
    }

    public final void setState(@NotNull t5 state) {
        int i;
        int iK;
        boolean z;
        Intrinsics.checkNotNullParameter(state, "state");
        if (Intrinsics.f(this.B, state)) {
            return;
        }
        t5 t5Var = this.B;
        boolean z3 = (t5Var != null ? t5Var.getSize() : null) != state.getSize();
        t5 t5Var2 = this.B;
        boolean z4 = (t5Var2 != null ? t5Var2.d() : null) != state.d();
        this.B = state;
        f0(state);
        if (z3 || z4) {
            int i2 = a6.f208180b[state.getSize().ordinal()];
            if (i2 == 1) {
                i = this.f56483m;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = this.f56484n;
            }
            int i3 = a6.f208179a[state.d().ordinal()];
            if (i3 == 1) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iK = kli.a.k(context, 4.0f);
            } else {
                if (i3 != 2 && i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                iK = 0;
            }
            int i5 = i + iK;
            or0.u.z(this.f, 0, i5, 0, 0, false, 29);
            or0.u.z(this.f56479g, 0, i5, 0, 0, false, 29);
        }
        if (state instanceof r5) {
            z = ((r5) state).f208410h;
        } else {
            if (!(state instanceof p5) && !(state instanceof q5) && !(state instanceof s5)) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        float f = this.f56491x;
        if (z) {
            ValueAnimator valueAnimator = this.z;
            if (!(valueAnimator != null && valueAnimator.isRunning())) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f56486q, f);
                valueAnimatorOfFloat.setDuration(600L);
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.setRepeatMode(2);
                valueAnimatorOfFloat.addUpdateListener(new b5(this, 28));
                this.z = valueAnimatorOfFloat;
                valueAnimatorOfFloat.start();
            }
        } else {
            ValueAnimator valueAnimator2 = this.z;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.z = null;
            this.f56492y = f;
        }
        if (isLaidOut()) {
            h0();
        }
        invalidate();
    }

    public final void setSubtitle(Clause subtitle, Function1<? super ty0.a, Unit> onClick) {
        UIKitTextView uIKitTextView = this.f56480h;
        if (subtitle == null || !((y) or0.u.k(this).b0()).t(subtitle)) {
            uIKitTextView.setOnTouchListener(null);
        } else {
            uIKitTextView.setOnTouchListener(new gzl.b(this, 8));
        }
        kli.a.d(uIKitTextView, subtitle, this, onClick, 8);
    }

    public final void setSubtitleColor(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.E = color;
        this.f56480h.setTextColor(io0.a.c(getDynamicContext(), color));
    }

    public final void setSubtitleMaxLines(int maxLines) {
        UIKitTextView uIKitTextView = this.f56480h;
        if (maxLines != uIKitTextView.getMaxLines()) {
            uIKitTextView.setSingleLine(maxLines == 1);
            uIKitTextView.setMaxLines(maxLines);
        }
    }

    public final void setTitle(@NotNull Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        kli.a.b(this.f56479g, title, ty0.f.f275450a);
    }

    public final void setTitleColor(@NotNull Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.D = color;
        this.f56479g.setTextColor(io0.a.c(getDynamicContext(), color));
    }

    public final void setTwinButtonsTexts(Clause primaryActionClause, Clause secondaryActionClause) {
        int i = primaryActionClause != null || secondaryActionClause != null ? 0 : 8;
        TwinHorizontalSmallButton twinHorizontalSmallButton = this.i;
        twinHorizontalSmallButton.setVisibility(i);
        twinHorizontalSmallButton.setPrimaryButtonText(primaryActionClause);
        twinHorizontalSmallButton.setPrimaryButtonVisible(primaryActionClause != null);
        twinHorizontalSmallButton.setSecondaryButtonText(secondaryActionClause);
        twinHorizontalSmallButton.setSecondaryButtonVisible(secondaryActionClause != null);
    }

    @Override // qp0.a
    public final void x() {
        t5 t5Var = this.B;
        if (t5Var != null) {
            f0(t5Var);
        }
        Color color = this.D;
        if (color != null) {
            this.f56479g.setTextColor(io0.a.c(getDynamicContext(), color));
        }
        Color color2 = this.E;
        if (color2 != null) {
            this.f56480h.setTextColor(io0.a.c(getDynamicContext(), color2));
        }
        if (isLaidOut()) {
            h0();
        }
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalProgressStepView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalProgressStepView(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VerticalProgressStepView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, i, 0);
        this.f56478b = new a5h.g((View) this);
        this.f56483m = kli.a.k(context, 2.0f);
        this.f56484n = kli.a.k(context, 10.0f);
        float fL = kli.a.l(context, 4.0f);
        this.f56486q = fL;
        this.f56487r = kli.a.l(context, 2.0f);
        this.f56488s = new RectF();
        this.f56489t = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        this.u = new RectF();
        this.v = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        this.f56490w = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        this.f56491x = kli.a.l(context, 8.0f);
        this.f56492y = fL;
        this.A = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        this.C = y5.f208500a;
        this.F = true;
        View.inflate(context, R$layout.internal_view_vertical_progress_step, this);
        View viewFindViewById = findViewById(R$id.verticalProgressStepView_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.verticalProgressStepView_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f56479g = (UIKitTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.verticalProgressStepView_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f56480h = (UIKitTextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.progressStepVerticalV2_twinHorizontalSmallButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TwinHorizontalSmallButton) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.progressStepVerticalV2_endIconsView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f56481j = (OverlappedIconsView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R$id.progressStepVerticalV2_endPrimaryActionButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (SmallActionButton) viewFindViewById6;
        View viewFindViewById7 = findViewById(R$id.progressStepVerticalV2_endContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.f56482l = (FrameLayout) viewFindViewById7;
    }
}
