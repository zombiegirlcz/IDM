package com.revolut.core.ui_kit.views.navbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import aw0.b6;
import aw0.c6;
import aw0.p6;
import com.facebook.shimmer.ShimmerConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.LinearGaugeChartView;
import com.revolut.core.ui_kit.internal.views.chart.HorizontalSingleLineChartLegendView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import ix0.s0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.s1;
import org.jetbrains.annotations.NotNull;
import tx0.l0;
import tx0.m0;
import tx0.o0;
import tx0.u2;
import tx0.x2;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0004\u0013\n !B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/HeaderWithGaugeBarContentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Ltx0/x2;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Ltx0/m0;", "segments", "", "setSegments", "(Ljava/util/List;)V", "", "loading", "setLoading", "(Z)V", "Ltx0/l0;", "model", "setModel", "(Ltx0/l0;)V", "", "offset", "setBackgroundOffset", "(I)V", "Ltx0/u2;", "listener", "setColorSchemeListener", "(Ltx0/u2;)V", "Companion", "tx0/n0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class HeaderWithGaugeBarContentView extends ConstraintLayout implements x2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ShimmerConstraintLayout f59227b;
    public final Group f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f59228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f59229h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearGaugeChartView f59230j;
    public final HorizontalSingleLineChartLegendView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l0 f59231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f59232m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f59233n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f59234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f59235q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderWithGaugeBarContentView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R$layout.internal_view_header_with_gauge_bar, this);
        setClipToPadding(false);
        this.f59227b = (ShimmerConstraintLayout) findViewById(R$id.headerWithGaugeBar_loadingContainer);
        this.f = (Group) findViewById(R$id.headerWithGaugeBar_contentGroup);
        this.f59228g = (TextView) findViewById(R$id.headerWithGaugeBar_topLabel);
        this.f59229h = (TextView) findViewById(R$id.headerWithGaugeBar_title);
        this.i = (TextView) findViewById(R$id.headerWithGaugeBar_subtitle);
        this.f59230j = (LinearGaugeChartView) findViewById(R$id.headerWithGaugeBar_chart);
        this.k = (HorizontalSingleLineChartLegendView) findViewById(R$id.headerWithGaugeBar_legend);
        this.f59233n = 1.0f;
        this.o = 1.0f;
        this.f59234p = 1.0f;
    }

    private final void setSegments(List<m0> segments) {
        boolean z;
        List<m0> list = segments;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (m0 m0Var : list) {
            float f = m0Var.f275195b;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            arrayList.add(new s1(f, kli.a.s(m0Var.f275196c, context), (TextLocalisedClause) null, 12));
        }
        this.f59230j.setModel(new com.revolut.core.ui_kit.internal.views.e(arrayList, false, 30));
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it8 = list.iterator();
            while (it8.hasNext()) {
                if (((m0) it8.next()).f275194a != null) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        HorizontalSingleLineChartLegendView legendView = this.k;
        Intrinsics.checkNotNullExpressionValue(legendView, "legendView");
        legendView.setVisibility(z ? 0 : 8);
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            for (m0 m0Var2 : list) {
                int i = m0Var2.f275196c;
                p6 p6Var = new p6(i, Integer.valueOf(i));
                Clause clause = m0Var2.f275194a;
                c6 c6Var = clause == null ? null : new c6(p6Var, clause);
                if (c6Var != null) {
                    arrayList2.add(c6Var);
                }
            }
            legendView.setModel(new b6(arrayList2));
        }
    }

    @Override // tx0.x2
    public final void H(int i) {
        this.f59235q = i;
        knm.b.v(i, this);
    }

    @Override // tx0.x2
    public final ViewGroup.LayoutParams N(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ConstraintLayout.LayoutParams(-1, -2);
    }

    @Override // tx0.x2
    public final void d(float f, int i) {
        this.f59233n = f;
        f0();
        int height = getHeight();
        LinearGaugeChartView linearGaugeChartView = this.f59230j;
        int bottom = height - linearGaugeChartView.getBottom();
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        float fK = (1 - f) * (bottom - kli.a.k(r1, 16.0f));
        linearGaugeChartView.setTranslationY(fK);
        this.k.setTranslationY(fK);
    }

    @Override // tx0.x2
    public final void d0(int i) {
        knm.b.y(i, this);
    }

    public final void f0() {
        float fMin = Math.min(this.o, this.f59233n);
        this.f59228g.setAlpha(fMin);
        this.f59229h.setAlpha(fMin);
        this.i.setAlpha(fMin);
        this.k.setAlpha(Math.min(this.f59234p, this.f59233n));
        this.f59230j.setAlpha(Math.min(this.f59234p, 1.0f));
    }

    @Override // tx0.x2
    public final int n(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LinearGaugeChartView linearGaugeChartView = this.f59230j;
        return kli.a.k(context, 16.0f) + (linearGaugeChartView.getMeasuredHeight() > 0 ? linearGaugeChartView.getMeasuredHeight() : kli.a.k(context, 8.0f)) + this.f59235q;
    }

    @Override // tx0.x2
    public void setBackgroundOffset(int offset) {
    }

    @Override // tx0.x2
    public void setColorSchemeListener(@NotNull u2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        listener.a(s0.f(kli.a.s(R$attr.uikit_colorBackground, context)), 0, 0, 0);
    }

    public final void setLoading(boolean loading) {
        if (this.f59232m == loading) {
            return;
        }
        this.f59232m = loading;
        Group contentGroup = this.f;
        ShimmerConstraintLayout shimmerLayout = this.f59227b;
        if (loading) {
            Intrinsics.checkNotNullExpressionValue(contentGroup, "contentGroup");
            contentGroup.setVisibility(8);
            Intrinsics.checkNotNullExpressionValue(shimmerLayout, "shimmerLayout");
            shimmerLayout.setVisibility(0);
            shimmerLayout.l0();
            return;
        }
        shimmerLayout.m0();
        Intrinsics.checkNotNullExpressionValue(shimmerLayout, "shimmerLayout");
        shimmerLayout.setVisibility(8);
        Intrinsics.checkNotNullExpressionValue(contentGroup, "contentGroup");
        contentGroup.setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final void setModel(@NotNull l0 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(this.f59231l, model)) {
            return;
        }
        l0 l0Var = this.f59231l;
        this.f59231l = model;
        boolean z = l0Var == null || !l0Var.f275180a.equals(model.f275180a);
        boolean z3 = l0Var == null || !l0Var.f275181b.equals(model.f275181b);
        boolean z4 = l0Var == null || !Intrinsics.f(l0Var.f275182c, model.f275182c);
        boolean z6 = l0Var == null || !Intrinsics.f(l0Var.d, model.d);
        boolean z11 = l0Var == null || l0Var.e != model.e;
        if (z) {
            TextView topLabelView = this.f59228g;
            Intrinsics.checkNotNullExpressionValue(topLabelView, "topLabelView");
            kli.a.b(topLabelView, model.f275180a, ty0.f.f275450a);
        }
        if (z3) {
            TextView titleView = this.f59229h;
            Intrinsics.checkNotNullExpressionValue(titleView, "titleView");
            kli.a.b(titleView, model.f275181b, ty0.f.f275450a);
        }
        if (z4) {
            TextView subtitleView = this.i;
            Intrinsics.checkNotNullExpressionValue(subtitleView, "subtitleView");
            kli.a.b(subtitleView, model.f275182c, ty0.f.f275450a);
        }
        if (z6) {
            setSegments(model.d);
        }
        if (z11) {
            int i = o0.f275214a[model.e.ordinal()];
            if (i == 1) {
                this.o = 1.0f;
                this.f59234p = 1.0f;
            } else if (i == 2) {
                this.o = 0.5f;
                this.f59234p = 0.5f;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                this.o = 1.0f;
                this.f59234p = 0.5f;
            }
            f0();
        }
    }

    @Override // tx0.x2
    public final int w(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeaderWithGaugeBarContentView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
