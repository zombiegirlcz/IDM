package com.revolut.core.ui_kit.delegates;

import android.graphics.Outline;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.card_design.CardDesign2dView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0007\b\u0003\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CardDesignCatalogueDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/CardDesignCatalogueDelegate$Model;", "Lip0/l5;", "<init>", "()V", "Companion", "Model", "ip0/k5", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardDesignCatalogueDelegate extends BaseRecyclerViewDelegate<Model, ip0.l5> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final aw0.d0 e = new aw0.d0(41, 65);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51768c;
    public final b d;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CardDesignCatalogueDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/p;", "Lqv0/q;", "Loy0/b;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements koi.j, TrackableItem, qv0.p, qv0.q, oy0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f51770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f51771c;
        public final TextClause d;
        public Parcelable e;
        public final o5l.i f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public qv0.c f51772g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p31.c f51773h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f51774j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f51775l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f51776m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f51777n;
        public final int o;

        public Model(String listId, Image cardDesignImage, LayeredImage layeredImage, TextClause textClause, AnalyticsContext analyticsContext, o5l.i iVar) {
            int i = R$attr.uikit_dp0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(cardDesignImage, "cardDesignImage");
            c.d positionInBox = c.d.f249513a;
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            this.f51769a = listId;
            this.f51770b = cardDesignImage;
            this.f51771c = layeredImage;
            this.d = textClause;
            this.e = analyticsContext;
            this.f = iVar;
            this.f51772g = positionInBox;
            this.f51773h = null;
            this.i = null;
            this.f51774j = null;
            this.k = null;
            this.f51775l = i;
            this.f51776m = i;
            this.f51777n = i;
            this.o = i;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new CardDesignCatalogueDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF() {
            return this.f;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53150a() {
            return this.f51769a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51769a, model.f51769a) && this.f51770b.equals(model.f51770b) && Intrinsics.f(this.f51771c, model.f51771c) && this.d.equals(model.d) && Intrinsics.f(this.e, model.e) && this.f.equals(model.f) && Intrinsics.f(this.f51772g, model.f51772g) && Intrinsics.f(this.f51773h, model.f51773h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f51774j, model.f51774j) && Intrinsics.f(this.k, model.k) && this.f51775l == model.f51775l && this.f51776m == model.f51776m && this.f51777n == model.f51777n && this.o == model.o;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF53157m() {
            return this.f51775l;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51775l = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.e;
        }

        @Override // oy0.b
        /* JADX INFO: renamed from: getContentDescription */
        public final Clause getE() {
            return this.d;
        }

        public final int hashCode() {
            int iB = p.a.b(this.f51769a.hashCode() * 31, 31, this.f51770b);
            Image image = this.f51771c;
            int iB2 = ip0.v7.b((iB + (image == null ? 0 : image.hashCode())) * 31, 31, this.d);
            Parcelable parcelable = this.e;
            int i = h30.l.i(this.f51772g, (this.f.hashCode() + ((iB2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31)) * 31, 31);
            p31.c cVar = this.f51773h;
            int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.i;
            int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f51774j;
            int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.k;
            return Integer.hashCode(this.o) + j6.a.b(this.f51777n, j6.a.b(this.f51776m, j6.a.b(this.f51775l, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getI() {
            return this.f51773h;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f51772g = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF53155j() {
            return this.i;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f51774j = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53158n() {
            return this.f51776m;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53159p() {
            return this.o;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f51776m = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF53154h() {
            return this.f51772g;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF53156l() {
            return this.k;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getK() {
            return this.f51774j;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f51773h = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.e = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getO() {
            return this.f51777n;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.i = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.k = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) != null) {
                return new ip0.k5(!r0.f51770b.equals(this.f51770b), !Intrinsics.f(r0.f51771c, this.f51771c), !this.d.equals(((Model) oldItem).d));
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.CardDesignCatalogueDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            Intrinsics.checkNotNullExpressionValue(view.getContext(), "getContext(...)");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), kli.a.k(r0, 7.0f));
        }
    }

    public CardDesignCatalogueDelegate() {
        super(R$layout.internal_delegate_card_design_catalogue, new ip0.g4(5));
        this.f51768c = v0.a.d("create(...)");
        this.d = new b();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ip0.l5 l5Var = new ip0.l5(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_card_design_catalogue));
        l5Var.itemView.setClipToOutline(true);
        l5Var.itemView.setOutlineProvider(this.d);
        return l5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v7, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
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
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.l5 holder, Model data, int i, List payloads) {
        List list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        CardDesign2dView cardDesign2dView = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                list = payloads;
                break;
            } else {
                if (!(payloads.get(i2) instanceof ip0.k5)) {
                    list = null;
                    break;
                }
                i2++;
            }
        }
        if (list == null) {
            list = zhm.f0.f322471a;
        }
        boolean zIsEmpty = list.isEmpty();
        boolean z = zIsEmpty;
        boolean z3 = z;
        for (Object obj2 : payloads) {
            if (obj2 instanceof ip0.k5) {
                boolean z4 = true;
                zIsEmpty = zIsEmpty || ((ip0.k5) obj2).f164958a;
                z = z || ((ip0.k5) obj2).f164959b;
                if (!z3 && !((ip0.k5) obj2).f164960c) {
                    z4 = false;
                }
                z3 = z4;
            }
        }
        if (zIsEmpty) {
            cardDesign2dView.f0(data.f51770b);
        }
        if (z) {
            yy0.f.e(or0.u.k(holder.f165129g).Q(), data.f51771c, holder.f165129g, null, null, 12);
        }
        if (z3) {
            pd.b.p(cardDesign2dView, data.d);
        }
        cardDesign2dView.setOnClickListener(new ip0.j5(this, 0, holder, data));
    }
}
