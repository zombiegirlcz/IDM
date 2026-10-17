package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.TileHeaderView;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fv;
import ip0.hw;
import ip0.iw;
import ip0.kt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/LogosTileDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/LogosTileDelegate$Model;", "Lip0/iw;", "<init>", "()V", "Model", "ip0/hw", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LogosTileDelegate extends BaseRecyclerViewDelegate<Model, iw> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52753c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/LogosTileDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f52754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Parcelable f52755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final aw0.ja f52756c;
        public final List d;
        public int e;
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f52757g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f52758h;
        public qv0.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f52759j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f52760l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f52761m;

        public Model(aw0.ja header, List logos, osk.f fVar) {
            Intrinsics.checkNotNullParameter("analyst-details-price-target-widget-listId", "listId");
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(logos, "logos");
            int i = R$attr.uikit_dp16;
            this.f52754a = fVar;
            this.f52755b = null;
            this.f52756c = header;
            this.d = logos;
            this.e = i;
            this.f = i;
            this.f52757g = i;
            this.f52758h = i;
            this.i = c.d.f249513a;
            this.f52759j = null;
            this.k = null;
            this.f52760l = null;
            this.f52761m = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new LogosTileDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52754a() {
            return this.f52754a;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b */
        public final String getF55721a() {
            return "analyst-details-price-target-widget-listId";
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52754a, model.f52754a) && Intrinsics.f(this.f52755b, model.f52755b) && this.f52756c.equals(model.f52756c) && Intrinsics.f(this.d, model.d) && this.e == model.e && this.f == model.f && this.f52757g == model.f52757g && this.f52758h == model.f52758h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52759j, model.f52759j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52760l, model.f52760l) && Intrinsics.f(this.f52761m, model.f52761m);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getE() {
            return this.e;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.e = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52755b() {
            return this.f52755b;
        }

        public final int hashCode() {
            Object obj2 = this.f52754a;
            int iHashCode = ((-523630688) + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52755b;
            int i = h30.l.i(this.i, j6.a.b(this.f52758h, j6.a.b(this.f52757g, j6.a.b(this.f, j6.a.b(this.e, p.a.d((this.f52756c.hashCode() + ((iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31)) * 31, 31, this.d), 31), 31), 31), 31), 31);
            p31.c cVar = this.f52759j;
            int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.k;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52760l;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52761m;
            return iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52759j() {
            return this.f52759j;
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
            this.f52760l = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF() {
            return this.f;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52758h() {
            return this.f52758h;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getI() {
            return this.i;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52761m() {
            return this.f52761m;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52760l() {
            return this.f52760l;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52759j = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52755b = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52757g() {
            return this.f52757g;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.k = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52761m = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) != null) {
                return new hw(!this.f52756c.equals(r5.f52756c), !Intrinsics.f(this.d, r5.d), !Intrinsics.f(this.i, r5.i));
            }
            return null;
        }
    }

    public LogosTileDelegate() {
        super(R$layout.internal_delegate_logos_tile, new fv(5));
        this.f52753c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new iw(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_logos_tile));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    public final void p(iw holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        List list = payloads;
        boolean zIsEmpty = list.isEmpty();
        boolean zIsEmpty2 = list.isEmpty();
        boolean zIsEmpty3 = list.isEmpty();
        for (Object obj2 : payloads) {
            if (!(obj2 instanceof hw)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            hw hwVar = (hw) obj2;
            zIsEmpty |= hwVar.f164609a;
            zIsEmpty2 |= hwVar.f164610b;
            zIsEmpty3 |= hwVar.f164611c;
        }
        if (zIsEmpty) {
            TileHeaderView tileHeaderView = holder.f;
            aw0.ja jaVar = data.f52756c;
            tileHeaderView.setTopLabel(jaVar.f10378a);
            tileHeaderView.setSubtitle(jaVar.f10380c);
            tileHeaderView.setTitle(jaVar.f10379b);
        }
        if (zIsEmpty2) {
            OverlappedIconsView.setIcons$default(holder.f164752g, data.d, null, null, 0, false, 30, null);
        }
        if (zIsEmpty3) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, true, null, 24);
        }
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        py0.c cVar = new py0.c(data.f52756c.f10378a);
        or0.m.a(itemView2);
        itemView2.setOnClickListener(new kt(data, cVar, this, data, 6));
    }
}
