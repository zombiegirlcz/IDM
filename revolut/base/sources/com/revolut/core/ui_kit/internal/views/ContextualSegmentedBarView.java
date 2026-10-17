package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aw0.a3;
import aw0.y2;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.g0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ms0.e0;
import ms0.h0;
import ms0.s1;
import or0.u;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class ContextualSegmentedBarView extends LinearLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f56146g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f56147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearGaugeChartView f56148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z4l.j f56149c;
    public List d;
    public int e;
    public boolean f;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n0\u0003R\u00060\u0000R\u00020\u00040\u0001:\u0001\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/ContextualSegmentedBarView$ItemDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lms0/h0;", "Lcom/revolut/core/ui_kit/internal/views/a;", "Lcom/revolut/core/ui_kit/internal/views/ContextualSegmentedBarView;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class ItemDelegate extends BaseRecyclerViewDelegate<h0, a> {
        public ItemDelegate() {
            super(0, new mqg.a(8));
        }

        public static void p(a holder, h0 data, List payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            holder.getClass();
            Intrinsics.checkNotNullParameter(data, "data");
            View view = holder.f;
            Context context = ContextualSegmentedBarView.this.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            view.setBackgroundColor(kli.a.s(data.d, context));
            kli.a.b(holder.f56493g, data.f208269b, ty0.f.f275450a);
            kli.a.b(holder.f56494h, data.f208270c, ty0.f.f275450a);
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            ConstraintLayout constraintLayout = new ConstraintLayout(parent.getContext());
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
            Context context = constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = kli.a.k(context, 8.0f);
            constraintLayout.setLayoutParams(layoutParams);
            return new a(this, constraintLayout);
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
        /* JADX INFO: renamed from: j */
        public final /* bridge */ /* synthetic */ void p(RecyclerView.ViewHolder viewHolder, koi.j jVar, int i, List list) {
            p((a) viewHolder, (h0) jVar, list);
        }

        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        /* JADX INFO: renamed from: m */
        public final /* bridge */ /* synthetic */ void p(koi.b bVar, koi.j jVar, int i, List list) {
            p((a) bVar, (h0) jVar, list);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextualSegmentedBarView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final Function1<Integer, Unit> getSelectionListener() {
        return this.f56148b.getSelectionListener();
    }

    public final void setChartData(@NotNull List<a3> segments, boolean z, int i, int i2) {
        Intrinsics.checkNotNullParameter(segments, "segments");
        boolean zF = Intrinsics.f(segments, this.d);
        LinearGaugeChartView linearGaugeChartView = this.f56148b;
        if (!zF || z != this.f || i2 != this.e) {
            this.d = segments;
            this.f = z;
            this.e = i2;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iS = kli.a.s(i2, context);
            List<a3> list = segments;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            for (a3 a3Var : list) {
                float f = a3Var.f10226c;
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                arrayList.add(new s1(f, kli.a.s(a3Var.e, context2), (TextLocalisedClause) null, 12));
            }
            linearGaugeChartView.setModel(new e(arrayList, 24.0f, 2.0f, z, new f(iS, io0.a.b(0.1f, iS))));
        }
        linearGaugeChartView.setSelectedPosition(i < 0 ? -1 : i);
        e0 e0Var = this.f56147a;
        if (i >= 0) {
            e0Var.setOnClickListener(new g0(this, 17));
        } else {
            u.o(e0Var);
        }
    }

    public final void setHeaderData(@NotNull y2 header) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.f56147a.setHeader(header);
    }

    public final void setItemsData(@NotNull String snapshotId, @NotNull List<a3> segments) {
        Intrinsics.checkNotNullParameter(snapshotId, "snapshotId");
        Intrinsics.checkNotNullParameter(segments, "segments");
        List<a3> list = segments;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (a3 a3Var : list) {
            arrayList.add(new h0(a0.d.r(snapshotId, a3Var.f10224a), a3Var.f10225b, a3Var.d, a3Var.e));
        }
        this.f56149c.c(arrayList);
    }

    public final void setSelectionListener(Function1<? super Integer, Unit> function1) {
        this.f56148b.setSelectionListener(function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextualSegmentedBarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextualSegmentedBarView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int i2 = 0;
        z4l.j jVar = new z4l.j(3, zhm.u.c(new ItemDelegate()), false);
        this.f56149c = jVar;
        this.d = f0.f322471a;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        AttributeSet attributeSet2 = null;
        int i3 = 6;
        e0 e0Var = new e0(context, attributeSet2, i3, i2);
        e0Var.setId(R$id.internal_contextualSegmentedBar_header);
        e0Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f56147a = e0Var;
        LinearGaugeChartView linearGaugeChartView = new LinearGaugeChartView(context, attributeSet2, i3, i2);
        linearGaugeChartView.setId(R$id.internal_contextualSegmentedBar_chart);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = kli.a.k(context, 16.0f);
        linearGaugeChartView.setLayoutParams(layoutParams);
        this.f56148b = linearGaugeChartView;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.internal_contextualSegmentedBar_rv);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = kli.a.k(context, 8.0f);
        recyclerView.setLayoutParams(layoutParams2);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        hoi.j jVar2 = new hoi.j(null, 7);
        jVar2.f154304b = true;
        jVar2.f154305c = true;
        jVar2.d = true;
        jVar2.setSupportsChangeAnimations(true);
        jVar2.setAddDuration(250L);
        jVar2.setRemoveDuration(250L);
        recyclerView.setItemAnimator(jVar2);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(jVar);
        addView(e0Var);
        addView(linearGaugeChartView);
        addView(recyclerView);
    }

    public /* synthetic */ ContextualSegmentedBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
