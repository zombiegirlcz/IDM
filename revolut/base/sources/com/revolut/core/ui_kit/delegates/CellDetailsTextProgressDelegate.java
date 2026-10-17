package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsTextProgressDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/CellDetailsTextProgressDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/a3;", "<init>", "()V", "Model", "ip0/m8", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsTextProgressDelegate extends BaseRecyclerViewDelegate<Model, a3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51925c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f51935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f51936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f51937c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(false, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.f51935a == aVar.f51935a && this.f51936b == aVar.f51936b && this.f51937c == aVar.f51937c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f51937c) + j6.a.b(this.f51936b, Boolean.hashCode(this.f51935a) * 31, 31);
        }

        public a(boolean z, int i, int i2) {
            this.f51935a = z;
            this.f51936b = i;
            this.f51937c = i2;
        }

        public /* synthetic */ a(boolean z, int i, int i2, int i3) {
            this((i2 & 1) != 0 ? true : z, R$attr.uikit_colorAccent, (i2 & 4) != 0 ? 0 : i);
        }
    }

    public CellDetailsTextProgressDelegate() {
        super(R$layout.internal_delegate_cell_details_text_progress, new ip0.h8(3));
        this.f51925c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new a3(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_text_progress), this.f51925c);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(a3 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ProgressBar progressBar = holder.f53660j;
        AppCompatImageView appCompatImageView = holder.f53658g;
        TextView textView = holder.f;
        ArrayList<ip0.m8> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof ip0.m8) {
                arrayList.add(obj2);
            }
        }
        boolean zIsEmpty = payloads.isEmpty();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        for (ip0.m8 m8Var : arrayList) {
            zIsEmpty = zIsEmpty || m8Var.f165333a;
            z = z || m8Var.f165334b;
            z3 = z3 || m8Var.f165335c;
            z4 = z4 || m8Var.d;
            z6 = z6 || m8Var.e;
            z11 = z11 || m8Var.f;
            z12 = z12 || m8Var.f165336g;
        }
        if (zIsEmpty) {
            kli.a.b(textView, data.f51927b.f10536a, ty0.f.f275450a);
        }
        if (z) {
            textView.setMaxLines(data.f51927b.f10538c);
        }
        if (z3) {
            zi0.c.g(appCompatImageView, data.f51927b.f10537b);
        }
        if (z4) {
            kli.a.b(holder.f53659h, data.f51928c, ty0.f.f275450a);
        }
        if (z6) {
            kli.a.b(holder.i, data.d, ty0.f.f275450a);
        }
        if (z11) {
            a aVar = data.e;
            if (aVar == null) {
                progressBar.setVisibility(8);
            } else {
                progressBar.setVisibility(0);
                progressBar.setIndeterminate(aVar.f51935a);
                if (!progressBar.isIndeterminate()) {
                    Context context = progressBar.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    or0.u.y(progressBar, 0, 0, 0, kli.a.w(R$attr.uikit_dp16, context), 7);
                    progressBar.setProgressDrawable(holder.f53661l);
                    int i2 = aVar.f51936b;
                    if (holder.f53662m != i2) {
                        Context context2 = holder.itemView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        progressBar.setProgressTintList(ColorStateList.valueOf(kli.a.s(i2, context2)));
                        holder.f53662m = i2;
                    }
                    progressBar.setProgress(aVar.f51937c);
                }
            }
        }
        if (z12) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        gq0.b bVarF = hx7.b.f(data.f51927b.f10536a);
        Clause clause = data.f51928c;
        gq0.b bVarF2 = clause != null ? hx7.b.f(clause) : null;
        Clause clause2 = data.d;
        gq0.d[] elements = {bVarF, bVarF2, clause2 != null ? hx7.b.f(clause2) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        hx7.b.u(kotlin.collections.d.L(elements), itemView2);
        boolean z29 = data.f51927b.d;
        r10.v vVar = holder.k;
        pd.b.q(textView, z29);
        pd.b.h(textView, z29);
        or0.u.n(textView, z29);
        if (z29) {
            or0.u.u(textView, data, vVar.E(data));
        } else {
            or0.u.o(textView);
        }
        pd.b.q(appCompatImageView, z29);
        pd.b.h(appCompatImageView, z29);
        if (z29) {
            or0.u.t(appCompatImageView, data, vVar.E(data));
        } else {
            or0.u.o(appCompatImageView);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsTextProgressDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lgx0/a;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, gx0.a, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final aw0.t0 f51927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f51928c;
        public final Clause d;
        public final a e;
        public qv0.c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p31.c f51929g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p31.c f51930h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f51931j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f51932l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f51933m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f51934n;
        public Parcelable o;

        public Model(String str, aw0.t0 t0Var, Clause clause, Clause clause2, a aVar, int i, int i2, int i3, int i5) {
            this.f51926a = str;
            this.f51927b = t0Var;
            this.f51928c = clause;
            this.d = clause2;
            this.e = aVar;
            this.f = c.d.f249513a;
            this.f51929g = null;
            this.f51930h = null;
            this.i = null;
            this.f51931j = null;
            this.k = i;
            this.f51932l = i2;
            this.f51933m = i3;
            this.f51934n = i5;
            this.o = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new CellDetailsTextProgressDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF51698j() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52508a() {
            return this.f51926a;
        }

        @Override // gx0.a
        public final py0.d d() {
            return new py0.c(this.f51927b.f10536a);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51926a, model.f51926a) && Intrinsics.f(this.f51927b, model.f51927b) && Intrinsics.f(this.f51928c, model.f51928c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f51929g, model.f51929g) && Intrinsics.f(this.f51930h, model.f51930h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f51931j, model.f51931j) && this.k == model.k && this.f51932l == model.f51932l && this.f51933m == model.f51933m && this.f51934n == model.f51934n && Intrinsics.f(this.o, model.o);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getO() {
            return this.k;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.k = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52514l() {
            return this.o;
        }

        public final int hashCode() {
            int iHashCode = (this.f51927b.hashCode() + (this.f51926a.hashCode() * 31)) * 31;
            Clause clause = this.f51928c;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.d;
            int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            a aVar = this.e;
            int i = h30.l.i(this.f, (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 961, 31);
            p31.c cVar = this.f51929g;
            int iHashCode4 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f51930h;
            int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.i;
            int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f51931j;
            int iB = j6.a.b(this.f51934n, j6.a.b(this.f51933m, j6.a.b(this.f51932l, j6.a.b(this.k, (iHashCode6 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 31);
            Parcelable parcelable = this.o;
            return iB + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getK() {
            return this.f51929g;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52666l() {
            return this.f51930h;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.i = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52669p() {
            return this.f51932l;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52671r() {
            return this.f51934n;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f51932l = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52665j() {
            return this.f;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52668n() {
            return this.f51931j;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52667m() {
            return this.i;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f51929g = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.o = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52670q() {
            return this.f51933m;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f51930h = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f51931j = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            aw0.t0 t0Var;
            boolean z;
            boolean z3;
            boolean z4;
            boolean z6;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            Clause clause = model.f51927b.f10536a;
            aw0.t0 t0Var2 = this.f51927b;
            boolean z11 = !Intrinsics.f(clause, t0Var2.f10536a);
            aw0.t0 t0Var3 = model.f51927b;
            if (t0Var3.f10538c != t0Var2.f10538c) {
                t0Var = t0Var3;
                z = true;
            } else {
                t0Var = t0Var3;
                z = false;
            }
            boolean z12 = !Intrinsics.f(t0Var.f10537b, t0Var2.f10537b);
            boolean z29 = !Intrinsics.f(model.f51928c, this.f51928c);
            boolean z31 = !Intrinsics.f(model.d, this.d);
            boolean z41 = !Intrinsics.f(model.e, this.e);
            if (Intrinsics.f(model.f51929g, this.f51929g) && Intrinsics.f(model.f51930h, this.f51930h) && Intrinsics.f(model.i, this.i) && Intrinsics.f(model.f51931j, this.f51931j)) {
                z3 = false;
                z6 = z11;
                z4 = z31;
            } else {
                z3 = true;
                z4 = z31;
                z6 = z11;
            }
            return new ip0.m8(z6, z, z12, z29, z4, z41, z3);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, aw0.t0 cellTitle, Clause clause, TextLocalisedClause textLocalisedClause, a aVar, int i) {
            textLocalisedClause = (i & 8) != 0 ? null : textLocalisedClause;
            int i2 = R$attr.uikit_dp0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
            this(listId, cellTitle, clause, textLocalisedClause, aVar, i2, i2, i2, i2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause cellTitle, Clause clause, a aVar, int i) {
            Clause clause2 = (i & 4) != 0 ? null : clause;
            a aVar2 = (i & 16) != 0 ? null : aVar;
            int i2 = R$attr.uikit_dp0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
            this(listId, new aw0.t0(cellTitle, (Image) null, 1, false, 26), clause2, null, aVar2, i2, i2, i2, i2);
        }
    }
}
