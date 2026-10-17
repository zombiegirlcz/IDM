package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.hq;
import ip0.iu;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0003\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ListingCardBasicDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ListingCardBasicDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/t8;", "<init>", "()V", "Companion", "Model", "com/revolut/core/ui_kit/delegates/p8", "ip0/iu", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ListingCardBasicDelegate extends BaseRecyclerViewDelegate<Model, t8> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52729c;
    public final ihm.f d;
    public final e01.a e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ListingCardBasicDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/q8", "com/revolut/core/ui_kit/delegates/r8", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f52731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f52732c;
        public final Image d;
        public final boolean e;
        public final Image f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Clause f52733g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f52734h;
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List f52735j;
        public final List k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Clause f52736l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Clause f52737m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final r8 f52738n;
        public Parcelable o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f52739p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f52740q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f52741r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f52742s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final q8 f52743t;
        public qv0.c u;
        public p31.c v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public p31.c f52744w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public p31.c f52745x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public p31.c f52746y;

        public Model(String listId, Object obj2, Clause title, Image image, ResourceImage resourceImage, TextClause textClause, Clause clause, int i, List tags, r8 imagePosition, q8 appearance, int i2) {
            obj2 = (i2 & 2) != 0 ? null : obj2;
            resourceImage = (i2 & 32) != 0 ? null : resourceImage;
            textClause = (i2 & 128) != 0 ? null : textClause;
            i = (i2 & 512) != 0 ? 3 : i;
            tags = (i2 & 1024) != 0 ? zhm.f0.f322471a : tags;
            zhm.f0 actions = zhm.f0.f322471a;
            imagePosition = (i2 & 16384) != 0 ? r8.FillCrop : imagePosition;
            appearance = (i2 & 65536) != 0 ? q8.Default : appearance;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(imagePosition, "imagePosition");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            int i3 = R$attr.uikit_dp0;
            this.f52730a = listId;
            this.f52731b = obj2;
            this.f52732c = title;
            this.d = image;
            this.e = true;
            this.f = resourceImage;
            this.f52733g = textClause;
            this.f52734h = clause;
            this.i = i;
            this.f52735j = tags;
            this.k = actions;
            this.f52736l = null;
            this.f52737m = null;
            this.f52738n = imagePosition;
            this.o = null;
            this.f52739p = i3;
            this.f52740q = i3;
            this.f52741r = i3;
            this.f52742s = i3;
            this.f52743t = appearance;
            this.u = c.d.f249513a;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ListingCardBasicDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getE() {
            return this.f52731b;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52603a() {
            return this.f52730a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52730a, model.f52730a) && Intrinsics.f(this.f52731b, model.f52731b) && Intrinsics.f(this.f52732c, model.f52732c) && Intrinsics.f(this.d, model.d) && this.e == model.e && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52733g, model.f52733g) && Intrinsics.f(this.f52734h, model.f52734h) && this.i == model.i && Intrinsics.f(this.f52735j, model.f52735j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52736l, model.f52736l) && Intrinsics.f(this.f52737m, model.f52737m) && this.f52738n == model.f52738n && Intrinsics.f(this.o, model.o) && this.f52739p == model.f52739p && this.f52740q == model.f52740q && this.f52741r == model.f52741r && this.f52742s == model.f52742s && this.f52743t == model.f52743t && Intrinsics.f(this.u, model.u);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52606g() {
            return this.f52739p;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52739p = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.o;
        }

        public final int hashCode() {
            int iHashCode = this.f52730a.hashCode() * 31;
            Object obj2 = this.f52731b;
            int iC = j6.a.c(a10.b.c(this.d, p.a.b((iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31, this.f52732c), 31), 31, this.e);
            Image image = this.f;
            int iHashCode2 = (iC + (image == null ? 0 : image.hashCode())) * 961;
            Clause clause = this.f52733g;
            int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
            Object obj3 = this.f52734h;
            int iD = p.a.d(p.a.d(j6.a.b(this.i, (iHashCode3 + (obj3 == null ? 0 : obj3.hashCode())) * 31, 31), 31, this.f52735j), 31, this.k);
            Clause clause2 = this.f52736l;
            int iHashCode4 = (iD + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            Clause clause3 = this.f52737m;
            int iHashCode5 = (this.f52738n.hashCode() + ((iHashCode4 + (clause3 == null ? 0 : clause3.hashCode())) * 31)) * 31;
            Parcelable parcelable = this.o;
            return this.u.hashCode() + ((this.f52743t.hashCode() + j6.a.b(this.f52742s, j6.a.b(this.f52741r, j6.a.b(this.f52740q, j6.a.b(this.f52739p, (iHashCode5 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31), 31)) * 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52610m() {
            return this.v;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.u = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52611n() {
            return this.f52744w;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52745x = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52607h() {
            return this.f52740q;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52608j() {
            return this.f52742s;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52740q = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52609l() {
            return this.u;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52612p() {
            return this.f52746y;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getO() {
            return this.f52745x;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.v = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.o = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getI() {
            return this.f52741r;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52744w = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52746y = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            boolean z = !Intrinsics.f(model.d, this.d);
            boolean z3 = !Intrinsics.f(model.f, this.f);
            boolean z4 = !true;
            boolean z6 = !Intrinsics.f(model.f52733g, this.f52733g);
            boolean z11 = !Intrinsics.f(model.f52732c, this.f52732c);
            boolean z12 = !Intrinsics.f(model.f52734h, this.f52734h);
            boolean z29 = model.i != this.i;
            boolean z31 = !Intrinsics.f(model.f52735j, this.f52735j);
            boolean z41 = !Intrinsics.f(model.k, this.k);
            boolean z49 = true;
            boolean z54 = !Intrinsics.f(model.f52736l, this.f52736l);
            boolean z74 = !Intrinsics.f(model.f52737m, this.f52737m);
            if (model.f52738n == this.f52738n) {
                z49 = false;
            }
            return new iu(z, z3, z4, z6, z11, z12, z29, z31, z41, z54, z74, z49, model.f52743t != this.f52743t, or0.b.l((qv0.i) oldItem, this), model.e != this.e);
        }
    }

    public static final class a {
        private a() {
        }
    }

    public ListingCardBasicDelegate() {
        super(R$layout.internal_delegate_listing_card_basic, new hq(25));
        this.f52729c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new t8(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_listing_card_basic));
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x023e  */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v66, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v80, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.revolut.core.ui_kit.delegates.t8 r39, com.revolut.core.ui_kit.delegates.ListingCardBasicDelegate.Model r40, int r41, java.util.List r42) {
        /*
            Method dump skipped, instruction units count: 1369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.ListingCardBasicDelegate.p(com.revolut.core.ui_kit.delegates.t8, com.revolut.core.ui_kit.delegates.ListingCardBasicDelegate$Model, int, java.util.List):void");
    }
}
