package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsTwinButtonsDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseGroupRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/CellDetailsTwinButtonsDelegate$Model;", "Lip0/s8;", "<init>", "()V", "Model", "ip0/r8", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsTwinButtonsDelegate extends BaseGroupRecyclerViewDelegate<Model, ip0.s8> {
    public final ihm.f d;
    public final e01.a e;
    public final e01.a f;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsTwinButtonsDelegate$Model;", "Lqv0/l;", "Lqv0/p;", "Lgx0/a;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.l, qv0.p, gx0.a, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final aw0.t0 f51939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final aw0.s0 f51940c;
        public final aw0.s0 d;
        public final v20.d1 e;
        public Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public qv0.c f51941g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public qv0.k f51942h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f51943j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f51944l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f51945m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f51946n;
        public final int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f51947p;

        public Model(aw0.t0 title, aw0.s0 firstButton, aw0.s0 secondButton, v20.d1 d1Var) {
            Intrinsics.checkNotNullParameter("NEED_MORE_HELP_LIST_ID", "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(firstButton, "firstButton");
            Intrinsics.checkNotNullParameter(secondButton, "secondButton");
            qv0.k positionInGroup = qv0.k.OutOfGroup;
            int i = R$attr.uikit_dp12;
            int i2 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter("NEED_MORE_HELP_LIST_ID", "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(firstButton, "firstButton");
            Intrinsics.checkNotNullParameter(secondButton, "secondButton");
            c.d positionInBox = c.d.f249513a;
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
            this.f51938a = "NEED_MORE_HELP_LIST_ID";
            this.f51939b = title;
            this.f51940c = firstButton;
            this.d = secondButton;
            this.e = d1Var;
            this.f = null;
            this.f51941g = positionInBox;
            this.f51942h = positionInGroup;
            this.i = null;
            this.f51943j = null;
            this.k = null;
            this.f51944l = null;
            this.f51945m = i;
            this.f51946n = i;
            this.o = i2;
            this.f51947p = i2;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: C1 */
        public final boolean getE() {
            boolean z = this.f51939b.d;
            return false;
        }

        @Override // qv0.l
        public final void R0(qv0.k kVar) {
            Intrinsics.checkNotNullParameter(kVar, "<set-?>");
            this.f51942h = kVar;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new CellDetailsTwinButtonsDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getK() {
            return this.e;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51938a() {
            return this.f51938a;
        }

        @Override // gx0.a
        public final py0.d d() {
            return new py0.c(this.f51939b.f10536a);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51938a, model.f51938a) && Intrinsics.f(this.f51939b, model.f51939b) && Intrinsics.f(this.f51940c, model.f51940c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f51941g, model.f51941g) && this.f51942h == model.f51942h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f51943j, model.f51943j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f51944l, model.f51944l) && this.f51945m == model.f51945m && this.f51946n == model.f51946n && this.o == model.o && this.f51947p == model.f51947p;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF51945m() {
            return this.f51945m;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: f0, reason: from getter */
        public final qv0.k getF51942h() {
            return this.f51942h;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51945m = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.f;
        }

        public final int hashCode() {
            int iC = j6.a.c((this.d.hashCode() + ((this.f51940c.hashCode() + ((this.f51939b.hashCode() + (this.f51938a.hashCode() * 31)) * 31)) * 31)) * 31, 31, false);
            v20.d1 d1Var = this.e;
            int iHashCode = (iC + (d1Var == null ? 0 : d1Var.hashCode())) * 31;
            Parcelable parcelable = this.f;
            int iHashCode2 = (this.f51942h.hashCode() + h30.l.i(this.f51941g, (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31)) * 31;
            p31.c cVar = this.i;
            int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f51943j;
            int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.k;
            int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f51944l;
            return Integer.hashCode(this.f51947p) + j6.a.b(this.o, j6.a.b(this.f51946n, j6.a.b(this.f51945m, (iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getI() {
            return this.i;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f51941g = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF51943j() {
            return this.f51943j;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.k = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF51946n() {
            return this.f51946n;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF51947p() {
            return this.f51947p;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f51946n = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF51941g() {
            return this.f51941g;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF51944l() {
            return this.f51944l;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getK() {
            return this.k;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.i = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getO() {
            return this.o;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f51943j = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f51944l = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new ip0.r8(!Intrinsics.f(model.f51939b, this.f51939b), !Intrinsics.f(model.f51940c, this.f51940c), !Intrinsics.f(model.d, this.d), or0.b.m(this, (qv0.l) oldItem));
        }
    }

    public CellDetailsTwinButtonsDelegate() {
        super(R$layout.internal_delegate_cell_details_twin_buttons, new ip0.h8(5));
        this.d = v0.a.d("create(...)");
        v0.a.d("create(...)");
        this.e = new e01.a();
        this.f = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.s8(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_twin_buttons));
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate
    public final void q(koi.b bVar, qv0.l lVar, int i, List payloads) {
        ip0.s8 holder = (ip0.s8) bVar;
        Model data = (Model) lVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.q(holder, data, i, payloads);
        SmallActionButton smallActionButton = holder.i;
        SmallActionButton smallActionButton2 = holder.f166322h;
        ImageView imageView = holder.f166321g;
        TextView textView = holder.f;
        ArrayList<ip0.r8> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof ip0.r8) {
                arrayList.add(obj2);
            }
        }
        boolean zIsEmpty = payloads.isEmpty();
        boolean z = zIsEmpty;
        boolean z3 = z;
        for (ip0.r8 r8Var : arrayList) {
            zIsEmpty = zIsEmpty || r8Var.f166142a;
            z = z || r8Var.f166143b;
            z3 = z3 || r8Var.f166144c;
        }
        if (zIsEmpty) {
            xam.a.e(data.f51939b, textView, imageView);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            hx7.b.u(zhm.u.c(hx7.b.f(data.f51939b.f10536a)), itemView);
        }
        if (z) {
            xam.a.d(data.f51940c, smallActionButton2, data.f);
        }
        if (z3) {
            xam.a.d(data.d, smallActionButton, data.f);
        }
        efm.r map = smallActionButton2.f56386h.map(new ip0.w(new ip0.q8(data, 0), 19));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.e.a(map, holder);
        efm.r map2 = smallActionButton.f56386h.map(new ip0.w(new ip0.q8(data, 1), 20));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.f.a(map2, holder);
        boolean z4 = data.f51939b.d;
        if (z4) {
            or0.u.u(textView, data, new j01.c(new View[]{textView, imageView}, data, this.d, null, 24));
        } else {
            or0.u.o(textView);
        }
        if (z4) {
            or0.u.t(imageView, data, new j01.c(new View[]{textView, imageView}, data, this.d, null, 24));
        } else {
            or0.u.o(imageView);
        }
        View view = holder.itemView;
        Intrinsics.h(view);
        or0.u.o(view);
    }
}
