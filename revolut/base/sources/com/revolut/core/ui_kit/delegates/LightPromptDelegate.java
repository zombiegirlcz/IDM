package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.product_article.impl.ui.screen.details.ProductArticleDetailsController;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.at;
import ip0.hq;
import ip0.ws;
import ip0.ys;
import ip0.zs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00042\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0005\u0005\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/LightPromptDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/LightPromptDelegate$Model;", "Lip0/zs;", "Companion", "Model", "ip0/xs", "ip0/ys", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class LightPromptDelegate extends BaseRecyclerViewDelegate<Model, zs> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xt0.a f52629c;
    public final ihm.f d;

    public static final class a {
        private a() {
        }
    }

    public LightPromptDelegate() {
        this(null);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new zs(this, kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_light_prompt));
    }

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
    public final void p(zs holder, Model data, int i, List payloads) {
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        ws wsVar;
        String str;
        int iA;
        int i2;
        int i3;
        boolean z11;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        UiKitMediaView uiKitMediaView = holder.i;
        TextView textView = holder.f167535g;
        TextView textView2 = holder.f;
        UiKitMediaView uiKitMediaView2 = holder.f167537j;
        ArrayList<ys> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof ys) {
                arrayList.add(obj2);
            }
        }
        if (payloads.size() != arrayList.size()) {
            arrayList = null;
        }
        boolean z12 = true;
        boolean z29 = arrayList == null || arrayList.isEmpty();
        if (arrayList != null) {
            z = z29;
            z3 = z;
            z4 = z3;
            z6 = z4;
            for (ys ysVar : arrayList) {
                z29 = z29 || ysVar.f167349a;
                z = z || ysVar.f167350b;
                z6 = z6 || ysVar.f167351c;
                z3 = z3 || ysVar.d;
                z4 = z4 || ysVar.e;
            }
        } else {
            z = z29;
            z3 = z;
            z4 = z3;
            z6 = z4;
        }
        if (z29) {
            Intrinsics.checkNotNullExpressionValue(textView2, "<get-title>(...)");
            kli.a.b(textView2, data.f52631b, ty0.f.f275450a);
        }
        if (z) {
            Intrinsics.checkNotNullExpressionValue(textView, "<get-description>(...)");
            kli.a.b(textView, data.f52632c, ty0.f.f275450a);
        }
        if (z3) {
            qv0.c cVar = data.o;
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.b(this, cVar, itemView, false, null, null, null, 56);
        }
        t7 t7Var = t7.f54744a;
        if (z4) {
            v7 v7Var = data.f;
            if (Intrinsics.f(v7Var, t7Var)) {
                i3 = R$attr.uikit_colorForeground;
                z11 = true;
                z12 = false;
            } else {
                if (!(v7Var instanceof u7)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i5 = at.f163492a[((u7) v7Var).f54806a.ordinal()];
                if (i5 == 1) {
                    i2 = R$attr.uikit_colorBlack;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R$attr.uikit_colorWhite;
                }
                i3 = i2;
                z11 = false;
            }
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iS = kli.a.s(i3, context);
            textView2.setTextColor(iS);
            textView.setTextColor(iS);
            View view = holder.f167536h;
            Intrinsics.checkNotNullExpressionValue(view, "<get-fullSizeMediaWrapper>(...)");
            view.setVisibility(z12 ? 0 : 8);
            Intrinsics.checkNotNullExpressionValue(uiKitMediaView2, "<get-compactMedia>(...)");
            uiKitMediaView2.setVisibility(z11 ? 0 : 8);
        }
        if (z6 || z4) {
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            jz0.d dVarA0 = or0.u.k(itemView2).a0();
            v7 v7Var2 = data.f;
            Media media = data.d;
            if (Intrinsics.f(v7Var2, t7Var)) {
                Intrinsics.checkNotNullExpressionValue(uiKitMediaView, "<get-fullSizeMedia>(...)");
                ((jz0.b) dVarA0).b(null, uiKitMediaView, null);
                Intrinsics.checkNotNullExpressionValue(uiKitMediaView2, "<get-compactMedia>(...)");
                ((jz0.b) dVarA0).b(media, uiKitMediaView2, null);
                ImageView imageView = (ImageView) uiKitMediaView2.b(R$layout.internal_uikit_media_image);
                if (imageView != null && imageView.getVisibility() == 0 && rd0.e.m(imageView)) {
                    iA = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 250.0f);
                    str = null;
                } else {
                    str = "343:248";
                    iA = 0;
                }
                ViewGroup.LayoutParams layoutParams = uiKitMediaView2.getLayoutParams();
                ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null && (((ViewGroup.MarginLayoutParams) layoutParams2).height != iA || ((ViewGroup.MarginLayoutParams) layoutParams2).width != iA || !Intrinsics.f(str, layoutParams2.dimensionRatio))) {
                    Intrinsics.checkNotNullExpressionValue(uiKitMediaView2, "<get-compactMedia>(...)");
                    ViewGroup.LayoutParams layoutParams3 = uiKitMediaView2.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                    ((ViewGroup.MarginLayoutParams) layoutParams4).width = iA;
                    ((ViewGroup.MarginLayoutParams) layoutParams4).height = iA;
                    layoutParams4.dimensionRatio = str;
                    uiKitMediaView2.setLayoutParams(layoutParams4);
                }
                wsVar = null;
            } else {
                if (!(v7Var2 instanceof u7)) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.checkNotNullExpressionValue(uiKitMediaView2, "<get-compactMedia>(...)");
                wsVar = null;
                ((jz0.b) dVarA0).b(null, uiKitMediaView2, null);
                Intrinsics.checkNotNullExpressionValue(uiKitMediaView, "<get-fullSizeMedia>(...)");
                ((jz0.b) dVarA0).b(media, uiKitMediaView, null);
            }
        } else {
            wsVar = null;
        }
        holder.itemView.setOnClickListener(data.e ? new ws(data, this, 0) : wsVar);
        holder.itemView.setClickable(data.e);
    }

    public LightPromptDelegate(ProductArticleDetailsController lifecycleOwner) {
        xt0.a aVar;
        super(R$layout.internal_delegate_light_prompt, new hq(14));
        if (lifecycleOwner != null) {
            aVar = new xt0.a();
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            lifecycleOwner.getLifecycle().addObserver(new xt0.b(lifecycleOwner, aVar));
        } else {
            aVar = null;
        }
        this.f52629c = aVar;
        this.d = v0.a.d("create(...)");
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/LightPromptDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/v7", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f52631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f52632c;
        public final Media d;
        public final boolean e;
        public final v7 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f52633g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f52634h;
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f52635j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f52636l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f52637m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f52638n;
        public qv0.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Parcelable f52639p;

        public Model(String listId, TextClause textClause, TextClause textClause2, Media media, boolean z, v7 mediaStyle) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(media, "media");
            Intrinsics.checkNotNullParameter(mediaStyle, "mediaStyle");
            int i = R$attr.uikit_dp0;
            this.f52630a = listId;
            this.f52631b = textClause;
            this.f52632c = textClause2;
            this.d = media;
            this.e = z;
            this.f = mediaStyle;
            this.f52633g = i;
            this.f52634h = i;
            this.i = i;
            this.f52635j = i;
            this.k = null;
            this.f52636l = null;
            this.f52637m = null;
            this.f52638n = null;
            this.o = c.d.f249513a;
            this.f52639p = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new LightPromptDelegate(null);
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF55076n() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55069b() {
            return this.f52630a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52630a, model.f52630a) && Intrinsics.f(this.f52631b, model.f52631b) && Intrinsics.f(this.f52632c, model.f52632c) && Intrinsics.f(this.d, model.d) && this.e == model.e && Intrinsics.f(this.f, model.f) && this.f52633g == model.f52633g && this.f52634h == model.f52634h && this.i == model.i && this.f52635j == model.f52635j && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52636l, model.f52636l) && Intrinsics.f(this.f52637m, model.f52637m) && Intrinsics.f(this.f52638n, model.f52638n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f52639p, model.f52639p);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getU() {
            return this.f52633g;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52633g = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getE() {
            return this.f52639p;
        }

        public final int hashCode() {
            int iHashCode = this.f52630a.hashCode() * 31;
            Clause clause = this.f52631b;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.f52632c;
            int iB = j6.a.b(this.f52635j, j6.a.b(this.i, j6.a.b(this.f52634h, j6.a.b(this.f52633g, (this.f.hashCode() + j6.a.c((this.d.hashCode() + ((iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31)) * 31, 31, this.e)) * 31, 31), 31), 31), 31);
            p31.c cVar = this.k;
            int iHashCode3 = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52636l;
            int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52637m;
            int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52638n;
            int i = h30.l.i(this.o, (iHashCode5 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 961);
            Parcelable parcelable = this.f52639p;
            return i + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF55078q() {
            return this.f52638n;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.o = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF55079r() {
            return this.k;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52636l = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getV() {
            return this.f52634h;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF55083x() {
            return this.f52635j;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52634h = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF55077p() {
            return this.o;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF55081t() {
            return this.f52637m;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF55080s() {
            return this.f52636l;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52638n = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52639p = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF55082w() {
            return this.i;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.k = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52637m = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new ys(!Intrinsics.f(model.f52631b, this.f52631b), !Intrinsics.f(model.f52632c, this.f52632c), !Intrinsics.f(model.d, this.d), or0.b.l((qv0.i) oldItem, this), !Intrinsics.f(model.f, this.f));
        }

        public /* synthetic */ Model(String str, Media media, v7 v7Var) {
            this(str, null, null, media, false, v7Var);
        }
    }
}
