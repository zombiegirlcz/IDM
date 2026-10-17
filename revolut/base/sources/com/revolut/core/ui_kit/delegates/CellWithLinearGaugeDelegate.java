package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.LinearGaugeChartView;
import com.revolut.core.ui_kit.internal.views.ResizableTileHeaderView;
import com.revolut.core.ui_kit.internal.views.chart.HorizontalSingleLineChartLegendView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate;
import com.revolut.core.ui_kit.tracking.TrackableAction;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellWithLinearGaugeDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseBoxRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/CellWithLinearGaugeDelegate$Model;", "Lip0/y8;", "<init>", "()V", "Model", "ip0/x8", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellWithLinearGaugeDelegate extends BaseBoxRecyclerViewDelegate<Model, ip0.y8> {
    public final ihm.f e;

    public CellWithLinearGaugeDelegate() {
        super(R$layout.internal_delegate_cell_with_linear_gauge, true, new ip0.h8(7));
        this.e = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.y8(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_with_linear_gauge));
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(ip0.y8 holder, Model model, int i, List list) {
        py0.c cVar;
        Model data = model;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, model, i, list);
        LinearGaugeChartView linearGaugeChartView = holder.f167276g;
        ResizableTileHeaderView resizableTileHeaderView = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.x8)) {
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
        for (int i3 = 0; i3 < size2; i3++) {
            ip0.x8 x8Var = (ip0.x8) payloads.get(i3);
            z = z || x8Var.f167104a;
            z3 = z3 || x8Var.f167105b;
            z6 = z6 || x8Var.d;
            z11 = z11 || x8Var.e;
            z4 = z4 || x8Var.f167106c;
            zIsEmpty = zIsEmpty || x8Var.f;
            z12 = z12 || x8Var.f167107g;
            z29 = z29 || x8Var.f167108h;
        }
        if (zIsEmpty) {
            linearGaugeChartView.setDataChangeAnimationRequest(data.f51952g);
        }
        if (z) {
            resizableTileHeaderView.setTitle(data.f51951c);
        }
        if (z3) {
            resizableTileHeaderView.setTopLabel(data.f51950b);
        }
        if (z4) {
            resizableTileHeaderView.setBottomSubtitle(data.d);
        }
        if (z6 || z11) {
            HorizontalSingleLineChartLegendView horizontalSingleLineChartLegendView = holder.f167277h;
            List list2 = data.e;
            boolean z31 = data.f;
            Context context = linearGaugeChartView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            List list3 = list2;
            ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                arrayList.add(new ms0.s1(r9.f53708c, kli.a.s(((b3) it8.next()).f53707b, context), (TextLocalisedClause) null, 12));
            }
            cVar = null;
            linearGaugeChartView.setModel(new com.revolut.core.ui_kit.internal.views.e(arrayList, false, 30));
            horizontalSingleLineChartLegendView.setVisibility(z31 ? 0 : 8);
            if (z31) {
                List<b3> list4 = data.e;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                for (b3 b3Var : list4) {
                    int i5 = b3Var.f53707b;
                    arrayList2.add(new aw0.c6(i5, b3Var.f53706a, Integer.valueOf(i5)));
                }
                horizontalSingleLineChartLegendView.setModel(new aw0.b6(arrayList2));
            }
        } else {
            cVar = null;
        }
        if (z12 || z29) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, data.f51961s, null, 24);
            data = data;
        }
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        TextLocalisedClause f58284a = data.f51962t.getF58284a();
        py0.c cVar2 = f58284a != null ? new py0.c(f58284a) : cVar;
        boolean z41 = data.f51961s;
        or0.m.a(itemView2);
        if (z41) {
            itemView2.setOnClickListener(new au0.i3(data, cVar2, this, model, 16));
        } else {
            or0.u.o(itemView2);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\b\tJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellWithLinearGaugeDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "com/revolut/core/ui_kit/delegates/b3", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f51950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f51951c;
        public final Clause d;
        public final List e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final uw0.i f51952g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f51953h;
        public qv0.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f51954j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f51955l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f51956m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f51957n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f51958p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f51959q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Parcelable f51960r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final boolean f51961s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final TrackableAction f51962t;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.CellWithLinearGaugeDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public Model(String str, Clause clause, Clause clause2, Clause clause3, List list, boolean z, uw0.i iVar, Object obj2, qv0.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, p31.c cVar5, int i, int i2, int i3, int i5, Parcelable parcelable, boolean z3, TrackableAction trackableAction) {
            this.f51949a = str;
            this.f51950b = clause;
            this.f51951c = clause2;
            this.d = clause3;
            this.e = list;
            this.f = z;
            this.f51952g = iVar;
            this.f51953h = obj2;
            this.i = cVar;
            this.f51954j = cVar2;
            this.k = cVar3;
            this.f51955l = cVar4;
            this.f51956m = cVar5;
            this.f51957n = i;
            this.o = i2;
            this.f51958p = i3;
            this.f51959q = i5;
            this.f51960r = parcelable;
            this.f51961s = z3;
            this.f51962t = trackableAction;
        }

        public static Model e(Model model) {
            String listId = model.f51949a;
            Clause clause = model.f51950b;
            Clause clause2 = model.f51951c;
            Clause clause3 = model.d;
            List segments = model.e;
            boolean z = model.f;
            uw0.i iVar = model.f51952g;
            Object obj2 = model.f51953h;
            qv0.c positionInBox = model.i;
            p31.c cVar = model.f51954j;
            p31.c cVar2 = model.k;
            p31.c cVar3 = model.f51955l;
            p31.c cVar4 = model.f51956m;
            int i = model.f51957n;
            int i2 = model.o;
            int i3 = model.f51958p;
            int i5 = model.f51959q;
            Parcelable parcelable = model.f51960r;
            TrackableAction trackableAction = model.f51962t;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(segments, "segments");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            Intrinsics.checkNotNullParameter(trackableAction, "trackableAction");
            return new Model(listId, clause, clause2, clause3, segments, z, iVar, obj2, positionInBox, cVar, cVar2, cVar3, cVar4, i, i2, i3, i5, parcelable, false, trackableAction);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new CellWithLinearGaugeDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF51953h() {
            return this.f51953h;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51949a() {
            return this.f51949a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51949a, model.f51949a) && Intrinsics.f(this.f51950b, model.f51950b) && Intrinsics.f(this.f51951c, model.f51951c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f51952g, model.f51952g) && Intrinsics.f(this.f51953h, model.f51953h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f51954j, model.f51954j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f51955l, model.f51955l) && Intrinsics.f(this.f51956m, model.f51956m) && this.f51957n == model.f51957n && this.o == model.o && this.f51958p == model.f51958p && this.f51959q == model.f51959q && Intrinsics.f(this.f51960r, model.f51960r) && this.f51961s == model.f51961s && Intrinsics.f(this.f51962t, model.f51962t);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF51957n() {
            return this.f51957n;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51957n = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF51960r() {
            return this.f51960r;
        }

        public final int hashCode() {
            int iHashCode = this.f51949a.hashCode() * 31;
            Clause clause = this.f51950b;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.f51951c;
            int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            Clause clause3 = this.d;
            int iC = j6.a.c(p.a.d((iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31, 31, this.e), 31, this.f);
            uw0.i iVar = this.f51952g;
            int iHashCode4 = (iC + (iVar == null ? 0 : iVar.hashCode())) * 31;
            Object obj2 = this.f51953h;
            int i = h30.l.i(this.i, (iHashCode4 + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
            p31.c cVar = this.f51954j;
            int iHashCode5 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.k;
            int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f51955l;
            int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f51956m;
            int iB = j6.a.b(this.f51959q, j6.a.b(this.f51958p, j6.a.b(this.o, j6.a.b(this.f51957n, (iHashCode7 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 31);
            Parcelable parcelable = this.f51960r;
            return this.f51962t.hashCode() + j6.a.c((iB + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31, this.f51961s);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF51954j() {
            return this.f51954j;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.i = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getK() {
            return this.k;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f51955l = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getO() {
            return this.o;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF51959q() {
            return this.f51959q;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.o = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getI() {
            return this.i;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF51956m() {
            return this.f51956m;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF51955l() {
            return this.f51955l;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f51954j = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f51960r = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF51958p() {
            return this.f51958p;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.k = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f51956m = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (!(oldItem instanceof Model)) {
                return null;
            }
            Model model = (Model) oldItem;
            return new ip0.x8(!Intrinsics.f(this.f51951c, model.f51951c), !Intrinsics.f(this.f51950b, model.f51950b), !Intrinsics.f(this.d, model.d), !Intrinsics.f(this.e, model.e), this.f != model.f, !Intrinsics.f(this.f51952g, model.f51952g), or0.b.l(this, (qv0.i) oldItem), this.f51961s != model.f51961s, !Intrinsics.f(this.f51962t, model.f51962t));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Model(String str, Clause clause, MoneyClause moneyClause, TextLocalisedClause textLocalisedClause, List list, boolean z, uw0.i iVar, Object obj2, TrackableAction trackableAction, int i) {
            uw0.i iVar2 = (i & 64) != 0 ? null : iVar;
            int i2 = R$attr.uikit_dp0;
            this(str, clause, moneyClause, textLocalisedClause, list, z, iVar2, obj2, c.d.f249513a, null, null, null, null, i2, i2, i2, i2, null, true, trackableAction);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause topLabel, MoneyClause title, List segments, Object obj2, TrackableAction.Custom custom, int i) {
            TrackableAction trackableAction = (i & 64) != 0 ? TrackableAction.Default.f58285a : custom;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(topLabel, "topLabel");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(segments, "segments");
            Intrinsics.checkNotNullParameter(trackableAction, "trackableAction");
            this(listId, topLabel, title, null, segments, true, new uw0.i(listId, uw0.g.UNTIL_ANY_FINISHED, true), obj2, trackableAction, 261632);
        }
    }
}
