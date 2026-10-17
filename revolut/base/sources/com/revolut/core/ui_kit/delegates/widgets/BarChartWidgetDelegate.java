package com.revolut.core.ui_kit.delegates.widgets;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import aw0.e5;
import aw0.h5;
import aw0.l5;
import aw0.m5;
import aw0.o5;
import aw0.p5;
import aw0.q5;
import aw0.s5;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.ResizableTileHeaderView;
import com.revolut.core.ui_kit.internal.views.chart.HistogramView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.tracking.TrackableAction;
import com.youTransactor.uCube.rpc.Constants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/BarChartWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BarChartWidgetDelegate$Model;", "Lop0/m;", "<init>", "()V", "Model", "op0/l", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BarChartWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.m> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/BarChartWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f54973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextLocalisedClause f54974c;
        public final Clause d;
        public final Clause e;
        public final Clause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Clause f54975g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f54976h;
        public final s5 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Float f54977j;
        public final Float k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f54978l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final aw0.k0 f54979m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final op0.q f54980n;
        public final TrackableAction o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Parcelable f54981p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Object f54982q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public op0.r f54983r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final uw0.i f54984s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final q5 f54985t;
        public final py0.c u;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.BarChartWidgetDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static Model a(Companion companion, String listId, TextLocalisedClause headerTopLabel, MoneyClause moneyClause, Clause clause, CompositeClause compositeClause, Clause clause2, s5 s5Var, List chartItems, Float f, boolean z, Object obj2, TrackableAction.Custom custom, int i) {
                Float fValueOf = (i & 256) != 0 ? Float.valueOf(8.0f) : null;
                Float f4 = (i & 512) != 0 ? null : f;
                boolean z3 = (i & 1024) != 0 ? false : z;
                aw0.k0 barBackgroundStyle = aw0.k0.SOLID;
                Object obj3 = (i & 4096) != 0 ? null : obj2;
                TrackableAction trackableAction = (i & 16384) != 0 ? TrackableAction.Default.f58285a : custom;
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(headerTopLabel, "headerTopLabel");
                Intrinsics.checkNotNullParameter(chartItems, "chartItems");
                Intrinsics.checkNotNullParameter(barBackgroundStyle, "barBackgroundStyle");
                Intrinsics.checkNotNullParameter(trackableAction, "trackableAction");
                return new Model(listId, headerTopLabel, moneyClause, clause, compositeClause, clause2, chartItems, s5Var, fValueOf, f4, z3, barBackgroundStyle, op0.q.MEDIUM, trackableAction, obj3, 65536);
            }

            public static Model b(Companion companion, String listId, TextLocalisedClause headerTopLabel, Clause clause, CompositeClause compositeClause, List chartItems, aw0.k0 k0Var, Object obj2, TrackableAction.Custom custom, int i) {
                Float fValueOf = Float.valueOf(8.0f);
                aw0.k0 barBackgroundStyle = (i & 64) != 0 ? aw0.k0.SOLID : k0Var;
                Object obj3 = (i & 128) != 0 ? null : obj2;
                TrackableAction trackableAction = (i & 512) != 0 ? TrackableAction.Default.f58285a : custom;
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(headerTopLabel, "headerTopLabel");
                Intrinsics.checkNotNullParameter(chartItems, "chartItems");
                Intrinsics.checkNotNullParameter(barBackgroundStyle, "barBackgroundStyle");
                Intrinsics.checkNotNullParameter(trackableAction, "trackableAction");
                return new Model(listId, headerTopLabel, clause, compositeClause, null, null, chartItems, null, fValueOf, null, false, barBackgroundStyle, op0.q.SMALL, trackableAction, obj3, 67072);
            }
        }

        public Model(String str, TextLocalisedClause textLocalisedClause, Clause clause, Clause clause2, Clause clause3, Clause clause4, List list, s5 s5Var, Float f, Float f4, boolean z, aw0.k0 k0Var, op0.q qVar, TrackableAction trackableAction, Object obj2, int i) {
            Clause clause5 = clause;
            Float f5 = (i & 512) != 0 ? null : f4;
            boolean z3 = (i & 1024) != 0 ? false : z;
            op0.r rVar = op0.r.SEEN;
            this.f54973b = str;
            this.f54974c = textLocalisedClause;
            this.d = clause5;
            this.e = clause2;
            this.f = clause3;
            this.f54975g = clause4;
            this.f54976h = list;
            this.i = s5Var;
            this.f54977j = f;
            this.k = f5;
            this.f54978l = z3;
            this.f54979m = k0Var;
            this.f54980n = qVar;
            this.o = trackableAction;
            this.f54981p = null;
            this.f54982q = obj2;
            this.f54983r = rVar;
            this.f54984s = new uw0.i(str, uw0.g.UNTIL_ANY_FINISHED, true);
            this.f54985t = new q5(f != null ? f.floatValue() : -1.0f, f5 != null ? f5.floatValue() : -1.0f, (l5) null, (o5) null, z3 ? m5.SPACE_BETWEEN : m5.FIXED, k0Var, (p5) null, Constants.EMVTag.TAG_9C_TRANSACTION_TYPE);
            TextLocalisedClause f58284a = trackableAction.getF58284a();
            if (f58284a != null) {
                clause5 = f58284a;
            } else if (clause5 == null) {
                clause5 = textLocalisedClause;
            }
            this.u = new py0.c(clause5);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getO() {
            return this.f54983r;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f54983r = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getE() {
            return this.f54982q;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52903a() {
            return this.f54973b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getO() {
            return this.u;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f54973b, model.f54973b) && Intrinsics.f(this.f54974c, model.f54974c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f54975g, model.f54975g) && Intrinsics.f(this.f54976h, model.f54976h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f54977j, model.f54977j) && Intrinsics.f(this.k, model.k) && this.f54978l == model.f54978l && this.f54979m == model.f54979m && this.f54980n == model.f54980n && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f54981p, model.f54981p) && Intrinsics.f(this.f54982q, model.f54982q) && this.f54983r == model.f54983r;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getI() {
            return this.f54981p;
        }

        public final int hashCode() {
            int iA = t61.a.a(this.f54973b.hashCode() * 31, 31, this.f54974c);
            Clause clause = this.d;
            int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.e;
            int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            Clause clause3 = this.f;
            int iHashCode3 = (iHashCode2 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
            Clause clause4 = this.f54975g;
            int iD = p.a.d((iHashCode3 + (clause4 == null ? 0 : clause4.hashCode())) * 31, 31, this.f54976h);
            s5 s5Var = this.i;
            int iHashCode4 = (iD + (s5Var == null ? 0 : s5Var.hashCode())) * 31;
            Float f = this.f54977j;
            int iHashCode5 = (iHashCode4 + (f == null ? 0 : f.hashCode())) * 31;
            Float f4 = this.k;
            int iHashCode6 = (this.o.hashCode() + okl.m.b(this.f54980n, (this.f54979m.hashCode() + j6.a.c((iHashCode5 + (f4 == null ? 0 : f4.hashCode())) * 31, 31, this.f54978l)) * 31, 31)) * 31;
            Parcelable parcelable = this.f54981p;
            int iHashCode7 = (iHashCode6 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            Object obj2 = this.f54982q;
            return this.f54983r.hashCode() + ((iHashCode7 + (obj2 != null ? obj2.hashCode() : 0)) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getK() {
            return this.f54980n;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f54981p = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            return new op0.l(!Intrinsics.f(this.d, model.d), !Intrinsics.f(this.f54974c, model.f54974c), !Intrinsics.f(this.e, model.e), !Intrinsics.f(this.f, model.f), !Intrinsics.f(this.f54975g, model.f54975g), !Intrinsics.f(this.f54976h, model.f54976h), !Intrinsics.f(this.i, model.i), this.f54980n != model.f54980n, !Intrinsics.f(this.f54985t, model.f54985t), !Intrinsics.f(this.f54984s, model.f54984s), !Intrinsics.f(this.o, model.o));
        }
    }

    public BarChartWidgetDelegate() {
        super(R$layout.internal_delegate_widget_bar_chart, new ood.g0(16));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.m mVar = new op0.m(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_bar_chart));
        p(mVar, true);
        return mVar;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.m holder, Model data, int i, List list) {
        boolean z;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        TextView textView = holder.f227346l;
        TextView textView2 = holder.k;
        HistogramView histogramView = holder.f227347m;
        ResizableTileHeaderView resizableTileHeaderView = holder.f227345j;
        List<e5> list2 = data.f54976h;
        Clause clause = data.d;
        op0.q qVar = data.f54980n;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof op0.l)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z3 = zIsEmpty;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        boolean z41 = z31;
        boolean z49 = z41;
        int i3 = 0;
        while (i3 < size2) {
            op0.l lVar = (op0.l) payloads.get(i3);
            z3 = z3 || lVar.f227334b;
            z4 = z4 || lVar.f227333a;
            List list3 = payloads;
            z6 = z6 || lVar.f227335c;
            z11 = z11 || lVar.d;
            z12 = z12 || lVar.e;
            z31 = z31 || lVar.f;
            z49 = z49 || lVar.f227336g;
            z29 = z29 || lVar.f227337h;
            z41 = z41 || lVar.i;
            zIsEmpty = zIsEmpty || lVar.f227338j;
            i3++;
            payloads = list3;
        }
        if (zIsEmpty) {
            histogramView.setDataChangeAnimationRequest(data.f54984s);
        }
        if (z4) {
            resizableTileHeaderView.setTitle(clause);
        }
        if (z3) {
            resizableTileHeaderView.setTopLabel(data.f54974c);
        }
        if (z6) {
            Clause clause2 = data.e;
            int i5 = op0.n.f227353a[qVar.ordinal()];
            if (i5 == 1) {
                resizableTileHeaderView.setBottomSubtitle(clause2);
                resizableTileHeaderView.setRightSubtitle(null);
            } else {
                if (i5 != 2 && i5 != 3 && i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (clause != null) {
                    resizableTileHeaderView.setRightSubtitle(clause2);
                    resizableTileHeaderView.setBottomSubtitle(null);
                } else {
                    resizableTileHeaderView.setRightSubtitle(null);
                    resizableTileHeaderView.setBottomSubtitle(clause2);
                }
            }
        }
        if (z11) {
            Context context = textView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ty0.c.b(jh.d.f(context).b0(), data.f, holder.k, null, null, 12);
        }
        if (z12) {
            Context context2 = textView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ty0.c.b(jh.d.f(context2).b0(), data.f54975g, holder.f227346l, null, null, 12);
        }
        if (z29) {
            holder.F(qVar);
        }
        if (z31) {
            histogramView.setGesturesEnabled(false);
            histogramView.setItems(list2);
        }
        if (z41) {
            histogramView.d(data.f54985t);
        }
        if (z49) {
            histogramView.setTooltip(data.i);
        }
        int i6 = op0.n.f227353a[qVar.ordinal()];
        if (i6 == 1) {
            ViewGroup.LayoutParams layoutParams = histogramView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.startToStart = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = okl.m.a(histogramView, "getContext(...)", 132.0f);
            layoutParams2.matchConstraintMaxHeight = okl.m.a(histogramView, "getContext(...)", 54.0f);
            histogramView.setLayoutParams(layoutParams2);
            textView2.setVisibility(8);
            textView.setVisibility(8);
            return;
        }
        if (i6 != 2 && i6 != 3 && i6 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        ViewGroup.LayoutParams layoutParams3 = histogramView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.startToStart = -1;
        ((ViewGroup.MarginLayoutParams) layoutParams4).width = okl.m.a(histogramView, "getContext(...)", 120.0f);
        h5.Companion.getClass();
        h5 h5Var = new h5(null, null);
        List<e5> list4 = list2;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            z = false;
        } else {
            Iterator it8 = list4.iterator();
            while (it8.hasNext()) {
                if (!Intrinsics.f(((e5) it8.next()).f10290b, h5Var)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        Context context3 = histogramView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        layoutParams4.matchConstraintMaxHeight = kli.a.k(context3, z ? 104.0f : 74.0f);
        histogramView.setLayoutParams(layoutParams4);
        textView2.setVisibility(0);
        textView.setVisibility(0);
    }
}
