package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.ViewUtils;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.CircleProgressBar;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.flexbox.FlexboxLayout;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/EsimDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseGroupRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/EsimDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/v5;", "<init>", "()V", "Model", "ip0/fg", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimDelegate extends BaseGroupRecyclerViewDelegate<Model, v5> {
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e01.a f52227g;

    public EsimDelegate() {
        super(R$layout.internal_delegate_esim, new ip0.zf(2));
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.f52227g = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new v5(kotlin.jvm.internal.s.r(parent, this.f58165c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    public final void q(koi.b bVar, qv0.l lVar, int i, List list) {
        EsimDelegate esimDelegate;
        List<ip0.fg> payloads = list;
        v5 holder = (v5) bVar;
        Model model = (Model) lVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(model, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.q(holder, model, i, payloads);
        CircleProgressBar circleProgressBar = holder.f54850g;
        SmallActionButton smallActionButton = holder.f54853l;
        List list2 = payloads;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (true) {
                if (it8.hasNext()) {
                    if (!(it8.next() instanceof ip0.fg)) {
                        payloads = null;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        Intrinsics.i(payloads, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.core.ui_kit.delegates.EsimDelegate.Payload>");
        boolean zIsEmpty = payloads.isEmpty();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        boolean z41 = z31;
        for (ip0.fg fgVar : payloads) {
            zIsEmpty = zIsEmpty || fgVar.f164257a;
            z = z || fgVar.f164258b;
            z3 = z3 || fgVar.f164259c;
            z4 = z4 || fgVar.d;
            z6 = z6 || fgVar.e;
            z11 = z11 || fgVar.f;
            z12 = z12 || fgVar.f164260g;
            z29 = z29 || fgVar.f164261h;
            z31 = z31 || fgVar.i;
            z41 = z41 || fgVar.f164262j;
        }
        if (zIsEmpty) {
            zi0.c.g(holder.f, model.f52229b);
        }
        if (z) {
            Float f = model.f52230c;
            if (f != null) {
                float fFloatValue = f.floatValue();
                int i2 = fFloatValue <= 10.0f ? R$attr.uikit_colorRed : fFloatValue <= 25.0f ? R$attr.uikit_colorTerracotta : R$attr.uikit_colorAccent;
                circleProgressBar.a(new ProgressStyle((int) fFloatValue, 100, i2, i2, R$attr.uikit_colorGreyTone10, 2.0f, 2.0f, null, ViewUtils.EDGE_TO_EDGE_FLAGS));
                circleProgressBar.setVisibility(0);
            } else {
                circleProgressBar.setVisibility(8);
            }
        }
        if (z3) {
            holder.f54851h.setBadgeAndVisibility(model.k, holder.f54856p);
        }
        if (z4) {
            kli.a.b(holder.i, model.d, ty0.f.f275450a);
        }
        if (z6) {
            kli.a.b(holder.f54852j, model.e, ty0.f.f275450a);
        }
        if (z11) {
            Model.a aVar = model.i;
            AppCompatTextView appCompatTextView = holder.k;
            boolean z49 = aVar instanceof t5;
            ty0.d dVar = ty0.d.f275448a;
            if (z49) {
                kli.a.b(appCompatTextView, ((t5) aVar).f54742a, dVar);
                smallActionButton.setVisibility(8);
                smallActionButton.setText(null);
            } else if (aVar instanceof s5) {
                kli.a.b(appCompatTextView, null, ty0.f.f275450a);
                smallActionButton.setVisibility(0);
                smallActionButton.setText(((s5) aVar).f54685a);
            } else if (aVar instanceof u5) {
                u5 u5Var = (u5) aVar;
                kli.a.b(appCompatTextView, u5Var.f54803a, dVar);
                smallActionButton.setVisibility(0);
                smallActionButton.setText(u5Var.f54804b);
            } else {
                if (aVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                appCompatTextView.setVisibility(8);
                smallActionButton.setVisibility(8);
            }
        }
        int i3 = 6;
        if (z12) {
            Intrinsics.checkNotNullParameter(model, "model");
            LinearLayout linearLayout = holder.f54854m;
            linearLayout.removeAllViews();
            linearLayout.setVisibility(!model.f.isEmpty() ? 0 : 8);
            List list3 = model.f;
            int size = list3.size();
            for (int i5 = 0; i5 < size; i5++) {
                r5 r5Var = (r5) list3.get(i5);
                Context context = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ms0.q0 q0Var = new ms0.q0(context, null, i3, 0);
                q0Var.setStartLabel(r5Var.f54658a);
                q0Var.setEndLabel(r5Var.f54659b);
                q0Var.setEndLabelImage(null, model, new ip0.md(holder, r5Var, 1));
                linearLayout.addView(q0Var);
                ViewGroup.LayoutParams layoutParams = q0Var.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 4.0f);
                marginLayoutParams.bottomMargin = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 4.0f);
                q0Var.setLayoutParams(marginLayoutParams);
            }
        }
        if (z29) {
            List list4 = model.f52231g;
            FlexboxLayout flexboxLayout = holder.f54855n;
            flexboxLayout.removeAllViews();
            List list5 = list4;
            flexboxLayout.setVisibility((list5 == null || list5.isEmpty()) ? 8 : 0);
            if (list4 != null) {
                int size2 = list4.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    TagViewData tagViewData = (TagViewData) list4.get(i6);
                    Context context2 = holder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    TagView tagView = new TagView(context2, null, i3, 0);
                    tagView.setContent(tagViewData);
                    flexboxLayout.addView(tagView);
                }
            }
        }
        if (z31) {
            float f4 = model.f52232h ? 0.5f : 1.0f;
            View view = holder.itemView;
            Intrinsics.i(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int iD = 0; iD < childCount; iD = m72.b.d(viewGroup, iD, f4, iD, 1)) {
            }
        }
        if (z41) {
            qv0.c positionInBox = model.f52242w;
            qv0.k positionInGroup = model.f52243x;
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
            Context context3 = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Drawable drawableB = dr0.b.b(positionInBox, positionInGroup, context3, true, null, 48);
            if (drawableB != null) {
                holder.itemView.setBackground(drawableB);
            }
        }
        AnimationRequest animationRequest = model.f52233j;
        if (animationRequest != null && !animationRequest.f57724a) {
            animationRequest.f57724a = true;
            holder.getGlowHighlightManager().a();
            holder.getGlowHighlightManager().c();
        } else if (animationRequest == null) {
            holder.getGlowHighlightManager().a();
        }
        if (model.f52234l) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            py0.c cVar = new py0.c(model.e);
            or0.m.a(itemView);
            esimDelegate = this;
            itemView.setOnClickListener(new au0.i3(model, cVar, esimDelegate, model, 23));
        } else {
            esimDelegate = this;
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            or0.u.o(itemView2);
        }
        smallActionButton.setAnalyticsContext(model.f52239r);
        smallActionButton.setOnClickListener(new ap0.f(esimDelegate, model, 25));
        holder.o = new ip0.ad(esimDelegate, 5);
        efm.r map = holder.getGlowHighlightManager().f.map(new ip0.a9(new ip0.ad(model, 6), 27));
        Intrinsics.h(map);
        esimDelegate.f52227g.a(map, holder);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\b\tJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/EsimDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/l;", "", "toString", "()Ljava/lang/String;", "a", "com/revolut/core/ui_kit/delegates/r5", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem, qv0.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f52229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Float f52230c;
        public final Clause d;
        public final Clause e;
        public final List f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f52231g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f52232h;
        public final a i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AnimationRequest f52233j;
        public final CircleBadgeModel k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f52234l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f52235m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f52236n;
        public final int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f52237p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Object f52238q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Parcelable f52239r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p31.c f52240s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p31.c f52241t;
        public p31.c u;
        public p31.c v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public qv0.c f52242w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public qv0.k f52243x;

        public static abstract class a {
            private a() {
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Image icon, Float f, Clause clause, Clause title, a aVar, List list, List list2, boolean z, CircleBadgeModel circleBadgeModel, boolean z3, Object obj2, Parcelable parcelable, int i) {
            Float f4 = (i & 4) != 0 ? null : f;
            Clause clause2 = (i & 8) != 0 ? null : clause;
            a aVar2 = (i & 32) != 0 ? null : aVar;
            List additionalDescriptions = (i & 64) != 0 ? zhm.f0.f322471a : list;
            List list3 = (i & 128) != 0 ? null : list2;
            boolean z4 = (i & 256) != 0 ? false : z;
            CircleBadgeModel circleBadgeModel2 = (i & 1024) != 0 ? null : circleBadgeModel;
            boolean z6 = (i & 2048) != 0 ? true : z3;
            Object obj3 = (i & 4096) != 0 ? null : obj2;
            Parcelable parcelable2 = (i & 8192) != 0 ? null : parcelable;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(additionalDescriptions, "additionalDescriptions");
            int i2 = R$attr.uikit_dp0;
            this(listId, icon, f4, clause2, title, additionalDescriptions, list3, z4, aVar2, null, circleBadgeModel2, z6, i2, i2, i2, i2, obj3, parcelable2, null, null, null, null, c.d.f249513a, qv0.k.OutOfGroup);
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: C1, reason: from getter */
        public final boolean getF() {
            return this.f52234l;
        }

        @Override // qv0.l
        public final void R0(qv0.k kVar) {
            Intrinsics.checkNotNullParameter(kVar, "<set-?>");
            this.f52243x = kVar;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new EsimDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF51719g() {
            return this.f52238q;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF54946b() {
            return this.f52228a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52228a, model.f52228a) && Intrinsics.f(this.f52229b, model.f52229b) && Intrinsics.f(this.f52230c, model.f52230c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52231g, model.f52231g) && this.f52232h == model.f52232h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52233j, model.f52233j) && Intrinsics.f(this.k, model.k) && this.f52234l == model.f52234l && this.f52235m == model.f52235m && this.f52236n == model.f52236n && this.o == model.o && this.f52237p == model.f52237p && Intrinsics.f(this.f52238q, model.f52238q) && Intrinsics.f(this.f52239r, model.f52239r) && Intrinsics.f(this.f52240s, model.f52240s) && Intrinsics.f(this.f52241t, model.f52241t) && Intrinsics.f(this.u, model.u) && Intrinsics.f(this.v, model.v) && Intrinsics.f(this.f52242w, model.f52242w) && this.f52243x == model.f52243x;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF53416g() {
            return this.f52235m;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: f0, reason: from getter */
        public final qv0.k getF53464w() {
            return this.f52243x;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52235m = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF53801l() {
            return this.f52239r;
        }

        public final int hashCode() {
            int iC = a10.b.c(this.f52229b, this.f52228a.hashCode() * 31, 31);
            Float f = this.f52230c;
            int iHashCode = (iC + (f == null ? 0 : f.hashCode())) * 31;
            Clause clause = this.d;
            int iD = p.a.d(p.a.a((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.e), 31, this.f);
            List list = this.f52231g;
            int iC2 = j6.a.c((iD + (list == null ? 0 : list.hashCode())) * 31, 31, this.f52232h);
            a aVar = this.i;
            int iHashCode2 = (iC2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            AnimationRequest animationRequest = this.f52233j;
            int iHashCode3 = (iHashCode2 + (animationRequest == null ? 0 : animationRequest.hashCode())) * 31;
            CircleBadgeModel circleBadgeModel = this.k;
            int iB = j6.a.b(this.f52237p, j6.a.b(this.o, j6.a.b(this.f52236n, j6.a.b(this.f52235m, j6.a.c((iHashCode3 + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode())) * 31, 31, this.f52234l), 31), 31), 31), 31);
            Object obj2 = this.f52238q;
            int iHashCode4 = (iB + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52239r;
            int iHashCode5 = (iHashCode4 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            p31.c cVar = this.f52240s;
            int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52241t;
            int iHashCode7 = (iHashCode6 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.u;
            int iHashCode8 = (iHashCode7 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.v;
            return this.f52243x.hashCode() + h30.l.i(this.f52242w, (iHashCode8 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF53415c() {
            return this.f52240s;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52242w = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getD() {
            return this.f52241t;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.u = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53803n() {
            return this.f52236n;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53804p() {
            return this.f52237p;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52236n = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF53414b() {
            return this.f52242w;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF() {
            return this.v;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getE() {
            return this.u;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52240s = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52239r = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getO() {
            return this.o;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52241t = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.v = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            return new ip0.fg(!Intrinsics.f(this.f52229b, model.f52229b), !Intrinsics.e(this.f52230c, model.f52230c), !Intrinsics.f(this.k, model.k), !Intrinsics.f(this.d, model.d), !Intrinsics.f(this.e, model.e), !Intrinsics.f(this.i, model.i), !Intrinsics.f(this.f, model.f), !Intrinsics.f(this.f52231g, model.f52231g), this.f52232h != model.f52232h, or0.b.m(this, (qv0.l) oldItem));
        }

        public Model(String str, Image image, Float f, Clause clause, Clause clause2, List list, List list2, boolean z, a aVar, AnimationRequest animationRequest, CircleBadgeModel circleBadgeModel, boolean z3, int i, int i2, int i3, int i5, Object obj2, Parcelable parcelable, p31.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, qv0.c cVar5, qv0.k kVar) {
            this.f52228a = str;
            this.f52229b = image;
            this.f52230c = f;
            this.d = clause;
            this.e = clause2;
            this.f = list;
            this.f52231g = list2;
            this.f52232h = z;
            this.i = aVar;
            this.f52233j = animationRequest;
            this.k = circleBadgeModel;
            this.f52234l = z3;
            this.f52235m = i;
            this.f52236n = i2;
            this.o = i3;
            this.f52237p = i5;
            this.f52238q = obj2;
            this.f52239r = parcelable;
            this.f52240s = cVar;
            this.f52241t = cVar2;
            this.u = cVar3;
            this.v = cVar4;
            this.f52242w = cVar5;
            this.f52243x = kVar;
        }
    }
}
