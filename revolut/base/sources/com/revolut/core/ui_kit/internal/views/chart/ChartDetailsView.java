package com.revolut.core.ui_kit.internal.views.chart;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.widgets.b0;
import com.revolut.core.ui_kit.delegates.widgets.c0;
import com.revolut.core.ui_kit.delegates.widgets.d0;
import com.revolut.core.ui_kit.delegates.widgets.e0;
import com.revolut.core.ui_kit.delegates.widgets.f0;
import com.revolut.core.ui_kit.delegates.widgets.h0;
import com.revolut.core.ui_kit.delegates.widgets.i0;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.v7;
import java.util.ArrayList;
import jb3.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chart/ChartDetailsView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/delegates/widgets/i0;", "model", "", "setModel", "(Lcom/revolut/core/ui_kit/delegates/widgets/i0;)V", "Companion", "ts0/d", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChartDetailsView extends LinearLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f56596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f56597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DotDividerClause f56598c;
    public UIKitTextView d;
    public i0 e;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChartDetailsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static UIKitTextView c(ChartDetailsView chartDetailsView, int i, int i2, int i3) {
        int i5 = (i3 & 2) != 0 ? 1 : 3;
        int i6 = (i3 & 4) != 0 ? -2 : -1;
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        Context context = chartDetailsView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, 6, 0);
        l.e(uIKitTextView, R$attr.internal_textAppearanceBody3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i6, -2);
        layoutParams.topMargin = i2;
        uIKitTextView.setLayoutParams(layoutParams);
        uIKitTextView.setMaxLines(i5);
        uIKitTextView.setTextAlignment(5);
        Context context2 = uIKitTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        uIKitTextView.setTextColor(kli.a.s(i, context2));
        return uIKitTextView;
    }

    public final void a(int i, Clause clause, Clause clause2, Color.Solid solid) {
        ArrayList arrayList;
        int iK;
        while (true) {
            arrayList = this.f56596a;
            if (arrayList.size() > i) {
                break;
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (arrayList.isEmpty()) {
                iK = 0;
            } else {
                Context context = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                iK = kli.a.k(context, 2.0f);
            }
            layoutParams.topMargin = iK;
            linearLayout.setLayoutParams(layoutParams);
            UIKitTextView uIKitTextViewC = c(this, R$attr.uikit_colorForeground, 0, 14);
            uIKitTextViewC.setEllipsize(TextUtils.TruncateAt.END);
            uIKitTextViewC.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 1.0f));
            UIKitTextView uIKitTextViewC2 = c(this, R$attr.uikit_colorGreyTone50, 0, 14);
            linearLayout.addView(uIKitTextViewC);
            linearLayout.addView(uIKitTextViewC2);
            View view = this.d;
            Integer numValueOf = view != null ? Integer.valueOf(indexOfChild(view)) : null;
            if (numValueOf == null) {
                addView(linearLayout);
            } else {
                addView(linearLayout, numValueOf.intValue());
            }
            arrayList.add(new ts0.d(linearLayout, uIKitTextViewC, uIKitTextViewC2));
        }
        Object obj2 = arrayList.get(i);
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        ts0.d dVar = (ts0.d) obj2;
        dVar.f273862a.setVisibility(0);
        UIKitTextView uIKitTextView = dVar.f273863b;
        ty0.f fVar = ty0.f.f275450a;
        kli.a.b(uIKitTextView, clause, fVar);
        kli.a.b(dVar.f273864c, yoj.b.w(this.f56598c, clause2), fVar);
        if (solid == null) {
            View view2 = dVar.d;
            if (view2 != null) {
                view2.setVisibility(8);
                return;
            }
            return;
        }
        View view3 = dVar.d;
        if (view3 == null) {
            LinearLayout linearLayout2 = dVar.f273862a;
            GradientDrawable gradientDrawableK = v7.k(0);
            Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
            gradientDrawableK.setCornerRadius(kli.a.k(r0, 2.0f));
            View view4 = new View(getContext());
            view4.setImportantForAccessibility(2);
            view4.setBackground(gradientDrawableK);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(com.google.android.gms.internal.mlkit_vision_face.a.a(view4, "getContext(...)", 8.0f), com.google.android.gms.internal.mlkit_vision_face.a.a(view4, "getContext(...)", 8.0f));
            Context context2 = view4.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            layoutParams2.setMarginEnd(kli.a.k(context2, 6.0f));
            view4.setLayoutParams(layoutParams2);
            linearLayout2.addView(view4, 0);
            dVar.d = view4;
            view3 = view4;
        }
        view3.setVisibility(0);
        Drawable background = view3.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            gradientDrawable.setColor(io0.a.c(context3, solid));
        }
    }

    public final void b(int i, int i2, Clause clause) {
        while (true) {
            ArrayList arrayList = this.f56597b;
            int iK = 0;
            if (arrayList.size() > i) {
                Object obj2 = arrayList.get(i);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                UIKitTextView uIKitTextView = (UIKitTextView) obj2;
                uIKitTextView.setVisibility(0);
                kli.a.b(uIKitTextView, clause, ty0.f.f275450a);
                uIKitTextView.setTextAlignment(5);
                Context context = uIKitTextView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                uIKitTextView.setTextColor(kli.a.s(i2, context));
                return;
            }
            int i3 = R$attr.uikit_colorForeground;
            if (!arrayList.isEmpty()) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                iK = kli.a.k(context2, 2.0f);
            }
            UIKitTextView uIKitTextViewC = c(this, i3, iK, 2);
            uIKitTextViewC.setEllipsize(TextUtils.TruncateAt.END);
            View view = this.d;
            Integer numValueOf = view != null ? Integer.valueOf(indexOfChild(view)) : null;
            if (numValueOf == null) {
                addView(uIKitTextViewC);
            } else {
                addView(uIKitTextViewC, numValueOf.intValue());
            }
            arrayList.add(uIKitTextViewC);
        }
    }

    public final void setModel(@NotNull i0 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(this.e, model)) {
            return;
        }
        this.e = model;
        UIKitTextView uIKitTextView = this.d;
        if (uIKitTextView != null) {
            uIKitTextView.setVisibility(8);
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f56596a;
            if (i >= arrayList.size()) {
                break;
            }
            ((ts0.d) arrayList.get(i)).f273862a.setVisibility(8);
            i++;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.f56597b;
            if (i2 >= arrayList2.size()) {
                break;
            }
            Object obj2 = arrayList2.get(i2);
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            ((View) obj2).setVisibility(8);
            i2++;
        }
        if (model instanceof b0) {
            b0 b0Var = (b0) model;
            UIKitTextView uIKitTextViewC = this.d;
            if (uIKitTextViewC == null) {
                uIKitTextViewC = c(this, R$attr.uikit_colorGreyTone50, 0, 8);
                uIKitTextViewC.setEllipsize(TextUtils.TruncateAt.END);
                addView(uIKitTextViewC);
                this.d = uIKitTextViewC;
            }
            uIKitTextViewC.setVisibility(0);
            kli.a.b(uIKitTextViewC, b0Var.f55297a, ty0.f.f275450a);
            uIKitTextViewC.setTextAlignment(5);
            return;
        }
        int i3 = 2;
        if (model instanceof h0) {
            h0 h0Var = (h0) model;
            b(0, R$attr.uikit_colorForeground, h0Var.f55364a);
            Clause clause = h0Var.f55365b;
            if (clause != null) {
                b(1, h0Var.d.a(), clause);
            } else {
                i3 = 1;
            }
            Clause clause2 = h0Var.f55366c;
            if (clause2 != null) {
                b(i3, R$attr.uikit_colorGreyTone50, clause2);
                return;
            }
            return;
        }
        if (model instanceof d0) {
            d0 d0Var = (d0) model;
            c0 c0Var = d0Var.f55321a;
            c0 c0Var2 = d0Var.f55322b;
            c0 c0Var3 = d0Var.f55323c;
            a(0, c0Var.f55309a, c0Var.f55310b, null);
            if (c0Var2 != null) {
                a(1, c0Var2.f55309a, c0Var2.f55310b, null);
            }
            if (c0Var3 != null) {
                a(2, c0Var3.f55309a, c0Var3.f55310b, null);
                return;
            }
            return;
        }
        if (!(model instanceof f0)) {
            throw new NoWhenBranchMatchedException();
        }
        f0 f0Var = (f0) model;
        e0 e0Var = f0Var.f55350a;
        e0 e0Var2 = f0Var.f55351b;
        e0 e0Var3 = f0Var.f55352c;
        a(0, e0Var.f55334a, e0Var.f55335b, e0Var.f55336c);
        if (e0Var2 != null) {
            a(1, e0Var2.f55334a, e0Var2.f55335b, e0Var2.f55336c);
        }
        if (e0Var3 != null) {
            a(2, e0Var3.f55334a, e0Var3.f55335b, e0Var3.f55336c);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChartDetailsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartDetailsView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56596a = new ArrayList(3);
        this.f56597b = new ArrayList(3);
        this.f56598c = new DotDividerClause((Integer) null);
        setOrientation(1);
        setGravity(8388611);
    }

    public /* synthetic */ ChartDetailsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
