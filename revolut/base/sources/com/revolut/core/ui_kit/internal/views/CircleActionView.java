package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import au0.p2;
import aw0.t1;
import aw0.u1;
import aw0.v1;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.ProgressSwitcher;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import fp0.p;
import ix0.l0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import maa.r;
import ms0.a0;
import ms0.b0;
import ms0.v3;
import ms0.w3;
import ms0.y;
import ms0.z;
import or0.u;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004\u001b*:;B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010\u0012J\u0017\u0010$\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00102\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b.\u0010\u0016R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006<"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/CircleActionView;", "Landroid/widget/LinearLayout;", "Lur0/a;", "Lsy0/a;", "Lrr0/d;", "Ljr0/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setEnabled", "(Z)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "icon", "setIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "label", "setLabel", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lms0/a0;", "style", "clickable", "setStyle", "(Lms0/a0;ZZ)V", "visible", "setNotificationDotVisible", "Lcom/revolut/core/ui_kit/models/badge/CircleBadgeModel;", "badge", "setBadgeModel", "(Lcom/revolut/core/ui_kit/models/badge/CircleBadgeModel;)V", "", "tag", "setLoadingButtonTag", "(Ljava/lang/String;)V", "Lms0/z;", "size", "setSize", "(Lms0/z;)V", "setIconInternal", "Lix0/l0;", "p", "Lkotlin/Lazy;", "getCutoutStage", "()Lix0/l0;", "cutoutStage", "Ljr0/g;", "getGlowHighlightManager", "()Ljr0/g;", "glowHighlightManager", "Companion", "ms0/y", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CircleActionView extends LinearLayout implements ur0.a, sy0.a, rr0.d, jr0.i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f56119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProgressSwitcher f56120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f56121c;
    public final FrameLayout d;
    public final AppCompatTextView e;
    public a0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f56122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v1 f56123h;
    public Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f56124j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CircleBadgeView f56125l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CutoutImageView f56126m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RoundedBackgroundDrawable f56127n;
    public final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final Lazy cutoutStage;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rr0.g f56129q;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.CircleActionView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static int a(Companion companion, Context context) {
            z size = z.SIZE_48;
            companion.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(size, "size");
            return kli.a.B(context, 36.0f) + kli.a.k(context, size.a() + 8.0f);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleActionView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final l0 getCutoutStage() {
        return (l0) this.cutoutStage.getValue();
    }

    private final void setIconInternal(Image icon) {
        yy0.f.e(u.k(this).Q(), icon, this.f56121c, null, null, 12);
    }

    @Override // rr0.d
    public final void L(boolean z) {
        this.f56120b.setProgressVisible(z);
    }

    @Override // sy0.a
    public final rr0.f V() {
        return this.f56129q.V();
    }

    public final int a(float f, int i) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(i, context);
        return isEnabled() ? iS : io0.a.d(f, iS);
    }

    public final int b(int i) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return kli.a.s(i, context);
    }

    public final int c(int i, int i2) {
        if (isEnabled()) {
            return i;
        }
        int[] iArr = io0.c.f163133a;
        return io0.c.b(i2, i, ho0.a.SRC_OVER);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    public final void d() {
        y yVar;
        y yVar2;
        int i;
        int iS;
        switch (b0.f208181a[this.f.ordinal()]) {
            case 1:
                yVar = new y(a(0.3f, R$attr.uikit_colorOnAccent), b(R$attr.uikit_colorForeground), c(b(R$attr.uikit_colorAccent), io0.a.d(0.8f, b(R$attr.uikit_colorGroupedBackground))));
                yVar2 = yVar;
                AppCompatImageView appCompatImageView = this.f56121c;
                int i2 = yVar2.f208490a;
                appCompatImageView.setImageTintList(ColorStateList.valueOf(i2));
                this.f56120b.setProgressTintColor(i2);
                this.e.setTextColor(yVar2.f208491b);
                this.f56127n.d(i2, yVar2.f208492c);
                return;
            case 2:
                yVar = new y(a(0.3f, R$attr.uikit_colorOnAccentNeutral), b(R$attr.uikit_colorForeground), c(b(R$attr.uikit_colorAccentNeutral), io0.a.d(0.8f, b(R$attr.uikit_colorGrey2))));
                yVar2 = yVar;
                AppCompatImageView appCompatImageView2 = this.f56121c;
                int i22 = yVar2.f208490a;
                appCompatImageView2.setImageTintList(ColorStateList.valueOf(i22));
                this.f56120b.setProgressTintColor(i22);
                this.e.setTextColor(yVar2.f208491b);
                this.f56127n.d(i22, yVar2.f208492c);
                return;
            case 3:
                yVar2 = new y(a(0.3f, R$attr.uikit_colorForeground), b(R$attr.uikit_colorForeground), c(b(R$attr.uikit_colorWidgetBackground), 0));
                AppCompatImageView appCompatImageView22 = this.f56121c;
                int i222 = yVar2.f208490a;
                appCompatImageView22.setImageTintList(ColorStateList.valueOf(i222));
                this.f56120b.setProgressTintColor(i222);
                this.e.setTextColor(yVar2.f208491b);
                this.f56127n.d(i222, yVar2.f208492c);
                return;
            case 4:
                yVar2 = new y(a(0.3f, R$attr.uikit_colorAccent), b(R$attr.uikit_colorAccent), c(b(R$attr.uikit_colorActionBackground), io0.a.d(0.3f, b(R$attr.uikit_colorGroupedBackground))));
                AppCompatImageView appCompatImageView222 = this.f56121c;
                int i2222 = yVar2.f208490a;
                appCompatImageView222.setImageTintList(ColorStateList.valueOf(i2222));
                this.f56120b.setProgressTintColor(i2222);
                this.e.setTextColor(yVar2.f208491b);
                this.f56127n.d(i2222, yVar2.f208492c);
                return;
            case 5:
                if (((Boolean) jo0.g.D.getValue()).booleanValue()) {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    v3 v3VarA = w3.a(context, isEnabled(), this.f56123h);
                    int i3 = v3VarA.f208468b;
                    yVar2 = new y(i3, i3, v3VarA.f208467a);
                } else {
                    int iA = this.f56123h.a();
                    v1 v1Var = this.f56123h;
                    v1Var.getClass();
                    int i5 = u1.f10553a[v1Var.ordinal()];
                    if (i5 == 1) {
                        i = com.revolut.core.ui_kit.R$attr.internal_colorForegroundTintOnDarkBackgroundDisabled;
                    } else {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = com.revolut.core.ui_kit.R$attr.internal_colorForegroundTintOnLightBackgroundDisabled;
                    }
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    if (!isEnabled()) {
                        iA = i;
                    }
                    int iS2 = kli.a.s(iA, context2);
                    int iB = b(this.f56123h.a());
                    Integer num = this.i;
                    if (num != null) {
                        iS = num.intValue();
                    } else {
                        Context context3 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        iS = kli.a.s(R$attr.uikit_colorWidgetBackground, context3);
                    }
                    yVar2 = new y(iS2, iB, iS);
                }
                AppCompatImageView appCompatImageView2222 = this.f56121c;
                int i22222 = yVar2.f208490a;
                appCompatImageView2222.setImageTintList(ColorStateList.valueOf(i22222));
                this.f56120b.setProgressTintColor(i22222);
                this.e.setTextColor(yVar2.f208491b);
                this.f56127n.d(i22222, yVar2.f208492c);
                return;
            case 6:
                yVar2 = new y(a(0.3f, R$attr.uikit_colorForeground), b(R$attr.uikit_colorForeground), c(io0.a.d(0.1f, b(R$attr.uikit_colorForeground)), io0.a.d(0.3f, b(R$attr.uikit_colorGroupedBackground))));
                AppCompatImageView appCompatImageView22222 = this.f56121c;
                int i222222 = yVar2.f208490a;
                appCompatImageView22222.setImageTintList(ColorStateList.valueOf(i222222));
                this.f56120b.setProgressTintColor(i222222);
                this.e.setTextColor(yVar2.f208491b);
                this.f56127n.d(i222222, yVar2.f208492c);
                return;
            case 7:
                yVar = new y(a(0.3f, R$attr.uikit_colorOnAccent), b(R$attr.uikit_colorForeground), c(b(R$attr.uikit_colorStatusDanger), io0.a.d(0.8f, b(R$attr.uikit_colorGroupedBackground))));
                yVar2 = yVar;
                AppCompatImageView appCompatImageView222222 = this.f56121c;
                int i2222222 = yVar2.f208490a;
                appCompatImageView222222.setImageTintList(ColorStateList.valueOf(i2222222));
                this.f56120b.setProgressTintColor(i2222222);
                this.e.setTextColor(yVar2.f208491b);
                this.f56127n.d(i2222222, yVar2.f208492c);
                return;
            case 8:
                int iA2 = a(0.4f, R$attr.uikit_colorForeground);
                yVar2 = new y(iA2, iA2, c(a(0.6f, R$attr.uikit_colorPopoverBackground), 0));
                AppCompatImageView appCompatImageView2222222 = this.f56121c;
                int i22222222 = yVar2.f208490a;
                appCompatImageView2222222.setImageTintList(ColorStateList.valueOf(i22222222));
                this.f56120b.setProgressTintColor(i22222222);
                this.e.setTextColor(yVar2.f208491b);
                this.f56127n.d(i22222222, yVar2.f208492c);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void e(Drawable drawable) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 4.0f);
        FrameLayout frameLayout = this.d;
        drawable.setBounds((frameLayout.getRight() - drawable.getIntrinsicWidth()) + iK, frameLayout.getTop(), frameLayout.getRight() + iK, drawable.getIntrinsicHeight() + frameLayout.getTop());
    }

    @Override // jr0.i
    @NotNull
    public jr0.g getGlowHighlightManager() {
        jr0.g.Companion.getClass();
        return jr0.f.a(this);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i5);
        if (!this.k || (drawable = this.f56124j) == null) {
            return;
        }
        e(drawable);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f56122g) {
            d();
            this.f56122g = true;
        }
        super.onMeasure(i, i2);
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        boolean z = this.f56123h != colorScheme;
        Integer num = this.i;
        boolean z3 = num == null || num.intValue() != i;
        if (z || z3) {
            this.f56123h = colorScheme;
            this.i = Integer.valueOf(i);
            if (this.f == a0.CONTEXTUAL) {
                d();
            }
        }
    }

    public final void setBadgeModel(CircleBadgeModel badge) {
        CircleBadgeView circleBadgeView = this.f56125l;
        if (circleBadgeView == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            CircleBadgeView circleBadgeView2 = new CircleBadgeView(context, null, 0, null, 14);
            this.f56125l = circleBadgeView2;
            circleBadgeView2.setBadgeSize(os0.a.SMALL);
            CircleBadgeView circleBadgeView3 = this.f56125l;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388661);
            Context context2 = circleBadgeView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int i = -kli.a.k(context2, 4.0f);
            layoutParams.setMarginEnd(i);
            layoutParams.topMargin = i;
            Unit unit = Unit.f186387a;
            this.d.addView(circleBadgeView3, layoutParams);
            circleBadgeView = circleBadgeView2;
        }
        circleBadgeView.setBadgeAndVisibility(badge, getCutoutStage());
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        if (isEnabled() != enabled) {
            super.setEnabled(enabled);
            boolean zIsEnabled = isEnabled();
            p pVar = this.o;
            p.b(pVar, zIsEnabled);
            View view = pVar.f137029a;
            or0.m.a(view);
            if (zIsEnabled) {
                view.setOnClickListener(new p2(this, 2));
            } else {
                u.o(view);
            }
            float f = enabled ? 1.0f : 0.3f;
            AppCompatTextView appCompatTextView = this.e;
            appCompatTextView.setAlpha(f);
            appCompatTextView.setEnabled(enabled);
            d();
            this.f56122g = true;
        }
    }

    public final void setIcon(Image icon) {
        setIconInternal(icon);
    }

    public final void setLabel(Clause label) {
        ty0.c.b(u.k(this).b0(), label, this.e, null, null, 12);
    }

    public final void setLoadingButtonTag(String tag2) {
        setTag(tag2);
    }

    public final void setNotificationDotVisible(boolean visible) {
        if (this.k == visible) {
            return;
        }
        this.k = visible;
        if (!visible) {
            Drawable drawable = this.f56124j;
            if (drawable != null) {
                getOverlay().remove(drawable);
                return;
            }
            return;
        }
        Drawable drawable2 = this.f56124j;
        if (drawable2 == null) {
            drawable2 = AppCompatResources.getDrawable(getContext(), R$drawable.internal_icn_16_new_item);
            this.f56124j = drawable2;
            if (drawable2 == null) {
                return;
            }
        }
        e(drawable2);
        getOverlay().add(drawable2);
    }

    public final void setSize(@NotNull z size) {
        Intrinsics.checkNotNullParameter(size, "size");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, size.a());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK2 = kli.a.k(context2, size.b());
        u.A(this.d, iK, iK);
        u.A(this.f56121c, iK2, iK2);
        this.f56120b.setProgressSize(iK2);
    }

    public final void setStyle(@NotNull a0 style, boolean enabled, boolean clickable) {
        Intrinsics.checkNotNullParameter(style, "style");
        boolean z = this.f != style;
        boolean z3 = isEnabled() != enabled;
        AppCompatImageView appCompatImageView = this.f56121c;
        boolean z4 = appCompatImageView.isEnabled() != clickable;
        if (z || z3 || z4) {
            this.f = style;
            if (z3) {
                super.setEnabled(enabled);
                boolean zIsEnabled = isEnabled();
                p pVar = this.o;
                p.b(pVar, zIsEnabled);
                View view = pVar.f137029a;
                or0.m.a(view);
                if (zIsEnabled) {
                    view.setOnClickListener(new p2(this, 2));
                } else {
                    u.o(view);
                }
                float f = enabled ? 1.0f : 0.3f;
                AppCompatTextView appCompatTextView = this.e;
                appCompatTextView.setAlpha(f);
                appCompatTextView.setEnabled(enabled);
            }
            if (z4) {
                appCompatImageView.setEnabled(clickable);
            }
            if (z || z3) {
                d();
                this.f56122g = true;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleActionView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleActionView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56119a = v0.a.d("create(...)");
        this.f = a0.ACCENT;
        v1.Companion.getClass();
        this.f56123h = t1.a(context);
        int i2 = 0;
        RoundedBackgroundDrawable roundedBackgroundDrawable = new RoundedBackgroundDrawable(context, i2, 4);
        this.f56127n = roundedBackgroundDrawable;
        fp0.m mVar = p.Companion;
        gp0.g gVar = new gp0.g(0);
        mVar.getClass();
        p pVarA = fp0.m.a(this, gVar);
        this.o = pVarA;
        this.cutoutStage = yhm.j.b(new r(this, 16));
        this.f56129q = s.b(this, true);
        setGravity(17);
        setOrientation(1);
        int iK = kli.a.k(context, 48.0f);
        int iK2 = kli.a.k(context, 24.0f);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.circleActionView_icon);
        this.f56121c = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.circleActionView_label);
        jb3.l.e(appCompatTextView, R$attr.internal_textAppearanceCircleButton);
        appCompatTextView.setMaxLines(4);
        appCompatTextView.setHyphenationFrequency(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = kli.a.k(context, 8.0f);
        appCompatTextView.setLayoutParams(layoutParams);
        this.e = appCompatTextView;
        ProgressSwitcher progressSwitcher = new ProgressSwitcher(context, null, 6, i2);
        progressSwitcher.setProgressSize(iK2);
        progressSwitcher.setProgressTintAttr(R$attr.uikit_colorWhite);
        progressSwitcher.addView(appCompatImageView, new FrameLayout.LayoutParams(iK2, iK2, 17));
        this.f56120b = progressSwitcher;
        CutoutImageView view = new CutoutImageView(context, null, 6, 0);
        view.setBackground(roundedBackgroundDrawable);
        this.f56126m = view;
        jr0.g glowHighlightManager = getGlowHighlightManager();
        glowHighlightManager.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        jr0.e eVar = glowHighlightManager.d;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        if (eVar.f177901g != view) {
            eVar.f177901g = view;
            eVar.f177902h.setEmpty();
            eVar.f = Float.NaN;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iK, iK);
        int iK3 = kli.a.k(context, 4.0f);
        layoutParams2.leftMargin = iK3;
        layoutParams2.rightMargin = iK3;
        frameLayout.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        frameLayout.addView(view, layoutParams3);
        frameLayout.addView(progressSwitcher, layoutParams3);
        this.d = frameLayout;
        addView(frameLayout);
        addView(appCompatTextView);
        boolean zIsEnabled = isEnabled();
        p.b(pVarA, zIsEnabled);
        View view2 = pVarA.f137029a;
        or0.m.a(view2);
        if (zIsEnabled) {
            view2.setOnClickListener(new p2(this, 2));
        } else {
            u.o(view2);
        }
        setClipChildren(false);
        setClipToPadding(false);
    }

    public /* synthetic */ CircleActionView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
