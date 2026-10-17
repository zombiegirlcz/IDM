package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.a8;
import mx0.b8;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001!B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u000eJ\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001b¢\u0006\u0004\b \u0010\u001eJ\u0015\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\f2\b\b\u0001\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010'R\u001b\u0010\u000b\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u0010\u0015\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u001b\u0010\u0018\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u00104R\u001b\u00108\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010,\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010,\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/revolut/core/ui_kit/views/InputTravelView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "primaryText", "", "setPrimaryText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "hint", "setHint", "", "hints", "setHints", "(Ljava/util/List;)V", "secondaryText", "setSecondaryText", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "icon", "setIconImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "", "isVisible", "setProgressVisible", "(Z)V", "loading", "setLoading", "Lmx0/a8;", "newStyle", "setStyle", "(Lmx0/a8;)V", "visibility", "setVisibility", "(I)V", "color", "setHintTextColor", "Landroid/widget/TextView;", "d", "Le8/q;", "getPrimaryText", "()Landroid/widget/TextView;", "e", "getSecondaryText", "Landroid/widget/ImageView;", "f", "getIcon", "()Landroid/widget/ImageView;", "g", "getProgress", "()Landroid/widget/FrameLayout;", "progress", "Landroid/view/View;", "h", "getContent", "()Landroid/view/View;", "content", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "i", "getLoadingShimmer", "()Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadingShimmer", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InputTravelView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ny0.k f58676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f58677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f58678c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final e8.q primaryText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final e8.q secondaryText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final e8.q icon;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final e8.q progress;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final e8.q content;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final e8.q loadingShimmer;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextSwitcher f58681j;
    public iv0.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a8 f58682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f58683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fp0.p f58684n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputTravelView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final View getContent() {
        return this.content.f();
    }

    private final ImageView getIcon() {
        return (ImageView) this.icon.f();
    }

    private final ShimmerFrameLayout getLoadingShimmer() {
        return (ShimmerFrameLayout) this.loadingShimmer.f();
    }

    private final TextView getPrimaryText() {
        return (TextView) this.primaryText.f();
    }

    private final FrameLayout getProgress() {
        return (FrameLayout) this.progress.f();
    }

    private final TextView getSecondaryText() {
        return (TextView) this.secondaryText.f();
    }

    private final void setHintTextColor(int color) {
        TextSwitcher textSwitcher = this.f58681j;
        if (textSwitcher != null) {
            int childCount = textSwitcher.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = textSwitcher.getChildAt(i);
                TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
                if (textView != null) {
                    textView.setTextColor(color);
                }
            }
        }
    }

    public final efm.r a() {
        efm.r rVarHide = this.f58677b.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    public final void b() {
        if (this.f58683m && isShown()) {
            getLoadingShimmer().e();
        } else {
            getLoadingShimmer().f();
        }
    }

    public final void c() {
        CharSequence text = getPrimaryText().getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        boolean z = text.length() > 0;
        CharSequence text2 = getSecondaryText().getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        boolean z3 = text2.length() > 0;
        iv0.d dVar = this.k;
        List list = dVar != null ? dVar.f168669c : null;
        if (list == null) {
            list = f0.f322471a;
        }
        boolean z4 = (z || z3 || list.isEmpty()) ? false : true;
        TextSwitcher textSwitcher = this.f58681j;
        if (textSwitcher != null) {
            textSwitcher.setVisibility(z4 ? 0 : 8);
        }
        iv0.d dVar2 = this.k;
        if (dVar2 != null) {
            dVar2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        iv0.d dVar = this.k;
        if (dVar != null) {
            dVar.a();
        }
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getLoadingShimmer().f();
        iv0.d dVar = this.k;
        if (dVar != null) {
            dVar.f = false;
            dVar.f168667a.removeCallbacks(dVar.f168670g);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.f58676a.b(i);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        iv0.d dVar = this.k;
        if (dVar != null) {
            dVar.a();
        }
        b();
    }

    public final void setHint(@NotNull Clause hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        setHints(zhm.u.c(hint));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void setHints(@NotNull List<? extends Clause> hints) {
        Intrinsics.checkNotNullParameter(hints, "hints");
        if (hints.isEmpty() && this.k == null) {
            return;
        }
        iv0.d dVar = this.k;
        if (dVar == null) {
            View viewInflate = ((ViewStub) findViewById(R$id.inputTravel_hintSwitcherStub)).inflate();
            Intrinsics.i(viewInflate, "null cannot be cast to non-null type android.widget.TextSwitcher");
            TextSwitcher textSwitcher = (TextSwitcher) viewInflate;
            this.f58681j = textSwitcher;
            a8 a8Var = this.f58682l;
            if (a8Var != null) {
                if (a8Var == a8.ON_MEDIA_STATIC && !((Boolean) jo0.g.M.getValue()).booleanValue()) {
                    a8Var = a8.DEFAULT;
                }
                if (a8Var != null) {
                    int iB = a8Var.b();
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    setHintTextColor(kli.a.s(iB, context));
                }
            }
            iv0.d dVar2 = new iv0.d(this, textSwitcher);
            this.k = dVar2;
            dVar = dVar2;
        }
        dVar.b(hints);
        c();
    }

    public final void setIconImage(@NotNull Image icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        yy0.f.e(or0.u.k(this).Q(), icon, getIcon(), null, null, 12);
    }

    public final void setLoading(boolean loading) {
        this.f58683m = loading;
        getContent().setVisibility(loading ? 4 : 0);
        getLoadingShimmer().setVisibility(loading ? 0 : 8);
        b();
        fp0.p pVar = this.f58684n;
        fp0.p.b(pVar, !loading);
        View view = pVar.f137029a;
        or0.m.a(view);
        if (loading) {
            or0.u.o(view);
        } else {
            view.setOnClickListener(new b8(this, 0));
        }
    }

    public final void setPrimaryText(@NotNull Clause primaryText) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        ty0.c.b(or0.u.k(this).b0(), primaryText, getPrimaryText(), null, null, 12);
        c();
    }

    public final void setProgressVisible(boolean isVisible) {
        getProgress().setVisibility(isVisible ? 0 : 8);
    }

    public final void setSecondaryText(@NotNull Clause secondaryText) {
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        getSecondaryText().setVisibility(0);
        ty0.c.b(or0.u.k(this).b0(), secondaryText, getSecondaryText(), null, null, 12);
        c();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    public final void setStyle(@NotNull a8 newStyle) {
        Intrinsics.checkNotNullParameter(newStyle, "newStyle");
        a8 a8Var = (newStyle != a8.ON_MEDIA_STATIC || ((Boolean) jo0.g.M.getValue()).booleanValue()) ? newStyle : a8.DEFAULT;
        if (a8Var == this.f58682l) {
            return;
        }
        this.f58682l = newStyle;
        Color.Solid solid = new Color.Solid(a8Var.a());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(a8Var.b(), context);
        getSecondaryText().setTextColor(iS);
        setHintTextColor(iS);
        fp0.d dVar = new fp0.d(new Color.Solid(R$attr.uikit_colorForeground), solid, false);
        this.f58684n.c(new gp0.g(dVar));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        float f = this.f58678c;
        GradientDrawable gradientDrawableI = dr0.l.i(context3, f, f, f, f, solid, 192);
        Color.SolidInt solidInt = new Color.SolidInt(-16777216);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        float f4 = this.f58678c;
        setBackground(dr0.l.f(context2, dVar, gradientDrawableI, null, dr0.l.i(context4, f4, f4, f4, f4, solidInt, 192), 8));
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        iv0.d dVar = this.k;
        if (dVar != null) {
            dVar.a();
        }
        b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputTravelView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputTravelView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ny0.k kVar = new ny0.k(this);
        this.f58676a = kVar;
        this.f58677b = v0.a.d("create(...)");
        this.f58678c = kli.a.l(context, qv0.h.EXTRA_LARGE.a());
        this.primaryText = kli.a.J(R$id.inputTravel_primaryText, this);
        this.secondaryText = kli.a.J(R$id.inputTravel_secondaryText, this);
        this.icon = kli.a.J(R$id.inputTravel_icon, this);
        this.progress = kli.a.J(R$id.inputTravel_progress, this);
        this.content = kli.a.J(R$id.inputTravel_content, this);
        this.loadingShimmer = kli.a.J(R$id.inputTravel_loading, this);
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(0);
        mVar.getClass();
        fp0.p pVarA = fp0.m.a(this, gVar);
        this.f58684n = pVarA;
        View.inflate(context, R$layout.internal_view_input_travel, this);
        kVar.d(true);
        fp0.p.b(pVarA, true);
        View view = pVarA.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new b8(this, 1));
        setStyle(a8.DEFAULT);
    }

    public /* synthetic */ InputTravelView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
