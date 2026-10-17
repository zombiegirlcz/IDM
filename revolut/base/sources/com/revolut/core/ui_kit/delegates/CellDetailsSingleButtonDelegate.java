package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsSingleButtonDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseGroupRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/CellDetailsSingleButtonDelegate$Model;", "Lip0/j8;", "<init>", "()V", "Model", "ip0/i8", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsSingleButtonDelegate extends BaseGroupRecyclerViewDelegate<Model, ip0.j8> {
    public final ihm.f d;
    public final ihm.f e;
    public final e01.a f;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\bJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsSingleButtonDelegate$Model;", "Lqv0/l;", "Lqv0/p;", "Lgx0/a;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/w2", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.l, qv0.p, gx0.a, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final aw0.t0 f51891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final aw0.s0 f51892c;
        public final boolean d;
        public final w2 e;
        public final Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Parcelable f51893g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public qv0.c f51894h;
        public qv0.k i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f51895j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f51896l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f51897m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f51898n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f51899p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f51900q;

        public Model(String listId, aw0.t0 title, aw0.s0 button, Object obj2, u2 u2Var, int i) {
            obj2 = (i & 16) != 0 ? null : obj2;
            w2 style = u2Var;
            style = (i & 64) != 0 ? v2.f54845a : style;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(style, "style");
            qv0.k positionInGroup = qv0.k.OutOfGroup;
            int i2 = R$attr.uikit_dp12;
            int i3 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(button, "button");
            Intrinsics.checkNotNullParameter(style, "style");
            c.d positionInBox = c.d.f249513a;
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
            this.f51890a = listId;
            this.f51891b = title;
            this.f51892c = button;
            this.d = false;
            this.e = style;
            this.f = obj2;
            this.f51893g = null;
            this.f51894h = positionInBox;
            this.i = positionInGroup;
            this.f51895j = null;
            this.k = null;
            this.f51896l = null;
            this.f51897m = null;
            this.f51898n = i2;
            this.o = i2;
            this.f51899p = i3;
            this.f51900q = i3;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: C1 */
        public final boolean getE() {
            return !this.f51891b.d && this.d;
        }

        @Override // qv0.l
        public final void R0(qv0.k kVar) {
            Intrinsics.checkNotNullParameter(kVar, "<set-?>");
            this.i = kVar;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new CellDetailsSingleButtonDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getK() {
            return this.f;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51938a() {
            return this.f51890a;
        }

        @Override // gx0.a
        public final py0.d d() {
            return new py0.c(this.f51891b.f10536a);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51890a, model.f51890a) && Intrinsics.f(this.f51891b, model.f51891b) && Intrinsics.f(this.f51892c, model.f51892c) && this.d == model.d && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f51893g, model.f51893g) && Intrinsics.f(this.f51894h, model.f51894h) && this.i == model.i && Intrinsics.f(this.f51895j, model.f51895j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f51896l, model.f51896l) && Intrinsics.f(this.f51897m, model.f51897m) && this.f51898n == model.f51898n && this.o == model.o && this.f51899p == model.f51899p && this.f51900q == model.f51900q;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF51945m() {
            return this.f51898n;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: f0, reason: from getter */
        public final qv0.k getF51942h() {
            return this.i;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51898n = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.f51893g;
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + j6.a.c((this.f51892c.hashCode() + ((this.f51891b.hashCode() + (this.f51890a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31;
            Object obj2 = this.f;
            int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f51893g;
            int iHashCode3 = (this.i.hashCode() + h30.l.i(this.f51894h, (iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31)) * 31;
            p31.c cVar = this.f51895j;
            int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.k;
            int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f51896l;
            int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f51897m;
            return Integer.hashCode(this.f51900q) + j6.a.b(this.f51899p, j6.a.b(this.o, j6.a.b(this.f51898n, (iHashCode6 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getI() {
            return this.f51895j;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f51894h = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF51943j() {
            return this.k;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f51896l = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF51946n() {
            return this.o;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF51947p() {
            return this.f51900q;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.o = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF51941g() {
            return this.f51894h;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF51944l() {
            return this.f51897m;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getK() {
            return this.f51896l;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f51895j = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f51893g = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getO() {
            return this.f51899p;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.k = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f51897m = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new ip0.i8(!Intrinsics.f(model.f51891b, this.f51891b), !Intrinsics.f(model.f51892c, this.f51892c), !Intrinsics.f(model.e, this.e), or0.b.m(this, (qv0.l) oldItem));
        }
    }

    public CellDetailsSingleButtonDelegate() {
        super(R$layout.internal_delegate_cell_details_single_button, new ip0.h8(0));
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.j8(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_single_button));
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate
    public final void q(koi.b bVar, qv0.l lVar, int i, List list) {
        gq0.b bVarF;
        Clause clause;
        List payloads = list;
        ip0.j8 holder = (ip0.j8) bVar;
        Model data = (Model) lVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.q(holder, data, i, payloads);
        ImageView imageView = holder.f164802g;
        SmallActionButton smallActionButton = holder.i;
        TextView textView = holder.f164803h;
        TextView textView2 = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            bVarF = null;
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.i8)) {
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
        for (int i3 = 0; i3 < size2; i3++) {
            ip0.i8 i8Var = (ip0.i8) payloads.get(i3);
            zIsEmpty = zIsEmpty || i8Var.f164659a;
            z3 = z3 || i8Var.f164660b;
            z = z || i8Var.f164661c;
        }
        if (zIsEmpty) {
            xam.a.e(data.f51891b, textView2, imageView);
        }
        if (z) {
            w2 w2Var = data.e;
            boolean z4 = w2Var instanceof u2;
            jb3.l.e(textView2, w2Var.c());
            Context context = textView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView2.setTextColor(kli.a.s(data.e.b(), context));
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            int i5 = z4 ? -1 : 0;
            int id10 = z4 ? textView.getId() : -1;
            if (layoutParams2.bottomToBottom != i5 || layoutParams2.bottomToTop != id10) {
                ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                layoutParams4.bottomToBottom = i5;
                layoutParams4.bottomToTop = id10;
                textView2.setLayoutParams(layoutParams4);
            }
        }
        if (z) {
            w2 w2Var2 = data.e;
            u2 u2Var = w2Var2 instanceof u2 ? (u2) w2Var2 : null;
            Clause clause2 = u2Var != null ? u2Var.f54799a : null;
            ty0.c.b(or0.u.k(textView).b0(), clause2, holder.f164803h, null, null, 12);
            textView.setVisibility(clause2 == null ? 8 : 0);
        }
        if (z3) {
            xam.a.d(data.f51892c, smallActionButton, data.f51893g);
        }
        if (z3 || z) {
            smallActionButton.i(data.e.a());
        }
        efm.r map = smallActionButton.f56386h.map(new ip0.w(new ii4.b(data, 27), 18));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f.a(map, holder);
        aw0.t0 t0Var = data.f51891b;
        boolean z6 = data.d;
        boolean z11 = t0Var.d && !z6;
        if (z11) {
            or0.u.u(textView2, data, new j01.c(new View[]{textView2, imageView}, data, this.d, null, 24));
        } else {
            or0.u.o(textView2);
        }
        if (z11) {
            or0.u.t(imageView, data, new j01.c(new View[]{textView2, imageView}, data, this.d, null, 24));
        } else {
            or0.u.o(imageView);
        }
        boolean z12 = t0Var.d;
        Clause clause3 = t0Var.f10536a;
        boolean z29 = !z12 && z6;
        View view = holder.itemView;
        if (z29) {
            Intrinsics.h(view);
            py0.c cVar = clause3 != null ? new py0.c(clause3) : null;
            or0.m.a(view);
            view.setOnClickListener(new au0.i3(data, cVar, this, data, 14));
        } else {
            Intrinsics.h(view);
            or0.u.o(view);
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        gq0.b bVarF2 = hx7.b.f(clause3);
        w2 w2Var3 = data.e;
        u2 u2Var2 = w2Var3 instanceof u2 ? (u2) w2Var3 : null;
        if (u2Var2 != null && (clause = u2Var2.f54799a) != null) {
            bVarF = hx7.b.f(clause);
        }
        gq0.d[] elements = {bVarF2, bVarF};
        Intrinsics.checkNotNullParameter(elements, "elements");
        hx7.b.u(kotlin.collections.d.L(elements), itemView);
    }
}
