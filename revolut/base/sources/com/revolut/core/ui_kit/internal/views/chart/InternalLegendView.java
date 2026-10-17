package com.revolut.core.ui_kit.internal.views.chart;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import aw0.h4;
import aw0.j4;
import aw0.n4;
import aw0.o9;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.v7;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import ts0.b0;
import ts0.c0;
import ts0.e0;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chart/InternalLegendView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setTitleSingleLineEllipsize", "(Z)V", "Lcom/revolut/core/ui_kit/models/g;", "chartData", "setData", "(Lcom/revolut/core/ui_kit/models/g;)V", "Companion", "ts0/b0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InternalLegendView extends LinearLayout {

    @NotNull
    private static final a Companion = new a();
    public static final BigDecimal e = new BigDecimal("100");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f56697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56699c;
    public final TextClause d;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InternalLegendView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setData(@NotNull com.revolut.core.ui_kit.models.g chartData) {
        BigDecimal bigDecimalDivide;
        ArrayList arrayList;
        List list;
        h4 h4Var;
        double d;
        int i;
        int i2;
        char c2;
        boolean z;
        int i3;
        int i5;
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        n4 n4Var = chartData.f;
        List listP0 = chartData.f58080a;
        int i6 = c0.f273860a[n4Var.ordinal()];
        char c3 = 3;
        int i21 = 2;
        boolean z3 = true;
        if (i6 == 1) {
            listP0 = d0.P0(listP0, new ts0.d0());
        } else if (i6 == 2) {
            listP0 = d0.P0(listP0, new e0());
        } else if (i6 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        double d5 = chartData.f58081b;
        ArrayList arrayList2 = this.f56697a;
        int size = arrayList2.size();
        int i22 = 0;
        int i32 = 0;
        while (i32 < size) {
            b0 b0Var = (b0) arrayList2.get(i32);
            j4 j4Var = (j4) d0.e0(i32, listP0);
            if (j4Var == null) {
                b0Var.f273856a.setVisibility(8);
                arrayList = arrayList2;
                list = listP0;
                d = d5;
                i = size;
                i3 = i22;
                c2 = c3;
                i5 = i21;
                z = z3;
            } else {
                ConstraintLayout constraintLayout = b0Var.f273856a;
                TextView textView = b0Var.f273857b;
                TextView textView2 = b0Var.f273858c;
                constraintLayout.setVisibility(i22);
                if (d5 > 0.0d) {
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j4Var.d());
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                    bigDecimalDivide = bigDecimalValueOf.multiply(e).divide(new BigDecimal(String.valueOf(d5)), i21, RoundingMode.HALF_UP);
                } else {
                    bigDecimalDivide = BigDecimal.ZERO;
                }
                Intrinsics.h(bigDecimalDivide);
                arrayList = arrayList2;
                PercentageClause percentageClause = new PercentageClause(bigDecimalDivide, chartData.d, (Style) null, 4);
                Clause clauseB = j4Var.b();
                h4 h4Var2 = chartData.e;
                h4 h4Var3 = b0Var.d;
                ConstraintLayout constraintLayout2 = b0Var.f273856a;
                if (h4Var3 == h4Var2) {
                    list = listP0;
                    h4Var = h4Var2;
                    d = d5;
                    i = size;
                    c2 = 3;
                } else {
                    Intrinsics.checkNotNullParameter(h4Var2, "<set-?>");
                    b0Var.d = h4Var2;
                    int id10 = textView.getId();
                    int id11 = textView2.getId();
                    list = listP0;
                    ConstraintSet constraintSetL = v7.l(constraintLayout2);
                    h4Var = h4Var2;
                    int i33 = c0.f273861b[h4Var2.ordinal()];
                    d = d5;
                    if (i33 == 1) {
                        i = size;
                        i2 = 0;
                        constraintSetL.connect(id10, 6, 0, 6);
                        constraintSetL.connect(id10, 7, id11, 6);
                        constraintSetL.connect(id11, 6, id10, 7);
                        constraintSetL.connect(id11, 7, 0, 7);
                        constraintSetL.setHorizontalChainStyle(id10, 2);
                    } else {
                        if (i33 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = 0;
                        constraintSetL.connect(id11, 6, 0, 6);
                        constraintSetL.connect(id11, 7, id10, 6);
                        constraintSetL.connect(id10, 6, id11, 7);
                        constraintSetL.connect(id10, 7, 0, 7);
                        constraintSetL.setHorizontalChainStyle(id11, 2);
                        i = size;
                    }
                    c2 = 3;
                    constraintSetL.connect(id10, 3, i2, 3);
                    constraintSetL.connect(id10, 4, i2, 4);
                    constraintSetL.connect(id11, 3, i2, 3);
                    constraintSetL.connect(id11, 4, i2, 4);
                    constraintSetL.applyTo(constraintLayout2);
                }
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ty0.c cVarB0 = jh.d.f(context).b0();
                int i43 = c0.f273861b[h4Var.ordinal()];
                TextClause textClause = this.d;
                z = true;
                if (i43 != 1) {
                    i5 = 2;
                    if (i43 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (clauseB != null) {
                        ty0.c.b(cVarB0, yoj.b.w(percentageClause, textClause), b0Var.f273858c, null, null, 12);
                        i3 = 0;
                        textView2.setVisibility(0);
                        ty0.c.b(cVarB0, clauseB, b0Var.f273857b, null, null, 12);
                        textView.setVisibility(0);
                    } else {
                        i3 = 0;
                        textView.setVisibility(8);
                        ty0.c.b(cVarB0, percentageClause, b0Var.f273858c, null, null, 12);
                        textView2.setVisibility(0);
                    }
                } else {
                    i3 = 0;
                    i5 = 2;
                    if (clauseB != null) {
                        ty0.c.b(cVarB0, clauseB, b0Var.f273857b, null, null, 12);
                        textView.setVisibility(0);
                        ty0.c.b(cVarB0, yoj.b.w(textClause, percentageClause), b0Var.f273858c, null, null, 12);
                        textView2.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                        ty0.c.b(cVarB0, percentageClause, b0Var.f273858c, null, null, 12);
                        textView2.setVisibility(0);
                    }
                }
                int i59 = Intrinsics.f(chartData.f58082c, j4Var.a()) ? this.f56698b : this.f56699c;
                textView.setTextColor(i59);
                textView2.setTextColor(i59);
            }
            i32++;
            i22 = i3;
            z3 = z;
            c3 = c2;
            i21 = i5;
            arrayList2 = arrayList;
            listP0 = list;
            d5 = d;
            size = i;
        }
    }

    public final void setTitleSingleLineEllipsize(boolean enabled) {
        ArrayList arrayList = this.f56697a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b0 b0Var = (b0) arrayList.get(i);
            b0Var.f273857b.setMaxLines(enabled ? 1 : Integer.MAX_VALUE);
            b0Var.f273857b.setEllipsize(enabled ? TextUtils.TruncateAt.END : null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InternalLegendView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalLegendView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56698b = kli.a.s(R$attr.uikit_colorForeground, context);
        this.f56699c = kli.a.s(R$attr.uikit_colorGreyTone50, context);
        m70.a.t(t0.f186434a);
        this.d = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        setOrientation(1);
        setGravity(17);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        ArrayList arrayList = new ArrayList(5);
        for (int i2 = 0; i2 < 5; i2++) {
            View viewInflate = layoutInflaterFrom.inflate(R$layout.internal_chart_legend_row, (ViewGroup) this, false);
            Intrinsics.i(viewInflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            addView(constraintLayout);
            View viewFindViewById = constraintLayout.findViewById(R$id.legendRow_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            View viewFindViewById2 = constraintLayout.findViewById(R$id.legendRow_percent);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            arrayList.add(new b0(constraintLayout, (TextView) viewFindViewById, (TextView) viewFindViewById2));
        }
        this.f56697a = arrayList;
    }

    public /* synthetic */ InternalLegendView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
