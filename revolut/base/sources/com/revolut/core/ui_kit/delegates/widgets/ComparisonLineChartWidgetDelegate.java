package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.ResizableTileHeaderView;
import com.revolut.core.ui_kit.internal.views.chart.ComparisonLineChartView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.tracking.TrackableAction;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0003\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/ComparisonLineChartWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/ComparisonLineChartWidgetDelegate$Model;", "Lop0/b1;", "<init>", "()V", "Companion", "Model", "op0/a1", "op0/z0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ComparisonLineChartWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.b1> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Color.Solid f55068h;
    public static final Color.ModifiedColor i;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.ComparisonLineChartWidgetDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    static {
        Color.Solid solid = new Color.Solid(R$attr.uikit_colorForeground);
        f55068h = solid;
        i = new Color.ModifiedColor(solid, 0.5f);
    }

    public ComparisonLineChartWidgetDelegate() {
        super(R$layout.internal_delegate_widget_comparison_line_chart, new op0.v0(1));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.b1 b1Var = new op0.b1(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_comparison_line_chart));
        p(b1Var, true);
        b1Var.f227182j.setBottomSubtitle(null);
        return b1Var;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.b1 holder, Model data, int i2, List list) {
        boolean z;
        aw0.m2 m2Var;
        int i3;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i2, list);
        ComparisonLineChartView comparisonLineChartView = holder.k;
        ResizableTileHeaderView resizableTileHeaderView = holder.f227182j;
        op0.z0 z0Var = data.f55070c;
        Clause clause = data.d;
        op0.q qVar = data.k;
        int size = payloads.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                break;
            }
            if (!(payloads.get(i5) instanceof op0.a1)) {
                payloads = null;
                break;
            }
            i5++;
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
        int i6 = 0;
        while (i6 < size2) {
            op0.a1 a1Var = (op0.a1) payloads.get(i6);
            z3 = z3 || a1Var.f227157a;
            z4 = z4 || a1Var.f227158b;
            z6 = z6 || a1Var.f227159c;
            List list2 = payloads;
            z31 = z31 || a1Var.d;
            z11 = z11 || a1Var.e;
            z12 = z12 || a1Var.f;
            z41 = z41 || a1Var.f227160g;
            z29 = z29 || a1Var.f227161h;
            zIsEmpty = zIsEmpty || a1Var.i;
            i6++;
            payloads = list2;
        }
        if (zIsEmpty) {
            comparisonLineChartView.setDataChangeAnimationRequest(data.f55073j);
        }
        if (z3) {
            resizableTileHeaderView.setTitle(clause);
        }
        if (z4) {
            resizableTileHeaderView.setTopLabel(z0Var.f227495a);
            int i21 = op0.c1.f227204a[z0Var.f227496b.ordinal()];
            if (i21 == 1) {
                i3 = 1;
            } else {
                if (i21 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = 2;
            }
            resizableTileHeaderView.setTopLabelMaxLines(i3);
        }
        if (z6) {
            Clause clause2 = data.e;
            int i22 = op0.c1.f227205b[qVar.ordinal()];
            if (i22 == 1) {
                resizableTileHeaderView.setBottomSubtitle(clause2);
                resizableTileHeaderView.setRightSubtitle(null);
            } else {
                if (i22 != 2 && i22 != 3 && i22 != 4) {
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
        if (z29) {
            holder.F(qVar);
        }
        if (z11 || z12 || z41 || z29) {
            int i32 = op0.c1.f227205b[qVar.ordinal()];
            if (i32 == 1) {
                z = false;
            } else {
                if (i32 != 2 && i32 != 3 && i32 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                z = true;
            }
            int i33 = op0.c1.f227206c[data.i.ordinal()];
            if (i33 == 1) {
                aw0.l2 l2Var = data.f55071g;
                aw0.f2 f2Var = data.f55072h;
                aw0.e2 e2Var = data.i;
                Color.Solid solid = f55068h;
                m2Var = new aw0.m2(l2Var, solid, solid, i, f2Var, e2Var, z, true);
            } else {
                if (i33 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                m2Var = new aw0.m2(data.f55071g, data.f55072h, data.i, z, 14);
            }
            comparisonLineChartView.setStyle(m2Var);
        }
        if (z31) {
            comparisonLineChartView.setData(data.f);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/ComparisonLineChartWidgetDelegate$Model;", "Lqv0/q;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.q, qv0.p {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final op0.z0 f55070c;
        public final Clause d;
        public final Clause e;
        public final aw0.y1 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final aw0.l2 f55071g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final aw0.f2 f55072h;
        public final aw0.e2 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final uw0.i f55073j;
        public final op0.q k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final TrackableAction f55074l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Parcelable f55075m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Object f55076n;
        public op0.r o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public qv0.c f55077p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f55078q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f55079r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p31.c f55080s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p31.c f55081t;
        public int u;
        public int v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final int f55082w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final int f55083x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final py0.c f55084y;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.ComparisonLineChartWidgetDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public Model(String str, op0.z0 z0Var, MoneyClause moneyClause, Clause clause, aw0.y1 y1Var, aw0.l2 l2Var, aw0.f2 f2Var, aw0.e2 e2Var, uw0.i iVar, op0.q qVar, TrackableAction trackableAction, Object obj2, int i) {
            f2Var = (i & 64) != 0 ? aw0.f2.CURRENT_OR_SELECTED_OF_PREVIOUS_LINE : f2Var;
            op0.r rVar = op0.r.SEEN;
            c.e eVar = new c.e((qv0.h) null, 3);
            int i2 = R$attr.uikit_dp0;
            this.f55069b = str;
            this.f55070c = z0Var;
            this.d = moneyClause;
            this.e = clause;
            this.f = y1Var;
            this.f55071g = l2Var;
            this.f55072h = f2Var;
            this.i = e2Var;
            this.f55073j = iVar;
            this.k = qVar;
            this.f55074l = trackableAction;
            this.f55075m = null;
            this.f55076n = obj2;
            this.o = rVar;
            this.f55077p = eVar;
            this.f55078q = null;
            this.f55079r = null;
            this.f55080s = null;
            this.f55081t = null;
            this.u = i2;
            this.v = i2;
            this.f55082w = i2;
            this.f55083x = i2;
            TextLocalisedClause f58284a = trackableAction.getF58284a();
            Clause clause2 = moneyClause;
            if (f58284a != null) {
                clause2 = f58284a;
            } else if (moneyClause == null) {
                clause2 = z0Var.f227495a;
            }
            this.f55084y = new py0.c(clause2);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF55257h() {
            return this.o;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.o = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55256g() {
            return this.f55076n;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55254b() {
            return this.f55069b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF54970q() {
            return this.f55084y;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55069b, model.f55069b) && Intrinsics.f(this.f55070c, model.f55070c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f55071g == model.f55071g && this.f55072h == model.f55072h && this.i == model.i && Intrinsics.f(this.f55073j, model.f55073j) && this.k == model.k && Intrinsics.f(this.f55074l, model.f55074l) && Intrinsics.f(this.f55075m, model.f55075m) && Intrinsics.f(this.f55076n, model.f55076n) && this.o == model.o && Intrinsics.f(this.f55077p, model.f55077p) && Intrinsics.f(this.f55078q, model.f55078q) && Intrinsics.f(this.f55079r, model.f55079r) && Intrinsics.f(this.f55080s, model.f55080s) && Intrinsics.f(this.f55081t, model.f55081t) && this.u == model.u && this.v == model.v && this.f55082w == model.f55082w && this.f55083x == model.f55083x;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF55051q() {
            return this.u;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.u = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.f55075m;
        }

        public final int hashCode() {
            int iHashCode = (this.f55070c.hashCode() + (this.f55069b.hashCode() * 31)) * 31;
            Clause clause = this.d;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.e;
            int iHashCode3 = (this.i.hashCode() + ((this.f55072h.hashCode() + ((this.f55071g.hashCode() + ((this.f.hashCode() + ((iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
            uw0.i iVar = this.f55073j;
            int iHashCode4 = (this.f55074l.hashCode() + okl.m.b(this.k, (iHashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31, 31)) * 31;
            Parcelable parcelable = this.f55075m;
            int iHashCode5 = (iHashCode4 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            Object obj2 = this.f55076n;
            int i = h30.l.i(this.f55077p, okl.m.c(this.o, (iHashCode5 + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31), 31);
            p31.c cVar = this.f55078q;
            int iHashCode6 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f55079r;
            int iHashCode7 = (iHashCode6 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f55080s;
            int iHashCode8 = (iHashCode7 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f55081t;
            return Integer.hashCode(this.f55083x) + j6.a.b(this.f55082w, j6.a.b(this.v, j6.a.b(this.u, (iHashCode8 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF55048m() {
            return this.f55078q;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f55077p = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF55049n() {
            return this.f55079r;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f55080s = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF55052r() {
            return this.v;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF55054t() {
            return this.f55083x;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.v = i;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getI() {
            return this.k;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF55047l() {
            return this.f55077p;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF55050p() {
            return this.f55081t;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getO() {
            return this.f55080s;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f55078q = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f55075m = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF55053s() {
            return this.f55082w;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f55079r = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f55081t = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            boolean z3 = !Intrinsics.f(this.d, model.d);
            boolean z4 = !Intrinsics.f(this.f55070c, model.f55070c);
            boolean z6 = !Intrinsics.f(this.e, model.e);
            boolean z11 = !Intrinsics.f(this.f, model.f);
            boolean z12 = false;
            boolean z29 = this.f55071g != model.f55071g;
            if (this.f55072h != model.f55072h) {
                z = false;
                z12 = true;
            } else {
                z = false;
            }
            return new op0.a1(z3, z4, z6, z11, z29, z12, this.i != model.i ? true : z, this.k != model.k ? true : z, !Intrinsics.f(this.f55073j, model.f55073j), !Intrinsics.f(this.f55074l, model.f55074l));
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Model(java.lang.String r13, op0.z0 r14, com.revolut.core.ui_kit.models.MoneyClause r15, com.revolut.core.ui_kit.models.CompositeClause r16, aw0.y1 r17, aw0.l2 r18, aw0.f2 r19, op0.q r20, java.lang.Object r21, com.revolut.core.ui_kit.tracking.TrackableAction.Custom r22, int r23) {
            /*
                r12 = this;
                aw0.e2 r8 = aw0.e2.PERFORMANCE
                r0 = r23
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L1c
                com.revolut.core.ui_kit.tracking.TrackableAction$Default r0 = com.revolut.core.ui_kit.tracking.TrackableAction.Default.f58285a
                r11 = r0
                r1 = r13
                r2 = r14
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r9 = r20
                r10 = r21
                r0 = r12
                goto L2e
            L1c:
                r11 = r22
                r0 = r12
                r1 = r13
                r2 = r14
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r9 = r20
                r10 = r21
            L2e:
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.widgets.ComparisonLineChartWidgetDelegate.Model.<init>(java.lang.String, op0.z0, com.revolut.core.ui_kit.models.MoneyClause, com.revolut.core.ui_kit.models.CompositeClause, aw0.y1, aw0.l2, aw0.f2, op0.q, java.lang.Object, com.revolut.core.ui_kit.tracking.TrackableAction$Custom, int):void");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Model(String listId, op0.z0 topLabel, MoneyClause moneyClause, Clause clause, aw0.y1 lineChartData, aw0.l2 performanceStyle, aw0.f2 comparisonStyle, aw0.e2 colorMode, op0.q widgetSize, Object obj2, TrackableAction trackableAction) {
            this(listId, topLabel, moneyClause, clause, lineChartData, performanceStyle, comparisonStyle, colorMode, new uw0.i(listId, uw0.g.UNTIL_ANY_FINISHED, true), widgetSize, trackableAction, obj2, 8382464);
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(topLabel, "topLabel");
            Intrinsics.checkNotNullParameter(lineChartData, "lineChartData");
            Intrinsics.checkNotNullParameter(performanceStyle, "performanceStyle");
            Intrinsics.checkNotNullParameter(comparisonStyle, "comparisonStyle");
            Intrinsics.checkNotNullParameter(colorMode, "colorMode");
            Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
            Intrinsics.checkNotNullParameter(trackableAction, "trackableAction");
        }
    }
}
