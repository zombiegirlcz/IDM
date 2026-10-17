package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ch0;
import ip0.dh0;
import ip0.je0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0003\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/StreakStepVerticalDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/StreakStepVerticalDelegate$Model;", "Lip0/dh0;", "<init>", "()V", "Model", "ip0/ch0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StreakStepVerticalDelegate extends BaseRecyclerViewDelegate<Model, dh0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53467c;
    public final e01.a d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/StreakStepVerticalDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final aw0.ea f53469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f53470c;
        public final a d;
        public final boolean e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Clause f53471g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f53472h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f53473j;
        public final int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f53474l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public qv0.c f53475m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Object f53476n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f53477p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f53478q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f53479r;

        public static abstract class a {

            /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.StreakStepVerticalDelegate$Model$a$a, reason: collision with other inner class name */
            public static final class C0427a extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0427a f53480a = new C0427a();

                private C0427a() {
                }
            }

            private a() {
            }
        }

        public Model(String listId, aw0.ea state, Clause title, a trailingValue, boolean z, boolean z3, TextClause textClause, cuj.h hVar, int i) {
            z = (i & 16) != 0 ? false : z;
            z3 = (i & 32) != 0 ? false : z3;
            textClause = (i & 64) != 0 ? null : textClause;
            hVar = (i & 512) != 0 ? null : hVar;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(trailingValue, "trailingValue");
            int i2 = R$attr.uikit_dp0;
            int i3 = R$attr.uikit_dp40;
            int i5 = R$attr.uikit_dp16;
            this.f53468a = listId;
            this.f53469b = state;
            this.f53470c = title;
            this.d = trailingValue;
            this.e = z;
            this.f = z3;
            this.f53471g = textClause;
            this.f53472h = null;
            this.i = i2;
            this.f53473j = i3;
            this.k = i5;
            this.f53474l = i5;
            this.f53475m = c.d.f249513a;
            this.f53476n = hVar;
            this.o = null;
            this.f53477p = null;
            this.f53478q = null;
            this.f53479r = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new StreakStepVerticalDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF53476n() {
            return this.f53476n;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53468a() {
            return this.f53468a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53468a, model.f53468a) && this.f53469b.equals(model.f53469b) && this.f53470c.equals(model.f53470c) && this.d.equals(model.d) && this.e == model.e && this.f == model.f && Intrinsics.f(this.f53471g, model.f53471g) && Intrinsics.f(this.f53472h, model.f53472h) && this.i == model.i && this.f53473j == model.f53473j && this.k == model.k && this.f53474l == model.f53474l && Intrinsics.f(this.f53475m, model.f53475m) && Intrinsics.f(this.f53476n, model.f53476n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f53477p, model.f53477p) && Intrinsics.f(this.f53478q, model.f53478q) && Intrinsics.f(this.f53479r, model.f53479r);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getI() {
            return this.i;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.i = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF53472h() {
            return this.f53472h;
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.c((this.d.hashCode() + p.a.b((this.f53469b.hashCode() + (this.f53468a.hashCode() * 31)) * 31, 31, this.f53470c)) * 31, 31, this.e), 31, this.f);
            Clause clause = this.f53471g;
            int iHashCode = (iC + (clause == null ? 0 : clause.hashCode())) * 961;
            Parcelable parcelable = this.f53472h;
            int i = h30.l.i(this.f53475m, j6.a.b(this.f53474l, j6.a.b(this.k, j6.a.b(this.f53473j, j6.a.b(this.i, (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31), 31), 31), 31);
            Object obj2 = this.f53476n;
            int iHashCode2 = (i + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            p31.c cVar = this.o;
            int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f53477p;
            int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f53478q;
            int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f53479r;
            return iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getO() {
            return this.o;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53475m = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF53477p() {
            return this.f53477p;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f53478q = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53473j() {
            return this.f53473j;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53474l() {
            return this.f53474l;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53473j = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF53475m() {
            return this.f53475m;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF53479r() {
            return this.f53479r;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF53478q() {
            return this.f53478q;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.o = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53472h = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getK() {
            return this.k;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f53477p = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f53479r = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            boolean z = true;
            boolean z3 = (this.f53470c.equals(model.f53470c) && Intrinsics.f(this.f53471g, model.f53471g) && this.d.equals(model.d) && this.f53469b.equals(model.f53469b) && this.e == model.e) ? false : true;
            if (!or0.b.l(this, (qv0.i) oldItem) && this.f == model.f) {
                z = false;
            }
            return new ch0(z3, z);
        }
    }

    public StreakStepVerticalDelegate() {
        super(R$id.internal_streak_step_vertical_delegate_type, new je0(20));
        this.f53467c = v0.a.d("create(...)");
        this.d = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ms0.u4 u4Var = new ms0.u4(context, null, 6, 0);
        u4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new dh0(u4Var);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(dh0 holder, Model data, int i, List payloads) {
        StreakStepVerticalDelegate streakStepVerticalDelegate;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ch0)) {
                payloads = null;
                break;
            }
            i2++;
        }
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        if (payloads != null) {
            int size2 = payloads.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ch0 ch0Var = (ch0) payloads.get(i3);
                zN = zN || ch0Var.f163737a;
                zN2 = zN2 || ch0Var.f163738b;
            }
        }
        View view = holder.itemView;
        ms0.u4 u4Var = holder.f;
        Intrinsics.h(view);
        boolean z = data.f;
        or0.m.a(view);
        if (z) {
            view.setOnClickListener(new au0.t1(data, 20, this, data));
        } else {
            or0.u.o(view);
        }
        pd.b.h(view, data.f);
        if (zN) {
            u4Var.setModel(data);
        }
        if (zN2) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            streakStepVerticalDelegate = this;
            or0.b.c(streakStepVerticalDelegate, data, itemView, data.f, null, 24);
        } else {
            streakStepVerticalDelegate = this;
        }
        streakStepVerticalDelegate.d.a(u4Var.f208454l, holder);
    }
}
