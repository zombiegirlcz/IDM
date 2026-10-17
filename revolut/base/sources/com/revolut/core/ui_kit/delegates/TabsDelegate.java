package com.revolut.core.ui_kit.delegates;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fg0;
import ip0.lj0;
import ip0.mj0;
import ip0.nj0;
import ip0.oj0;
import ip0.pj0;
import ip0.ri0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\b\u0007\b\t\n\u000b\f\u0003\rB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/TabsDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/TabsDelegate$Model;", "Lip0/pj0;", "<init>", "()V", "Companion", "Model", "ip0/nj0", "ip0/oj0", "com/revolut/core/ui_kit/delegates/zh", "com/revolut/core/ui_kit/delegates/ai", "ip0/mj0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TabsDelegate extends BaseRecyclerViewDelegate<Model, pj0> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f53515c;
    public final e01.a d;
    public final e01.a e;
    public final e01.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e01.a f53516g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/TabsDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f53518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f53519c;
        public final List d;
        public final Tabs.b e;
        public final nj0 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f53520g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f53521h;
        public qv0.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f53522j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f53523l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f53524m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f53525n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f53526p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f53527q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final List f53528r;

        public Model(String listId, List items, String str, Object obj2, AnalyticsContext analyticsContext, List list, int i, int i2, nj0 nj0Var, int i3) {
            String str2 = (i3 & 4) != 0 ? null : str;
            Object obj3 = (i3 & 8) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i3 & 16) != 0 ? null : analyticsContext;
            List extraActions = (i3 & 32) != 0 ? zhm.f0.f322471a : list;
            Tabs.b layoutMode = (i3 & 64) != 0 ? Tabs.b.C0441b.f58896a : Tabs.b.a.f58895a;
            int i5 = (i3 & 128) != 0 ? R$attr.uikit_dp16 : i;
            int i6 = (i3 & 256) != 0 ? R$attr.uikit_dp16 : i2;
            int i21 = R$attr.uikit_dp16;
            nj0 nj0Var2 = (i3 & 2048) != 0 ? null : nj0Var;
            zhm.f0 leadingActions = zhm.f0.f322471a;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(extraActions, "extraActions");
            Intrinsics.checkNotNullParameter(layoutMode, "layoutMode");
            Intrinsics.checkNotNullParameter(leadingActions, "leadingActions");
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(extraActions, "extraActions");
            Intrinsics.checkNotNullParameter(layoutMode, "layoutMode");
            c.d positionInBox = c.d.f249513a;
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            Intrinsics.checkNotNullParameter(leadingActions, "leadingActions");
            this.f53517a = listId;
            this.f53518b = items;
            this.f53519c = str2;
            this.d = extraActions;
            this.e = layoutMode;
            this.f = nj0Var2;
            this.f53520g = obj3;
            this.f53521h = analyticsContext2;
            this.i = positionInBox;
            this.f53522j = null;
            this.k = null;
            this.f53523l = null;
            this.f53524m = null;
            this.f53525n = i5;
            this.o = i6;
            this.f53526p = i21;
            this.f53527q = i21;
            this.f53528r = leadingActions;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new TabsDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF() {
            return this.f53520g;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51769a() {
            return this.f53517a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53517a, model.f53517a) && Intrinsics.f(this.f53518b, model.f53518b) && Intrinsics.f(this.f53519c, model.f53519c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f53520g, model.f53520g) && Intrinsics.f(this.f53521h, model.f53521h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f53522j, model.f53522j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f53523l, model.f53523l) && Intrinsics.f(this.f53524m, model.f53524m) && this.f53525n == model.f53525n && this.o == model.o && this.f53526p == model.f53526p && this.f53527q == model.f53527q && Intrinsics.f(this.f53528r, model.f53528r);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF51775l() {
            return this.f53525n;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53525n = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getE() {
            return this.f53521h;
        }

        public final int hashCode() {
            int iD = p.a.d(this.f53517a.hashCode() * 31, 31, this.f53518b);
            String str = this.f53519c;
            int iHashCode = (this.e.hashCode() + p.a.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31;
            nj0 nj0Var = this.f;
            int iHashCode2 = (iHashCode + (nj0Var == null ? 0 : nj0Var.hashCode())) * 31;
            Object obj2 = this.f53520g;
            int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f53521h;
            int i = h30.l.i(this.i, (iHashCode3 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f53522j;
            int iHashCode4 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.k;
            int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f53523l;
            int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f53524m;
            return this.f53528r.hashCode() + j6.a.b(this.f53527q, j6.a.b(this.f53526p, j6.a.b(this.o, j6.a.b(this.f53525n, (iHashCode6 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF51773h() {
            return this.f53522j;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.i = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getI() {
            return this.k;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f53523l = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF51776m() {
            return this.o;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getO() {
            return this.f53527q;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.o = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF51772g() {
            return this.i;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getK() {
            return this.f53524m;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF51774j() {
            return this.f53523l;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f53522j = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53521h = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF51777n() {
            return this.f53526p;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.k = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f53524m = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new mj0(!Intrinsics.f(model.f53518b, this.f53518b), !Intrinsics.f(model.f53519c, this.f53519c), !Intrinsics.f(model.d, this.d), !Intrinsics.f(model.f53528r, this.f53528r), !Intrinsics.f(model.e, this.e), !Intrinsics.f(model.f, this.f), or0.b.l(this, (qv0.i) oldItem));
        }
    }

    public static final class a {
        private a() {
        }
    }

    public TabsDelegate() {
        super(R$layout.internal_delegate_tabs, new ri0(5));
        this.f53515c = new e01.a();
        this.d = new e01.a();
        this.e = new e01.a();
        this.f = new e01.a();
        this.f53516g = new e01.a();
    }

    public static efm.r q(efm.r rVar, Model model) {
        efm.r rVarFilter = rVar.filter(new fg0(new lj0(model, 3), 13));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        return rVarFilter;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new pj0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_tabs));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof pj0) {
            this.e.c(holder);
            pj0 pj0Var = (pj0) holder;
            es0.q qVar = pj0Var.f165838j;
            qVar.e.cancel();
            qVar.f128844b = es0.p.NOT_INITIALISED;
            qVar.d = BitmapDescriptorFactory.HUE_RED;
            qVar.b();
            es0.m mVar = qVar.f128845c;
            if (mVar != null) {
                mVar.b();
                ty0.c.b(or0.u.k(mVar).b0(), null, mVar.f128836a.f128840b, null, null, 12);
                ty0.c.b(or0.u.k(mVar).b0(), null, mVar.f128837b.f128840b, null, null, 12);
            }
            pj0Var.k = null;
        }
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(pj0 holder, Model data, int i, List payloads) {
        List list;
        es0.j jVar;
        es0.j jVar2;
        nj0 nj0Var;
        String str;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        es0.j jVar3 = holder.i;
        es0.j jVar4 = holder.f165837h;
        Tabs tabs = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                list = payloads;
                break;
            } else {
                if (!(payloads.get(i2) instanceof mj0)) {
                    list = null;
                    break;
                }
                i2++;
            }
        }
        if (list == null) {
            list = zhm.f0.f322471a;
        }
        boolean zIsEmpty = list.isEmpty();
        int size2 = list.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        for (int i3 = 0; i3 < size2; i3++) {
            mj0 mj0Var = (mj0) list.get(i3);
            zIsEmpty = zIsEmpty || mj0Var.f165391a;
            z = z || mj0Var.f165392b;
            z3 = z3 || mj0Var.f165393c || mj0Var.d;
            z4 = z4 || mj0Var.e;
            z6 = z6 || mj0Var.f165394g;
        }
        if (zIsEmpty) {
            tabs.setItems(data.f53518b, data.f53519c);
        }
        if (z && !zIsEmpty && (str = data.f53519c) != null) {
            Tabs.u(holder.f, str, false, false, false, 14);
        }
        if (z3) {
            List list2 = data.d;
            List list3 = data.f53528r;
            ConstraintLayout constraintLayout = holder.f165836g;
            jVar4.d(list2);
            jVar3.d(list3);
            if (list2.size() != holder.f165839l || list3.size() != holder.f165840m) {
                float f = list2.isEmpty() ? BitmapDescriptorFactory.HUE_RED : 8.0f;
                float f4 = list3.isEmpty() ? BitmapDescriptorFactory.HUE_RED : 8.0f;
                ConstraintSet constraintSetL = ip0.v7.l(constraintLayout);
                jVar4.a(constraintSetL, R$id.tabs, 7, f);
                jVar3.a(constraintSetL, R$id.tabs, 6, f4);
                constraintSetL.applyTo(constraintLayout);
                holder.f165839l = list2.size();
                holder.f165840m = list3.size();
            }
            tabs.setTrailingFadingEdgeEnabled$ui_kit_components_release(!list2.isEmpty());
            tabs.setLeadingFadingEdgeEnabled$ui_kit_components_release(!list3.isEmpty());
        }
        if (z4) {
            tabs.setLayoutMode$ui_kit_components_release(data.e);
        }
        es0.q qVar = holder.f165838j;
        Parcelable parcelable = data.f53521h;
        String str2 = data.f53517a;
        tabs.setAnalyticsContext(parcelable);
        nj0 period = data.f;
        Parcelable parcelable2 = data.f53521h;
        boolean z11 = !payloads.isEmpty() && Intrinsics.f(holder.k, str2);
        ConstraintLayout constraintLayout2 = qVar.f128843a;
        ValueAnimator valueAnimator = qVar.e;
        if (period != null) {
            es0.m mVar = qVar.f128845c;
            if (mVar == null) {
                Context context = constraintLayout2.getContext();
                jVar = jVar3;
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                mVar = new es0.m(context);
                qVar.f128845c = mVar;
                jVar2 = jVar4;
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
                layoutParams.startToStart = 0;
                layoutParams.endToEnd = 0;
                layoutParams.topToTop = 0;
                layoutParams.bottomToBottom = 0;
                Unit unit = Unit.f186387a;
                constraintLayout2.addView(mVar, layoutParams);
            } else {
                jVar = jVar3;
                jVar2 = jVar4;
            }
            Intrinsics.checkNotNullParameter(period, "period");
            mVar.a(mVar.f128836a, period.f165522a, parcelable2, oj0.START);
            mVar.a(mVar.f128837b, period.f165523b, parcelable2, oj0.END);
            fp0.p pVar = mVar.f;
            TrackableItem.Companion companion = TrackableItem.INSTANCE;
            mx0.nc ncVar = mVar.d;
            companion.getClass();
            CustomTrackableComponent customTrackableComponentA = TrackableItem.Companion.a(ncVar, parcelable2);
            py0.b bVar = new py0.b(mVar.f128838c.f209808c);
            fp0.p.b(pVar, true);
            View view = pVar.f137029a;
            or0.m.a(view);
            nj0Var = period;
            view.setOnClickListener(new au0.t1(customTrackableComponentA, 2, bVar, mVar));
        } else {
            jVar = jVar3;
            jVar2 = jVar4;
            nj0Var = period;
            es0.m mVar2 = qVar.f128845c;
            if (mVar2 != null) {
                mVar2.b();
            }
        }
        es0.p pVar2 = nj0Var != null ? es0.p.PERIOD_VISIBLE : es0.p.TABS_VISIBLE;
        if (qVar.f128844b.a() == pVar2 && z11) {
            qVar.b();
        } else {
            valueAnimator.cancel();
            float f5 = nj0Var != null ? 1.0f : BitmapDescriptorFactory.HUE_RED;
            if (!z11 || qVar.f128844b == es0.p.NOT_INITIALISED || !constraintLayout2.isLaidOut() || qVar.d == f5) {
                qVar.f128844b = pVar2;
                qVar.c();
            } else {
                qVar.f128844b = pVar2.b() ? es0.p.SHOWING_PERIOD : es0.p.SHOWING_TABS;
                valueAnimator.setFloatValues(qVar.d, f5);
                valueAnimator.start();
            }
        }
        holder.k = str2;
        efm.r map = q(tabs.f58882b, data).map(new fg0(new lj0(data, 0), 10));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f53515c.a(map, holder);
        efm.r rVarMerge = efm.r.merge(tabs.n(), tabs.o());
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        efm.r map2 = q(rVarMerge, data).map(new fg0(new lj0(data, 1), 11));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.d.a(map2, holder);
        this.f.a(q(jVar2.c(), data), holder);
        this.f53516g.a(q(jVar.c(), data), holder);
        efm.r rVarDefer = efm.r.defer(new a31.l(qVar, 20));
        Intrinsics.checkNotNullExpressionValue(rVarDefer, "defer(...)");
        efm.r map3 = rVarDefer.map(new fg0(new lj0(data, 2), 12));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        this.e.a(map3, holder);
        if (z6) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
    }
}
