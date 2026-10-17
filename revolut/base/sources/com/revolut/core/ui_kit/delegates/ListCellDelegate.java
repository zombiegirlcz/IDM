package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.au;
import ip0.cu;
import ip0.hq;
import ip0.kt;
import ip0.yt;
import ip0.zt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0006\u0007\b\t\n\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ListCellDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ListCellDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/l8;", "<init>", "()V", "Model", "ip0/au", "ip0/zt", "a", "ip0/yt", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ListCellDelegate extends BaseRecyclerViewDelegate<Model, l8> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52692c;
    public final ihm.f d;

    public static abstract class a {
        private a() {
        }
    }

    public ListCellDelegate() {
        super(R$layout.internal_delegate_list_cell, new hq(22));
        this.f52692c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new l8(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_list_cell));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(l8 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f54429l;
        TextView textView2 = holder.k;
        if (payloads.isEmpty()) {
            boolean z = data.f52695c != null;
            q(holder, data.f52694b, z);
            holder.F(data, new n8(1, 0, ihm.f.class, this.d, "onNext", "onNext(Ljava/lang/Object;)V"));
            r(holder, data, z);
            textView2.setVisibility(8);
            textView.setVisibility(8);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, true, null, 24);
        } else {
            List list = payloads;
            ArrayList<zt> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.ListCellDelegate.Payload");
                arrayList.add((zt) obj2);
            }
            for (zt ztVar : arrayList) {
                boolean z3 = data.f52695c != null;
                if (ztVar.f167538a) {
                    q(holder, data.f52694b, z3);
                }
                if (ztVar.f167539b || ztVar.f167540c) {
                    holder.F(data, new m8(1, 0, ihm.f.class, this.d, "onNext", "onNext(Ljava/lang/Object;)V"));
                }
                if (ztVar.d) {
                    r(holder, data, z3);
                }
                if (ztVar.f) {
                    textView2.setVisibility(8);
                    textView.setVisibility(8);
                }
                if (ztVar.e) {
                    View itemView2 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                    or0.b.c(this, data, itemView2, true, null, 24);
                }
            }
        }
        boolean z4 = data.f;
        View view = holder.itemView;
        TextView textView3 = holder.i;
        if (z4) {
            ((TextView) view.findViewById(R$id.internalDelegateListCell_titleNormal)).setMovementMethod(null);
            ((TextView) view.findViewById(R$id.internalDelegateListCell_titleSmall)).setMovementMethod(null);
            textView3.setMovementMethod(null);
            Clause clause = data.f52695c;
            py0.c cVar = clause != null ? new py0.c(clause) : null;
            or0.m.a(view);
            view.setOnClickListener(new kt(data, cVar, this, data, 3));
            return;
        }
        TextView textView4 = (TextView) view.findViewById(R$id.internalDelegateListCell_titleNormal);
        ix0.c0 c0Var = ix0.c0.f169220a;
        textView4.setMovementMethod(c0Var);
        ((TextView) view.findViewById(R$id.internalDelegateListCell_titleSmall)).setMovementMethod(c0Var);
        textView3.setMovementMethod(c0Var);
        view.setOnClickListener(null);
        view.setClickable(false);
    }

    public final void q(l8 l8Var, a aVar, boolean z) {
        if (!(aVar instanceof j8)) {
            if (aVar instanceof k8) {
                or0.b.f(this, null, l8Var.f54427h);
                or0.b.k(this, String.valueOf(((k8) aVar).f54373a), l8Var.f54428j);
                return;
            } else {
                or0.b.f(this, null, l8Var.f54427h);
                or0.b.k(this, null, l8Var.f54428j);
                return;
            }
        }
        j8 j8Var = (j8) aVar;
        or0.b.f(this, j8Var.f54323a, l8Var.f54427h);
        View view = l8Var.itemView;
        Intrinsics.i(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        ImageView imageView = l8Var.f54427h;
        yt ytVar = j8Var.f54324b;
        ConstraintSet constraintSetL = ip0.v7.l(constraintLayout);
        int i = cu.f163796a[ytVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            constraintSetL.connect(imageView.getId(), 4, 0, 4, 0);
        } else if (z) {
            constraintSetL.connect(imageView.getId(), 4, R$id.internalDelegateListCell_titleNormal, 4, 0);
        } else {
            constraintSetL.clear(imageView.getId(), 4);
        }
        constraintSetL.applyTo(constraintLayout);
        or0.b.k(this, null, l8Var.f54428j);
    }

    public final void r(l8 l8Var, Model model, boolean z) {
        View view = l8Var.itemView;
        TextView textView = l8Var.i;
        Intrinsics.i(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        ConstraintSet constraintSetL = ip0.v7.l(constraintLayout);
        if (z) {
            constraintSetL.connect(textView.getId(), 3, R$id.internalDelegateListCell_titleBottomBarrier, 4, foh.i.j(4));
            constraintSetL.clear(textView.getId(), 4);
        } else {
            constraintSetL.connect(textView.getId(), 3, 0, 3, 0);
            constraintSetL.connect(textView.getId(), 4, 0, 4, 0);
        }
        constraintSetL.applyTo(constraintLayout);
        kli.a.d(textView, model.e, model, new o8(1, 0, ihm.f.class, this.d, "onNext", "onNext(Ljava/lang/Object;)V"), 8);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ListCellDelegate$Model;", "Lqv0/i;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f52694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f52695c;
        public final au d;
        public final Clause e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f52696g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final aw0.j0 f52697h;
        public Parcelable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public qv0.c f52698j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f52699l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f52700m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f52701n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f52702p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f52703q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f52704r;

        public Model(String listId, a aVar, Clause clause, au auVar, Clause clause2, boolean z, Object obj2, Parcelable parcelable, int i, int i2, int i3, int i5, int i6) {
            au titleSize = (i6 & 8) != 0 ? au.NORMAL : auVar;
            Clause clause3 = (i6 & 16) != 0 ? null : clause2;
            boolean z3 = (i6 & 32) != 0 ? true : z;
            Object obj3 = (i6 & 64) != 0 ? null : obj2;
            aw0.j0 backgroundType = aw0.j0.DEFAULT;
            Parcelable parcelable2 = (i6 & 512) != 0 ? null : parcelable;
            int i21 = (32768 & i6) != 0 ? R$attr.uikit_dp16 : i;
            int i22 = (65536 & i6) != 0 ? R$attr.uikit_dp16 : i2;
            int i32 = (131072 & i6) != 0 ? R$attr.uikit_dp16 : i3;
            int i33 = (i6 & 262144) != 0 ? R$attr.uikit_dp16 : i5;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(titleSize, "titleSize");
            Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
            c.d positionInBox = c.d.f249513a;
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            this.f52693a = listId;
            this.f52694b = aVar;
            this.f52695c = clause;
            this.d = titleSize;
            this.e = clause3;
            this.f = z3;
            this.f52696g = obj3;
            this.f52697h = backgroundType;
            this.i = parcelable2;
            this.f52698j = positionInBox;
            this.k = null;
            this.f52699l = null;
            this.f52700m = null;
            this.f52701n = null;
            this.o = i21;
            this.f52702p = i22;
            this.f52703q = i32;
            this.f52704r = i33;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ListCellDelegate();
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF57029a() {
            return this.f52693a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52693a, model.f52693a) && Intrinsics.f(this.f52694b, model.f52694b) && Intrinsics.f(this.f52695c, model.f52695c) && this.d == model.d && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f52696g, model.f52696g) && this.f52697h == model.f52697h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52698j, model.f52698j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52699l, model.f52699l) && Intrinsics.f(this.f52700m, model.f52700m) && Intrinsics.f(this.f52701n, model.f52701n) && this.o == model.o && this.f52702p == model.f52702p && this.f52703q == model.f52703q && this.f52704r == model.f52704r;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF53129l() {
            return this.o;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.o = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF57034j() {
            return this.i;
        }

        public final int hashCode() {
            int iHashCode = this.f52693a.hashCode() * 31;
            a aVar = this.f52694b;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            Clause clause = this.f52695c;
            int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
            Clause clause2 = this.e;
            int iC = j6.a.c((iHashCode3 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.f);
            Object obj2 = this.f52696g;
            int iHashCode4 = (this.f52697h.hashCode() + ((iC + (obj2 == null ? 0 : obj2.hashCode())) * 31)) * 961;
            Parcelable parcelable = this.i;
            int i = h30.l.i(this.f52698j, (iHashCode4 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.k;
            int iHashCode5 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52699l;
            int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52700m;
            int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52701n;
            return Integer.hashCode(this.f52704r) + j6.a.b(this.f52703q, j6.a.b(this.f52702p, j6.a.b(this.o, (iHashCode7 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF() {
            return this.k;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52698j = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF57032g() {
            return this.f52699l;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52700m = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53130m() {
            return this.f52702p;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getO() {
            return this.f52704r;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52702p = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF53132p() {
            return this.f52698j;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getI() {
            return this.f52701n;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF57033h() {
            return this.f52700m;
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
        public final int getF53131n() {
            return this.f52703q;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52699l = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52701n = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new zt(!Intrinsics.f(r10.f52694b, this.f52694b), !Intrinsics.f(r10.f52695c, this.f52695c), ((Model) oldItem).d != this.d, !Intrinsics.f(r10.e, this.e), !Intrinsics.f(r10.f52698j, this.f52698j), false);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, a aVar, Clause clause, Clause clause2, boolean z, Object obj2, AnalyticsContext analyticsContext, int i, int i2, int i3, int i5, int i6) {
            Clause clause3 = (i6 & 4) != 0 ? null : clause;
            Clause clause4 = (i6 & 8) != 0 ? null : clause2;
            boolean z3 = (i6 & 16) != 0 ? true : z;
            Object obj3 = (i6 & 32) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i6 & 128) != 0 ? null : analyticsContext;
            int i21 = (i6 & 256) != 0 ? R$attr.uikit_dp16 : i;
            int i22 = (i6 & 512) != 0 ? R$attr.uikit_dp16 : i2;
            int i32 = (i6 & 1024) != 0 ? R$attr.uikit_dp16 : i3;
            int i33 = (i6 & 2048) != 0 ? R$attr.uikit_dp16 : i5;
            Intrinsics.checkNotNullParameter(listId, "listId");
            this(listId, aVar, clause3, null, clause4, z3, obj3, analyticsContext2, i21, i22, i32, i33, 30856);
        }
    }
}
