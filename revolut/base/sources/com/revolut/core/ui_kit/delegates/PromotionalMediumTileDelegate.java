package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.i60;
import ip0.j60;
import ip0.k60;
import ip0.kt;
import ip0.l40;
import ip0.ws;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0003\u0006\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromotionalMediumTileDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/PromotionalMediumTileDelegate$Model;", "Lip0/k60;", "<init>", "()V", "Model", "ip0/j60", "b", "ip0/i60", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PromotionalMediumTileDelegate extends BaseRecyclerViewDelegate<Model, k60> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53038c;
    public final ihm.f d;
    public final ihm.f e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromotionalMediumTileDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f53040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f53041c;
        public final Media d;
        public final vc e;
        public final b f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f53042g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f53043h;
        public final Object i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f53044j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f53045l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f53046m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f53047n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f53048p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f53049q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f53050r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public qv0.c f53051s;

        public Model(String listId, Clause title, Clause clause, Media background, vc componentStyle, wc wcVar, Object obj2, AnalyticsContext analyticsContext, int i) {
            clause = (i & 4) != 0 ? null : clause;
            wcVar = (i & 32) != 0 ? null : wcVar;
            int i2 = R$attr.uikit_colorGroupedBackground;
            analyticsContext = (i & 512) != 0 ? null : analyticsContext;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(background, "background");
            Intrinsics.checkNotNullParameter(componentStyle, "componentStyle");
            int i3 = R$attr.uikit_dp0;
            this.f53039a = listId;
            this.f53040b = title;
            this.f53041c = clause;
            this.d = background;
            this.e = componentStyle;
            this.f = wcVar;
            this.f53042g = true;
            this.f53043h = i2;
            this.i = obj2;
            this.f53044j = analyticsContext;
            this.k = i3;
            this.f53045l = i3;
            this.f53046m = i3;
            this.f53047n = i3;
            this.o = null;
            this.f53048p = null;
            this.f53049q = null;
            this.f53050r = null;
            this.f53051s = c.d.f249513a;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new PromotionalMediumTileDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getI() {
            return this.i;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53039a() {
            return this.f53039a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return this.f53039a.equals(model.f53039a) && this.f53040b.equals(model.f53040b) && Intrinsics.f(this.f53041c, model.f53041c) && this.d.equals(model.d) && this.e.equals(model.e) && Intrinsics.f(this.f, model.f) && this.f53042g == model.f53042g && this.f53043h == model.f53043h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f53044j, model.f53044j) && this.k == model.k && this.f53045l == model.f53045l && this.f53046m == model.f53046m && this.f53047n == model.f53047n && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f53048p, model.f53048p) && Intrinsics.f(this.f53049q, model.f53049q) && Intrinsics.f(this.f53050r, model.f53050r) && Intrinsics.f(this.f53051s, model.f53051s);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getK() {
            return this.k;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.k = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF53044j() {
            return this.f53044j;
        }

        public final int hashCode() {
            int iB = p.a.b(this.f53039a.hashCode() * 31, 31, this.f53040b);
            Clause clause = this.f53041c;
            int iHashCode = (this.e.f54864a.hashCode() + ((this.d.hashCode() + ((iB + (clause == null ? 0 : clause.hashCode())) * 31)) * 31)) * 31;
            b bVar = this.f;
            int iB2 = j6.a.b(this.f53043h, j6.a.c((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f53042g), 31);
            Object obj2 = this.i;
            int iHashCode2 = (iB2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f53044j;
            int iB3 = j6.a.b(this.f53047n, j6.a.b(this.f53046m, j6.a.b(this.f53045l, j6.a.b(this.k, (iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31), 31), 31);
            p31.c cVar = this.o;
            int iHashCode3 = (iB3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f53048p;
            int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f53049q;
            int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f53050r;
            return this.f53051s.hashCode() + ((iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getO() {
            return this.o;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53051s = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF53048p() {
            return this.f53048p;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f53049q = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53045l() {
            return this.f53045l;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53047n() {
            return this.f53047n;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53045l = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF53051s() {
            return this.f53051s;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF53050r() {
            return this.f53050r;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF53049q() {
            return this.f53049q;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.o = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53044j = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF53046m() {
            return this.f53046m;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f53048p = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f53050r = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new j60(!r0.f53040b.equals(this.f53040b), !Intrinsics.f(r0.f53041c, this.f53041c), !r0.d.equals(this.d), !r0.e.equals(this.e), !Intrinsics.f(r0.f, this.f), or0.b.l(this, (qv0.i) oldItem), ((Model) oldItem).f53043h != this.f53043h);
        }
    }

    public static abstract class a {
        private a() {
        }
    }

    public static abstract class b {
        private b() {
        }
    }

    public PromotionalMediumTileDelegate() {
        super(R$layout.internal_delegate_promotional_medium_tile, new l40(10));
        this.f53038c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new k60(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_promotional_medium_tile));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    public final void p(k60 holder, Model data, int i, List list) {
        PromotionalMediumTileDelegate promotionalMediumTileDelegate;
        List<j60> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        ImageView imageView = holder.f164970l;
        SmallActionButton smallActionButton = holder.f164971m;
        UiKitMediaView uiKitMediaView = holder.f;
        TextView textView = holder.f164968h;
        TextView textView2 = holder.f164967g;
        List list2 = payloads;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (true) {
                if (it8.hasNext()) {
                    if (!(it8.next() instanceof j60)) {
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
        Intrinsics.i(payloads, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.core.ui_kit.delegates.PromotionalMediumTileDelegate.Payload>");
        boolean zIsEmpty = payloads.isEmpty();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        for (j60 j60Var : payloads) {
            zIsEmpty = zIsEmpty || j60Var.f164793a;
            z = z || j60Var.f164794b;
            z3 = z3 || j60Var.f164795c;
            z6 = z6 || j60Var.d;
            z11 = z11 || j60Var.e;
            z12 = z12 || j60Var.f;
            z4 = z4 || j60Var.f164796g;
        }
        if (zIsEmpty) {
            kli.a.b(textView2, data.f53040b, ty0.f.f275450a);
        }
        if (z) {
            kli.a.b(textView, data.f53041c, ty0.f.f275450a);
        }
        if (z3) {
            Media media = data.d;
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            ((jz0.b) or0.u.k(itemView).a0()).b(media, uiKitMediaView, null);
        }
        if (z4) {
            uiKitMediaView.setVideoShutter(new VideoShutter.Colored(new Color.Solid(data.f53043h)));
        }
        if (z6) {
            vc vcVar = data.e;
            holder.i.setVisibility(8);
            holder.k.setVisibility(8);
            holder.f164969j.setVisibility(8);
            smallActionButton.setVisibility(0);
            i60 i60Var = vcVar.f54864a;
            smallActionButton.setText(i60Var.f164644a);
            smallActionButton.i(i60Var.f164645b);
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topToTop = 0;
            layoutParams2.topToBottom = -1;
            Context context = textView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = kli.a.k(context, 16.0f);
            textView2.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.topToBottom = textView2.getId();
            layoutParams4.bottomToBottom = -1;
            layoutParams4.bottomToTop = smallActionButton.getId();
            Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = kli.a.k(context2, BitmapDescriptorFactory.HUE_RED);
            textView.setLayoutParams(layoutParams4);
        }
        if (z11) {
            imageView.setVisibility(data.f instanceof wc ? 0 : 8);
            b bVar = data.f;
            wc wcVar = bVar instanceof wc ? (wc) bVar : null;
            zi0.c.g(imageView, wcVar != null ? new ResourceImage(R$drawable.uikit_icn_16_cross, (Integer) null, (Integer) null, Integer.valueOf(wcVar.f54920a), (List) null, (ImageTransformations) null, (Clause) null, 246) : null);
        }
        if (z12) {
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            promotionalMediumTileDelegate = this;
            or0.b.c(promotionalMediumTileDelegate, data, itemView2, false, null, 28);
        } else {
            promotionalMediumTileDelegate = this;
        }
        holder.itemView.setOnClickListener(data.f53042g ? new ip0.j5(data, 5, holder, promotionalMediumTileDelegate) : null);
        holder.itemView.setClickable(data.f53042g);
        py0.a aVar = new py0.a("PromotionalMediumTileDelegateClose");
        or0.m.a(imageView);
        imageView.setOnClickListener(new kt(data, aVar, this, data, 13));
        imageView.setOnTouchListener(new j01.e(new View[]{imageView}));
        smallActionButton.setAnalyticsContext(data.f53044j);
        smallActionButton.setOnClickListener(new ws(this, data, 12));
    }
}
