package com.revolut.core.ui_kit.delegates.widgets;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import aw0.a6;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.ResizableTileHeaderView;
import com.revolut.core.ui_kit.internal.views.barchart.HorizontalBarView;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/CellWithLinearProgressDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/CellWithLinearProgressDelegate$Model;", "Lop0/k0;", "<init>", "()V", "Model", "op0/j0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellWithLinearProgressDelegate extends BaseDraggableWidgetDelegate<Model, op0.k0> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/CellWithLinearProgressDelegate$Model;", "Lqv0/q;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.q, qv0.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextLocalisedClause f55019c;
        public final MoneyClause d;
        public final CompositeClause e;
        public final TextLocalisedClause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f55020g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TextLocalisedClause f55021h;
        public final MoneyClause i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final a6 f55022j;
        public final zod.e k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Parcelable f55023l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public op0.r f55024m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public qv0.c f55025n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f55026p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f55027q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f55028r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f55029s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f55030t;
        public final int u;
        public final int v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final uw0.i f55031w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final py0.c f55032x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final op0.q f55033y;

        public Model(String listId, TextLocalisedClause topLabel, MoneyClause title, CompositeClause bottomSubtitle, TextLocalisedClause rightSubtitle, int i, TextLocalisedClause bottomStartLabel, MoneyClause bottomEndLabel, a6 color, zod.e eVar) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(topLabel, "topLabel");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(bottomSubtitle, "bottomSubtitle");
            Intrinsics.checkNotNullParameter(rightSubtitle, "rightSubtitle");
            Intrinsics.checkNotNullParameter(bottomStartLabel, "bottomStartLabel");
            Intrinsics.checkNotNullParameter(bottomEndLabel, "bottomEndLabel");
            Intrinsics.checkNotNullParameter(color, "color");
            op0.r rVar = op0.r.SEEN;
            c.e eVar2 = new c.e((qv0.h) null, 3);
            int i2 = R$attr.uikit_dp0;
            this.f55018b = listId;
            this.f55019c = topLabel;
            this.d = title;
            this.e = bottomSubtitle;
            this.f = rightSubtitle;
            this.f55020g = i;
            this.f55021h = bottomStartLabel;
            this.i = bottomEndLabel;
            this.f55022j = color;
            this.k = eVar;
            this.f55023l = null;
            this.f55024m = rVar;
            this.f55025n = eVar2;
            this.o = null;
            this.f55026p = null;
            this.f55027q = null;
            this.f55028r = null;
            this.f55029s = i2;
            this.f55030t = i2;
            this.u = i2;
            this.v = i2;
            this.f55031w = new uw0.i(listId, uw0.g.UNTIL_ANY_FINISHED, true);
            this.f55032x = new py0.c(title);
            this.f55033y = op0.q.MEDIUM;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getO() {
            return this.f55024m;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f55024m = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF() {
            return this.k;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53929a() {
            return this.f55018b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF54970q() {
            return this.f55032x;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55018b, model.f55018b) && Intrinsics.f(this.f55019c, model.f55019c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f55020g == model.f55020g && Intrinsics.f(this.f55021h, model.f55021h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f55022j, model.f55022j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f55023l, model.f55023l) && this.f55024m == model.f55024m && Intrinsics.f(this.f55025n, model.f55025n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f55026p, model.f55026p) && Intrinsics.f(this.f55027q, model.f55027q) && Intrinsics.f(this.f55028r, model.f55028r) && this.f55029s == model.f55029s && this.f55030t == model.f55030t && this.u == model.u && this.v == model.v;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF53939q() {
            return this.f55029s;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f55029s = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF53938p() {
            return this.f55023l;
        }

        public final int hashCode() {
            int iHashCode = (this.f55022j.hashCode() + v7.a(t61.a.a(j6.a.b(this.f55020g, t61.a.a(h30.l.c(this.e, v7.a(t61.a.a(this.f55018b.hashCode() * 31, 31, this.f55019c), 31, this.d), 31), 31, this.f), 31), 31, this.f55021h), 31, this.i)) * 31;
            zod.e eVar = this.k;
            int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.f323982a.hashCode())) * 31;
            Parcelable parcelable = this.f55023l;
            int i = h30.l.i(this.f55025n, okl.m.c(this.f55024m, (iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31);
            p31.c cVar = this.o;
            int iHashCode3 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f55026p;
            int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f55027q;
            int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f55028r;
            return Integer.hashCode(this.v) + j6.a.b(this.u, j6.a.b(this.f55030t, j6.a.b(this.f55029s, (iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52787l() {
            return this.o;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f55025n = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getI() {
            return this.f55026p;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f55027q = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53940r() {
            return this.f55030t;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53942t() {
            return this.v;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f55030t = i;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getK() {
            return this.f55033y;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52785h() {
            return this.f55025n;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getK() {
            return this.f55028r;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52786j() {
            return this.f55027q;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.o = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f55023l = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF53941s() {
            return this.u;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f55026p = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f55028r = cVar;
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
            boolean z4 = !Intrinsics.f(this.f55019c, model.f55019c);
            boolean z6 = !Intrinsics.f(this.e, model.e);
            boolean z11 = !Intrinsics.f(this.f55021h, model.f55021h);
            boolean z12 = !Intrinsics.f(this.i, model.i);
            boolean z29 = !Intrinsics.f(this.f, model.f);
            boolean z31 = false;
            if (this.f55033y != model.f55033y) {
                z = false;
                z31 = true;
            } else {
                z = false;
            }
            return new op0.j0(z3, z4, z6, z29, z11, z12, z31, this.f55020g != model.f55020g ? true : z, !Intrinsics.f(this.f55022j, model.f55022j), !Intrinsics.f(this.f55031w, model.f55031w));
        }
    }

    public CellWithLinearProgressDelegate() {
        super(R$layout.internal_delegate_widget_cell_with_linear_progress, new ood.g0(24));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.k0 k0Var = new op0.k0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_cell_with_linear_progress));
        p(k0Var, true);
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        k0Var.k.setTrackColor(kli.a.s(R$attr.uikit_colorGreyTone5, context));
        return k0Var;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.k0 holder, Model data, int i, List list) {
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        HorizontalBarView.HorizontalBar horizontalBar = holder.k;
        ResizableTileHeaderView resizableTileHeaderView = holder.f227324j;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof op0.j0)) {
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
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        boolean z41 = z31;
        int i3 = 0;
        while (i3 < size2) {
            List list2 = payloads;
            op0.j0 j0Var = (op0.j0) payloads.get(i3);
            z = z || j0Var.f227308a;
            z3 = z3 || j0Var.f227309b;
            z6 = z6 || j0Var.f227310c;
            z4 = z4 || j0Var.d;
            z11 = z11 || j0Var.e;
            z12 = z12 || j0Var.f;
            z29 = z29 || j0Var.f227312h;
            boolean z49 = zIsEmpty;
            z41 = z41 || j0Var.f227311g;
            z31 = z31 || j0Var.i;
            zIsEmpty = z49 || j0Var.f227313j;
            i3++;
            payloads = list2;
        }
        if (zIsEmpty) {
            horizontalBar.setDataChangeAnimationRequest(data.f55031w);
        }
        if (z) {
            resizableTileHeaderView.setTitle(data.d);
        }
        if (z3) {
            resizableTileHeaderView.setTopLabel(data.f55019c);
        }
        if (z4) {
            resizableTileHeaderView.setRightSubtitle(data.f);
        }
        if (z6) {
            resizableTileHeaderView.setBottomSubtitle(data.e);
        }
        if (z11) {
            kli.a.b(holder.f227325l, data.f55021h, ty0.f.f275450a);
        }
        if (z12) {
            kli.a.b(holder.f227326m, data.i, ty0.f.f275450a);
        }
        if (z29) {
            horizontalBar.setProgress(data.f55020g / 100.0f);
        }
        if (z31) {
            horizontalBar.setColor(data.f55022j);
        }
        if (z41) {
            holder.F(data.f55033y);
        }
    }
}
