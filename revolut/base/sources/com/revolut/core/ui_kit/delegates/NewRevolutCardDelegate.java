package com.revolut.core.ui_kit.delegates;

import android.graphics.Bitmap;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Color;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.NewRevolutCardView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ay;
import ip0.dy;
import ip0.ey;
import ip0.fv;
import ip0.fy;
import ip0.gy;
import ip0.hy;
import ip0.iy;
import ip0.jy;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u0003¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/NewRevolutCardDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/NewRevolutCardDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/o9;", "Model", "a", "ip0/hy", "ip0/jy", "ip0/dy", "ip0/ey", "ip0/iy", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewRevolutCardDelegate extends BaseRecyclerViewDelegate<Model, o9> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f52801c;
    public final Bitmap d;
    public int e;
    public final Bitmap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e01.a f52802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e01.a f52803h;
    public final e01.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e01.a f52804j;
    public final e01.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e01.a f52805l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e01.a f52806m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ihm.f f52807n;
    public final ihm.f o;

    public static abstract class a {
        private a() {
        }
    }

    public /* synthetic */ NewRevolutCardDelegate(int i) {
        this(false, null, i, null);
    }

    public static int p(Model model, boolean z) {
        if (z) {
            model.d.getClass();
            return -16777216;
        }
        Integer num = model.d.f;
        if (num != null) {
            return num.intValue();
        }
        return -16777216;
    }

    public static void q(o9 o9Var, String str, Model model) {
        or0.u.k(o9Var.f54535h).n0().a(o9Var.f54535h, model, new py0.a(str));
    }

    public static TagViewData u(iy iyVar, int i, Integer num) {
        Intrinsics.checkNotNullParameter(iyVar, "<this>");
        Intrinsics.checkNotNullParameter(iyVar, "<this>");
        TextClause textClause = iyVar.f164755a;
        if (textClause == null) {
            throw new IllegalArgumentException(j6.a.q("Unexpected type of text = ", textClause != null ? "TextClause" : null));
        }
        TextClause textClause2 = new TextClause(textClause.f57936a, (Style) new Color(i), (Integer) null, false, (aw0.o9) null, (List) null, 124);
        Integer num2 = iyVar.f164756b;
        return new TagViewData(num2 != null ? new ResourceImage(num2.intValue(), (Integer) null, Integer.valueOf(i), (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, Constants.TAG_SUPPORTED_LOCALE_LIST) : null, textClause2, num != null ? new Color.SolidInt(num.intValue()) : new Color.Solid(R$attr.uikit_colorWhite_70), R$attr.uikit_colorTransparent, null, 1000);
    }

    public static void w(NewRevolutCardView newRevolutCardView, Model model, boolean z) {
        boolean z3 = model.e != null;
        if (model.f && z3) {
            newRevolutCardView.n(z);
        } else {
            newRevolutCardView.q(z3 && z);
        }
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewR = kotlin.jvm.internal.s.r(parent, this.f98535a);
        if (this.f52801c) {
            viewR.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        return new o9(viewR);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: k */
    public final void n(RecyclerView.ViewHolder viewHolder) {
        o9 holder = (o9) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        int i = this.e;
        if (i == holder.k) {
            return;
        }
        holder.k = i;
        holder.f54535h.setCardWidth(i);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void n(koi.b bVar) {
        o9 holder = (o9) bVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        int i = this.e;
        if (i == holder.k) {
            return;
        }
        holder.k = i;
        holder.f54535h.setCardWidth(i);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        o9 o9Var = holder instanceof o9 ? (o9) holder : null;
        if (o9Var == null) {
            return;
        }
        o9Var.i = false;
        o9Var.f54536j = null;
        if (o9Var.f54534g != null) {
            o9Var.F().animate().cancel();
            o9Var.F().setVisibility(8);
            o9Var.F().l();
        }
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0236  */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.revolut.core.ui_kit.views.NewRevolutCardView] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.revolut.core.ui_kit.views.NewRevolutCardView] */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.revolut.core.ui_kit.views.NewRevolutCardView] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.revolut.core.ui_kit.internal.views.tag.TagViewData] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [com.revolut.core.ui_kit.internal.views.tag.TagViewData] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [com.revolut.core.ui_kit.internal.views.tag.TagViewData] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [com.revolut.core.ui_kit.internal.views.tag.TagViewData] */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.revolut.core.ui_kit.views.NewRevolutCardView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.revolut.core.ui_kit.views.NewRevolutCardView] */
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
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.revolut.core.ui_kit.delegates.o9 r40, com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate.Model r41, int r42, java.util.List r43) {
        /*
            Method dump skipped, instruction units count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate.p(com.revolut.core.ui_kit.delegates.o9, com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate$Model, int, java.util.List):void");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
    public final NewRevolutCardView s(o9 o9Var, Model model) {
        boolean z;
        mx0.qa qaVar;
        NewRevolutCardView newRevolutCardViewF = o9Var.F();
        dy dyVar = model.d;
        n9 n9Var = model.f52809b;
        ey eyVar = model.e;
        hy hyVar = model.i;
        mx0.ta taVarV = hyVar != null ? v(hyVar) : null;
        newRevolutCardViewF.setCardWidth(this.e);
        ?? r110 = dyVar.f163972a;
        Integer num = dyVar.f163975g;
        int i = dyVar.e;
        NewRevolutCardView.setCardFrontImage$default(newRevolutCardViewF, r110, taVarV, false, null, null, 24, null);
        newRevolutCardViewF.setFrontPrimaryColor(dyVar.f163974c);
        newRevolutCardViewF.setFrontSecondaryColor(i);
        newRevolutCardViewF.setCustomisationImage(model.f52811g);
        newRevolutCardViewF.setCardLabel(p9.c(model));
        newRevolutCardViewF.setCardTypeLabel(p9.d(model));
        newRevolutCardViewF.setCardHolderName(model.f52810c);
        newRevolutCardViewF.setLastFour(p9.h(model));
        if (n9Var instanceof l9) {
            z = true;
        } else {
            if (!(n9Var instanceof m9)) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        newRevolutCardViewF.setLastFourVisible(z);
        if (n9Var instanceof l9) {
            qaVar = mx0.qa.SECONDARY;
        } else {
            if (!(n9Var instanceof m9)) {
                throw new NoWhenBranchMatchedException();
            }
            qaVar = mx0.qa.PRIMARY;
        }
        newRevolutCardViewF.setCardHolderNameStyle(qaVar);
        newRevolutCardViewF.setLastFourTextAppearance(p9.g(model));
        newRevolutCardViewF.setCardLabelTextAppearance(p9.g(model));
        newRevolutCardViewF.setCardTypeLabelTextAppearance(p9.g(model));
        iy iyVarE = p9.e(model);
        newRevolutCardViewF.setFrontCardTag(iyVarE != null ? u(iyVarE, p(model, false), num) : null);
        iy iyVarF = p9.f(model);
        newRevolutCardViewF.setFrontSecondaryCardTag(iyVarF != null ? u(iyVarF, p(model, false), num) : null);
        NewRevolutCardView.setCardBackImage$default(newRevolutCardViewF, dyVar.f163973b, null, 2, null);
        newRevolutCardViewF.setBackPrimaryColor(dyVar.d);
        newRevolutCardViewF.setBackSecondaryColor(i);
        iy iyVarA = p9.a(model);
        newRevolutCardViewF.setBackCardTag(iyVarA != null ? u(iyVarA, p(model, false), num) : null);
        iy iyVarB = p9.b(model);
        newRevolutCardViewF.setBackSecondaryCardTag(iyVarB != null ? u(iyVarB, p(model, false), num) : null);
        newRevolutCardViewF.setCardOverlay(taVarV);
        newRevolutCardViewF.setClickable(false);
        newRevolutCardViewF.p(model.f52812h && eyVar != null);
        if (eyVar != null) {
            newRevolutCardViewF.o(eyVar.f164161a, eyVar.f164162b, eyVar.f164163c);
        } else {
            newRevolutCardViewF.r(false);
        }
        w(newRevolutCardViewF, model, false);
        newRevolutCardViewF.setVisibility(0);
        return newRevolutCardViewF;
    }

    public final void t(NewRevolutCardView newRevolutCardView, Model model) {
        ay ayVar = new ay(this, model, 2);
        this.f52807n.onNext(model);
        Unit unit = Unit.f186387a;
        vp0.i.b(vp0.k.Companion, newRevolutCardView, null, vp0.h.CARD, null, new ip0.md(newRevolutCardView, ayVar, 4), 42);
    }

    public final mx0.ta v(hy hyVar) {
        if (Intrinsics.f(hyVar, fy.f164319a)) {
            Bitmap bitmap = this.d;
            if (bitmap != null) {
                return new mx0.ra(bitmap);
            }
            return null;
        }
        if (!Intrinsics.f(hyVar, gy.f164476a)) {
            throw new NoWhenBranchMatchedException();
        }
        Bitmap bitmap2 = this.f;
        if (bitmap2 != null) {
            return new mx0.sa(bitmap2);
        }
        return null;
    }

    public NewRevolutCardDelegate(boolean z, Bitmap bitmap, int i, Bitmap bitmap2) {
        super(R$layout.internal_delegate_new_revolut_card, new fv(18));
        this.f52801c = z;
        this.d = bitmap;
        this.e = i;
        this.f = bitmap2;
        this.f52802g = new e01.a();
        this.f52803h = new e01.a();
        this.i = new e01.a();
        this.f52804j = new e01.a();
        this.k = new e01.a();
        this.f52805l = new e01.a();
        this.f52806m = new e01.a();
        this.f52807n = v0.a.d("create(...)");
        this.o = v0.a.d("create(...)");
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\bJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/NewRevolutCardDelegate$Model;", "Lkoi/j;", "Lqv0/p;", "Lqv0/o;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/n9", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements koi.j, qv0.p, qv0.o, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n9 f52809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f52810c;
        public final dy d;
        public final ey e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Image f52811g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f52812h;
        public final hy i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final a f52813j;
        public final Object k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Parcelable f52814l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f52815m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f52816n;
        public final int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f52817p;

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, n9 variant, Clause clause, dy cardDesignConfig, UrlImage urlImage, int i) {
            UrlImage urlImage2 = (i & 256) != 0 ? null : urlImage;
            boolean z = (i & 512) != 0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(variant, "variant");
            Intrinsics.checkNotNullParameter(cardDesignConfig, "cardDesignConfig");
            int i2 = R$attr.uikit_dp0;
            this(listId, variant, clause, cardDesignConfig, null, false, urlImage2, z, null, null, null, i2, i2, i2, i2);
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getI() {
            return this.k;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55232b() {
            return this.f52808a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52808a, model.f52808a) && Intrinsics.f(this.f52809b, model.f52809b) && Intrinsics.f(this.f52810c, model.f52810c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f52811g, model.f52811g) && this.f52812h == model.f52812h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52813j, model.f52813j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52814l, model.f52814l) && this.f52815m == model.f52815m && this.f52816n == model.f52816n && this.o == model.o && this.f52817p == model.f52817p;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52495j() {
            return this.f52815m;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52815m = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF55235h() {
            return this.f52814l;
        }

        public final int hashCode() {
            int iHashCode = (this.f52809b.hashCode() + (this.f52808a.hashCode() * 31)) * 31;
            Clause clause = this.f52810c;
            int iHashCode2 = (this.d.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
            ey eyVar = this.e;
            int iC = j6.a.c(j6.a.c((iHashCode2 + (eyVar == null ? 0 : eyVar.hashCode())) * 31, 31, this.f), 31, false);
            Image image = this.f52811g;
            int iC2 = j6.a.c(j6.a.c((iC + (image == null ? 0 : image.hashCode())) * 31, 31, this.f52812h), 31, false);
            hy hyVar = this.i;
            int iHashCode3 = (iC2 + (hyVar == null ? 0 : hyVar.hashCode())) * 31;
            a aVar = this.f52813j;
            int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            Object obj2 = this.k;
            int iHashCode5 = (iHashCode4 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52814l;
            return Integer.hashCode(this.f52817p) + j6.a.b(this.o, j6.a.b(this.f52816n, j6.a.b(this.f52815m, (iHashCode5 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getK() {
            return this.f52816n;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52497m() {
            return this.f52817p;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52816n = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52814l = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52496l() {
            return this.o;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new jy(!Intrinsics.f(p9.c(model), p9.c(this)), !Intrinsics.f(p9.d(model), p9.d(this)), !Intrinsics.f(p9.h(model), p9.h(this)), !Intrinsics.f(model.d, this.d), !Intrinsics.f(model.e, this.e), model.f != this.f, false, !Intrinsics.f(model.f52810c, this.f52810c), !Intrinsics.f(model.f52811g, this.f52811g), !Intrinsics.f(p9.e(model), p9.e(this)), !Intrinsics.f(p9.a(model), p9.a(this)), model.f52812h != this.f52812h, !Intrinsics.f(model.f52809b, this.f52809b), false, !Intrinsics.f(p9.f(model), p9.f(this)), !Intrinsics.f(p9.b(model), p9.b(this)), !Intrinsics.f(model.i, this.i), !Intrinsics.f(model.f52813j, this.f52813j));
        }

        public Model(String listId, n9 variant, Clause clause, dy cardDesignConfig, ey eyVar, boolean z, Image image, boolean z3, hy hyVar, a aVar, Object obj2, int i, int i2, int i3, int i5) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(variant, "variant");
            Intrinsics.checkNotNullParameter(cardDesignConfig, "cardDesignConfig");
            this.f52808a = listId;
            this.f52809b = variant;
            this.f52810c = clause;
            this.d = cardDesignConfig;
            this.e = eyVar;
            this.f = z;
            this.f52811g = image;
            this.f52812h = z3;
            this.i = hyVar;
            this.f52813j = aVar;
            this.k = obj2;
            this.f52814l = null;
            this.f52815m = i;
            this.f52816n = i2;
            this.o = i3;
            this.f52817p = i5;
        }
    }
}
