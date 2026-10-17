package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.dk;
import ip0.ql;
import ip0.ul;
import ip0.vl;
import ip0.wl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0007\b\u0003\t\n\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/HeaderDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/HeaderDelegate$Model;", "Lip0/wl;", "<init>", "()V", "Companion", "Model", "ip0/vl", "ip0/ul", "a", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HeaderDelegate extends BaseRecyclerViewDelegate<Model, wl> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f52392c;
    public final e01.a d;
    public final e01.a e;
    public final e01.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e01.a f52393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e01.a f52394h;
    public final ihm.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f52395j;
    public final e01.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e01.a f52396l;

    public static abstract class a {

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.HeaderDelegate$a$a, reason: collision with other inner class name */
        public static final class C0407a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0407a f52418a = new C0407a();

            private C0407a() {
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f52419a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f52420b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f52421c;
            public final boolean d;

            public b() {
                this(31, false, false, false, false);
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return this.f52419a == bVar.f52419a && this.f52420b == bVar.f52420b && this.f52421c == bVar.f52421c && this.d == bVar.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(false) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f52419a) * 31, 31, this.f52420b), 31, this.f52421c), 31, this.d);
            }

            public b(boolean z, boolean z3, boolean z4, boolean z6) {
                this.f52419a = z;
                this.f52420b = z3;
                this.f52421c = z4;
                this.d = z6;
            }

            public /* synthetic */ b(int i, boolean z, boolean z3, boolean z4, boolean z6) {
                this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z3, (i & 4) != 0 ? true : z4, (i & 8) != 0 ? false : z6);
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f52422a = new c();

            private c() {
            }
        }

        private a() {
        }
    }

    public HeaderDelegate() {
        super(R$layout.internal_delegate_header, new dk(7));
        this.f52392c = new e01.a();
        this.d = new e01.a();
        this.e = new e01.a();
        this.f = new e01.a();
        this.f52393g = new e01.a();
        this.f52394h = new e01.a();
        this.i = v0.a.d("create(...)");
        this.f52395j = v0.a.d("create(...)");
        this.k = new e01.a();
        this.f52396l = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        wl wlVar = new wl(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_header));
        wlVar.f.setDescriptionTextStyle(au0.u.CAPTION);
        return wlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05e9  */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(ip0.wl r38, final com.revolut.core.ui_kit.delegates.HeaderDelegate.Model r39, int r40, java.util.List r41) {
        /*
            Method dump skipped, instruction units count: 1526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.HeaderDelegate.p(ip0.wl, com.revolut.core.ui_kit.delegates.HeaderDelegate$Model, int, java.util.List):void");
    }

    public final void q(View view, Model model, boolean z) {
        if (z) {
            view.setOnClickListener(new ap0.f(this, model, 28));
            view.setOnTouchListener(new j01.e(new View[]{view}));
        } else {
            view.setOnTouchListener(null);
            or0.u.o(view);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\b\tJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/HeaderDelegate$Model;", "Lqv0/i;", "Ls31/c;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "a", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, s31.c, qv0.p, TrackableItem {
        public boolean A;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ul f52398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final aw0.s2 f52399c;
        public final Clause d;
        public final Clause e;
        public final TagViewData f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Image f52400g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f52401h;
        public final Clause i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ProgressStyle f52402j;
        public final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final a f52403l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final a f52404m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final tx0.k0 f52405n;
        public final b o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Object f52406p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Parcelable f52407q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public qv0.c f52408r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p31.c f52409s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p31.c f52410t;
        public p31.c u;
        public p31.c v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f52411w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f52412x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f52413y;
        public int z;

        public static abstract class a {

            /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.HeaderDelegate$Model$a$a, reason: collision with other inner class name */
            public static final class C0405a extends a {
                private C0405a() {
                }
            }

            public static final class b extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final b f52414a = new b();

                private b() {
                }
            }

            private a() {
            }
        }

        public static abstract class b {

            public static final class a extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f52415a = new a();

                private a() {
                }
            }

            /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.HeaderDelegate$Model$b$b, reason: collision with other inner class name */
            public static final class C0406b extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0406b f52416a = new C0406b();

                private C0406b() {
                }
            }

            public static final class c extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final c f52417a = new c();

                private c() {
                }
            }

            private b() {
            }
        }

        public Model(String str, ul ulVar, aw0.s2 s2Var, Clause clause, Clause clause2, TagViewData tagViewData, Image image, boolean z, Clause clause3, ProgressStyle progressStyle, boolean z3, a aVar, a aVar2, tx0.k0 k0Var, b bVar, Object obj2) {
            int i = R$attr.uikit_dp0;
            this.f52397a = str;
            this.f52398b = ulVar;
            this.f52399c = s2Var;
            this.d = clause;
            this.e = clause2;
            this.f = tagViewData;
            this.f52400g = image;
            this.f52401h = z;
            this.i = clause3;
            this.f52402j = progressStyle;
            this.k = z3;
            this.f52403l = aVar;
            this.f52404m = aVar2;
            this.f52405n = k0Var;
            this.o = bVar;
            this.f52406p = obj2;
            this.f52407q = null;
            this.f52408r = c.d.f249513a;
            this.f52409s = null;
            this.f52410t = null;
            this.u = null;
            this.v = null;
            this.f52411w = i;
            this.f52412x = i;
            this.f52413y = i;
            this.z = i;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new HeaderDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52276m() {
            return this.f52406p;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52269a() {
            return this.f52397a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52397a, model.f52397a) && Intrinsics.f(this.f52398b, model.f52398b) && Intrinsics.f(this.f52399c, model.f52399c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52400g, model.f52400g) && this.f52401h == model.f52401h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52402j, model.f52402j) && this.k == model.k && Intrinsics.f(this.f52403l, model.f52403l) && Intrinsics.f(this.f52404m, model.f52404m) && this.f52405n == model.f52405n && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f52406p, model.f52406p) && Intrinsics.f(this.f52407q, model.f52407q) && Intrinsics.f(this.f52408r, model.f52408r) && Intrinsics.f(this.f52409s, model.f52409s) && Intrinsics.f(this.f52410t, model.f52410t) && Intrinsics.f(this.u, model.u) && Intrinsics.f(this.v, model.v) && Intrinsics.f(null, null) && this.f52411w == model.f52411w && this.f52412x == model.f52412x && this.f52413y == model.f52413y && this.z == model.z;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52282t() {
            return this.f52411w;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52411w = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52277n() {
            return this.f52407q;
        }

        public final int hashCode() {
            int iHashCode = this.f52397a.hashCode() * 31;
            ul ulVar = this.f52398b;
            int iHashCode2 = (this.f52399c.hashCode() + ((iHashCode + (ulVar == null ? 0 : ulVar.hashCode())) * 31)) * 31;
            Clause clause = this.d;
            int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.e;
            int iHashCode4 = (iHashCode3 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            TagViewData tagViewData = this.f;
            int iHashCode5 = (iHashCode4 + (tagViewData == null ? 0 : tagViewData.hashCode())) * 31;
            Image image = this.f52400g;
            int iC = j6.a.c((iHashCode5 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f52401h);
            Clause clause3 = this.i;
            int iHashCode6 = (iC + (clause3 == null ? 0 : clause3.hashCode())) * 31;
            ProgressStyle progressStyle = this.f52402j;
            int iHashCode7 = (this.o.hashCode() + ((this.f52405n.hashCode() + ((this.f52404m.hashCode() + ((this.f52403l.hashCode() + j6.a.c((iHashCode6 + (progressStyle == null ? 0 : progressStyle.hashCode())) * 31, 31, this.k)) * 31)) * 31)) * 31)) * 31;
            Object obj2 = this.f52406p;
            int iHashCode8 = (iHashCode7 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52407q;
            int i = h30.l.i(this.f52408r, (iHashCode8 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f52409s;
            int iHashCode9 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52410t;
            int iHashCode10 = (iHashCode9 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.u;
            int iHashCode11 = (iHashCode10 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.v;
            return Integer.hashCode(this.z) + j6.a.b(this.f52413y, j6.a.b(this.f52412x, j6.a.b(this.f52411w, (((iHashCode11 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31) + 0) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52278p() {
            return this.f52409s;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52408r = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52279q() {
            return this.f52410t;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.u = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getU() {
            return this.f52412x;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52283w() {
            return this.z;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52412x = i;
        }

        @Override // s31.c
        public final hx7.i p() {
            return null;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getO() {
            return this.f52408r;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52281s() {
            return this.v;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52280r() {
            return this.u;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52409s = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52407q = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getV() {
            return this.f52413y;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52410t = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.v = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (!(oldItem instanceof Model)) {
                return null;
            }
            Model model = (Model) oldItem;
            aw0.s2 s2Var = model.f52399c;
            boolean z4 = !Intrinsics.f(model.f52398b, this.f52398b);
            aw0.s2 s2Var2 = this.f52399c;
            boolean z6 = !Intrinsics.f(s2Var, s2Var2);
            boolean z11 = !Intrinsics.f(model.e, this.e);
            boolean z12 = model.k != this.k;
            aw0.q2 q2Var = s2Var instanceof aw0.q2 ? (aw0.q2) s2Var : null;
            String str = q2Var != null ? q2Var.f10485c : null;
            aw0.q2 q2Var2 = s2Var2 instanceof aw0.q2 ? (aw0.q2) s2Var2 : null;
            boolean z29 = !Intrinsics.f(str, q2Var2 != null ? q2Var2.f10485c : null);
            boolean z31 = !Intrinsics.f(model.d, this.d);
            if (Intrinsics.f(model.f52400g, this.f52400g) && model.f52401h == this.f52401h) {
                z = z12;
                z3 = false;
            } else {
                z = z12;
                z3 = true;
            }
            return new vl(z4, z6, z11, z, z29, z31, z3, !Intrinsics.f(model.i, this.i), !Intrinsics.f(model.f52402j, this.f52402j), !Intrinsics.f(model.f52404m, this.f52404m), or0.b.l(this, (qv0.i) oldItem), model.f52405n != this.f52405n, !Intrinsics.f(model.o, this.o), !Intrinsics.f(model.f, this.f));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, ul ulVar, aw0.s2 complexTitle, TagViewData tagViewData, Clause clause, Clause clause2, ProgressStyle progressStyle, a aVar, Object obj2, tx0.k0 k0Var, b bVar, int i) {
            TagViewData tagViewData2 = (i & 16) != 0 ? null : tagViewData;
            Clause clause3 = (i & 32) != 0 ? null : clause;
            Clause clause4 = (i & 256) != 0 ? null : clause2;
            ProgressStyle progressStyle2 = (i & 512) != 0 ? null : progressStyle;
            a clicksTarget = (i & 2048) != 0 ? new a.b(31, false, false, false, false) : aVar;
            Object obj3 = (i & 4096) != 0 ? null : obj2;
            tx0.k0 titleStyle = (32768 & i) != 0 ? tx0.k0.SMALL : k0Var;
            b style = (i & 65536) != 0 ? b.C0406b.f52416a : bVar;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(complexTitle, "complexTitle");
            Intrinsics.checkNotNullParameter(clicksTarget, "clicksTarget");
            a.b state = a.b.f52414a;
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
            Intrinsics.checkNotNullParameter(style, "style");
            this(listId, ulVar, complexTitle, clause3, null, tagViewData2, null, false, clause4, progressStyle2, false, clicksTarget, state, titleStyle, style, obj3);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, ql qlVar, aw0.s2 complexTitle, Clause clause, Clause clause2, boolean z, tx0.k0 k0Var, boolean z3, boolean z4, int i) {
            a bVar;
            Clause clause3 = (i & 256) != 0 ? null : clause2;
            tx0.k0 titleStyle = (i & 2048) != 0 ? tx0.k0.SMALL : k0Var;
            boolean z6 = (i & 8192) != 0 ? false : z4;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(complexTitle, "complexTitle");
            Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
            a.b state = a.b.f52414a;
            Intrinsics.checkNotNullParameter(state, "state");
            if (!z3 && !z6) {
                bVar = a.c.f52422a;
            } else {
                bVar = new a.b(16, z3, z3, z3, z6);
            }
            this(listId, qlVar, complexTitle, clause, null, null, null, false, clause3, null, z, bVar, state, titleStyle, b.C0406b.f52416a, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, LayeredImage layeredImage, aw0.s2 complexTitle, Clause clause, Clause clause2, tx0.k0 k0Var, boolean z, int i) {
            LayeredImage layeredImage2 = (i & 2) != 0 ? null : layeredImage;
            Clause clause3 = (i & 8) != 0 ? null : clause;
            Clause clause4 = (i & 32) != 0 ? null : clause2;
            boolean z3 = (i & 256) != 0;
            tx0.k0 titleStyle = (i & 512) != 0 ? tx0.k0.SMALL : k0Var;
            boolean z4 = (i & 1024) != 0;
            boolean z6 = (i & 2048) != 0 ? false : z;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(complexTitle, "complexTitle");
            Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
            a.b state = a.b.f52414a;
            Intrinsics.checkNotNullParameter(state, "state");
            this(listId, layeredImage2 != null ? new ql(4, layeredImage2.d, layeredImage2) : null, complexTitle, clause3, clause4, z3, titleStyle, z4, z6, 32768);
        }
    }
}
