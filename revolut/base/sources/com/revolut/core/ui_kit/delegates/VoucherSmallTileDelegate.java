package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fo0;
import ip0.io0;
import ip0.jo0;
import ip0.kt;
import ip0.qn0;
import ip0.qo0;
import ip0.ro0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.StandardBiometricHeader;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u000e\u0003\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/VoucherSmallTileDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/VoucherSmallTileDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/dj;", "<init>", "()V", "Companion", "Model", "ip0/fo0", "c", "ip0/ho0", "ip0/ro0", "d", "f", "e", "ip0/go0", "a", "ip0/jo0", "ip0/io0", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VoucherSmallTileDelegate extends BaseRecyclerViewDelegate<Model, dj> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final aw0.d0 e = new aw0.d0(167, StandardBiometricHeader.JTC1_SC37_FORMAT_OWNER_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53608c;
    public final ihm.f d;

    public static abstract class a {
        private a() {
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static abstract class c {
        private c() {
        }
    }

    public static abstract class d {

        public static final class b extends d {
            public final boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof b);
            }

            public final int hashCode() {
                return 0;
            }
        }

        public static final class c extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f53627a = new c();

            private c() {
            }
        }

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate$d$d, reason: collision with other inner class name */
        public static final class C0430d extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0430d f53628a = new C0430d();

            private C0430d() {
            }
        }

        private d() {
        }

        public static final class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final bj f53626a;

            public a(aj ajVar) {
                this.f53626a = ajVar;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && Intrinsics.f(this.f53626a, ((a) obj2).f53626a);
            }

            public final int hashCode() {
                if (this.f53626a == null) {
                    return 0;
                }
                return Boolean.hashCode(true);
            }

            public a() {
                this(null);
            }
        }
    }

    public static abstract class e {
        private e() {
        }
    }

    public static abstract class f {
        private f() {
        }
    }

    public VoucherSmallTileDelegate() {
        super(R$layout.internal_delegate_voucher_small_tile, new qn0(4));
        this.f53608c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new dj(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(dj holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TagView tagView = holder.f54061n;
        UiKitMediaView uiKitMediaView = holder.f54063q;
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        ArrayList<io0> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof io0) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            holder.F(data.o);
            holder.N(data.f53610b);
            holder.a0(data);
            holder.Y(data.B);
            holder.W(data);
            int i2 = data.f53618p;
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iW = kli.a.w(i2, context);
            uiKitMediaView.setPadding(iW, iW, iW, iW);
            Integer num = data.f53619q;
            if (num != null) {
                Context context2 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                uiKitMediaView.setBackgroundColor(kli.a.s(num.intValue(), context2));
            } else {
                uiKitMediaView.setBackgroundColor(0);
            }
            holder.S(data.f53611c);
            holder.U(data.d);
            holder.R(data.e);
            holder.P(data);
            holder.O(data.f53613h);
            ro0 ro0Var = data.k;
            TagViewData tag2 = ro0Var != null ? ro0Var.getTag() : null;
            tagView.setVisibility(tag2 != null ? 0 : 8);
            if (tag2 != null) {
                tagView.setContent(tag2);
            }
            boolean z = ro0Var instanceof qo0;
            holder.M(z);
            qo0 qo0Var = z ? (qo0) ro0Var : null;
            holder.J(qo0Var != null ? qo0Var.f166037b : null);
            holder.I(data.i);
            holder.K(data.f53614j);
            q(holder, data);
            return;
        }
        for (io0 io0Var : arrayList) {
            boolean z3 = io0Var.f164727l;
            boolean z4 = io0Var.f164730p;
            boolean z6 = io0Var.f164726j;
            if (z3) {
                holder.F(data.o);
            }
            if (io0Var.f164721a) {
                holder.N(data.f53610b);
            }
            if (io0Var.f164728m) {
                int i3 = data.f53618p;
                Context context3 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                int iW2 = kli.a.w(i3, context3);
                uiKitMediaView.setPadding(iW2, iW2, iW2, iW2);
            }
            if (io0Var.f164729n) {
                Integer num2 = data.f53619q;
                if (num2 != null) {
                    Context context4 = holder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    uiKitMediaView.setBackgroundColor(kli.a.s(num2.intValue(), context4));
                } else {
                    uiKitMediaView.setBackgroundColor(0);
                }
            }
            if (io0Var.f164722b) {
                holder.S(data.f53611c);
            }
            if (io0Var.f164723c) {
                holder.U(data.d);
            }
            if (io0Var.d) {
                holder.R(data.e);
            }
            if (io0Var.e || io0Var.f) {
                holder.P(data);
            }
            if (io0Var.f164724g) {
                holder.O(data.f53613h);
                holder.W(data);
            }
            if (io0Var.f164725h) {
                holder.I(data.i);
            }
            if (io0Var.i) {
                holder.K(data.f53614j);
            }
            if (z6) {
                holder.a0(data);
                if (io0Var.k) {
                    holder.itemView.sendAccessibilityEvent(2048);
                }
            }
            if (io0Var.o) {
                ro0 ro0Var2 = data.k;
                TagViewData tag3 = ro0Var2 != null ? ro0Var2.getTag() : null;
                tagView.setVisibility(tag3 != null ? 0 : 8);
                if (tag3 != null) {
                    tagView.setContent(tag3);
                }
                boolean z11 = ro0Var2 instanceof qo0;
                holder.M(z11);
                qo0 qo0Var2 = z11 ? (qo0) ro0Var2 : null;
                holder.J(qo0Var2 != null ? qo0Var2.f166037b : null);
            }
            if (z4) {
                holder.Y(data.B);
            }
            if (z4) {
                holder.Z(data);
            }
            if (io0Var.f164731q || z6) {
                q(holder, data);
            }
        }
    }

    public final void q(dj djVar, Model model) {
        Model model2;
        fp0.p pVar = djVar.H;
        boolean z = model.f53617n;
        Clause clause = model.f53611c;
        py0.c cVar = clause != null ? new py0.c(clause) : null;
        fp0.p.b(pVar, z);
        View view = pVar.f137029a;
        or0.m.a(view);
        if (z) {
            model2 = model;
            view.setOnClickListener(new kt(model2, cVar, this, model, 26));
        } else {
            model2 = model;
            or0.u.o(view);
        }
        fp0.p pVar2 = djVar.I;
        boolean z3 = model2.f53617n;
        fp0.p.b(pVar2, z3);
        View view2 = pVar2.f137029a;
        or0.m.a(view2);
        if (z3) {
            view2.setOnClickListener(new au0.r2(this, model2, 12));
        } else {
            or0.u.o(view2);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/VoucherSmallTileDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem {
        public p31.c A;
        public qv0.c B;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f53610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f53611c;
        public final f d;
        public final e e;
        public final Clause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Image f53612g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Image f53613h;
        public final a i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final jo0 f53614j;
        public final ro0 k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f53615l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final d f53616m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f53617n;
        public final fo0 o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f53618p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Integer f53619q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Parcelable f53620r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f53621s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f53622t;
        public final int u;
        public final int v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final Object f53623w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public p31.c f53624x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public p31.c f53625y;
        public p31.c z;

        public Model(String str, c cVar, Clause clause, f fVar, e eVar, Clause clause2, Image image, Image image2, a aVar, jo0 jo0Var, ro0 ro0Var, boolean z, d dVar, boolean z3, fo0 fo0Var, int i, Integer num, Parcelable parcelable, int i2, int i3, int i5, int i6, Object obj2, p31.c cVar2, p31.c cVar3, p31.c cVar4, p31.c cVar5, qv0.c cVar6) {
            this.f53609a = str;
            this.f53610b = cVar;
            this.f53611c = clause;
            this.d = fVar;
            this.e = eVar;
            this.f = clause2;
            this.f53612g = image;
            this.f53613h = image2;
            this.i = aVar;
            this.f53614j = jo0Var;
            this.k = ro0Var;
            this.f53615l = z;
            this.f53616m = dVar;
            this.f53617n = z3;
            this.o = fo0Var;
            this.f53618p = i;
            this.f53619q = num;
            this.f53620r = parcelable;
            this.f53621s = i2;
            this.f53622t = i3;
            this.u = i5;
            this.v = i6;
            this.f53623w = obj2;
            this.f53624x = cVar2;
            this.f53625y = cVar3;
            this.z = cVar4;
            this.A = cVar5;
            this.B = cVar6;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new VoucherSmallTileDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52406p() {
            return this.f53623w;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52397a() {
            return this.f53609a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53609a, model.f53609a) && Intrinsics.f(this.f53610b, model.f53610b) && Intrinsics.f(this.f53611c, model.f53611c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f53612g, model.f53612g) && Intrinsics.f(this.f53613h, model.f53613h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f53614j, model.f53614j) && Intrinsics.f(this.k, model.k) && this.f53615l == model.f53615l && Intrinsics.f(this.f53616m, model.f53616m) && this.f53617n == model.f53617n && Intrinsics.f(this.o, model.o) && this.f53618p == model.f53618p && Intrinsics.f(this.f53619q, model.f53619q) && Intrinsics.f(this.f53620r, model.f53620r) && this.f53621s == model.f53621s && this.f53622t == model.f53622t && this.u == model.u && this.v == model.v && Intrinsics.f(this.f53623w, model.f53623w) && Intrinsics.f(this.f53624x, model.f53624x) && Intrinsics.f(this.f53625y, model.f53625y) && Intrinsics.f(this.z, model.z) && Intrinsics.f(this.A, model.A) && Intrinsics.f(this.B, model.B);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52411w() {
            return this.f53621s;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53621s = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52407q() {
            return this.f53620r;
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + p.a.a((this.f53610b.hashCode() + (this.f53609a.hashCode() * 31)) * 31, 31, this.f53611c)) * 31)) * 31;
            Clause clause = this.f;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Image image = this.f53612g;
            int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
            Image image2 = this.f53613h;
            int iHashCode4 = (iHashCode3 + (image2 == null ? 0 : image2.hashCode())) * 31;
            a aVar = this.i;
            int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            jo0 jo0Var = this.f53614j;
            int iHashCode6 = (iHashCode5 + (jo0Var == null ? 0 : jo0Var.hashCode())) * 31;
            ro0 ro0Var = this.k;
            int iC = j6.a.c((this.f53616m.hashCode() + j6.a.c((iHashCode6 + (ro0Var == null ? 0 : ro0Var.hashCode())) * 31, 31, this.f53615l)) * 31, 31, this.f53617n);
            fo0 fo0Var = this.o;
            int iB = j6.a.b(this.f53618p, (iC + (fo0Var == null ? 0 : fo0Var.hashCode())) * 31, 31);
            Integer num = this.f53619q;
            int iHashCode7 = (iB + (num == null ? 0 : num.hashCode())) * 31;
            Parcelable parcelable = this.f53620r;
            int iB2 = j6.a.b(this.v, j6.a.b(this.u, j6.a.b(this.f53622t, j6.a.b(this.f53621s, (iHashCode7 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31), 31), 31);
            Object obj2 = this.f53623w;
            int iHashCode8 = (iB2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            p31.c cVar = this.f53624x;
            int iHashCode9 = (iHashCode8 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f53625y;
            int iHashCode10 = (iHashCode9 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.z;
            int iHashCode11 = (iHashCode10 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.A;
            return this.B.hashCode() + ((iHashCode11 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52409s() {
            return this.f53624x;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.B = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52410t() {
            return this.f53625y;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.z = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52412x() {
            return this.f53622t;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getZ() {
            return this.v;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53622t = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52408r() {
            return this.B;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getV() {
            return this.A;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getU() {
            return this.z;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f53624x = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53620r = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52413y() {
            return this.u;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f53625y = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.A = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            d dVar = model.f53616m;
            boolean z = !Intrinsics.f(this.f53610b, model.f53610b);
            boolean z3 = !Intrinsics.f(this.f53611c, model.f53611c);
            boolean z4 = !Intrinsics.f(this.d, model.d);
            boolean z6 = !Intrinsics.f(this.e, model.e);
            boolean z11 = !Intrinsics.f(this.f, model.f);
            boolean z12 = !Intrinsics.f(this.f53612g, model.f53612g);
            boolean z29 = !Intrinsics.f(this.f53613h, model.f53613h);
            boolean z31 = !Intrinsics.f(this.i, model.i);
            boolean z41 = !Intrinsics.f(this.f53614j, model.f53614j);
            d dVar2 = this.f53616m;
            boolean z49 = !Intrinsics.f(dVar2, dVar);
            boolean z54 = false;
            boolean z74 = (dVar2 instanceof d.C0430d) != (dVar instanceof d.C0430d);
            boolean z83 = !Intrinsics.f(this.o, model.o);
            if (this.f53618p != model.f53618p) {
                z54 = true;
            }
            return new io0(z, z3, z4, z6, z11, z12, z29, z31, z41, z49, z74, z83, z54, !Intrinsics.f(this.f53619q, model.f53619q), !Intrinsics.f(this.k, model.k), !Intrinsics.f(this.B, model.B), this.f53617n != model.f53617n);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, zi voucherContent, Clause voucherTitle, f fVar, ej ejVar, Clause clause, Image image, a aVar, jo0 jo0Var, ro0 ro0Var, d dVar, boolean z, fo0 fo0Var, AnalyticsContext analyticsContext, Object obj2, int i) {
            f voucherTitleLines = (i & 8) != 0 ? new hj(1) : fVar;
            e voucherSubtitleLines = (i & 16) != 0 ? new fj() : ejVar;
            Clause clause2 = (i & 32) != 0 ? null : clause;
            Image image2 = (i & 128) != 0 ? null : image;
            a aVar2 = (i & 256) != 0 ? null : aVar;
            jo0 jo0Var2 = (i & 512) != 0 ? null : jo0Var;
            ro0 ro0Var2 = (i & 1024) != 0 ? null : ro0Var;
            boolean z3 = (i & 2048) != 0;
            d state = (i & 4096) != 0 ? new d.a(null) : dVar;
            boolean z4 = (i & 8192) != 0 ? true : z;
            fo0 fo0Var2 = (i & 16384) != 0 ? null : fo0Var;
            int i2 = R$attr.uikit_dp0;
            AnalyticsContext analyticsContext2 = (i & 131072) != 0 ? null : analyticsContext;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(voucherContent, "voucherContent");
            Intrinsics.checkNotNullParameter(voucherTitle, "voucherTitle");
            Intrinsics.checkNotNullParameter(voucherTitleLines, "voucherTitleLines");
            Intrinsics.checkNotNullParameter(voucherSubtitleLines, "voucherSubtitleLines");
            Intrinsics.checkNotNullParameter(state, "state");
            int i3 = R$attr.uikit_dp0;
            this(listId, voucherContent, voucherTitle, voucherTitleLines, voucherSubtitleLines, clause2, null, image2, aVar2, jo0Var2, ro0Var2, z3, state, z4, fo0Var2, i2, null, analyticsContext2, i3, i3, i3, i3, obj2, null, null, null, null, c.d.f249513a);
        }
    }
}
