package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.dh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.je0;
import ip0.wg0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0007\b\u0003\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SplitColumnCellDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseGroupRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/SplitColumnCellDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/jh;", "<init>", "()V", "Companion", "Model", "ip0/wg0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SplitColumnCellDelegate extends BaseGroupRecyclerViewDelegate<Model, jh> {
    public final ihm.f d;
    public final ihm.f e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SplitColumnCellDelegate$Model;", "Lqv0/l;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "a", "com/revolut/core/ui_kit/delegates/eh", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.l, TrackableItem, qv0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextClause f53451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f53452c;
        public final a d;
        public final boolean e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Image f53453g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final eh f53454h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f53455j;
        public final dh k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Object f53456l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f53457m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f53458n;
        public final int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f53459p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public qv0.c f53460q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f53461r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p31.c f53462s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p31.c f53463t;
        public p31.c u;
        public Parcelable v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public qv0.k f53464w;

        public static abstract class a {

            /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate$Model$a$a, reason: collision with other inner class name */
            public static final class C0426a extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0426a f53465a = new C0426a();

                private C0426a() {
                }
            }

            private a() {
            }
        }

        public Model(String listId, TextClause title, a value, TextClause textClause, boolean z, boolean z3, UrlImage urlImage, boolean z4, boolean z6, Object obj2, int i) {
            TextClause textClause2 = (i & 8) != 0 ? null : textClause;
            boolean z11 = (i & 16) != 0 ? true : z;
            boolean z12 = (i & 64) != 0 ? false : z3;
            UrlImage urlImage2 = (i & 128) != 0 ? null : urlImage;
            eh titleTextAlignment = eh.START;
            boolean z29 = (i & 1024) == 0 ? z4 : true;
            boolean z31 = (i & 2048) == 0 ? z6 : false;
            Object obj3 = (i & 8192) != 0 ? null : obj2;
            int i2 = R$attr.uikit_dp0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(titleTextAlignment, "titleTextAlignment");
            dh.b columnsWidthsMode = dh.b.f54054a;
            Intrinsics.checkNotNullParameter(columnsWidthsMode, "columnsWidthsMode");
            qv0.k kVar = qv0.k.OutOfGroup;
            this.f53450a = listId;
            this.f53451b = title;
            this.f53452c = textClause2;
            this.d = value;
            this.e = z11;
            this.f = z12;
            this.f53453g = urlImage2;
            this.f53454h = titleTextAlignment;
            this.i = z29;
            this.f53455j = z31;
            this.k = columnsWidthsMode;
            this.f53456l = obj3;
            this.f53457m = i2;
            this.f53458n = i2;
            this.o = i2;
            this.f53459p = i2;
            this.f53460q = c.d.f249513a;
            this.f53461r = null;
            this.f53462s = null;
            this.f53463t = null;
            this.u = null;
            this.v = null;
            this.f53464w = kVar;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: C1, reason: from getter */
        public final boolean getF() {
            return this.f;
        }

        @Override // qv0.l
        public final void R0(qv0.k kVar) {
            Intrinsics.checkNotNullParameter(kVar, "<set-?>");
            this.f53464w = kVar;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new SplitColumnCellDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF53456l() {
            return this.f53456l;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53450a() {
            return this.f53450a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53450a, model.f53450a) && Intrinsics.f(this.f53451b, model.f53451b) && Intrinsics.f(this.f53452c, model.f53452c) && Intrinsics.f(this.d, model.d) && this.e == model.e && this.f == model.f && Intrinsics.f(this.f53453g, model.f53453g) && this.f53454h == model.f53454h && this.i == model.i && this.f53455j == model.f53455j && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f53456l, model.f53456l) && this.f53457m == model.f53457m && this.f53458n == model.f53458n && this.o == model.o && this.f53459p == model.f53459p && Intrinsics.f(this.f53460q, model.f53460q) && Intrinsics.f(this.f53461r, model.f53461r) && Intrinsics.f(this.f53462s, model.f53462s) && Intrinsics.f(this.f53463t, model.f53463t) && Intrinsics.f(this.u, model.u) && Intrinsics.f(this.v, model.v) && this.f53464w == model.f53464w;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF53457m() {
            return this.f53457m;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: f0, reason: from getter */
        public final qv0.k getF53464w() {
            return this.f53464w;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53457m = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getV() {
            return this.v;
        }

        public final int hashCode() {
            int iB = ip0.v7.b(this.f53450a.hashCode() * 31, 31, this.f53451b);
            Clause clause = this.f53452c;
            int iC = j6.a.c(j6.a.c(j6.a.c((this.d.hashCode() + ((iB + (clause == null ? 0 : clause.hashCode())) * 31)) * 31, 31, this.e), 31, false), 31, this.f);
            Image image = this.f53453g;
            int iHashCode = (this.k.hashCode() + j6.a.c(j6.a.c((this.f53454h.hashCode() + ((iC + (image == null ? 0 : image.hashCode())) * 961)) * 31, 31, this.i), 31, this.f53455j)) * 31;
            Object obj2 = this.f53456l;
            int i = h30.l.i(this.f53460q, j6.a.b(this.f53459p, j6.a.b(this.o, j6.a.b(this.f53458n, j6.a.b(this.f53457m, (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31), 31), 31), 31), 31);
            p31.c cVar = this.f53461r;
            int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f53462s;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f53463t;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.u;
            int iHashCode5 = (iHashCode4 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31;
            Parcelable parcelable = this.v;
            return this.f53464w.hashCode() + ((iHashCode5 + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF53461r() {
            return this.f53461r;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53460q = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF53462s() {
            return this.f53462s;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f53463t = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53458n() {
            return this.f53458n;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53459p() {
            return this.f53459p;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53458n = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF53460q() {
            return this.f53460q;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getU() {
            return this.u;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF53463t() {
            return this.f53463t;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f53461r = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.v = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getO() {
            return this.o;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f53462s = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.u = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new wg0(!Intrinsics.f(model.f53451b, this.f53451b), !Intrinsics.f(model.f53452c, this.f53452c), !Intrinsics.f(model.d, this.d), model.e != this.e, false, !Intrinsics.f(model.k, this.k), model.f != this.f, !Intrinsics.f(model.f53453g, this.f53453g), !true, model.i != this.i, model.f53455j != this.f53455j, model.f53454h != this.f53454h, or0.b.m(this, (qv0.l) oldItem));
        }
    }

    public SplitColumnCellDelegate() {
        super(R$layout.internal_delegate_split_column_cell, new je0(18));
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
    }

    public static void r(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.38f);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new jh(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_split_column_cell));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x021d  */
    /* JADX WARN: Type inference failed for: r11v4, types: [android.view.View, com.facebook.shimmer.ShimmerFrameLayout] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [py0.d] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48, types: [int] */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [py0.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [py0.d] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(koi.b r27, qv0.l r28, int r29, java.util.List r30) {
        /*
            Method dump skipped, instruction units count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate.q(koi.b, qv0.l, int, java.util.List):void");
    }
}
