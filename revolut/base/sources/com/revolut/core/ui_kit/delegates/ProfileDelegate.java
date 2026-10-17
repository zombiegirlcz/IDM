package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.r30;
import ip0.s30;
import ip0.tz;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0006\u0003\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ProfileDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseGroupRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ProfileDelegate$Model;", "Lip0/s30;", "<init>", "()V", "Model", "ip0/r30", "ip0/q30", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProfileDelegate extends BaseGroupRecyclerViewDelegate<Model, s30> {
    public final ihm.f d;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ProfileDelegate$Model;", "Lqv0/l;", "Lqv0/i;", "Lo31/c;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.l, qv0.i, o31.c, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f52988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f52989c;
        public final TextLocalisedClause d;
        public final Clause e;
        public final AccentCircleBadge f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f52990g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f52991h;
        public qv0.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f52992j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f52993l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f52994m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f52995n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f52996p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f52997q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public qv0.k f52998r;

        public Model(Image image, Clause clause, TextLocalisedClause textLocalisedClause, Clause clause2, AccentCircleBadge accentCircleBadge, List listItems) {
            Intrinsics.checkNotNullParameter("LIST_ID_AGENT_HEADER", "listId");
            Intrinsics.checkNotNullParameter(listItems, "listItems");
            int i = R$attr.uikit_dp16;
            int i2 = R$attr.uikit_dp24;
            qv0.k kVar = qv0.k.OutOfGroup;
            this.f52987a = "LIST_ID_AGENT_HEADER";
            this.f52988b = image;
            this.f52989c = clause;
            this.d = textLocalisedClause;
            this.e = clause2;
            this.f = accentCircleBadge;
            this.f52990g = listItems;
            this.f52991h = null;
            this.i = c.d.f249513a;
            this.f52992j = null;
            this.k = null;
            this.f52993l = null;
            this.f52994m = null;
            this.f52995n = i;
            this.o = i2;
            this.f52996p = i;
            this.f52997q = i;
            this.f52998r = kVar;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: C1 */
        public final boolean getE() {
            return false;
        }

        @Override // qv0.l
        public final void R0(qv0.k kVar) {
            Intrinsics.checkNotNullParameter(kVar, "<set-?>");
            this.f52998r = kVar;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ProfileDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF55256g() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52987a() {
            return this.f52987a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52987a, model.f52987a) && Intrinsics.f(this.f52988b, model.f52988b) && Intrinsics.f(this.f52989c, model.f52989c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52990g, model.f52990g) && Intrinsics.f(this.f52991h, model.f52991h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52992j, model.f52992j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52993l, model.f52993l) && Intrinsics.f(this.f52994m, model.f52994m) && this.f52995n == model.f52995n && this.o == model.o && this.f52996p == model.f52996p && this.f52997q == model.f52997q && this.f52998r == model.f52998r;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52995n() {
            return this.f52995n;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: f0, reason: from getter */
        public final qv0.k getF52998r() {
            return this.f52998r;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52995n = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52991h() {
            return this.f52991h;
        }

        public final int hashCode() {
            int iHashCode = this.f52987a.hashCode() * 31;
            Image image = this.f52988b;
            int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
            Object obj2 = this.f52989c;
            int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            TextLocalisedClause textLocalisedClause = this.d;
            int iHashCode4 = (iHashCode3 + (textLocalisedClause == null ? 0 : textLocalisedClause.hashCode())) * 31;
            Clause clause = this.e;
            int iHashCode5 = (iHashCode4 + (clause == null ? 0 : clause.hashCode())) * 31;
            AccentCircleBadge accentCircleBadge = this.f;
            int iD = p.a.d((iHashCode5 + (accentCircleBadge == null ? 0 : accentCircleBadge.f58049a.hashCode())) * 31, 961, this.f52990g);
            Parcelable parcelable = this.f52991h;
            int i = h30.l.i(this.i, (iD + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f52992j;
            int iHashCode6 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.k;
            int iHashCode7 = (iHashCode6 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52993l;
            int iHashCode8 = (iHashCode7 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52994m;
            return this.f52998r.hashCode() + j6.a.b(this.f52997q, j6.a.b(this.f52996p, j6.a.b(this.o, j6.a.b(this.f52995n, (iHashCode8 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52992j() {
            return this.f52992j;
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
            this.f52993l = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getO() {
            return this.o;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52997q() {
            return this.f52997q;
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
        public final p31.c getF52994m() {
            return this.f52994m;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52993l() {
            return this.f52993l;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52992j = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52991h = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52996p() {
            return this.f52996p;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.k = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52994m = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (!(oldItem instanceof Model)) {
                return null;
            }
            Model model = (Model) oldItem;
            return new r30(!Intrinsics.f(this.f52988b, model.f52988b), !Intrinsics.f(this.f52989c, model.f52989c), !Intrinsics.f(this.d, model.d), !Intrinsics.f(this.e, model.e), !Intrinsics.f(this.f, model.f), !Intrinsics.f(this.f52990g, model.f52990g), !true, or0.b.m(this, (qv0.l) oldItem));
        }
    }

    public ProfileDelegate() {
        super(R$layout.internal_delegate_profile, new tz(25));
        this.d = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new s30(kotlin.jvm.internal.s.r(parent, this.f58165c));
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate
    public final void q(koi.b bVar, qv0.l lVar, int i, List payloads) {
        s30 holder = (s30) bVar;
        Model data = (Model) lVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.q(holder, data, i, payloads);
        boolean zIsEmpty = payloads.isEmpty();
        Iterator it8 = payloads.iterator();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            Intrinsics.i(next, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.ProfileDelegate.ProfileModelPayload");
            r30 r30Var = (r30) next;
            zIsEmpty = zIsEmpty || r30Var.f166098a;
            z = z || r30Var.f166099b;
            z3 = z3 || r30Var.f166100c;
            z4 = z4 || r30Var.d;
            z6 = z6 || r30Var.e;
            z11 = z11 || r30Var.f;
        }
        if (zIsEmpty) {
            zi0.c.g(holder.f, data.f52988b);
        }
        if (z) {
            kli.a.b(holder.f166286h, data.f52989c, ty0.f.f275450a);
        }
        if (z3) {
            kli.a.b(holder.i, data.d, ty0.f.f275450a);
        }
        if (z4) {
            Clause clause = data.e;
            fc onClick = new fc(1, 0, ihm.f.class, this.d, "onNext", "onNext(Ljava/lang/Object;)V");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            kli.a.d(holder.f166287j, clause, data, onClick, 8);
        }
        if (z6) {
            holder.f166285g.setBadgeAndVisibility(data.f, holder.f166289m);
        }
        if (z11) {
            List items = data.f52990g;
            Intrinsics.checkNotNullParameter(items, "items");
            holder.f166288l.c(items);
            RecyclerView recyclerView = holder.k;
            List list = items;
            recyclerView.setVisibility(list.isEmpty() ? 8 : 0);
            if (list.isEmpty()) {
                return;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            if (gridLayoutManager != null) {
                gridLayoutManager.setSpanCount(list.size());
            }
        }
    }
}
