package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.delegates.SelectableIconDelegate;
import com.revolut.core.ui_kit.internal.recycler.layout_manager.SimpleCenteredGridLayoutManager;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ShimmerImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.flexbox.FlexboxLayoutManager;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.dk;
import ip0.hp;
import ip0.jp;
import ip0.kp;
import ip0.lp;
import ip0.mp;
import ip0.np;
import ip0.op;
import ip0.pp;
import ip0.qp;
import ip0.rp;
import ip0.sp;
import ip0.tp;
import ip0.up;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\t\b\t\n\u000b\f\r\u000e\u0003\u000fB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/IconSelectorDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/IconSelectorDelegate$Model;", "Lip0/up;", "", "<init>", "()V", "Companion", "Model", "SelectableIconModel", "ip0/tp", "ip0/jp", "ip0/qp", "ip0/sp", "ip0/rp", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IconSelectorDelegate extends BaseRecyclerViewDelegate<Model, up> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SelectableIconDelegate f52489c;
    public final tw0.u d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/IconSelectorDelegate$Model;", "Lqv0/i;", "Lqv0/m;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.m, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f52491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final jp f52492c;
        public final qp d;
        public final tp e;
        public p31.c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p31.c f52493g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p31.c f52494h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f52495j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f52496l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f52497m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public qv0.c f52498n;
        public Parcelable o;

        public Model(String listId, List iconList, jp gravity, qp layout, tp shape, int i) {
            gravity = (i & 4) != 0 ? hp.f164586b : gravity;
            layout = (i & 8) != 0 ? new pp(null) : layout;
            shape = (i & 16) != 0 ? tp.CIRCLE : shape;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(iconList, "iconList");
            Intrinsics.checkNotNullParameter(gravity, "gravity");
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(shape, "shape");
            int i2 = R$attr.uikit_dp16;
            this.f52490a = listId;
            this.f52491b = iconList;
            this.f52492c = gravity;
            this.d = layout;
            this.e = shape;
            this.f = null;
            this.f52493g = null;
            this.f52494h = null;
            this.i = null;
            this.f52495j = i2;
            this.k = i2;
            this.f52496l = i2;
            this.f52497m = i2;
            this.f52498n = c.d.f249513a;
            this.o = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new IconSelectorDelegate();
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55135b() {
            return this.f52490a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52490a, model.f52490a) && Intrinsics.f(this.f52491b, model.f52491b) && Intrinsics.f(this.f52492c, model.f52492c) && Intrinsics.f(this.d, model.d) && this.e == model.e && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52493g, model.f52493g) && Intrinsics.f(this.f52494h, model.f52494h) && Intrinsics.f(this.i, model.i) && this.f52495j == model.f52495j && this.k == model.k && this.f52496l == model.f52496l && this.f52497m == model.f52497m && Intrinsics.f(this.f52498n, model.f52498n) && Intrinsics.f(this.o, model.o);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getI() {
            return this.f52495j;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52495j = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.o;
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.f52492c.hashCode() + p.a.d(this.f52490a.hashCode() * 31, 31, this.f52491b)) * 31)) * 31)) * 31;
            p31.c cVar = this.f;
            int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52493g;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52494h;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.i;
            int i = h30.l.i(this.f52498n, j6.a.b(this.f52497m, j6.a.b(this.f52496l, j6.a.b(this.k, j6.a.b(this.f52495j, (iHashCode4 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 31), 31);
            Parcelable parcelable = this.o;
            return i + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getE() {
            return this.f;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52498n = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF() {
            return this.f52493g;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52494h = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53487j() {
            return this.k;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53488l() {
            return this.f52497m;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.k = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getD() {
            return this.f52498n;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF53486h() {
            return this.i;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF53485g() {
            return this.f52494h;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.o = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getK() {
            return this.f52496l;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52493g = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.i = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new rp(!Intrinsics.f(r0.f52491b, this.f52491b), !Intrinsics.f(r0.f52492c, this.f52492c), !Intrinsics.f(r0.d, this.d), ((Model) oldItem).e != this.e, or0.b.l(this, (qv0.i) oldItem));
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.IconSelectorDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public IconSelectorDelegate() {
        super(R$layout.internal_delegate_icon_selector, new dk(24));
        this.f52489c = new SelectableIconDelegate(true);
        this.d = new tw0.u();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new up(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_icon_selector), this.f52489c);
    }

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
    public final void p(up holder, Model data, int i, List payloads) {
        tw0.j jVar;
        int i2;
        RecyclerView.ItemDecoration a0Var;
        RecyclerView.LayoutManager layoutManager;
        RecyclerView.LayoutManager layoutManager2;
        RecyclerView.ItemDecoration cVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        RecyclerView recyclerView = holder.f;
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        boolean zN5 = ue0.e.n(payloads);
        Iterator it8 = payloads.iterator();
        boolean z = zN;
        boolean z3 = zN3;
        boolean z4 = zN4;
        boolean z6 = zN5;
        while (true) {
            boolean z11 = true;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (next instanceof rp) {
                boolean z12 = z || ((rp) next).f166220b;
                zN2 = zN2 || ((rp) next).e;
                boolean z29 = z3 || ((rp) next).f166219a;
                boolean z31 = z4 || ((rp) next).f166221c;
                if (!z6 && !((rp) next).d) {
                    z11 = false;
                }
                z = z12;
                z3 = z29;
                z4 = z31;
                z6 = z11;
            }
        }
        if (zN2) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            or0.b.c(this, data, itemView2, false, null, 28);
            recyclerView.setPadding(itemView.getPaddingLeft(), recyclerView.getPaddingTop(), itemView.getPaddingRight(), recyclerView.getPaddingBottom());
            itemView.setPadding(0, itemView.getPaddingTop(), 0, itemView.getPaddingBottom());
        }
        if (z4) {
            qp qpVar = data.d;
            if (qpVar instanceof pp) {
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext(), 0, false);
                cVar = new tw0.c(12.0f);
                layoutManager2 = linearLayoutManager;
            } else {
                if (qpVar instanceof op) {
                    Context context = recyclerView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    int iK = kli.a.k(context, 14.0f);
                    SimpleCenteredGridLayoutManager simpleCenteredGridLayoutManager = new SimpleCenteredGridLayoutManager();
                    a0Var = new tw0.b(iK, iK, 4);
                    layoutManager = simpleCenteredGridLayoutManager;
                } else {
                    if (!(qpVar instanceof np)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView.getContext(), 1);
                    flexboxLayoutManager.z(0);
                    flexboxLayoutManager.A(1);
                    mp mpVar = ((np) qpVar).f165556a;
                    if (Intrinsics.f(mpVar, lp.f165247a)) {
                        i2 = 2;
                    } else {
                        if (!Intrinsics.f(mpVar, kp.f165059a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = 3;
                    }
                    flexboxLayoutManager.B(i2);
                    flexboxLayoutManager.y(0);
                    Context context2 = recyclerView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    int iK2 = kli.a.k(context2, 8.0f);
                    a0Var = new tw0.a0(iK2, iK2, iK2, iK2);
                    layoutManager = flexboxLayoutManager;
                }
                layoutManager2 = layoutManager;
                cVar = a0Var;
            }
            recyclerView.setLayoutManager(layoutManager2);
            while (recyclerView.getItemDecorationCount() > 0) {
                recyclerView.removeItemDecorationAt(0);
            }
            recyclerView.addItemDecoration(cVar);
        }
        if (z3 || z4 || z6) {
            List list = data.f52491b;
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it9 = list2.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    if (((SelectableIconModel) it9.next()).f52503h != data.e) {
                        List list3 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            SelectableIconModel selectableIconModel = (SelectableIconModel) it10.next();
                            tp shape = data.e;
                            String listId = selectableIconModel.f52499a;
                            Image icon = selectableIconModel.f52500b;
                            boolean z41 = selectableIconModel.f52501c;
                            Clause clause = selectableIconModel.d;
                            boolean z49 = selectableIconModel.e;
                            CircleBadgeModel circleBadgeModel = selectableIconModel.f;
                            int i3 = selectableIconModel.f52502g;
                            Iterator it11 = it10;
                            boolean z54 = selectableIconModel.i;
                            boolean z74 = selectableIconModel.f52504j;
                            Clause clause2 = selectableIconModel.k;
                            Object obj2 = selectableIconModel.f52505l;
                            Parcelable parcelable = selectableIconModel.f52506m;
                            Intrinsics.checkNotNullParameter(listId, "listId");
                            Intrinsics.checkNotNullParameter(icon, "icon");
                            Intrinsics.checkNotNullParameter(shape, "shape");
                            arrayList.add(new SelectableIconModel(listId, icon, z41, clause, z49, circleBadgeModel, i3, shape, z54, z74, clause2, obj2, parcelable));
                            it10 = it11;
                        }
                        list = arrayList;
                    }
                }
            }
            holder.f166711g.c(list);
        }
        if (z) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = data.f52492c.f164899a;
            recyclerView.setLayoutParams(layoutParams2);
        }
        String str = data.f52490a;
        tw0.u uVar = this.d;
        uVar.c(recyclerView, str);
        if (ue0.e.n(payloads)) {
            qp qpVar2 = data.d;
            pp ppVar = qpVar2 instanceof pp ? (pp) qpVar2 : null;
            if (ppVar == null || (jVar = ppVar.f165857a) == null) {
                return;
            }
            uVar.b(data.f52490a, recyclerView, jVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/IconSelectorDelegate$SelectableIconModel;", "Lkoi/j;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectableIconModel implements koi.j, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f52500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f52501c;
        public final Clause d;
        public final boolean e;
        public final CircleBadgeModel f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f52502g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final tp f52503h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f52504j;
        public final Clause k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Object f52505l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Parcelable f52506m;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.IconSelectorDelegate$SelectableIconModel$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static SelectableIconModel a(Companion companion, String listId, Image icon, boolean z, Clause clause, Clause contentDescription, InactiveCircleBadge inactiveCircleBadge, int i, boolean z3, boolean z4, Object obj2, AnalyticsContext analyticsContext, int i2) {
                Clause clause2 = (i2 & 8) != 0 ? null : clause;
                InactiveCircleBadge inactiveCircleBadge2 = (i2 & 64) != 0 ? null : inactiveCircleBadge;
                int i3 = (i2 & 128) != 0 ? R$attr.uikit_colorForeground : i;
                boolean z6 = (i2 & 256) != 0 ? false : z3;
                boolean z11 = (i2 & 512) != 0 ? false : z4;
                Object obj3 = (i2 & 1024) != 0 ? null : obj2;
                AnalyticsContext analyticsContext2 = (i2 & 2048) != 0 ? null : analyticsContext;
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
                return new SelectableIconModel(listId, icon, z, clause2, true, inactiveCircleBadge2, i3, tp.CIRCLE, z6, z11, contentDescription, obj3, analyticsContext2);
            }

            public static SelectableIconModel b(String listId) {
                Intrinsics.checkNotNullParameter(listId, "listId");
                return new SelectableIconModel(listId, ShimmerImage.f60002a, false, new TextClause("", (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126), null, false, null, 0, false, null, null, 4048);
            }
        }

        public SelectableIconModel(String listId, Image icon, boolean z, Clause clause, boolean z3, CircleBadgeModel circleBadgeModel, int i, tp shape, boolean z4, boolean z6, Clause clause2, Object obj2, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(shape, "shape");
            this.f52499a = listId;
            this.f52500b = icon;
            this.f52501c = z;
            this.d = clause;
            this.e = z3;
            this.f = circleBadgeModel;
            this.f52502g = i;
            this.f52503h = shape;
            this.i = z4;
            this.f52504j = z6;
            this.k = clause2;
            this.f52505l = obj2;
            this.f52506m = parcelable;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55137g() {
            return this.f52505l;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55135b() {
            return this.f52499a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectableIconModel)) {
                return false;
            }
            SelectableIconModel selectableIconModel = (SelectableIconModel) obj2;
            return Intrinsics.f(this.f52499a, selectableIconModel.f52499a) && Intrinsics.f(this.f52500b, selectableIconModel.f52500b) && this.f52501c == selectableIconModel.f52501c && Intrinsics.f(this.d, selectableIconModel.d) && this.e == selectableIconModel.e && Intrinsics.f(this.f, selectableIconModel.f) && this.f52502g == selectableIconModel.f52502g && this.f52503h == selectableIconModel.f52503h && this.i == selectableIconModel.i && this.f52504j == selectableIconModel.f52504j && Intrinsics.f(this.k, selectableIconModel.k) && Intrinsics.f(this.f52505l, selectableIconModel.f52505l) && Intrinsics.f(this.f52506m, selectableIconModel.f52506m);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.f52506m;
        }

        public final int hashCode() {
            int iC = j6.a.c(a10.b.c(this.f52500b, this.f52499a.hashCode() * 31, 31), 31, this.f52501c);
            Clause clause = this.d;
            int iC2 = j6.a.c((iC + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.e);
            CircleBadgeModel circleBadgeModel = this.f;
            int iC3 = j6.a.c(j6.a.c((this.f52503h.hashCode() + j6.a.b(this.f52502g, (iC2 + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode())) * 31, 31)) * 31, 31, this.i), 31, this.f52504j);
            Clause clause2 = this.k;
            int iHashCode = (iC3 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            Object obj2 = this.f52505l;
            int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52506m;
            return iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52506m = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof SelectableIconModel ? (SelectableIconModel) oldItem : null) == null) {
                return null;
            }
            SelectableIconModel selectableIconModel = (SelectableIconModel) oldItem;
            boolean z3 = !Intrinsics.f(selectableIconModel.f52500b, this.f52500b);
            boolean z4 = false;
            boolean z6 = selectableIconModel.f52501c != this.f52501c;
            if (selectableIconModel.f52502g != this.f52502g) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            return new sp(z3, z6, z4, selectableIconModel.e != this.e ? true : z, !Intrinsics.f(selectableIconModel.f, this.f), selectableIconModel.f52503h != this.f52503h ? true : z, selectableIconModel.i != this.i ? true : z, selectableIconModel.f52504j != this.f52504j ? true : z, !Intrinsics.f(selectableIconModel.d, this.d));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public SelectableIconModel(String listId, Image icon, boolean z, Clause clause, TextLocalisedClause textLocalisedClause, boolean z3, LayeredImage layeredImage, int i, boolean z4, Object obj2, AnalyticsContext analyticsContext, int i2) {
            Clause clause2 = (i2 & 8) != 0 ? null : clause;
            TextLocalisedClause textLocalisedClause2 = (i2 & 16) != 0 ? null : textLocalisedClause;
            boolean z6 = (i2 & 32) != 0 ? true : z3;
            LayeredImage layeredImage2 = (i2 & 64) != 0 ? null : layeredImage;
            int i3 = (i2 & 128) != 0 ? R$attr.uikit_colorForeground : i;
            boolean z11 = (i2 & 256) != 0 ? false : z4;
            Object obj3 = (i2 & 1024) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i2 & 2048) != 0 ? null : analyticsContext;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this(listId, icon, z, clause2, z6, layeredImage2 != null ? new RawImageBadge(layeredImage2) : null, i3, tp.CIRCLE, z11, false, textLocalisedClause2, obj3, analyticsContext2);
        }
    }
}
