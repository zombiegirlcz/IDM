package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0007\b\u0003\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/AttributeWideDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/AttributeWideDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/z0;", "<init>", "()V", "Companion", "Model", "ip0/w1", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AttributeWideDelegate extends BaseRecyclerViewDelegate<Model, z0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final c.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f51682g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51683c;
    public final ihm.f d;
    public final i4g.g e;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\b\tJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/AttributeWideDelegate$Model;", "Lkoi/j;", "Lqv0/n;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/y0", "com/revolut/core/ui_kit/delegates/x0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements koi.j, qv0.n, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextClause f51685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f51686c;
        public final Clause d;
        public final y0 e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final x0 f51687g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f51688h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f51689j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f51690l;

        public Model(String listId, TextClause title, Clause clause, Clause clause2, y0 y0Var, boolean z, x0 x0Var) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f51684a = listId;
            this.f51685b = title;
            this.f51686c = clause;
            this.d = clause2;
            this.e = y0Var;
            this.f = z;
            this.f51687g = x0Var;
            this.f51688h = null;
            this.i = null;
            this.f51689j = null;
            this.k = null;
            this.f51690l = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new AttributeWideDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getO() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52311a() {
            return this.f51684a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51684a, model.f51684a) && this.f51685b.equals(model.f51685b) && Intrinsics.f(this.f51686c, model.f51686c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && this.f51687g.equals(model.f51687g) && Intrinsics.f(this.f51688h, model.f51688h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f51689j, model.f51689j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f51690l, model.f51690l);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52313c() {
            return this.f51688h;
        }

        public final int hashCode() {
            int iB = ip0.v7.b(this.f51684a.hashCode() * 31, 31, this.f51685b);
            Clause clause = this.f51686c;
            int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.d;
            int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            y0 y0Var = this.e;
            int iHashCode3 = (this.f51687g.hashCode() + j6.a.c(j6.a.c(j6.a.c((iHashCode2 + (y0Var == null ? 0 : y0Var.hashCode())) * 31, 31, true), 31, true), 31, this.f)) * 961;
            Parcelable parcelable = this.f51688h;
            int iHashCode4 = (iHashCode3 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            p31.c cVar = this.i;
            int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f51689j;
            int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.k;
            int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f51690l;
            return iHashCode7 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getE() {
            return this.i;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF() {
            return this.f51689j;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.k = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52315h() {
            return this.f51690l;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52314g() {
            return this.k;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.i = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f51688h = parcelable;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f51689j = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f51690l = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new ip0.w1(!r12.f51685b.equals(this.f51685b), !Intrinsics.f(r12.f51686c, this.f51686c), !Intrinsics.f(r12.d, this.d), !Intrinsics.f(r12.e, this.e), false, false, ((Model) oldItem).f != this.f, !r12.f51687g.equals(this.f51687g));
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.AttributeWideDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    static {
        c.e eVar = new c.e((qv0.h) null, 3);
        f = eVar;
        f51682g = eVar.f249514a.a();
    }

    public AttributeWideDelegate() {
        super(R$layout.internal_delegate_attribute_wide, new ip0.c(19));
        this.f51683c = v0.a.d("create(...)");
        ihm.f fVarD = v0.a.d("create(...)");
        this.d = fVarD;
        this.e = new i4g.g(1, fVarD, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 14);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new z0(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(z0 holder, Model data, int i, List list) {
        boolean z;
        dr0.e eVarA;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        UIKitTextView uIKitTextView = holder.f55661j;
        UIKitTextView uIKitTextView2 = holder.i;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.w1)) {
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
        boolean z3 = zIsEmpty;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        int i3 = 0;
        while (true) {
            z = true;
            if (i3 >= size2) {
                break;
            }
            ip0.w1 w1Var = (ip0.w1) payloads.get(i3);
            zIsEmpty = zIsEmpty || w1Var.f166913a;
            z3 = z3 || w1Var.f166914b;
            z4 = z4 || w1Var.f166915c;
            z12 = z12 || w1Var.d;
            z6 = z6 || w1Var.e;
            z11 = z11 || w1Var.f;
            z29 = z29 || w1Var.f166916g;
            z31 = z31 || w1Var.f166917h;
            i3++;
        }
        if (zIsEmpty) {
            kli.a.b(holder.f, data.f51685b, ty0.f.f275450a);
        }
        if (z3) {
            kli.a.b(holder.f55659g, data.f51686c, ty0.f.f275450a);
        }
        if (z4) {
            kli.a.b(holder.f55660h, data.d, ty0.f.f275450a);
        }
        y0 y0Var = data.e;
        Clause clause = y0Var != null ? y0Var.f55612a : null;
        i4g.g gVar = this.e;
        kli.a.d(uIKitTextView2, clause, data, gVar, 8);
        kli.a.d(uIKitTextView, y0Var != null ? y0Var.f55613b : null, data, gVar, 8);
        kli.a.I(uIKitTextView2, y0Var != null ? y0Var.f55612a : null);
        kli.a.I(uIKitTextView, y0Var != null ? y0Var.f55613b : null);
        if (!z6 && !z11) {
            z = false;
        }
        if (z) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            pd.b.q(itemView, true);
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            pd.b.h(itemView2, true);
            View itemView3 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
            or0.b.b(this, f, itemView3, true, null, null, null, 56);
        }
        View itemView4 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
        py0.c cVar = new py0.c(data.f51685b);
        or0.m.a(itemView4);
        itemView4.setOnClickListener(new au0.i3(data, cVar, this, data, 5));
        if (z11) {
            holder.itemView.setAlpha(1.0f);
        }
        if (z29 || z31 || z) {
            x0 x0Var = data.f51687g;
            if (data.f) {
                eVarA = a1.a(x0Var);
                if (eVarA == null) {
                    eVarA = a1.f53653a;
                }
            } else {
                eVarA = a1.f53654b;
            }
            View itemView5 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView5, "itemView");
            dr0.f.a(itemView5, eVarA);
        }
    }
}
