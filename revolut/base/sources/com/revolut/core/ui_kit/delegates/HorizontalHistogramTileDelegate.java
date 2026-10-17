package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.TileHeaderView;
import com.revolut.core.ui_kit.internal.views.barchart.HorizontalBarView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.dk;
import ip0.ko;
import ip0.lo;
import ip0.mo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0003\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/HorizontalHistogramTileDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/HorizontalHistogramTileDelegate$Model;", "Lip0/mo;", "<init>", "()V", "Companion", "Model", "ip0/ko", "ip0/lo", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HorizontalHistogramTileDelegate extends BaseRecyclerViewDelegate<Model, mo> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52456c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/HorizontalHistogramTileDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final aw0.ja f52457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f52458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public qv0.c f52459c;
        public p31.c d;
        public p31.c e;
        public p31.c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p31.c f52460g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f52461h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f52462j;
        public final int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Parcelable f52463l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Object f52464m;

        public Model(aw0.ja header, List items, osk.f fVar) {
            Intrinsics.checkNotNullParameter("analysts-ratings-widget-listId", "listId");
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(items, "items");
            int i = R$attr.uikit_dp16;
            this.f52457a = header;
            this.f52458b = items;
            this.f52459c = c.d.f249513a;
            this.d = null;
            this.e = null;
            this.f = null;
            this.f52460g = null;
            this.f52461h = i;
            this.i = i;
            this.f52462j = i;
            this.k = i;
            this.f52463l = null;
            this.f52464m = fVar;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new HorizontalHistogramTileDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52083j() {
            return this.f52464m;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b */
        public final String getF51997a() {
            return "analysts-ratings-widget-listId";
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return this.f52457a.equals(model.f52457a) && Intrinsics.f(this.f52458b, model.f52458b) && Intrinsics.f(this.f52459c, model.f52459c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52460g, model.f52460g) && this.f52461h == model.f52461h && this.i == model.i && this.f52462j == model.f52462j && this.k == model.k && Intrinsics.f(this.f52463l, model.f52463l) && Intrinsics.f(this.f52464m, model.f52464m);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52003l() {
            return this.f52461h;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52461h = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.f52463l;
        }

        public final int hashCode() {
            int i = h30.l.i(this.f52459c, (((this.f52458b.hashCode() + j6.a.b(100, this.f52457a.hashCode() * 31, 31)) * 31) - 1640592817) * 31, 31);
            p31.c cVar = this.d;
            int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.e;
            int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f;
            int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52460g;
            int iB = j6.a.b(this.k, j6.a.b(this.f52462j, j6.a.b(this.i, j6.a.b(this.f52461h, (iHashCode3 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 31);
            Parcelable parcelable = this.f52463l;
            int iHashCode4 = (iB + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            Object obj2 = this.f52464m;
            return iHashCode4 + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52001h() {
            return this.d;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52459c = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getI() {
            return this.e;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52004m() {
            return this.i;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getO() {
            return this.k;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.i = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52000g() {
            return this.f52459c;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getK() {
            return this.f52460g;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52002j() {
            return this.f;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.d = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52463l = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52005n() {
            return this.f52462j;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.e = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52460g = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                return new lo(!model.f52457a.equals(this.f52457a), false, !Intrinsics.f(model.f52458b, this.f52458b), or0.b.l(this, model));
            }
            return null;
        }
    }

    public HorizontalHistogramTileDelegate() {
        super(R$layout.internal_delegate_horizontal_histogram_tile, new dk(18));
        this.f52456c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new mo(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(mo holder, Model data, int i, List payloads) {
        List list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        List list2 = payloads;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            list = payloads;
        } else {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (!(it8.next() instanceof lo)) {
                    list = null;
                    break;
                }
            }
            list = payloads;
        }
        if (list == null) {
            list = zhm.f0.f322471a;
        }
        Intrinsics.i(list, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.core.ui_kit.delegates.HorizontalHistogramTileDelegate.Payload>");
        boolean zIsEmpty = list.isEmpty();
        int size = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        for (int i2 = 0; i2 < size; i2++) {
            lo loVar = (lo) list.get(i2);
            zIsEmpty = zIsEmpty || loVar.f165243a;
            z3 = z3 || loVar.f165244b;
            z = z || loVar.f165245c;
            z4 = z4 || loVar.d;
        }
        if (zIsEmpty) {
            TileHeaderView tileHeaderView = holder.f;
            aw0.ja jaVar = data.f52457a;
            tileHeaderView.setTopLabel(jaVar.f10378a);
            tileHeaderView.setTitle(jaVar.f10379b);
            tileHeaderView.setSubtitle(jaVar.f10380c);
        }
        if (z || z3) {
            HorizontalBarView horizontalBarView = holder.f165409g;
            data.getClass();
            List<ko> list3 = data.f52458b;
            ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
            for (ko koVar : list3) {
                koVar.getClass();
                arrayList.add(new ps0.m(null, koVar.f165057c, R$attr.uikit_colorGrey50, koVar.f165055a / 100, koVar.f165056b));
            }
            horizontalBarView.setBars(new ps0.n(100, arrayList, 8.0f, 5.0f, 5.0f, 4.0f));
        }
        if (z4) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, true, null, 24);
        }
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        or0.m.a(itemView2);
        itemView2.setOnClickListener(new au0.t1(data, 13, this, data));
    }
}
