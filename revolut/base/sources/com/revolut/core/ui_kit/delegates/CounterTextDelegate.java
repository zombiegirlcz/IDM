package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.a5;
import com.revolut.core.ui_kit.delegates.z4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.FundDetailsScreenContract$Action;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\b\u0007\b\t\n\u000b\f\u0003\rB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CounterTextDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseGroupRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/CounterTextDelegate$Model;", "Lip0/td;", "<init>", "()V", "Companion", "Model", "c", "ip0/sd", "d", "a", "ip0/nd", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CounterTextDelegate extends BaseGroupRecyclerViewDelegate<Model, ip0.td> {
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f52157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e01.a f52158h;

    public static abstract class a {

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.CounterTextDelegate$a$a, reason: collision with other inner class name */
        public static final class C0400a extends a {
            private C0400a() {
            }
        }

        private a() {
        }
    }

    public static abstract class c {

        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f52173a = new a();

            private a() {
            }
        }

        private c() {
        }
    }

    public static abstract class d {

        public static abstract class a extends d {
            private a() {
            }
        }

        public static abstract class b extends d {

            public static final class a extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final y4 f52174a;

                public a() {
                    this(0);
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof a) && this.f52174a == ((a) obj2).f52174a;
                }

                public final int hashCode() {
                    return this.f52174a.hashCode();
                }

                public a(int i) {
                    y4 size = y4.Small;
                    Intrinsics.checkNotNullParameter(size, "size");
                    this.f52174a = size;
                }
            }

            /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.CounterTextDelegate$d$b$b, reason: collision with other inner class name */
            public static final class C0401b extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0401b f52175a = new C0401b();

                private C0401b() {
                }
            }

            private b() {
            }
        }

        private d() {
        }
    }

    public CounterTextDelegate() {
        super(R$layout.internal_delegate_counter_text, new ip0.lb(12));
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.f52157g = v0.a.d("create(...)");
        this.f52158h = new e01.a();
    }

    public static void r(View view, boolean z) {
        float f;
        float f4;
        if (z) {
            f = 12.0f;
            f4 = 16.0f;
        } else {
            f = 8.0f;
            f4 = 20.0f;
        }
        or0.u.z(view, 0, com.google.android.gms.internal.mlkit_vision_face.a.a(view, "getContext(...)", f), 0, com.google.android.gms.internal.mlkit_vision_face.a.a(view, "getContext(...)", f4), false, 21);
    }

    public static void s(View view, y4 y4Var) {
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, y4Var.a());
        if (view.getLayoutParams().width == iK && view.getLayoutParams().height == iK) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = iK;
        layoutParams.height = iK;
        view.setLayoutParams(layoutParams);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.td(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_counter_text));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0490  */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31, types: [int] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r2v25, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r38v0, types: [com.revolut.core.ui_kit.delegates.CounterTextDelegate, com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.revolut.core.ui_kit.internal.views.LinearGaugeChartView] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View, com.revolut.core.ui_kit.internal.views.SmallActionButton] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [int] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, com.facebook.shimmer.ShimmerFrameLayout] */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v9, types: [android.view.View] */
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
    public final void q(koi.b r39, qv0.l r40, int r41, java.util.List r42) {
        /*
            Method dump skipped, instruction units count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.CounterTextDelegate.q(koi.b, qv0.l, int, java.util.List):void");
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \b2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\tJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CounterTextDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/l;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem, qv0.l {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f52160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final w4 f52161c;
        public final ip0.pd d;
        public final ip0.sd e;
        public final a f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f52162g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f52163h;
        public final uw0.i i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object f52164j;
        public qv0.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f52165l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f52166m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f52167n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f52168p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f52169q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f52170r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f52171s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Parcelable f52172t;
        public qv0.k u;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.CounterTextDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static Model a(Companion companion, String listId, d.a aVar, Clause clause, Clause clause2, a aVar2, Object obj2, int i, int i2, int i3) {
                d.a aVar3 = (i3 & 2) != 0 ? null : aVar;
                Clause clause3 = (i3 & 4) != 0 ? null : clause;
                Clause clause4 = (i3 & 8) != 0 ? null : clause2;
                a aVar4 = (i3 & 16) != 0 ? null : aVar2;
                boolean z = (i3 & 32) == 0;
                Object obj3 = (i3 & 64) != 0 ? null : obj2;
                int i5 = R$attr.uikit_dp16;
                int i6 = (i3 & 1024) != 0 ? i5 : i;
                int i21 = (i3 & 2048) != 0 ? i5 : i2;
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                ip0.od odVar = null;
                w4 w4Var = w4.LARGE;
                ip0.qd qdVar = clause3 != null ? new ip0.qd(clause3, ip0.rd.LARGE) : null;
                if (clause4 != null) {
                    odVar = new ip0.od(clause4);
                }
                return new Model(listId, aVar3, w4Var, null, new ip0.sd(qdVar, odVar), aVar4, z, new uw0.i(listId, uw0.g.UNTIL_ANY_FINISHED, false), obj3, i5, i5, i6, i21, null, 1080456);
            }

            public static Model b(Companion companion, String listId, d dVar, int i, int i2, int i3, int i5, int i6) {
                d dVar2 = (i6 & 2) != 0 ? d.b.C0401b.f52175a : dVar;
                z4.a aVar = (i6 & 4) != 0 ? null : z4.a.f55673a;
                int i21 = (i6 & 8) != 0 ? R$attr.uikit_dp16 : i;
                int i22 = (i6 & 16) != 0 ? R$attr.uikit_dp16 : i2;
                int i32 = (i6 & 32) != 0 ? R$attr.uikit_dp16 : i3;
                int i33 = (i6 & 64) != 0 ? R$attr.uikit_dp16 : i5;
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                return new Model(listId, dVar2, w4.LARGE, null, new ip0.sd(a5.a.f53666a, aVar), null, false, null, null, i21, i22, i32, i33, null, 1605512);
            }

            public static Model c(Companion companion, String listId, Clause topLabel, Clause valueTitle, Clause clause, boolean z, int i) {
                Clause clause2 = (i & 8) != 0 ? null : clause;
                boolean z3 = (i & 16) != 0 ? false : z;
                int i2 = R$attr.uikit_dp16;
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(topLabel, "topLabel");
                Intrinsics.checkNotNullParameter(valueTitle, "valueTitle");
                return new Model(listId, new x4(topLabel), w4.LARGE, null, new ip0.sd(new ip0.qd(valueTitle, ip0.rd.SMALL), clause2 != null ? new ip0.od(clause2) : null), null, z3, null, null, i2, i2, i2, i2, null, 1080712);
            }

            public static Model d(Companion companion, String listId, TextLocalisedClause topLabel, NumberClause valueTitle, int i, int i2) {
                int i3 = R$attr.uikit_dp16;
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(topLabel, "topLabel");
                Intrinsics.checkNotNullParameter(valueTitle, "valueTitle");
                return new Model(listId, new x4(topLabel), w4.SMALL, null, new ip0.sd(new ip0.qd(valueTitle, ip0.rd.SMALL), null), null, false, null, null, i, i2, i3, i3, null, 1080712);
            }

            public static Model e(Companion companion, String listId, Clause topLabel, Clause bottomLabel, FundDetailsScreenContract$Action fundDetailsScreenContract$Action, int i) {
                boolean z = (i & 8) == 0;
                FundDetailsScreenContract$Action fundDetailsScreenContract$Action2 = (i & 16) != 0 ? null : fundDetailsScreenContract$Action;
                int i2 = R$attr.uikit_dp16;
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(topLabel, "topLabel");
                Intrinsics.checkNotNullParameter(bottomLabel, "bottomLabel");
                return new Model(listId, new x4(topLabel), w4.SMALL, ip0.pd.SUBTLE, new ip0.sd(null, new ip0.od(bottomLabel)), null, z, null, fundDetailsScreenContract$Action2, i2, i2, i2, i2, null, 1080704);
            }
        }

        public Model(String str, d dVar, w4 w4Var, ip0.pd pdVar, ip0.sd sdVar, a aVar, boolean z, boolean z3, uw0.i iVar, Object obj2, qv0.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, p31.c cVar5, int i, int i2, int i3, int i5, Parcelable parcelable, qv0.k kVar) {
            this.f52159a = str;
            this.f52160b = dVar;
            this.f52161c = w4Var;
            this.d = pdVar;
            this.e = sdVar;
            this.f = aVar;
            this.f52162g = z;
            this.f52163h = z3;
            this.i = iVar;
            this.f52164j = obj2;
            this.k = cVar;
            this.f52165l = cVar2;
            this.f52166m = cVar3;
            this.f52167n = cVar4;
            this.o = cVar5;
            this.f52168p = i;
            this.f52169q = i2;
            this.f52170r = i3;
            this.f52171s = i5;
            this.f52172t = parcelable;
            this.u = kVar;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: C1, reason: from getter */
        public final boolean getF52234l() {
            return this.f52162g;
        }

        @Override // qv0.l
        public final void R0(qv0.k kVar) {
            Intrinsics.checkNotNullParameter(kVar, "<set-?>");
            this.u = kVar;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new CounterTextDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55231n() {
            return this.f52164j;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53422a() {
            return this.f52159a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52159a, model.f52159a) && Intrinsics.f(this.f52160b, model.f52160b) && this.f52161c == model.f52161c && this.d == model.d && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f52162g == model.f52162g && this.f52163h == model.f52163h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52164j, model.f52164j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52165l, model.f52165l) && Intrinsics.f(this.f52166m, model.f52166m) && Intrinsics.f(this.f52167n, model.f52167n) && Intrinsics.f(this.o, model.o) && this.f52168p == model.f52168p && this.f52169q == model.f52169q && this.f52170r == model.f52170r && this.f52171s == model.f52171s && Intrinsics.f(this.f52172t, model.f52172t) && this.u == model.u;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF53429m() {
            return this.f52168p;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: f0, reason: from getter */
        public final qv0.k getF52243x() {
            return this.u;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52168p = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF53433r() {
            return this.f52172t;
        }

        public final int hashCode() {
            int iHashCode = this.f52159a.hashCode() * 31;
            d dVar = this.f52160b;
            int iHashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((this.f52161c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31)) * 31)) * 31;
            a aVar = this.f;
            int iC = j6.a.c(j6.a.c((iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f52162g), 31, this.f52163h);
            uw0.i iVar = this.i;
            int iHashCode3 = (iC + (iVar == null ? 0 : iVar.hashCode())) * 31;
            Object obj2 = this.f52164j;
            int i = h30.l.i(this.k, (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
            p31.c cVar = this.f52165l;
            int iHashCode4 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52166m;
            int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52167n;
            int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.o;
            int iB = j6.a.b(this.f52171s, j6.a.b(this.f52170r, j6.a.b(this.f52169q, j6.a.b(this.f52168p, (iHashCode6 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 31);
            Parcelable parcelable = this.f52172t;
            return this.u.hashCode() + ((iB + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getI() {
            return this.f52165l;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.k = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF53427j() {
            return this.f52166m;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52167n = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53430n() {
            return this.f52169q;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53431p() {
            return this.f52171s;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52169q = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF53426h() {
            return this.k;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF53428l() {
            return this.o;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getK() {
            return this.f52167n;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52165l = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52172t = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getO() {
            return this.f52170r;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52166m = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.o = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            boolean z3 = false;
            if (Intrinsics.f(model.f52160b, this.f52160b) && model.f52161c == this.f52161c) {
                z = false;
            } else {
                z = false;
                z3 = true;
            }
            boolean z4 = !Intrinsics.f(model.e, this.e);
            boolean z6 = !Intrinsics.f(model.f, this.f);
            boolean z11 = !Intrinsics.f(model.i, this.i);
            if (model.f52163h != this.f52163h) {
                z = true;
            }
            return new ip0.nd(z3, z4, z6, z11, z, or0.b.m(this, (qv0.l) oldItem));
        }

        public /* synthetic */ Model(String str, d dVar, w4 w4Var, ip0.pd pdVar, ip0.sd sdVar, a aVar, boolean z, uw0.i iVar, Object obj2, int i, int i2, int i3, int i5, Parcelable parcelable, int i6) {
            this(str, dVar, w4Var, (i6 & 8) != 0 ? ip0.pd.DEFAULT : pdVar, sdVar, aVar, z, false, (i6 & 256) != 0 ? null : iVar, (i6 & 512) != 0 ? null : obj2, new c.e((qv0.h) null, 3), null, null, null, null, i, i2, i3, i5, (i6 & 524288) != 0 ? null : parcelable, qv0.k.OutOfGroup);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause clause, c cVar, Clause clause2, boolean z, Object obj2, AnalyticsContext analyticsContext, int i, int i2, int i3, int i5, int i6) {
            w4 w4Var;
            a5 qdVar;
            ip0.rd rdVar;
            Clause clause3 = (i6 & 2) != 0 ? null : clause;
            Clause clause4 = (i6 & 8) != 0 ? null : clause2;
            boolean z3 = (i6 & 16) != 0 ? false : z;
            Object obj3 = (i6 & 32) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i6 & 64) != 0 ? null : analyticsContext;
            int i21 = (i6 & 128) != 0 ? R$attr.uikit_dp16 : i;
            int i22 = (i6 & 256) != 0 ? R$attr.uikit_dp16 : i2;
            int i32 = (i6 & 512) != 0 ? R$attr.uikit_dp16 : i3;
            int i33 = (i6 & 1024) != 0 ? R$attr.uikit_dp16 : i5;
            Intrinsics.checkNotNullParameter(listId, "listId");
            x4 x4Var = clause3 != null ? new x4(clause3) : null;
            if (clause4 == null && (cVar instanceof t4) && ((t4) cVar).f54741b == s4.FIXED_SMALL) {
                w4Var = w4.SMALL;
            } else {
                w4Var = w4.LARGE;
            }
            w4 w4Var2 = w4Var;
            if (cVar instanceof c.a) {
                qdVar = a5.a.f53666a;
            } else if (cVar instanceof t4) {
                t4 t4Var = (t4) cVar;
                Clause clause5 = t4Var.f54740a;
                int i43 = u4.f54802a[t4Var.f54741b.ordinal()];
                if (i43 == 1 || i43 == 2) {
                    rdVar = ip0.rd.LARGE;
                } else if (i43 == 3) {
                    rdVar = ip0.rd.SMALL;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                qdVar = new ip0.qd(clause5, rdVar);
            } else {
                qdVar = null;
            }
            this(listId, x4Var, w4Var2, cVar == null ? ip0.pd.SUBTLE : ip0.pd.DEFAULT, new ip0.sd(qdVar, clause4 != null ? new ip0.od(clause4) : null), null, z3, null, obj3, i21, i22, i32, i33, analyticsContext2, 1080704);
        }
    }
}
