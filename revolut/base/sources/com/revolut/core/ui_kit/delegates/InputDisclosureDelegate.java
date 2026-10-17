package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.hq;
import ip0.nq;
import ip0.oq;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0007\u0003\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/InputDisclosureDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/InputDisclosureDelegate$Model;", "Lip0/oq;", "<init>", "()V", "Companion", "a", "Model", "ip0/nq", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InputDisclosureDelegate extends BaseRecyclerViewDelegate<Model, oq> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52538c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/InputDisclosureDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f52540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f52541c;
        public final a d;
        public final Object e;
        public Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public qv0.c f52542g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p31.c f52543h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f52544j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f52545l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f52546m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f52547n;
        public final int o;

        public static abstract class a {

            /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.InputDisclosureDelegate$Model$a$a, reason: collision with other inner class name */
            public static final class C0409a extends a {
                private C0409a() {
                }
            }

            public static final class b extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final b f52548a = new b();

                private b() {
                }
            }

            private a() {
            }
        }

        public Model(String listId, Clause text, Clause clause, Object obj2, AnalyticsContext analyticsContext, int i) {
            clause = (i & 4) != 0 ? null : clause;
            obj2 = (i & 16) != 0 ? null : obj2;
            analyticsContext = (i & 32) != 0 ? null : analyticsContext;
            int i2 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(text, "text");
            a.b state = a.b.f52548a;
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(state, "state");
            c.d positionInBox = c.d.f249513a;
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            this.f52539a = listId;
            this.f52540b = text;
            this.f52541c = clause;
            this.d = state;
            this.e = obj2;
            this.f = analyticsContext;
            this.f52542g = positionInBox;
            this.f52543h = null;
            this.i = null;
            this.f52544j = null;
            this.k = null;
            this.f52545l = i2;
            this.f52546m = i2;
            this.f52547n = i2;
            this.o = i2;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new InputDisclosureDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getE() {
            return this.e;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52539a() {
            return this.f52539a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52539a, model.f52539a) && Intrinsics.f(this.f52540b, model.f52540b) && Intrinsics.f(this.f52541c, model.f52541c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52542g, model.f52542g) && Intrinsics.f(this.f52543h, model.f52543h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52544j, model.f52544j) && Intrinsics.f(this.k, model.k) && this.f52545l == model.f52545l && this.f52546m == model.f52546m && this.f52547n == model.f52547n && this.o == model.o;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52545l() {
            return this.f52545l;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52545l = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.f;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f52539a.hashCode() * 31, 31, this.f52540b);
            Clause clause = this.f52541c;
            int iHashCode = (this.d.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
            Object obj2 = this.e;
            int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f;
            int i = h30.l.i(this.f52542g, (iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f52543h;
            int iHashCode3 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.i;
            int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52544j;
            int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.k;
            return Integer.hashCode(this.o) + j6.a.b(this.f52547n, j6.a.b(this.f52546m, j6.a.b(this.f52545l, (iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getK() {
            return this.k;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52542g = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52543h() {
            return this.f52543h;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.i = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52546m() {
            return this.f52546m;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getO() {
            return this.o;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52546m = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52542g() {
            return this.f52542g;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52544j() {
            return this.f52544j;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getI() {
            return this.i;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.k = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52547n() {
            return this.f52547n;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52543h = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52544j = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new nq(!Intrinsics.f(model.f52540b, this.f52540b), !Intrinsics.f(model.f52541c, this.f52541c), !Intrinsics.f(model.d, this.d), or0.b.l(this, (qv0.i) oldItem));
        }
    }

    public InputDisclosureDelegate() {
        super(R$layout.internal_delegate_input_disclosure, new hq(1));
        this.f52538c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new oq(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_input_disclosure));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(oq holder, Model data, int i, List payloads) {
        oq oqVar;
        Function1 function1;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f165703g;
        TextView textView2 = holder.f;
        Model.a aVar = data.d;
        Model.a aVar2 = data.d;
        Clause clause = data.f52541c;
        Clause clause2 = data.f52540b;
        boolean zF = Intrinsics.f(aVar, Model.a.b.f52548a);
        if (zF) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            py0.c cVar = clause2 != null ? new py0.c(clause2) : null;
            or0.m.a(itemView);
            oqVar = holder;
            itemView.setOnClickListener(new ip0.d6(data, cVar, holder, this, data, 4));
        } else {
            oqVar = holder;
            oqVar.itemView.setOnClickListener(null);
        }
        View itemView2 = oqVar.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        or0.b.c(this, data, itemView2, zF, null, 24);
        if (payloads.isEmpty()) {
            or0.b.e(this, clause2, textView2, null, 12);
            or0.b.e(this, clause, textView, null, 12);
            if (aVar2 instanceof Model.a.b) {
                View view = oqVar.itemView;
                Intrinsics.i(view, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int iD = 0; iD < childCount; iD = m72.b.d(viewGroup, iD, 1.0f, iD, 1)) {
                }
                return;
            }
            if (!(aVar2 instanceof Model.a.C0409a)) {
                throw new NoWhenBranchMatchedException();
            }
            View view2 = oqVar.itemView;
            Intrinsics.i(view2, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup2 = (ViewGroup) view2;
            int childCount2 = viewGroup2.getChildCount();
            for (int iD2 = 0; iD2 < childCount2; iD2 = m72.b.d(viewGroup2, iD2, 0.4f, iD2, 1)) {
            }
            return;
        }
        for (nq nqVar : zhm.c0.N(payloads, nq.class)) {
            if (nqVar.f165559a) {
                function1 = null;
                or0.b.e(this, clause2, textView2, null, 12);
            } else {
                function1 = null;
            }
            if (nqVar.f165560b) {
                or0.b.e(this, clause, textView, function1, 12);
            }
            if (nqVar.f165561c) {
                if (aVar2 instanceof Model.a.b) {
                    View view3 = oqVar.itemView;
                    Intrinsics.i(view3, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup3 = (ViewGroup) view3;
                    int childCount3 = viewGroup3.getChildCount();
                    for (int iD3 = 0; iD3 < childCount3; iD3 = m72.b.d(viewGroup3, iD3, 1.0f, iD3, 1)) {
                    }
                } else {
                    if (!(aVar2 instanceof Model.a.C0409a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    View view4 = oqVar.itemView;
                    Intrinsics.i(view4, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup4 = (ViewGroup) view4;
                    int childCount4 = viewGroup4.getChildCount();
                    for (int iD4 = 0; iD4 < childCount4; iD4 = m72.b.d(viewGroup4, iD4, 0.4f, iD4, 1)) {
                    }
                }
            }
        }
    }
}
