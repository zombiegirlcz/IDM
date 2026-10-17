package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.layout.UIKitConstraintLayout;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0004\u0003\b\t\nB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/BasketDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/BasketDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/k1;", "Lix0/c1;", "<init>", "()V", "Companion", "Model", "ip0/b4", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BasketDelegate extends BaseRecyclerViewDelegate<Model, k1> implements ix0.c1 {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51715c;
    public ConstraintSet d;
    public ConstraintSet e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/BasketDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/j1", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j1 f51717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LayeredImage f51718c;
        public final TextClause d;
        public final Clause e;
        public final i1 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f51719g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f51720h;
        public qv0.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f51721j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f51722l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f51723m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f51724n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f51725p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f51726q;

        public Model(String listId, j1 orientation, LayeredImage icon, TextClause title, TextClause textClause, i1 i1Var, Object obj2, int i) {
            textClause = (i & 16) != 0 ? null : textClause;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            int i2 = R$attr.uikit_dp16;
            this.f51716a = listId;
            this.f51717b = orientation;
            this.f51718c = icon;
            this.d = title;
            this.e = textClause;
            this.f = i1Var;
            this.f51719g = obj2;
            this.f51720h = null;
            this.i = c.d.f249513a;
            this.f51721j = null;
            this.k = null;
            this.f51722l = null;
            this.f51723m = null;
            this.f51724n = i2;
            this.o = i2;
            this.f51725p = i2;
            this.f51726q = i2;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new BasketDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getE() {
            return this.f51719g;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF58192a() {
            return this.f51716a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51716a, model.f51716a) && this.f51717b == model.f51717b && this.f51718c.equals(model.f51718c) && this.d.equals(model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f51719g.equals(model.f51719g) && Intrinsics.f(this.f51720h, model.f51720h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f51721j, model.f51721j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f51722l, model.f51722l) && Intrinsics.f(this.f51723m, model.f51723m) && this.f51724n == model.f51724n && this.o == model.o && this.f51725p == model.f51725p && this.f51726q == model.f51726q;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF() {
            return this.f51724n;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51724n = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.f51720h;
        }

        public final int hashCode() {
            int iB = ip0.v7.b(h30.l.e(this.f51718c, (this.f51717b.hashCode() + (this.f51716a.hashCode() * 31)) * 31, 31), 31, this.d);
            Clause clause = this.e;
            int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
            i1 i1Var = this.f;
            int iB2 = p.a.b(j6.a.c((iHashCode + (i1Var == null ? 0 : i1Var.hashCode())) * 31, 31, true), 31, this.f51719g);
            Parcelable parcelable = this.f51720h;
            int i = h30.l.i(this.i, (iB2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f51721j;
            int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.k;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f51722l;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f51723m;
            return Integer.hashCode(this.f51726q) + j6.a.b(this.f51725p, j6.a.b(this.o, j6.a.b(this.f51724n, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF53436b() {
            return this.f51721j;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.i = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF53437c() {
            return this.k;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f51722l = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53438g() {
            return this.o;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getI() {
            return this.f51726q;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.o = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF53435a() {
            return this.i;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getE() {
            return this.f51723m;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getD() {
            return this.f51722l;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f51721j = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f51720h = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF53439h() {
            return this.f51725p;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.k = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f51723m = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                return new ip0.b4(model.f51717b != this.f51717b, !model.f51718c.equals(this.f51718c), !model.d.equals(this.d), !Intrinsics.f(model.e, this.e), !Intrinsics.f(model.f, this.f), false, or0.b.l(this, model));
            }
            return null;
        }
    }

    public static final class a {
        private a() {
        }
    }

    public BasketDelegate() {
        super(R$layout.internal_delegate_basket, new ip0.c(28));
        this.f51715c = v0.a.d("create(...)");
    }

    @Override // ix0.c1
    public final int e(Context context, int i, koi.j model) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(model, "model");
        if (model instanceof Model) {
            return kli.a.k(context, ((Model) model).f51717b.c());
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewR = kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_basket);
        Intrinsics.i(viewR, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.views.layout.UIKitConstraintLayout");
        UIKitConstraintLayout uIKitConstraintLayout = (UIKitConstraintLayout) viewR;
        if (this.d == null) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(uIKitConstraintLayout);
            this.d = constraintSet;
            Context context = uIKitConstraintLayout.getContext();
            ConstraintSet constraintSet2 = new ConstraintSet();
            ConstraintSet constraintSet3 = this.d;
            if (constraintSet3 == null) {
                Intrinsics.r("verticalConstraints");
                throw null;
            }
            constraintSet2.clone(constraintSet3);
            constraintSet2.clear(R$id.basket_avatar, 6);
            constraintSet2.connect(R$id.basket_avatar, 7, 0, 7);
            constraintSet2.connect(R$id.basket_avatar, 3, 0, 3);
            constraintSet2.clear(R$id.basket_title, 3);
            constraintSet2.connect(R$id.basket_title, 3, 0, 3);
            constraintSet2.setMargin(R$id.basket_title, 3, 0);
            constraintSet2.clear(R$id.basket_title, 7);
            int i = R$id.basket_title;
            int i2 = R$id.basket_avatar;
            Intrinsics.h(context);
            j1 j1Var = j1.HORIZONTAL;
            constraintSet2.connect(i, 7, i2, 6, kli.a.k(context, j1Var.a()));
            int iK = kli.a.k(context, j1Var.b());
            constraintSet2.setMargin(R$id.basket_detailsContainer, 3, iK);
            constraintSet2.setMargin(R$id.basket_avatarGroup, 3, iK);
            this.e = constraintSet2;
        }
        return new k1(uIKitConstraintLayout);
    }

    @Override // ix0.c1
    public final boolean l(koi.j model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return model instanceof Model;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(k1 holder, Model data, int i, List list) {
        ConstraintSet constraintSet;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        TagView tagView = holder.k;
        OverlappedIconsView overlappedIconsView = holder.f54361l;
        LinearLayout linearLayout = holder.f54360j;
        UIKitTextView uIKitTextView = holder.f54359h;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.b4)) {
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
        boolean z6 = z4;
        boolean z11 = z6;
        int i3 = 0;
        while (i3 < size2) {
            ip0.b4 b4Var = (ip0.b4) payloads.get(i3);
            zIsEmpty = zIsEmpty || b4Var.f163522a;
            z = z || b4Var.f163523b;
            z4 = z4 || b4Var.f163524c;
            z3 = z3 || b4Var.d;
            z6 = z6 || b4Var.e;
            List list2 = payloads;
            z11 = z11 || b4Var.f163525g || b4Var.f;
            i3++;
            payloads = list2;
        }
        if (zIsEmpty) {
            j1 j1Var = data.f51717b;
            j1 j1Var2 = holder.f54362m;
            UIKitConstraintLayout uIKitConstraintLayout = holder.f;
            if (j1Var2 != j1Var) {
                holder.f54362m = j1Var;
                int i5 = l1.f54409a[j1Var.ordinal()];
                if (i5 == 1) {
                    constraintSet = this.d;
                    if (constraintSet == null) {
                        Intrinsics.r("verticalConstraints");
                        throw null;
                    }
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    constraintSet = this.e;
                    if (constraintSet == null) {
                        Intrinsics.r("horizontalConstraints");
                        throw null;
                    }
                }
                constraintSet.applyTo(uIKitConstraintLayout);
                Context context = uIKitConstraintLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                uIKitConstraintLayout.setMinHeight(kli.a.k(context, j1Var.c()));
            }
        }
        if (z) {
            zi0.c.g(holder.f54358g, data.f51718c);
        }
        if (z3) {
            uIKitTextView.setMaxLines(data.e != null ? 1 : 2);
            kli.a.b(holder.i, data.e, ty0.f.f275450a);
        }
        if (z4) {
            kli.a.b(uIKitTextView, data.d, ty0.f.f275450a);
        }
        if (z6) {
            i1 i1Var = data.f;
            if (i1Var != null) {
                linearLayout.setVisibility(8);
                tagView.setVisibility(8);
                overlappedIconsView.setVisibility(0);
                yp0.u.a(overlappedIconsView, new aw0.i0(i1Var.f54270a, aw0.e0.DP_32, (aw0.h0) null, 12), 8);
            } else {
                if (i1Var != null) {
                    throw new NoWhenBranchMatchedException();
                }
                linearLayout.setVisibility(8);
                tagView.setVisibility(8);
                overlappedIconsView.setVisibility(8);
            }
        }
        if (z11) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            data.getClass();
            pd.b.h(itemView2, true);
        }
        View itemView3 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
        py0.c cVar = new py0.c(data.d);
        or0.m.a(itemView3);
        itemView3.setOnClickListener(new au0.i3(data, cVar, this, data, 8));
    }
}
