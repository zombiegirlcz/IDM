package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.views.TagsView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0006\u0007\b\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsListDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/CellDetailsListDelegate$Model;", "Lip0/r7;", "<init>", "()V", "Model", "ip0/q7", "ip0/p7", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsListDelegate extends BaseRecyclerViewDelegate<Model, ip0.r7> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f51858c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsListDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f51860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f51861c;
        public final a d;
        public final List e;
        public final Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Parcelable f51862g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f51863h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f51864j;
        public final int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public qv0.c f51865l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f51866m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f51867n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f51868p;

        public static abstract class a {
            private a() {
            }
        }

        public Model(String listId, Image image, List titleValues, o2 o2Var, List tags, Object obj2, int i) {
            image = (i & 2) != 0 ? null : image;
            o2Var = (i & 8) != 0 ? null : o2Var;
            tags = (i & 16) != 0 ? zhm.f0.f322471a : tags;
            obj2 = (i & 32) != 0 ? null : obj2;
            int i2 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(titleValues, "titleValues");
            Intrinsics.checkNotNullParameter(tags, "tags");
            this.f51859a = listId;
            this.f51860b = image;
            this.f51861c = titleValues;
            this.d = o2Var;
            this.e = tags;
            this.f = obj2;
            this.f51862g = null;
            this.f51863h = i2;
            this.i = i2;
            this.f51864j = i2;
            this.k = i2;
            this.f51865l = c.d.f249513a;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new CellDetailsListDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52656t() {
            return this.f;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52354a() {
            return this.f51859a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51859a, model.f51859a) && Intrinsics.f(this.f51860b, model.f51860b) && Intrinsics.f(this.f51861c, model.f51861c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f51862g, model.f51862g) && this.f51863h == model.f51863h && this.i == model.i && this.f51864j == model.f51864j && this.k == model.k;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52361m() {
            return this.f51863h;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51863h = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getK() {
            return this.f51862g;
        }

        public final int hashCode() {
            int iHashCode = this.f51859a.hashCode() * 31;
            Image image = this.f51860b;
            int iD = p.a.d((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f51861c);
            a aVar = this.d;
            int iD2 = p.a.d((iD + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.e);
            Object obj2 = this.f;
            int iHashCode2 = (iD2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f51862g;
            return Integer.hashCode(this.k) + j6.a.b(this.f51864j, j6.a.b(this.i, j6.a.b(this.f51863h, (iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52364q() {
            return this.f51866m;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f51865l = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52365r() {
            return this.f51867n;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.o = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52362n() {
            return this.i;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52363p() {
            return this.k;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.i = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52360l() {
            return this.f51865l;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52367t() {
            return this.f51868p;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52366s() {
            return this.o;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f51866m = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f51862g = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getO() {
            return this.f51864j;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f51867n = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f51868p = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new ip0.p7(!Intrinsics.f(model.f51860b, this.f51860b), !Intrinsics.f(model.f51861c, this.f51861c), !Intrinsics.f(model.d, this.d), !Intrinsics.f(model.e, this.e), or0.b.l(this, (qv0.i) oldItem));
        }
    }

    public CellDetailsListDelegate() {
        super(R$layout.internal_delegate_cell_details_list, new ip0.g4(23));
        v0.a.d("create(...)");
        this.f51858c = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.r7(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_list));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.r7 holder, Model data, int i, List list) {
        AttributeSet attributeSet;
        int i2;
        List<ip0.p7> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        LinearLayout linearLayout = holder.f166127g;
        int size = payloads.size();
        int i3 = 0;
        while (true) {
            attributeSet = null;
            if (i3 >= size) {
                break;
            }
            if (!(payloads.get(i3) instanceof ip0.p7)) {
                payloads = null;
                break;
            }
            i3++;
        }
        List list2 = payloads;
        boolean z = list2 == null || list2.isEmpty();
        boolean z3 = list2 == null || list2.isEmpty();
        boolean z4 = list2 == null || list2.isEmpty();
        boolean z6 = list2 == null || list2.isEmpty();
        boolean z11 = list2 == null || list2.isEmpty();
        if (payloads != null) {
            for (ip0.p7 p7Var : payloads) {
                z = z || p7Var.f165776a;
                z3 = z3 || p7Var.f165777b;
                z4 = z4 || p7Var.f165778c;
                z6 = z6 || p7Var.d;
                z11 = z11 || p7Var.e;
            }
        }
        if (z) {
            or0.b.f(this, data.f51860b, holder.f);
        }
        int i5 = 6;
        if (z3) {
            List<ip0.q7> list3 = data.f51861c;
            linearLayout.removeAllViews();
            for (ip0.q7 q7Var : list3) {
                Context context = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                mx0.wc wcVar = new mx0.wc(context, attributeSet, i5, i);
                wcVar.setImage(q7Var.f165932a);
                wcVar.setText(q7Var.f165933b);
                linearLayout.addView(wcVar);
            }
        }
        if (z4) {
            TagView tagView = holder.f166128h;
            if (tagView != null) {
                tagView.setVisibility(8);
            }
            TagView tagView2 = holder.f166128h;
            if (tagView2 != null) {
                tagView2.setOnClickListener(null);
            }
            if (holder.f166128h != null) {
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.endToStart = -1;
                layoutParams2.endToEnd = 0;
                linearLayout.setLayoutParams(layoutParams2);
            }
            Model.a aVar = data.d;
            if (aVar instanceof o2) {
                o2 o2Var = (o2) aVar;
                TagView tagView3 = holder.f166128h;
                if (tagView3 != null) {
                    i2 = 8;
                } else {
                    Context context2 = holder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    tagView3 = new TagView(context2, null, 6, 0);
                    tagView3.setId(View.generateViewId());
                    ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
                    layoutParams3.endToEnd = 0;
                    layoutParams3.topToTop = linearLayout.getId();
                    layoutParams3.bottomToBottom = linearLayout.getId();
                    Context context3 = tagView3.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    layoutParams3.setMarginStart(kli.a.k(context3, 8.0f));
                    tagView3.setLayoutParams(layoutParams3);
                    i2 = 8;
                    tagView3.setVisibility(8);
                    View view = holder.itemView;
                    Intrinsics.i(view, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) view).addView(tagView3);
                    holder.f166128h = tagView3;
                }
                tagView3.setContent(o2Var.f54527a);
                tagView3.setVisibility(0);
                tagView3.setOnClickListener(null);
                tagView3.setClickable(false);
                ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams4;
                layoutParams5.endToEnd = -1;
                layoutParams5.endToStart = tagView3.getId();
                linearLayout.setLayoutParams(layoutParams5);
            } else {
                i2 = 8;
                if (aVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            i2 = 8;
        }
        if (z6) {
            List list4 = data.e;
            if (!list4.isEmpty() || holder.i != null) {
                TagsView tagsView = holder.i;
                if (tagsView == null) {
                    Context context4 = holder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    tagsView = new TagsView(context4, attributeSet, 6, i);
                    holder.i = tagsView;
                    tagsView.setId(View.generateViewId());
                    ConstraintLayout.LayoutParams layoutParams6 = new ConstraintLayout.LayoutParams(0, -2);
                    Context context5 = tagsView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                    ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = kli.a.k(context5, 4.0f);
                    layoutParams6.endToEnd = 0;
                    layoutParams6.startToStart = linearLayout.getId();
                    layoutParams6.topToBottom = linearLayout.getId();
                    tagsView.setLayoutParams(layoutParams6);
                    View view2 = holder.itemView;
                    Intrinsics.i(view2, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) view2).addView(tagsView);
                }
                tagsView.setVisibility(list4.isEmpty() ? i2 : 0);
                tagsView.setModel(new mx0.qc(list4, null));
            }
            TagsView tagsView2 = holder.i;
            if (tagsView2 != null) {
                this.f51858c.a(tagsView2.a(), holder);
            }
        }
        if (z11) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
    }
}
