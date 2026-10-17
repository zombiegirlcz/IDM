package com.revolut.core.ui_kit.delegates.widgets;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.DetailGridItemDelegate;
import com.revolut.core.ui_kit.delegates.DetailGridItemLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.UIKitRecyclerView;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\b\u0007\b\t\u0003\n\u000b\f\rB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/TilePaginatedGridWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/TilePaginatedGridWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/p4;", "<init>", "()V", "Companion", "a", "Model", "op0/r4", "op0/q4", "op0/p4", "com/revolut/core/ui_kit/delegates/widgets/o4", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TilePaginatedGridWidgetDelegate extends BaseDraggableWidgetDelegate<Model, p4> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/TilePaginatedGridWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Ltw0/y;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements tw0.y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextClause f55250c;
        public final ArrayList d;
        public Parcelable e;
        public op0.r f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final bme.a f55251g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f55252h;
        public final AnimationRequest i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final op0.q f55253j;

        public Model(String listId, TextClause title, ArrayList items, bme.a aVar, AnalyticsContext analyticsContext, AnimationRequest animationRequest) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(items, "items");
            ArrayList arrayList = new ArrayList(zhm.w.t(items, 10));
            Iterator it8 = items.iterator();
            while (it8.hasNext()) {
                DetailGridItemDelegate.Model model = (DetailGridItemDelegate.Model) it8.next();
                DetailGridItemDelegate.Model model2 = new DetailGridItemDelegate.Model(model.f52179a, model.f52180b, model.f52181c, model.d, model.f52184j, model.k);
                int i = R$attr.uikit_dp4;
                model2.f52185l = i;
                model2.f52186m = i;
                int i2 = R$attr.uikit_dp8;
                model2.f52187n = i2;
                model2.o = i2;
                yp0.b.m(model2);
                arrayList.add(model2);
            }
            op0.r rVar = op0.r.SEEN;
            this.f55249b = listId;
            this.f55250c = title;
            this.d = arrayList;
            this.e = analyticsContext;
            this.f = rVar;
            this.f55251g = aVar;
            this.f55252h = true;
            this.i = animationRequest;
            this.f55253j = op0.q.DYNAMIC;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: A, reason: from getter */
        public final boolean getF55252h() {
            return this.f55252h;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: B */
        public final boolean getF54944l() {
            return false;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f = rVar;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55249b() {
            return this.f55249b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getO() {
            return null;
        }

        @Override // tw0.y
        /* JADX INFO: renamed from: e */
        public final boolean getF55114g() {
            return false;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55249b, model.f55249b) && Intrinsics.f(this.f55250c, model.f55250c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f55251g, model.f55251g) && this.f55252h == model.f55252h && Intrinsics.f(this.i, model.i);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getE() {
            return this.e;
        }

        public final int hashCode() {
            int iC = j6.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, v7.b(this.f55249b.hashCode() * 31, 31, this.f55250c), 31), 31, false);
            Parcelable parcelable = this.e;
            int iC2 = j6.a.c(okl.m.c(this.f, (iC + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31, false);
            bme.a aVar = this.f55251g;
            int iC3 = j6.a.c((iC2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f55252h);
            AnimationRequest animationRequest = this.i;
            return iC3 + (animationRequest != null ? animationRequest.hashCode() : 0);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF55253j() {
            return this.f55253j;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.e = parcelable;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: x */
        public final boolean getF54941g() {
            return false;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            op0.r4 r4Var = null;
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                ArrayList arrayList = model.d;
                koi.j jVar = (koi.j) zhm.d0.d0(this.d);
                Class<?> cls = jVar != null ? jVar.getClass() : null;
                koi.j jVar2 = (koi.j) zhm.d0.d0(arrayList);
                if (Intrinsics.f(cls, jVar2 != null ? jVar2.getClass() : null)) {
                    r4Var = new op0.r4(!r2.equals(arrayList), !Intrinsics.f(this.f55250c, model.f55250c), this.i != model.i);
                }
            }
            return r4Var;
        }
    }

    public static abstract class a extends BaseDraggableWidgetDelegate.a {
        private a() {
        }
    }

    public TilePaginatedGridWidgetDelegate() {
        super(R$id.internal_tile_paginated_grid_widget_view_type, new op0.v3(12));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewR = kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_tile_paginated_grid);
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 4.0f);
        View viewFindViewById = viewR.findViewById(R$id.tilePaginatedGridWidget_recycler);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        UIKitRecyclerView uIKitRecyclerView = (UIKitRecyclerView) viewFindViewById;
        View viewFindViewById2 = viewR.findViewById(R$id.tilePaginatedGridWidget_pagerIndicator);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ScrollingPagerIndicatorView scrollingPagerIndicatorView = (ScrollingPagerIndicatorView) viewFindViewById2;
        View viewFindViewById3 = viewR.findViewById(R$id.tilePaginatedGridWidget_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        UIKitTextView uIKitTextView = (UIKitTextView) viewFindViewById3;
        DetailGridItemDelegate detailGridItemDelegate = new DetailGridItemDelegate();
        z4l.j jVar = new z4l.j(7, zhm.v.k(detailGridItemDelegate, new DetailGridItemLoadingDelegate()), false);
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        op0.q4 q4Var = new op0.q4(context2, iK);
        bs0.c cVar = new bs0.c(6, bs0.a.START);
        cVar.attachToRecyclerView(uIKitRecyclerView);
        uIKitRecyclerView.setAdapter(jVar);
        uIKitRecyclerView.setLayoutManager(q4Var);
        uIKitRecyclerView.setNestedScrollingEnabled(false);
        uIKitRecyclerView.addItemDecoration(new op0.p4(iK));
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(fp0.b.f137017a);
        mVar.getClass();
        fp0.p pVarA = fp0.m.a(uIKitTextView, gVar);
        ViewParent parent2 = parent;
        while (true) {
            if (parent2 == null) {
                recyclerView = null;
                break;
            }
            if (parent2 instanceof RecyclerView) {
                recyclerView = (RecyclerView) parent2;
                break;
            }
            parent2 = parent2.getParent();
        }
        p4 p4Var = new p4(viewR, uIKitRecyclerView, scrollingPagerIndicatorView, uIKitTextView, pVarA, jVar, new ok7.c(detailGridItemDelegate, 23), iK, recyclerView, cVar, new ok7.c(this, 24));
        p(p4Var, false);
        o4 o4Var = p4Var.f55473q;
        RecyclerView recyclerView2 = o4Var.f55455c;
        if (recyclerView2 != null) {
            recyclerView2.addOnScrollListener(o4Var.k);
        }
        uIKitRecyclerView.addOnScrollListener(o4Var.f55459l);
        return p4Var;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        o4 o4Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        p4 p4Var = holder instanceof p4 ? (p4) holder : null;
        if (p4Var == null || (o4Var = p4Var.f55473q) == null || o4Var.f55457h) {
            return;
        }
        o4Var.f55457h = true;
        o4Var.f.removeCallbacks(o4Var.f55458j);
        if (!o4Var.i) {
            o4Var.d.attachToRecyclerView(o4Var.f55453a);
            o4Var.i = true;
        }
        o4Var.f55453a.removeOnScrollListener(o4Var.f55459l);
        RecyclerView recyclerView = o4Var.f55455c;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(o4Var.k);
        }
        o4Var.f55453a.stopScroll();
        o4Var.f55460m = null;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(p4 holder, Model model, int i, List list) {
        AnimationRequest animationRequest;
        List payloads = list;
        Float fValueOf = Float.valueOf(16.0f);
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, model, i, list);
        holder.F(model.f55253j);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof op0.r4)) {
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
            op0.r4 r4Var = (op0.r4) payloads.get(i3);
            z3 = z3 || r4Var.f227404a;
            z = z || r4Var.f227405b;
            z4 = z4 || r4Var.f227406c;
        }
        if (z) {
            kli.a.b(holder.f55469l, holder.f55469l.getContext().getResources().getConfiguration().getLayoutDirection() == 1 ? new CompositeClause(zhm.v.k(new ImageClause(R$drawable.uikit_icn_24_chevron_left, Integer.valueOf(R$attr.uikit_colorGreyTone50), fValueOf, fValueOf, 16), model.f55250c), null, null, null, 14) : yh5.b.a(model.f55250c), ty0.f.f275450a);
        }
        if (z3) {
            ArrayList items = model.d;
            Intrinsics.checkNotNullParameter(items, "items");
            holder.f55471n.c(items);
            if (model.d.size() > 6) {
                holder.k.setVisibility(0);
                holder.k.c(holder.f55468j, new gu0.f(6, holder.o));
            } else {
                holder.k.setVisibility(8);
                holder.k.a();
            }
        }
        if (zIsEmpty || (z4 && (animationRequest = model.i) != null && !animationRequest.f57724a)) {
            o4 o4Var = holder.f55473q;
            if (o4Var.f55457h) {
                o4Var.f55457h = false;
                RecyclerView recyclerView = o4Var.f55455c;
                if (recyclerView != null) {
                    recyclerView.addOnScrollListener(o4Var.k);
                }
                o4Var.f55453a.addOnScrollListener(o4Var.f55459l);
            }
        }
        o4 o4Var2 = holder.f55473q;
        o4Var2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (!o4Var2.f55457h) {
            o4Var2.f55460m = model;
            o4Var2.f.removeCallbacks(o4Var2.f55458j);
            o4Var2.f.postDelayed(o4Var2.f55458j, 300L);
        }
        fp0.p pVar = holder.f55470m;
        fp0.p.b(pVar, true);
        View view = pVar.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new au0.r2(this, model, 23));
        pd.b.h(holder.f55469l, true);
        holder.f55472p = new ood.k(this, model, 14);
    }
}
