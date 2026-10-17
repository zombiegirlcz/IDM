package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsHeadlineDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/CellDetailsHeadlineDelegate$Model;", "Lip0/e7;", "<init>", "()V", "Model", "ip0/d7", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsHeadlineDelegate extends BaseRecyclerViewDelegate<Model, ip0.e7> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsHeadlineDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/n2", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextLocalisedClause f51849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f51850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n2 f51851c;
        public Parcelable d;
        public qv0.c e;
        public p31.c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p31.c f51852g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p31.c f51853h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f51854j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f51855l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f51856m;

        public Model(TextLocalisedClause title, Clause headline, n2 n2Var) {
            int i = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter("TRANSFER_RATE_ITEM_ID", "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(headline, "headline");
            this.f51849a = title;
            this.f51850b = headline;
            this.f51851c = n2Var;
            this.d = null;
            this.e = c.d.f249513a;
            this.f = null;
            this.f51852g = null;
            this.f51853h = null;
            this.i = null;
            this.f51854j = i;
            this.k = i;
            this.f51855l = i;
            this.f51856m = i;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new CellDetailsHeadlineDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getD() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b */
        public final String getF53900a() {
            return "TRANSFER_RATE_ITEM_ID";
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return this.f51849a.equals(model.f51849a) && this.f51850b.equals(model.f51850b) && Intrinsics.f(this.f51851c, model.f51851c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f51852g, model.f51852g) && Intrinsics.f(this.f51853h, model.f51853h) && Intrinsics.f(this.i, model.i) && this.f51854j == model.f51854j && this.k == model.k && this.f51855l == model.f51855l && this.f51856m == model.f51856m;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF51854j() {
            return this.f51854j;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51854j = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.d;
        }

        public final int hashCode() {
            int iB = p.a.b(t61.a.a(1572742724, 31, this.f51849a), 31, this.f51850b);
            n2 n2Var = this.f51851c;
            int iC = j6.a.c((iB + (n2Var == null ? 0 : n2Var.hashCode())) * 31, 961, false);
            Parcelable parcelable = this.d;
            int i = h30.l.i(this.e, (iC + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f;
            int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f51852g;
            int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f51853h;
            int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.i;
            return Integer.hashCode(this.f51856m) + j6.a.b(this.f51855l, j6.a.b(this.k, j6.a.b(this.f51854j, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF() {
            return this.f;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.e = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF51852g() {
            return this.f51852g;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f51853h = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getK() {
            return this.k;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF51856m() {
            return this.f51856m;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.k = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getE() {
            return this.e;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getI() {
            return this.i;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF51853h() {
            return this.f51853h;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.d = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF51855l() {
            return this.f51855l;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f51852g = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.i = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) != null) {
                return new ip0.d7(!r5.f51849a.equals(this.f51849a), !r5.f51850b.equals(this.f51850b), !Intrinsics.f(r5.f51851c, this.f51851c));
            }
            return null;
        }
    }

    public CellDetailsHeadlineDelegate() {
        super(R$layout.internal_delegate_cell_details_headline, new ip0.g4(19));
        v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.e7(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_headline));
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.e7 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ArrayList<ip0.d7> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof ip0.d7) {
                arrayList.add(obj2);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        boolean z = zIsEmpty;
        boolean z3 = z;
        for (ip0.d7 d7Var : arrayList) {
            zIsEmpty = zIsEmpty || d7Var.f163848a;
            z = z || d7Var.f163849b;
            z3 = z3 || d7Var.f163850c;
        }
        if (zIsEmpty) {
            kli.a.b(holder.f, data.f51849a, ty0.f.f275450a);
        }
        if (z) {
            kli.a.b(holder.f164028g, data.f51850b, ty0.f.f275450a);
        }
        if (z3) {
            n2 n2Var = data.f51851c;
            kli.a.b(holder.f164029h, n2Var != null ? n2Var.f54491a : null, ty0.f.f275450a);
            holder.i.setVisibility(8);
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        TextLocalisedClause clause = data.f51849a;
        Intrinsics.checkNotNullParameter(clause, "clause");
        or0.m.a(itemView);
        or0.u.o(itemView);
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        or0.b.c(this, data, itemView2, false, null, 24);
    }
}
