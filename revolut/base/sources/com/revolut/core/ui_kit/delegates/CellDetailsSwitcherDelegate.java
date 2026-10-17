package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.SwitcherView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsSwitcherDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/CellDetailsSwitcherDelegate$Model;", "Lip0/l8;", "<init>", "()V", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsSwitcherDelegate extends BaseRecyclerViewDelegate<Model, ip0.l8> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51912c;
    public final ihm.f d;

    public CellDetailsSwitcherDelegate() {
        super(R$layout.internal_delegate_cell_details_switcher, new ip0.h8(2));
        this.f51912c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.l8(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_switcher));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.l8 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View itemView = holder.itemView;
        TextView textView = holder.f;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        SwitcherView switcherView = holder.f165145g;
        switcherView.setOnCheckedChangeListener(null);
        switcherView.setOnTouchListener(null);
        if (payloads.isEmpty()) {
            kli.a.b(textView, data.f51914b, ty0.f.f275450a);
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, data.e, 0);
            switcherView.setChecked(data.f51915c);
            hx7.b.v(switcherView, data.f51916g);
            q(holder, data);
        } else {
            for (Object obj2 : payloads) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate.Model.Payload");
                z2 z2Var = (z2) obj2;
                if (z2Var.f55663a) {
                    switcherView.setChecked(data.f51915c);
                }
                if (z2Var.f55664b) {
                    kli.a.b(textView, data.f51914b, ty0.f.f275450a);
                }
                if (z2Var.f55665c) {
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, data.e, 0);
                }
                if (z2Var.d) {
                    hx7.b.v(switcherView, data.f51916g);
                }
                q(holder, data);
            }
        }
        switcherView.setClickable(data.d);
        switcherView.setEnabled(data.d);
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        hx7.b.u(zhm.u.c(hx7.b.f(data.f51914b)), itemView2);
    }

    public final void q(ip0.l8 l8Var, Model model) {
        SwitcherView switcherView = l8Var.f165145g;
        TextView textView = l8Var.f;
        switcherView.setOnTouchListener(new com.revolut.uicomponent.toolbar.app_bar.a(l8Var, 1, model, this));
        if (model.e == 0) {
            or0.u.o(textView);
        } else {
            or0.u.r(textView, model, model.f51914b, new j01.c(new View[]{textView, textView}, model, this.d, null, 24));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsSwitcherDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/z2", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f51914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f51915c;
        public final boolean d;
        public final int e;
        public final aw0.j0 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f51916g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f51917h;
        public Parcelable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public qv0.c f51918j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f51919l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f51920m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f51921n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f51922p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f51923q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f51924r;

        public Model(String listId, Clause title, boolean z, boolean z3, int i, aw0.j0 backgroundType, String str, Object obj2, Parcelable parcelable, qv0.c positionInBox, p31.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, int i2, int i3, int i5, int i6) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            this.f51913a = listId;
            this.f51914b = title;
            this.f51915c = z;
            this.d = z3;
            this.e = i;
            this.f = backgroundType;
            this.f51916g = str;
            this.f51917h = obj2;
            this.i = parcelable;
            this.f51918j = positionInBox;
            this.k = cVar;
            this.f51919l = cVar2;
            this.f51920m = cVar3;
            this.f51921n = cVar4;
            this.o = i2;
            this.f51922p = i3;
            this.f51923q = i5;
            this.f51924r = i6;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new CellDetailsSwitcherDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52731b() {
            return this.f51917h;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52730a() {
            return this.f51913a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51913a, model.f51913a) && Intrinsics.f(this.f51914b, model.f51914b) && this.f51915c == model.f51915c && this.d == model.d && this.e == model.e && this.f == model.f && Intrinsics.f(this.f51916g, model.f51916g) && Intrinsics.f(this.f51917h, model.f51917h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f51918j, model.f51918j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f51919l, model.f51919l) && Intrinsics.f(this.f51920m, model.f51920m) && Intrinsics.f(this.f51921n, model.f51921n) && this.o == model.o && this.f51922p == model.f51922p && this.f51923q == model.f51923q && this.f51924r == model.f51924r;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52739p() {
            return this.o;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.o = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getO() {
            return this.i;
        }

        public final int hashCode() {
            int iHashCode = (this.f.hashCode() + j6.a.b(this.e, j6.a.c(j6.a.c(p.a.a(this.f51913a.hashCode() * 31, 31, this.f51914b), 31, this.f51915c), 31, this.d), 31)) * 31;
            String str = this.f51916g;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Object obj2 = this.f51917h;
            int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.i;
            int i = h30.l.i(this.f51918j, (iHashCode3 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.k;
            int iHashCode4 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f51919l;
            int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f51920m;
            int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f51921n;
            return Integer.hashCode(this.f51924r) + j6.a.b(this.f51923q, j6.a.b(this.f51922p, j6.a.b(this.o, (iHashCode6 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getV() {
            return this.k;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f51918j = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52744w() {
            return this.f51919l;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f51920m = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52740q() {
            return this.f51922p;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52742s() {
            return this.f51924r;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f51922p = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getU() {
            return this.f51918j;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52746y() {
            return this.f51921n;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52745x() {
            return this.f51920m;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.k = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.i = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52741r() {
            return this.f51923q;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f51919l = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f51921n = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new z2(model.f51915c != this.f51915c, !Intrinsics.f(model.f51914b, this.f51914b), model.e != this.e, !Intrinsics.f(model.f51916g, this.f51916g));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, TextLocalisedClause title, boolean z, boolean z3, int i, String str, Object obj2, AnalyticsContext analyticsContext, int i2) {
            int i3 = (i2 & 16) != 0 ? 0 : i;
            String str2 = (i2 & 32) != 0 ? null : str;
            Object obj3 = (i2 & 64) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i2 & 128) != 0 ? null : analyticsContext;
            int i5 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            this(listId, title, z, z3, i3, aw0.j0.DEFAULT, str2, obj3, analyticsContext2, c.d.f249513a, null, null, null, null, i5, i5, i5, i5);
        }
    }
}
