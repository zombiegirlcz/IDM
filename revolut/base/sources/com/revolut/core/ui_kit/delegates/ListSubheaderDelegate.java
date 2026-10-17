package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.du;
import ip0.eu;
import ip0.hq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0007\b\u0003\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ListSubheaderDelegate;", "Lcom/revolut/core/ui_kit/delegates/NestedChildDelegate;", "Lcom/revolut/core/ui_kit/delegates/ListSubheaderDelegate$Model;", "Lip0/eu;", "<init>", "()V", "Companion", "ip0/du", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ListSubheaderDelegate extends NestedChildDelegate<Model, eu> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f52705g = R$attr.uikit_colorForeground_10;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f52706h = R$attr.uikit_dp16;
    public static final int i = R$attr.uikit_dp12;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52707c;
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public ListSubheaderDelegate() {
        int i2 = R$layout.internal_delegate_list_subheader;
        hq rule = new hq(23);
        Intrinsics.checkNotNullParameter(rule, "rule");
        super(i2, rule);
        this.f52707c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new eu(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_list_subheader));
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0223  */
    @Override // com.revolut.core.ui_kit.delegates.NestedChildDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(koi.b r22, koi.j r23, java.util.List r24, koi.j r25) {
        /*
            Method dump skipped, instruction units count: 973
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.ListSubheaderDelegate.p(koi.b, koi.j, java.util.List, koi.j):void");
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\b\tJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ListSubheaderDelegate$Model;", "Lqv0/l;", "Lqv0/p;", "Lgx0/a;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "a", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.l, qv0.p, gx0.a, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f52709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f52710c;
        public final Image d;
        public final Clause e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final aw0.j0 f52711g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f52712h;
        public final a i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final b f52713j;
        public final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f52714l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Object f52715m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Parcelable f52716n;
        public qv0.k o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public qv0.c f52717p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f52718q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f52719r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p31.c f52720s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p31.c f52721t;
        public int u;
        public int v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f52722w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f52723x;

        public static abstract class a {

            /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model$a$a, reason: collision with other inner class name */
            public static final class C0411a extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0411a f52724a = new C0411a();

                private C0411a() {
                }
            }

            public static final class b extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f52725a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f52726b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final boolean f52727c;

                /* JADX WARN: Illegal instructions before constructor call */
                public b() {
                    boolean z = false;
                    this(z, z, z, 7);
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj2;
                    return this.f52725a == bVar.f52725a && this.f52726b == bVar.f52726b && this.f52727c == bVar.f52727c;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f52727c) + j6.a.c(Boolean.hashCode(this.f52725a) * 31, 31, this.f52726b);
                }

                public b(boolean z, boolean z3, boolean z4) {
                    this.f52725a = z;
                    this.f52726b = z3;
                    this.f52727c = z4;
                }

                public /* synthetic */ b(boolean z, boolean z3, boolean z4, int i) {
                    this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z3, (i & 4) != 0 ? false : z4);
                }
            }

            private a() {
            }
        }

        public static abstract class b {

            public static final class a extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f52728a = new a();

                private a() {
                }
            }

            /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model$b$b, reason: collision with other inner class name */
            public static final class C0412b extends b {
                private C0412b() {
                }
            }

            private b() {
            }
        }

        public Model(String listId, Image image, Clause clause, Image image2, Clause clause2, String str, aw0.j0 j0Var, a aVar, b bVar, boolean z, boolean z3, Object obj2, Parcelable parcelable, int i, int i2, int i3, int i5, int i6) {
            int i21;
            int i22;
            Image image3 = (i6 & 2) != 0 ? null : image;
            Image image4 = (i6 & 8) != 0 ? null : image2;
            Clause clause3 = (i6 & 16) != 0 ? null : clause2;
            String str2 = (i6 & 32) != 0 ? null : str;
            aw0.j0 backgroundType = (i6 & 64) != 0 ? aw0.j0.DEFAULT : j0Var;
            a aVar2 = (i6 & 256) != 0 ? null : aVar;
            b subHeaderStyle = (i6 & 512) != 0 ? b.a.f52728a : bVar;
            boolean z4 = (i6 & 1024) != 0 ? false : z;
            boolean z6 = (i6 & 2048) != 0 ? false : z3;
            Object obj3 = (i6 & 4096) != 0 ? null : obj2;
            Parcelable parcelable2 = (i6 & 8192) != 0 ? null : parcelable;
            qv0.k positionInGroup = qv0.k.OutOfGroup;
            qv0.c positionInBox = (i6 & 32768) != 0 ? c.d.f249513a : c.C1364c.f249512a;
            if ((i6 & PKIFailureInfo.badCertTemplate) != 0) {
                ListSubheaderDelegate.INSTANCE.getClass();
                i21 = ListSubheaderDelegate.f52706h;
            } else {
                i21 = i;
            }
            if ((i6 & PKIFailureInfo.badSenderNonce) != 0) {
                ListSubheaderDelegate.INSTANCE.getClass();
                i22 = ListSubheaderDelegate.f52706h;
            } else {
                i22 = i2;
            }
            int i32 = (i6 & 4194304) != 0 ? R$attr.uikit_dp16 : i3;
            int i33 = (i6 & 8388608) != 0 ? R$attr.uikit_dp16 : i5;
            int i43 = i21;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
            Intrinsics.checkNotNullParameter(subHeaderStyle, "subHeaderStyle");
            Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            this.f52708a = listId;
            this.f52709b = image3;
            this.f52710c = clause;
            this.d = image4;
            this.e = clause3;
            this.f = str2;
            this.f52711g = backgroundType;
            this.f52712h = false;
            this.i = aVar2;
            this.f52713j = subHeaderStyle;
            this.k = z4;
            this.f52714l = z6;
            this.f52715m = obj3;
            this.f52716n = parcelable2;
            this.o = positionInGroup;
            this.f52717p = positionInBox;
            this.f52718q = null;
            this.f52719r = null;
            this.f52720s = null;
            this.f52721t = null;
            this.u = i43;
            this.v = i22;
            this.f52722w = i32;
            this.f52723x = i33;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: C1 */
        public final boolean getF52234l() {
            return this.i instanceof a.C0411a;
        }

        @Override // qv0.l
        public final void R0(qv0.k kVar) {
            Intrinsics.checkNotNullParameter(kVar, "<set-?>");
            this.o = kVar;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ListSubheaderDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF51903b() {
            return this.f52715m;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51902a() {
            return this.f52708a;
        }

        @Override // gx0.a
        public final py0.d d() {
            Clause clause = this.f52710c;
            if (clause != null) {
                return new py0.c(clause);
            }
            Image image = this.d;
            if (image != null) {
                return new py0.b(image);
            }
            return null;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52708a, model.f52708a) && Intrinsics.f(this.f52709b, model.f52709b) && Intrinsics.f(this.f52710c, model.f52710c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f52711g == model.f52711g && this.f52712h == model.f52712h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52713j, model.f52713j) && this.k == model.k && this.f52714l == model.f52714l && Intrinsics.f(this.f52715m, model.f52715m) && Intrinsics.f(this.f52716n, model.f52716n) && this.o == model.o && Intrinsics.f(this.f52717p, model.f52717p) && Intrinsics.f(this.f52718q, model.f52718q) && Intrinsics.f(this.f52719r, model.f52719r) && Intrinsics.f(this.f52720s, model.f52720s) && Intrinsics.f(this.f52721t, model.f52721t) && this.u == model.u && this.v == model.v && this.f52722w == model.f52722w && this.f52723x == model.f52723x;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF51906h() {
            return this.u;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: f0, reason: from getter */
        public final qv0.k getU() {
            return this.o;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.u = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF54955l() {
            return this.f52716n;
        }

        public final int hashCode() {
            int iHashCode = this.f52708a.hashCode() * 31;
            Image image = this.f52709b;
            int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
            Clause clause = this.f52710c;
            int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
            Image image2 = this.d;
            int iHashCode4 = (iHashCode3 + (image2 == null ? 0 : image2.hashCode())) * 31;
            Clause clause2 = this.e;
            int iHashCode5 = (iHashCode4 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            String str = this.f;
            int iC = j6.a.c((this.f52711g.hashCode() + ((iHashCode5 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f52712h);
            a aVar = this.i;
            int iC2 = j6.a.c(j6.a.c((this.f52713j.hashCode() + ((iC + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31, 31, this.k), 31, this.f52714l);
            Object obj2 = this.f52715m;
            int iHashCode6 = (iC2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52716n;
            int i = h30.l.i(this.f52717p, (this.o.hashCode() + ((iHashCode6 + (parcelable == null ? 0 : parcelable.hashCode())) * 31)) * 31, 31);
            p31.c cVar = this.f52718q;
            int iHashCode7 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52719r;
            int iHashCode8 = (iHashCode7 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52720s;
            int iHashCode9 = (iHashCode8 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52721t;
            return Integer.hashCode(this.f52723x) + j6.a.b(this.f52722w, j6.a.b(this.v, j6.a.b(this.u, (iHashCode9 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF51909m() {
            return this.f52718q;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52717p = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF51910n() {
            return this.f52719r;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52720s = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getI() {
            return this.v;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getK() {
            return this.f52723x;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.v = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF51908l() {
            return this.f52717p;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF51911p() {
            return this.f52721t;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getO() {
            return this.f52720s;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52718q = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52716n = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF51907j() {
            return this.f52722w;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52719r = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52721t = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            boolean z3 = !Intrinsics.f(model.f52709b, this.f52709b);
            boolean z4 = !Intrinsics.f(model.f52710c, this.f52710c);
            boolean z6 = !Intrinsics.f(model.d, this.d);
            boolean z11 = !Intrinsics.f(model.e, this.e);
            boolean z12 = !Intrinsics.f(model.f, this.f);
            boolean z29 = false;
            if (model.f52712h != this.f52712h) {
                z = false;
                z29 = true;
            } else {
                z = false;
            }
            return new du(z3, z4, z6, z11, z12, z29, !Intrinsics.f(model.i, this.i), !Intrinsics.f(model.f52713j, this.f52713j), model.k != this.k ? true : z, model.f52714l != this.f52714l ? true : z, or0.b.m(this, (qv0.l) oldItem));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Image image, Clause clause, Image image2, Clause clause2, String str, a aVar, boolean z, boolean z3, Object obj2, Parcelable parcelable, int i, int i2, int i3, int i5, int i6) {
            int i21;
            int i22;
            Image image3 = (i6 & 2) != 0 ? null : image;
            Clause clause3 = (i6 & 4) != 0 ? null : clause;
            Image image4 = (i6 & 8) != 0 ? null : image2;
            Clause clause4 = (i6 & 16) != 0 ? null : clause2;
            String str2 = (i6 & 32) != 0 ? null : str;
            a aVar2 = (i6 & 64) != 0 ? null : aVar;
            boolean z4 = (i6 & 256) != 0 ? false : z;
            boolean z6 = (i6 & 512) != 0 ? false : z3;
            Object obj3 = (i6 & 1024) != 0 ? null : obj2;
            Parcelable parcelable2 = (i6 & 2048) != 0 ? null : parcelable;
            if ((i6 & 4096) != 0) {
                ListSubheaderDelegate.INSTANCE.getClass();
                i21 = ListSubheaderDelegate.f52706h;
            } else {
                i21 = i;
            }
            if ((i6 & 8192) != 0) {
                ListSubheaderDelegate.INSTANCE.getClass();
                i22 = ListSubheaderDelegate.f52706h;
            } else {
                i22 = i2;
            }
            int i32 = (i6 & 16384) != 0 ? R$attr.uikit_dp16 : i3;
            int i33 = (i6 & 32768) != 0 ? R$attr.uikit_dp16 : i5;
            Intrinsics.checkNotNullParameter(listId, "listId");
            int i43 = i32;
            b.a subHeaderStyle = b.a.f52728a;
            Intrinsics.checkNotNullParameter(subHeaderStyle, "subHeaderStyle");
            this(listId, image3, clause3, image4, clause4, str2, aw0.j0.DEFAULT, aVar2, subHeaderStyle, z4, z6, obj3, parcelable2, 0, 0, 0, 0, 16760832);
            this.u = i21;
            this.v = i22;
            this.f52722w = i43;
            this.f52723x = i33;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, aw0.j0 backgroundType, int i, int i2) {
            int i3;
            if ((i2 & PKIFailureInfo.badCertTemplate) != 0) {
                ListSubheaderDelegate.INSTANCE.getClass();
                i3 = ListSubheaderDelegate.f52706h;
            } else {
                i3 = i;
            }
            ListSubheaderDelegate.INSTANCE.getClass();
            int i5 = ListSubheaderDelegate.f52706h;
            int i6 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
            b.a subHeaderStyle = b.a.f52728a;
            Intrinsics.checkNotNullParameter(subHeaderStyle, "subHeaderStyle");
            c.d positionInBox = c.d.f249513a;
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            this(listId, null, textLocalisedClause, null, textLocalisedClause2, null, backgroundType, new a.b(false, false, true), subHeaderStyle, false, false, null, null, 0, 0, 0, 0, 16760832);
            j(positionInBox);
            this.f52718q = null;
            this.f52719r = null;
            this.f52720s = null;
            this.f52721t = null;
            this.u = i3;
            this.v = i5;
            this.f52722w = i6;
            this.f52723x = i6;
        }

        public Model(String listId, Image image, Clause clause, ResourceImage resourceImage, boolean z, boolean z3, Clause clause2, boolean z4, Object obj2, AnalyticsContext analyticsContext, int i, int i2, int i3, int i5, String str, int i6) {
            int i21;
            int i22;
            Image image2 = (i6 & 2) != 0 ? null : image;
            ResourceImage resourceImage2 = (i6 & 8) != 0 ? null : resourceImage;
            boolean z6 = (i6 & 16) != 0 ? false : z;
            boolean z11 = (i6 & 32) != 0 ? false : z3;
            Clause clause3 = (i6 & 64) != 0 ? null : clause2;
            boolean z12 = (i6 & 128) == 0 ? z4 : false;
            Object obj3 = (i6 & 2048) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i6 & 4096) != 0 ? null : analyticsContext;
            if ((i6 & 8192) != 0) {
                ListSubheaderDelegate.INSTANCE.getClass();
                i21 = ListSubheaderDelegate.f52706h;
            } else {
                i21 = i;
            }
            if ((i6 & 16384) != 0) {
                ListSubheaderDelegate.INSTANCE.getClass();
                i22 = ListSubheaderDelegate.f52706h;
            } else {
                i22 = i2;
            }
            int i32 = (32768 & i6) != 0 ? R$attr.uikit_dp16 : i3;
            int i33 = (65536 & i6) != 0 ? R$attr.uikit_dp16 : i5;
            String str2 = (i6 & 131072) != 0 ? null : str;
            Intrinsics.checkNotNullParameter(listId, "listId");
            b.a subHeaderStyle = b.a.f52728a;
            Intrinsics.checkNotNullParameter(subHeaderStyle, "subHeaderStyle");
            a.b bVar = new a.b(z6, z11, z12);
            if (!z6 && !z12 && !z11) {
                bVar = null;
            }
            this(listId, image2, clause, (Image) resourceImage2, clause3, str2, (a) bVar, false, false, obj3, (Parcelable) analyticsContext2, 0, 0, 0, 0, 61440);
            this.u = i21;
            this.v = i22;
            this.f52722w = i32;
            this.f52723x = i33;
        }
    }
}
