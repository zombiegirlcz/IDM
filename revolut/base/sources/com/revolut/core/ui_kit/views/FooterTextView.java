package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.WindowInsets;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.internal.drawables.BottomGradientDrawable;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import ix0.c0;
import ix0.c2;
import ix0.w0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.a7;
import mx0.b7;
import mx0.c7;
import mx0.d7;
import mx0.e7;
import mx0.f7;
import mx0.g7;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 &2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002'\fB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/revolut/core/ui_kit/views/FooterTextView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lix0/w0;", "Lny0/o;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lmx0/f7;", "content", "", "setContent", "(Lmx0/f7;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "title", "setTextClause", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "", "getText", "()Ljava/lang/CharSequence;", "Lcom/revolut/core/ui_kit/internal/drawables/BottomGradientDrawable;", "b", "Lkotlin/Lazy;", "getGradient", "()Lcom/revolut/core/ui_kit/internal/drawables/BottomGradientDrawable;", "gradient", "", "o", "Z", "getSuppressLayout", "()Z", "setSuppressLayout", "(Z)V", "suppressLayout", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FooterTextView extends ConstraintLayout implements w0, ny0.o {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f58601p = R$id.internal_footer_text_view_text;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f58602q = R$id.internal_footer_text_view_start_logo;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f58603r = R$id.internal_footer_text_view_bottom_logo;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f58604b;
    public final c2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ContextThemeWrapper f58605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UIKitTextView f58606h;
    public ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f58607j;
    public f7 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.f f58608l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a7 f58609m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ny0.q f58610n;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean suppressLayout;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.FooterTextView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FooterTextView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final BottomGradientDrawable getGradient() {
        return (BottomGradientDrawable) this.f58604b.getValue();
    }

    public final void f0(ConstraintSet constraintSet, int i, ImageView imageView, b7 b7Var) {
        Integer numValueOf;
        if (imageView != null) {
            Integer numValueOf2 = null;
            if (b7Var != null) {
                float fIntValue = b7Var.f209605b.intValue();
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                numValueOf = Integer.valueOf(kli.a.k(context, fIntValue));
            } else {
                numValueOf = null;
            }
            if (b7Var != null) {
                float fIntValue2 = b7Var.f209606c.intValue();
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                numValueOf2 = Integer.valueOf(kli.a.k(context2, fIntValue2));
            }
            constraintSet.constrainWidth(i, numValueOf != null ? numValueOf.intValue() : -2);
            constraintSet.constrainHeight(i, numValueOf2 != null ? numValueOf2.intValue() : -2);
            if (numValueOf == null && numValueOf2 == null) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            } else {
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g0(com.revolut.core.ui_kit.models.Clause r20, mx0.b7 r21, mx0.b7 r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.FooterTextView.g0(com.revolut.core.ui_kit.models.Clause, mx0.b7, mx0.b7, boolean):void");
    }

    @Override // ny0.h
    public /* bridge */ boolean getFitsReadableArea() {
        return false;
    }

    @Override // ix0.w0, ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable();
    }

    public boolean getSuppressLayout() {
        return this.suppressLayout;
    }

    public final CharSequence getText() {
        return this.f58606h.getText();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(this.f.c(insets));
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.f58610n.d(i);
        super.onMeasure(i, i2);
    }

    public final void setContent(@NotNull f7 content) {
        d7 d7VarA;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        f7 f7Var = this.k;
        if (f7Var == null || (d7VarA = f7Var.a()) == null) {
            d7VarA = d7.DEFAULT;
        }
        boolean z = d7VarA != content.a();
        if (z) {
            d7 d7VarA2 = content.a();
            Resources.Theme theme = this.f58605g.getTheme();
            int[] iArr = g7.f209717a;
            int i3 = iArr[d7VarA2.ordinal()];
            if (i3 == 1) {
                i = R$style.UiKitThemeOverlay_FooterDefault;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$style.UiKitThemeOverlay_FooterDisclaimer;
            }
            theme.applyStyle(i, true);
            UIKitTextView uIKitTextView = this.f58606h;
            Context context = uIKitTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int i5 = iArr[d7VarA2.ordinal()];
            if (i5 == 1) {
                i2 = R$attr.uikit_colorGreyTone50;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$attr.uikit_colorForeground;
            }
            uIKitTextView.setTextColor(kli.a.s(i2, context));
        }
        if (content instanceof c7) {
            g0(((c7) content).f209633a, null, null, z);
        } else {
            if (!(content instanceof e7)) {
                throw new NoWhenBranchMatchedException();
            }
            e7 e7Var = (e7) content;
            g0(e7Var.f209678a, e7Var.f209679b, e7Var.f209680c, z);
        }
        setBackground(content.b() ? getGradient() : null);
        this.k = content;
    }

    @Override // ny0.o
    public void setSuppressLayout(boolean z) {
        this.suppressLayout = z;
    }

    @yhm.d
    public final void setTextClause(Clause title) {
        kli.a.e(this.f58606h, title, this.f58609m, null, 0, 12);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        int i = f58601p;
        constraintSet.clear(i);
        if (this.i != null) {
            constraintSet.clear(f58602q);
        }
        if (this.f58607j != null) {
            constraintSet.clear(f58603r);
        }
        constraintSet.constrainWidth(i, -2);
        constraintSet.constrainHeight(i, -2);
        constraintSet.centerHorizontally(i, 0);
        constraintSet.centerVertically(i, 0);
        constraintSet.applyTo(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FooterTextView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FooterTextView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58604b = te0.w.y0(new lu0.a(context, 12));
        this.f = new c2(this);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R$style.UiKitThemeOverlay_FooterDefault);
        this.f58605g = contextThemeWrapper;
        UIKitTextView uIKitTextView = new UIKitTextView(contextThemeWrapper, null, 6, 0);
        uIKitTextView.setId(f58601p);
        uIKitTextView.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        jb3.l.e(uIKitTextView, R$attr.internal_textAppearanceBody3);
        uIKitTextView.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        uIKitTextView.setGravity(17);
        uIKitTextView.setMovementMethod(c0.f169220a);
        addView(uIKitTextView);
        this.f58606h = uIKitTextView;
        this.f58608l = v0.a.d("create(...)");
        this.f58609m = new a7(this, 0);
        ny0.q qVar = new ny0.q(this);
        this.f58610n = qVar;
        qVar.e(true);
    }

    public /* synthetic */ FooterTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
