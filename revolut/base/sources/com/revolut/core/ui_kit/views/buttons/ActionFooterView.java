package com.revolut.core.ui_kit.views.buttons;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import aw0.g;
import aw0.n6;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import efm.r;
import ihm.f;
import ix0.c2;
import ix0.w0;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ny0.h;
import org.jetbrains.annotations.NotNull;
import ox0.d;
import ox0.e;
import ox0.e0;
import ox0.i;
import vy0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004FFGHJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\b\b\u0001\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 J/\u0010#\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b#\u0010 J\u000f\u0010$\u001a\u00020\u0013H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0013H\u0016¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\u0013H\u0016¢\u0006\u0004\b'\u0010%J\u000f\u0010(\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010%J\u000f\u0010)\u001a\u00020\u0013H\u0016¢\u0006\u0004\b)\u0010%J\u000f\u0010*\u001a\u00020\u0013H\u0016¢\u0006\u0004\b*\u0010%J\u0017\u0010+\u001a\u00020\t2\b\b\u0001\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b+\u0010\u0016J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b-\u0010.R*\u00108\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b0\u00101\u0012\u0004\b6\u00107\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u0010A\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b:\u0010;\u0012\u0004\b@\u00107\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010B\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006I"}, d2 = {"Lcom/revolut/core/ui_kit/views/buttons/ActionFooterView;", "Landroid/widget/FrameLayout;", "Lox0/i;", "Lvy0/b;", "Lix0/w0;", "Lny0/h;", "", "collapsed", "animate", "", "setCollapsed", "(ZZ)V", "collapsible", "setCollapsible", "(Z)V", "Law0/i;", "model", "setModel", "(Law0/i;)V", "", "color", "setGradientTint", "(I)V", "Landroid/graphics/drawable/Drawable;", "background", "setBackground", "(Landroid/graphics/drawable/Drawable;)V", "left", "top", "right", "bottom", "setPadding", "(IIII)V", "start", "end", "setPaddingRelative", "getPaddingStart", "()I", "getPaddingTop", "getPaddingEnd", "getPaddingBottom", "getPaddingLeft", "getPaddingRight", "setDescriptionColor", "Landroid/view/View;", "getCurrentButtonView", "()Landroid/view/View;", "Lcom/revolut/core/ui_kit/views/buttons/TwinHorizontalButton;", "c", "Lcom/revolut/core/ui_kit/views/buttons/TwinHorizontalButton;", "getTwinHorizontalButton", "()Lcom/revolut/core/ui_kit/views/buttons/TwinHorizontalButton;", "setTwinHorizontalButton", "(Lcom/revolut/core/ui_kit/views/buttons/TwinHorizontalButton;)V", "getTwinHorizontalButton$annotations", "()V", "twinHorizontalButton", "Lcom/revolut/core/ui_kit/views/buttons/TwinVerticalButton;", "d", "Lcom/revolut/core/ui_kit/views/buttons/TwinVerticalButton;", "getTwinVerticalButton", "()Lcom/revolut/core/ui_kit/views/buttons/TwinVerticalButton;", "setTwinVerticalButton", "(Lcom/revolut/core/ui_kit/views/buttons/TwinVerticalButton;)V", "getTwinVerticalButton$annotations", "twinVerticalButton", "fitsReadableArea", "Z", "getFitsReadableArea", "()Z", "ox0/d", "a", "ox0/e", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActionFooterView extends FrameLayout implements i, b, w0, h {
    public static final /* synthetic */ int z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f58952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public aw0.i f58953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public TwinHorizontalButton twinHorizontalButton;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TwinVerticalButton twinVerticalButton;
    public final f e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f58955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f58956h;
    public Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f58957j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f58958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f58959m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f58960n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f58961p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public e f58962q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public FormsActionButton f58963r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f58964s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ValueAnimator f58965t;
    public vy0.a u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ox0.b f58966w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ox0.b f58967x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ox0.b f58968y;

    public static final class a implements vy0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f58969a = new a();

        private a() {
        }

        @Override // vy0.a
        public final boolean A() {
            return false;
        }

        @Override // vy0.a
        public final boolean i() {
            return false;
        }

        @Override // vy0.a
        public final void setCollapsed(boolean z, boolean z3) {
        }

        @Override // vy0.a
        public final void setCollapsible(boolean z) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionFooterView(@NotNull Context context) {
        this(context, null, 0, 14);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getCurrentButtonView() {
        aw0.i iVar = this.f58953b;
        if (!(iVar instanceof aw0.e) && !(iVar instanceof aw0.h)) {
            if (iVar instanceof g) {
                return this.twinHorizontalButton;
            }
            if (iVar == null) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        return this.twinVerticalButton;
    }

    public static /* synthetic */ void getTwinHorizontalButton$annotations() {
    }

    public static /* synthetic */ void getTwinVerticalButton$annotations() {
    }

    @Override // vy0.a
    public final boolean A() {
        return this.u.A();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        if (this.f58953b == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f58965t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        AttributeSet attributeSet = null;
        this.f58965t = null;
        a aVar = a.f58969a;
        this.u = aVar;
        View currentButtonView = getCurrentButtonView();
        if (currentButtonView == 0) {
            return;
        }
        int i = 0;
        currentButtonView.setVisibility(0);
        FormsActionButton formsActionButton = this.f58963r;
        if (formsActionButton != null) {
            formsActionButton.setVisibility(8);
        }
        FormsActionButton formsActionButton2 = this.f58963r;
        if (formsActionButton2 != null) {
            formsActionButton2.setAlpha(1.0f);
        }
        currentButtonView.setAlpha(1.0f);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!ny0.i.c(context)) {
            if (currentButtonView instanceof vy0.a) {
                vy0.a aVar2 = (vy0.a) currentButtonView;
                if (aVar2.i()) {
                    this.f58962q = null;
                    this.u = new d(aVar2);
                    return;
                }
            }
            this.f58962q = null;
            this.u = aVar;
            return;
        }
        vy0.a aVar3 = currentButtonView instanceof vy0.a ? (vy0.a) currentButtonView : null;
        if (aVar3 != null) {
            aVar3.setCollapsed(false, false);
        }
        if (this.f58963r == null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iK = kli.a.k(context2, 16.0f);
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            FormsActionButton formsActionButton3 = new FormsActionButton(context3, attributeSet, 6, i);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388693);
            layoutParams.setMarginEnd(iK);
            layoutParams.bottomMargin = iK;
            formsActionButton3.setLayoutParams(layoutParams);
            formsActionButton3.f(FormsActionButton.a.C0442a.f58988a);
            formsActionButton3.setImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
            formsActionButton3.f58987s.subscribe(new or2.e(new ox0.a(this, 1), 23));
            addView(formsActionButton3);
            this.f58963r = formsActionButton3;
        }
        FormsActionButton formsActionButton4 = this.f58963r;
        if (formsActionButton4 != null) {
            formsActionButton4.setVisibility(4);
        }
        this.f58962q = new e(false);
        this.u = new d(this);
    }

    public final void c(ViewGroup viewGroup) {
        TwinVerticalButton twinVerticalButton = this.twinVerticalButton;
        if (twinVerticalButton != null) {
            twinVerticalButton.setVisibility(viewGroup.equals(twinVerticalButton) ? 0 : 8);
        }
        TwinHorizontalButton twinHorizontalButton = this.twinHorizontalButton;
        if (twinHorizontalButton != null) {
            twinHorizontalButton.setVisibility(viewGroup.equals(twinHorizontalButton) ? 0 : 8);
        }
    }

    public final TwinVerticalButton d() {
        TwinVerticalButton twinVerticalButton = this.twinVerticalButton;
        if (twinVerticalButton == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TwinVerticalButton twinVerticalButton2 = new TwinVerticalButton(context, null, 0, 14, 0);
            twinVerticalButton2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            twinVerticalButton2.setGradientBackgroundEnabled(false);
            twinVerticalButton2.setVisibility(8);
            this.twinVerticalButton = twinVerticalButton2;
            Integer num = this.i;
            if (num != null) {
                twinVerticalButton2.setDescriptionColor(num.intValue());
            }
            Integer num2 = this.f58957j;
            if (num2 != null) {
                twinVerticalButton2.setGradientTint(num2.intValue());
            }
            twinVerticalButton2.o0().subscribe(this.f58966w);
            twinVerticalButton2.p0().subscribe(this.f58967x);
            twinVerticalButton2.f59017j.subscribe(this.e);
            twinVerticalButton2.m0().subscribe(this.f58968y);
            f(twinVerticalButton2);
            addView(twinVerticalButton2);
            twinVerticalButton = twinVerticalButton2;
        }
        c(twinVerticalButton);
        return twinVerticalButton;
    }

    public final void f(View view) {
        if (view == null) {
            return;
        }
        if (isPaddingRelative()) {
            view.setPaddingRelative(this.k, this.f58958l, this.f58959m, this.f58960n);
        } else {
            view.setPadding(this.o, this.f58958l, this.f58961p, this.f58960n);
        }
    }

    @Override // ny0.h
    public boolean getFitsReadableArea() {
        return false;
    }

    @Override // ix0.w0, ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable();
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return this.f58960n;
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return isPaddingRelative() ? this.f58959m : this.f58961p;
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return isPaddingRelative() ? getLayoutDirection() == 0 ? this.k : this.f58959m : this.o;
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return isPaddingRelative() ? getLayoutDirection() == 0 ? this.f58959m : this.k : this.f58961p;
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return isPaddingRelative() ? this.k : this.o;
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return this.f58958l;
    }

    public final TwinHorizontalButton getTwinHorizontalButton() {
        return this.twinHorizontalButton;
    }

    public final TwinVerticalButton getTwinVerticalButton() {
        return this.twinVerticalButton;
    }

    @Override // vy0.a
    public final boolean i() {
        return this.u.i();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(this.f58952a.c(insets));
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f58965t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.v = true;
    }

    @Override // android.view.View
    public void setBackground(Drawable background) {
    }

    @Override // vy0.a
    public void setCollapsed(boolean collapsed, boolean animate) {
        this.u.setCollapsed(collapsed, animate);
    }

    @Override // vy0.a
    public void setCollapsible(boolean collapsible) {
        this.u.setCollapsible(collapsible);
    }

    public final void setDescriptionColor(int color) {
        this.i = Integer.valueOf(color);
        TwinVerticalButton twinVerticalButton = this.twinVerticalButton;
        if (twinVerticalButton != null) {
            twinVerticalButton.setDescriptionColor(color);
        }
        TwinHorizontalButton twinHorizontalButton = this.twinHorizontalButton;
        if (twinHorizontalButton != null) {
            twinHorizontalButton.setTextColor(color);
        }
    }

    public final void setGradientTint(int color) {
        this.f58957j = Integer.valueOf(color);
        TwinVerticalButton twinVerticalButton = this.twinVerticalButton;
        if (twinVerticalButton != null) {
            twinVerticalButton.setGradientTint(color);
        }
        TwinHorizontalButton twinHorizontalButton = this.twinHorizontalButton;
        if (twinHorizontalButton != null) {
            twinHorizontalButton.setGradientTint(color);
        }
    }

    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object, kotlin.Lazy] */
    public final void setModel(@NotNull aw0.i model) {
        Boolean boolValueOf;
        float f;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model, this.f58953b)) {
            return;
        }
        KeyEvent.Callback currentButtonView = getCurrentButtonView();
        Boolean boolValueOf2 = null;
        if (currentButtonView != null) {
            boolValueOf = Boolean.valueOf((currentButtonView instanceof vy0.a) && ((vy0.a) currentButtonView).i());
        } else {
            boolValueOf = null;
        }
        this.f58953b = model;
        if (model instanceof aw0.e) {
            TwinVerticalButton twinVerticalButtonD = d();
            twinVerticalButtonD.setMainButtonWidthMode$ui_kit_components_release(e0.MATCH_PARENT);
            aw0.e eVar = (aw0.e) model;
            ox0.g.a(twinVerticalButtonD, eVar.d);
            twinVerticalButtonD.setSecondaryButtonVisible(false);
            aw0.d dVar = eVar.e;
            if (dVar == null) {
                twinVerticalButtonD.setCollapsible(false);
            } else {
                twinVerticalButtonD.setFabImage(dVar.f10272a);
                twinVerticalButtonD.setCollapsible(true);
                twinVerticalButtonD.setFabEnabled(true);
                if (((Boolean) jo0.g.Q.getValue()).booleanValue()) {
                    twinVerticalButtonD.setFabLabel(null);
                }
            }
            twinVerticalButtonD.setDescription(eVar.f10286b, eVar.f10287c, eVar.f);
            twinVerticalButtonD.setGradientBackgroundEnabled(eVar.f10285a);
        } else if (model instanceof g) {
            TwinHorizontalButton twinHorizontalButton = this.twinHorizontalButton;
            if (twinHorizontalButton == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                twinHorizontalButton = new TwinHorizontalButton(context, null, 0, 14);
                twinHorizontalButton.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                twinHorizontalButton.setGradientBackgroundEnabled(false);
                twinHorizontalButton.setVisibility(8);
                this.twinHorizontalButton = twinHorizontalButton;
                Integer num = this.i;
                if (num != null) {
                    twinHorizontalButton.setTextColor(num.intValue());
                }
                Integer num2 = this.f58957j;
                if (num2 != null) {
                    twinHorizontalButton.setGradientTint(num2.intValue());
                }
                twinHorizontalButton.c().subscribe(this.f58966w);
                twinHorizontalButton.d().subscribe(this.f58967x);
                r rVarHide = twinHorizontalButton.f59008g.hide();
                Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
                rVarHide.subscribe(this.e);
                f(twinHorizontalButton);
                addView(twinHorizontalButton);
            }
            c(twinHorizontalButton);
            g gVar = (g) model;
            n6 n6Var = gVar.f10315b;
            if (n6Var == null) {
                twinHorizontalButton.setPrimaryButtonVisible(false);
            } else {
                twinHorizontalButton.setPrimaryButtonVisible(true);
                twinHorizontalButton.setPrimaryButtonText(n6Var.f10433a);
                twinHorizontalButton.setPrimaryButtonStyle(n6Var.f10434b);
                twinHorizontalButton.setPrimaryButtonIcon(n6Var.f10435c);
                twinHorizontalButton.setPrimaryButtonEnabled(n6Var.f10436g);
                twinHorizontalButton.setPrimaryButtonAnalyticsContext(n6Var.f10437h);
                twinHorizontalButton.setPrimaryButtonBadge(n6Var.e);
                twinHorizontalButton.setPrimaryButtonCustomE2ETestId(n6Var.f10438j);
                twinHorizontalButton.setPrimaryButtonLoadingTag(n6Var.f);
                twinHorizontalButton.setPrimaryButtonLoadingStrategy(n6Var.i);
                twinHorizontalButton.setPrimaryButtonContentDescription(n6Var.d);
            }
            n6 n6Var2 = gVar.f10316c;
            if (n6Var2 == null) {
                twinHorizontalButton.setSecondaryButtonVisible(false);
            } else {
                twinHorizontalButton.setSecondaryButtonVisible(true);
                twinHorizontalButton.setSecondaryButtonText(n6Var2.f10433a);
                twinHorizontalButton.setSecondaryButtonStyle(n6Var2.f10434b);
                twinHorizontalButton.setSecondaryButtonIcon(n6Var2.f10435c);
                twinHorizontalButton.setSecondaryButtonEnabled(n6Var2.f10436g);
                twinHorizontalButton.setSecondaryButtonAnalyticsContext(n6Var2.f10437h);
                twinHorizontalButton.setSecondaryButtonBadge(n6Var2.e);
                twinHorizontalButton.setSecondaryButtonCustomE2ETestId(n6Var2.f10438j);
                twinHorizontalButton.setSecondaryButtonLoadingTag(n6Var2.f);
                twinHorizontalButton.setSecondaryButtonLoadingStrategy(n6Var2.i);
                twinHorizontalButton.setSecondaryButtonContentDescription(n6Var2.d);
            }
            aw0.f fVar = gVar.e;
            int i = ox0.f.f230479a[fVar.ordinal()];
            float f4 = 0.5f;
            if (i == 1 || i == 2) {
                f = 0.5f;
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
                if (i == 3) {
                    f4 = 0.0f;
                    f = 1.0f;
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f4 = 1.0f;
                }
            }
            twinHorizontalButton.setButtonsReversed(fVar == aw0.f.EQUAL_BUTTONS_REVERSED);
            twinHorizontalButton.setPrimaryButtonWeight(f4);
            twinHorizontalButton.setSecondaryButtonWeight(f);
            twinHorizontalButton.setGradientBackgroundEnabled(gVar.f10314a);
            twinHorizontalButton.setText(gVar.d, false);
        } else {
            if (!(model instanceof aw0.h)) {
                throw new NoWhenBranchMatchedException();
            }
            TwinVerticalButton twinVerticalButtonD2 = d();
            twinVerticalButtonD2.setMainButtonWidthMode$ui_kit_components_release(e0.MATCH_PARENT);
            aw0.h hVar = (aw0.h) model;
            ox0.g.a(twinVerticalButtonD2, hVar.f10330b);
            n6 n6Var3 = hVar.f10331c;
            if (n6Var3 == null) {
                twinVerticalButtonD2.setSecondaryButtonVisible(false);
            } else {
                twinVerticalButtonD2.setSecondaryButtonVisible(true);
                twinVerticalButtonD2.setSecondaryButtonText(n6Var3.f10433a);
                twinVerticalButtonD2.setSecondaryButtonStyle(n6Var3.f10434b);
                twinVerticalButtonD2.setSecondaryButtonIcon(n6Var3.f10435c);
                twinVerticalButtonD2.setSecondaryButtonEnabled(n6Var3.f10436g);
                twinVerticalButtonD2.setSecondaryButtonAnalyticsContext(n6Var3.f10437h);
                twinVerticalButtonD2.setSecondaryButtonBadge(n6Var3.e);
                twinVerticalButtonD2.setSecondaryButtonCustomE2ETestId(n6Var3.f10438j);
                twinVerticalButtonD2.setSecondaryButtonLoadingTag(n6Var3.f);
                twinVerticalButtonD2.setSecondaryButtonLoadingStrategy(n6Var3.i);
                twinVerticalButtonD2.setSecondaryButtonContentDescription(n6Var3.d);
            }
            twinVerticalButtonD2.setCollapsible(false);
            twinVerticalButtonD2.setDescription(hVar.d, hVar.e, hVar.f);
            twinVerticalButtonD2.setGradientBackgroundEnabled(hVar.f10329a);
        }
        KeyEvent.Callback currentButtonView2 = getCurrentButtonView();
        if (currentButtonView2 != null) {
            boolValueOf2 = Boolean.valueOf((currentButtonView2 instanceof vy0.a) && ((vy0.a) currentButtonView2).i());
        }
        if (Intrinsics.f(boolValueOf, boolValueOf2)) {
            return;
        }
        b();
    }

    @Override // android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        this.o = left;
        this.f58958l = top;
        this.f58961p = right;
        this.f58960n = bottom;
        super.setPadding(0, 0, 0, 0);
        f(this.twinHorizontalButton);
        f(this.twinVerticalButton);
    }

    @Override // android.view.View
    public void setPaddingRelative(int start, int top, int end2, int bottom) {
        this.k = start;
        this.f58958l = top;
        this.f58959m = end2;
        this.f58960n = bottom;
        super.setPaddingRelative(0, 0, 0, 0);
        f(this.twinHorizontalButton);
        f(this.twinVerticalButton);
    }

    public final void setTwinHorizontalButton(TwinHorizontalButton twinHorizontalButton) {
        this.twinHorizontalButton = twinHorizontalButton;
    }

    public final void setTwinVerticalButton(TwinVerticalButton twinVerticalButton) {
        this.twinVerticalButton = twinVerticalButton;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionFooterView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionFooterView(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r3v10, types: [ox0.b] */
    /* JADX WARN: Type inference failed for: r3v8, types: [ox0.b] */
    /* JADX WARN: Type inference failed for: r3v9, types: [ox0.b] */
    public ActionFooterView(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        int i3 = R$style.InternalActionFooterView;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, i, i3);
        this.f58952a = new c2(this);
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.f58955g = v0.a.d("create(...)");
        this.f58956h = v0.a.d("create(...)");
        this.f58964s = v0.a.d("create(...)");
        this.u = a.f58969a;
        if (isPaddingRelative()) {
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        } else {
            setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
        }
        c8g.a.a(this, ny0.a.f220589a, new ox0.a(this, 0));
        setWillNotDraw(false);
        final int i5 = 0;
        this.f58966w = new kfm.g(this) { // from class: ox0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActionFooterView f230470b;

            {
                this.f230470b = this;
            }

            @Override // kfm.g
            public final void accept(Object obj2) {
                n6 n6Var;
                n6 n6Var2;
                switch (i5) {
                    case 0:
                        ActionFooterView actionFooterView = this.f230470b;
                        aw0.i iVar = actionFooterView.f58953b;
                        if (iVar instanceof aw0.h) {
                            n6Var = ((aw0.h) iVar).f10330b;
                        } else if (iVar instanceof aw0.e) {
                            n6Var = ((aw0.e) iVar).d;
                        } else if (iVar instanceof aw0.g) {
                            n6Var = ((aw0.g) iVar).f10315b;
                        } else {
                            if (iVar != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            n6Var = null;
                        }
                        if (n6Var != null) {
                            actionFooterView.f.onNext(n6Var);
                            return;
                        }
                        return;
                    case 1:
                        ActionFooterView actionFooterView2 = this.f230470b;
                        aw0.i iVar2 = actionFooterView2.f58953b;
                        if (iVar2 instanceof aw0.h) {
                            n6Var2 = ((aw0.h) iVar2).f10331c;
                        } else if (iVar2 instanceof aw0.e) {
                            n6Var2 = null;
                        } else if (iVar2 instanceof aw0.g) {
                            n6Var2 = ((aw0.g) iVar2).f10316c;
                        } else {
                            if (iVar2 != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            n6Var2 = null;
                        }
                        if (n6Var2 != null) {
                            actionFooterView2.f58955g.onNext(n6Var2);
                            return;
                        }
                        return;
                    default:
                        ActionFooterView actionFooterView3 = this.f230470b;
                        aw0.i iVar3 = actionFooterView3.f58953b;
                        aw0.d dVar = null;
                        if (!(iVar3 instanceof aw0.h)) {
                            if (iVar3 instanceof aw0.e) {
                                dVar = ((aw0.e) iVar3).e;
                            } else if (!(iVar3 instanceof aw0.g) && iVar3 != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        if (dVar != null) {
                            actionFooterView3.f58956h.onNext(dVar);
                            return;
                        }
                        return;
                }
            }
        };
        final int i6 = 1;
        this.f58967x = new kfm.g(this) { // from class: ox0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActionFooterView f230470b;

            {
                this.f230470b = this;
            }

            @Override // kfm.g
            public final void accept(Object obj2) {
                n6 n6Var;
                n6 n6Var2;
                switch (i6) {
                    case 0:
                        ActionFooterView actionFooterView = this.f230470b;
                        aw0.i iVar = actionFooterView.f58953b;
                        if (iVar instanceof aw0.h) {
                            n6Var = ((aw0.h) iVar).f10330b;
                        } else if (iVar instanceof aw0.e) {
                            n6Var = ((aw0.e) iVar).d;
                        } else if (iVar instanceof aw0.g) {
                            n6Var = ((aw0.g) iVar).f10315b;
                        } else {
                            if (iVar != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            n6Var = null;
                        }
                        if (n6Var != null) {
                            actionFooterView.f.onNext(n6Var);
                            return;
                        }
                        return;
                    case 1:
                        ActionFooterView actionFooterView2 = this.f230470b;
                        aw0.i iVar2 = actionFooterView2.f58953b;
                        if (iVar2 instanceof aw0.h) {
                            n6Var2 = ((aw0.h) iVar2).f10331c;
                        } else if (iVar2 instanceof aw0.e) {
                            n6Var2 = null;
                        } else if (iVar2 instanceof aw0.g) {
                            n6Var2 = ((aw0.g) iVar2).f10316c;
                        } else {
                            if (iVar2 != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            n6Var2 = null;
                        }
                        if (n6Var2 != null) {
                            actionFooterView2.f58955g.onNext(n6Var2);
                            return;
                        }
                        return;
                    default:
                        ActionFooterView actionFooterView3 = this.f230470b;
                        aw0.i iVar3 = actionFooterView3.f58953b;
                        aw0.d dVar = null;
                        if (!(iVar3 instanceof aw0.h)) {
                            if (iVar3 instanceof aw0.e) {
                                dVar = ((aw0.e) iVar3).e;
                            } else if (!(iVar3 instanceof aw0.g) && iVar3 != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        if (dVar != null) {
                            actionFooterView3.f58956h.onNext(dVar);
                            return;
                        }
                        return;
                }
            }
        };
        final int i21 = 2;
        this.f58968y = new kfm.g(this) { // from class: ox0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActionFooterView f230470b;

            {
                this.f230470b = this;
            }

            @Override // kfm.g
            public final void accept(Object obj2) {
                n6 n6Var;
                n6 n6Var2;
                switch (i21) {
                    case 0:
                        ActionFooterView actionFooterView = this.f230470b;
                        aw0.i iVar = actionFooterView.f58953b;
                        if (iVar instanceof aw0.h) {
                            n6Var = ((aw0.h) iVar).f10330b;
                        } else if (iVar instanceof aw0.e) {
                            n6Var = ((aw0.e) iVar).d;
                        } else if (iVar instanceof aw0.g) {
                            n6Var = ((aw0.g) iVar).f10315b;
                        } else {
                            if (iVar != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            n6Var = null;
                        }
                        if (n6Var != null) {
                            actionFooterView.f.onNext(n6Var);
                            return;
                        }
                        return;
                    case 1:
                        ActionFooterView actionFooterView2 = this.f230470b;
                        aw0.i iVar2 = actionFooterView2.f58953b;
                        if (iVar2 instanceof aw0.h) {
                            n6Var2 = ((aw0.h) iVar2).f10331c;
                        } else if (iVar2 instanceof aw0.e) {
                            n6Var2 = null;
                        } else if (iVar2 instanceof aw0.g) {
                            n6Var2 = ((aw0.g) iVar2).f10316c;
                        } else {
                            if (iVar2 != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            n6Var2 = null;
                        }
                        if (n6Var2 != null) {
                            actionFooterView2.f58955g.onNext(n6Var2);
                            return;
                        }
                        return;
                    default:
                        ActionFooterView actionFooterView3 = this.f230470b;
                        aw0.i iVar3 = actionFooterView3.f58953b;
                        aw0.d dVar = null;
                        if (!(iVar3 instanceof aw0.h)) {
                            if (iVar3 instanceof aw0.e) {
                                dVar = ((aw0.e) iVar3).e;
                            } else if (!(iVar3 instanceof aw0.g) && iVar3 != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        if (dVar != null) {
                            actionFooterView3.f58956h.onNext(dVar);
                            return;
                        }
                        return;
                }
            }
        };
    }
}
