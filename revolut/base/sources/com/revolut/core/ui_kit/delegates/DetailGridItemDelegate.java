package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0006\u0007\b\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/DetailGridItemDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/DetailGridItemDelegate$Model;", "Lip0/ae;", "<init>", "()V", "Model", "a", "ip0/zd", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DetailGridItemDelegate extends BaseRecyclerViewDelegate<Model, ip0.ae> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52178c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/DetailGridItemDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UrlImage f52180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextClause f52181c;
        public final a d;
        public qv0.c e;
        public p31.c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p31.c f52182g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p31.c f52183h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object f52184j;
        public Parcelable k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f52185l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f52186m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f52187n;
        public int o;

        public Model(String listId, UrlImage logo, TextClause title, a badge, Object obj2, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(logo, "logo");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(badge, "badge");
            this.f52179a = listId;
            this.f52180b = logo;
            this.f52181c = title;
            this.d = badge;
            this.e = c.d.f249513a;
            this.f = null;
            this.f52182g = null;
            this.f52183h = null;
            this.i = null;
            this.f52184j = obj2;
            this.k = parcelable;
            int i = R$attr.uikit_dp0;
            this.f52185l = i;
            this.f52186m = i;
            this.f52187n = i;
            this.o = i;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new DetailGridItemDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52184j() {
            return this.f52184j;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52179a() {
            return this.f52179a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52179a, model.f52179a) && this.f52180b.equals(model.f52180b) && this.f52181c.equals(model.f52181c) && this.d.equals(model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52182g, model.f52182g) && Intrinsics.f(this.f52183h, model.f52183h) && Intrinsics.f(this.i, model.i) && this.f52184j.equals(model.f52184j) && Intrinsics.f(this.k, model.k);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52185l() {
            return this.f52185l;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52185l = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getK() {
            return this.k;
        }

        public final int hashCode() {
            int i = h30.l.i(this.e, (this.d.hashCode() + ip0.v7.b(ip0.v7.g(this.f52180b, this.f52179a.hashCode() * 31, 31), 31, this.f52181c)) * 31, 31);
            p31.c cVar = this.f;
            int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52182g;
            int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52183h;
            int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.i;
            int iB = p.a.b((iHashCode3 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31, this.f52184j);
            Parcelable parcelable = this.k;
            return iB + (parcelable != null ? parcelable.hashCode() : 0);
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
        public final p31.c getF52182g() {
            return this.f52182g;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52183h = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52186m() {
            return this.f52186m;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getO() {
            return this.o;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52186m = i;
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
        public final p31.c getF52183h() {
            return this.f52183h;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.k = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52187n() {
            return this.f52187n;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52182g = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.i = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                return new ip0.zd(!model.f52181c.equals(this.f52181c), !model.f52180b.equals(this.f52180b), !model.d.equals(this.d), or0.b.l(this, model));
            }
            return null;
        }
    }

    public static abstract class a {
        private a() {
        }

        public abstract TagViewData a();
    }

    public DetailGridItemDelegate() {
        super(R$layout.internal_delegate_detail_grid_item, new ip0.lb(16));
        this.f52178c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ip0.ae aeVar = new ip0.ae(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_detail_grid_item));
        ip0.be beVar = new ip0.be();
        ImageView imageView = aeVar.f163423g;
        imageView.setOutlineProvider(beVar);
        imageView.setClipToOutline(true);
        return aeVar;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.ae holder, Model data, int i, List list) {
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.zd)) {
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
        for (int i3 = 0; i3 < size2; i3++) {
            ip0.zd zdVar = (ip0.zd) payloads.get(i3);
            z = z || zdVar.f167447a;
            z3 = z3 || zdVar.f167448b;
            z4 = z4 || zdVar.f167449c;
            zIsEmpty = zIsEmpty || zdVar.d;
        }
        if (zIsEmpty) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, true, null, 24);
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            pd.b.h(itemView2, true);
        }
        if (z3) {
            xv0.m.e0(holder, data.f52180b, holder.f163423g, null, 14);
        }
        if (z) {
            ty0.c.b(or0.u.k(holder.i).b0(), data.f52181c, holder.i, null, null, 12);
        }
        if (z4) {
            holder.f163425j.setContent(data.d.a());
        }
        fp0.p pVar = holder.f163424h;
        py0.c cVar = new py0.c(data.f52181c);
        fp0.p.b(pVar, true);
        View view = pVar.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new au0.i3(data, cVar, this, data, 21));
    }
}
