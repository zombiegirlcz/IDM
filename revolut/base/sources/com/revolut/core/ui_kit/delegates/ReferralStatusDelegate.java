package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.da0;
import ip0.ea0;
import ip0.fa0;
import ip0.ga0;
import ip0.kt;
import ip0.t90;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0006\u0007\b\t\n\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ReferralStatusDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ReferralStatusDelegate$Model;", "Lip0/ga0;", "<init>", "()V", "Model", "ip0/ea0", "a", "ip0/fa0", "ip0/da0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReferralStatusDelegate extends BaseRecyclerViewDelegate<Model, ga0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53176c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ReferralStatusDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GlyphImage f53178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextLocalisedClause f53179c;
        public final Object d;
        public final CircleBadgeModel e;
        public final ArrayList f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final dx4.r0 f53180g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f53181h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f53182j;
        public final int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f53183l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public qv0.c f53184m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f53185n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f53186p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f53187q;

        public Model(String listId, GlyphImage glyphImage, TextLocalisedClause title, Clause clause, CircleBadgeModel circleBadgeModel, ArrayList stages, dx4.r0 r0Var, AnalyticsContext analyticsContext) {
            int i = R$attr.uikit_dp0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(stages, "stages");
            a.b value = a.b.f53188a;
            Intrinsics.checkNotNullParameter(value, "value");
            this.f53177a = listId;
            this.f53178b = glyphImage;
            this.f53179c = title;
            this.d = clause;
            this.e = circleBadgeModel;
            this.f = stages;
            this.f53180g = r0Var;
            this.f53181h = analyticsContext;
            this.i = i;
            this.f53182j = i;
            this.k = i;
            this.f53183l = i;
            this.f53184m = c.d.f249513a;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ReferralStatusDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF55256g() {
            return this.f53180g;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53916a() {
            return this.f53177a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            if (!Intrinsics.f(this.f53177a, model.f53177a) || !Intrinsics.f(this.f53178b, model.f53178b) || !this.f53179c.equals(model.f53179c) || !Intrinsics.f(this.d, model.d) || !Intrinsics.f(this.e, model.e) || !this.f.equals(model.f)) {
                return false;
            }
            Object obj3 = a.b.f53188a;
            return obj3.equals(obj3) && Intrinsics.f(this.f53180g, model.f53180g) && Intrinsics.f(this.f53181h, model.f53181h) && this.i == model.i && this.f53182j == model.f53182j && this.k == model.k && this.f53183l == model.f53183l;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getI() {
            return this.i;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.i = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF53923g() {
            return this.f53181h;
        }

        public final int hashCode() {
            int iHashCode = this.f53177a.hashCode() * 31;
            GlyphImage glyphImage = this.f53178b;
            int iA = t61.a.a((iHashCode + (glyphImage == null ? 0 : glyphImage.hashCode())) * 31, 31, this.f53179c);
            Object obj2 = this.d;
            int iHashCode2 = (iA + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            CircleBadgeModel circleBadgeModel = this.e;
            int iC = j6.a.c((a.b.f53188a.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, (iHashCode2 + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode())) * 31, 31)) * 31, 31, false);
            dx4.r0 r0Var = this.f53180g;
            int iHashCode3 = (iC + (r0Var == null ? 0 : r0Var.hashCode())) * 31;
            Parcelable parcelable = this.f53181h;
            return Integer.hashCode(this.f53183l) + j6.a.b(this.k, j6.a.b(this.f53182j, j6.a.b(this.i, (iHashCode3 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF55048m() {
            return this.f53185n;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53184m = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF55049n() {
            return this.o;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f53186p = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53921j() {
            return this.f53182j;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53922l() {
            return this.f53183l;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53182j = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF55047l() {
            return this.f53184m;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF55050p() {
            return this.f53187q;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getO() {
            return this.f53186p;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f53185n = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53181h = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getK() {
            return this.k;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.o = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f53187q = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            boolean z = !Intrinsics.f(model.f53178b, this.f53178b);
            boolean z3 = !Intrinsics.f(model.e, this.e);
            boolean zL = or0.b.l(this, (qv0.i) oldItem);
            boolean z4 = !model.f53179c.equals(this.f53179c);
            boolean z6 = !Intrinsics.f(model.d, this.d);
            boolean z11 = !model.f.equals(this.f);
            Object obj2 = a.b.f53188a;
            return new ea0(z, false, z3, z4, z6, !obj2.equals(obj2), z11, zL);
        }
    }

    public static abstract class a {

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.ReferralStatusDelegate$a$a, reason: collision with other inner class name */
        public static final class C0419a extends a {
            private C0419a() {
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f53188a = new b();

            private b() {
            }
        }

        private a() {
        }
    }

    public ReferralStatusDelegate() {
        super(R$layout.internal_delegate_referral_status, new t90(4));
        Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
        ihm.f fVar = new ihm.f();
        Intrinsics.checkNotNullExpressionValue(fVar, "create(...)");
        this.f53176c = fVar;
    }

    public static void r(ga0 ga0Var, Model model) {
        if (model.f53178b == null) {
            ImageView imageView = ga0Var.f164388m;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topToTop = R$id.referralStatus_title;
            layoutParams2.bottomToBottom = R$id.referralStatus_description;
            imageView.setLayoutParams(layoutParams2);
            return;
        }
        ImageView imageView2 = ga0Var.f164388m;
        ViewGroup.LayoutParams layoutParams3 = imageView2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        int i = R$id.referralStatus_image;
        layoutParams4.topToTop = i;
        layoutParams4.bottomToBottom = i;
        imageView2.setLayoutParams(layoutParams4);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ga0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_referral_status));
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ga0 holder, Model data, int i, List list) {
        ReferralStatusDelegate referralStatusDelegate;
        int i2;
        int i3;
        int i5;
        List<ea0> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        LinearLayout linearLayout = holder.k;
        int size = payloads.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                break;
            }
            if (!(payloads.get(i6) instanceof ea0)) {
                payloads = null;
                break;
            }
            i6++;
        }
        List list2 = payloads;
        boolean z = list2 == null || list2.isEmpty();
        boolean z3 = list2 == null || list2.isEmpty();
        boolean z4 = list2 == null || list2.isEmpty();
        boolean z6 = list2 == null || list2.isEmpty();
        boolean z11 = list2 == null || list2.isEmpty();
        boolean z12 = list2 == null || list2.isEmpty();
        boolean z29 = list2 == null || list2.isEmpty();
        boolean z31 = list2 == null || list2.isEmpty();
        if (payloads != null) {
            for (ea0 ea0Var : payloads) {
                z = z || ea0Var.f164044a;
                z3 = z3 || ea0Var.d;
                z4 = z4 || ea0Var.e;
                z6 = z6 || ea0Var.f164045b;
                z11 = z11 || ea0Var.f164046c;
                z12 = z12 || ea0Var.f;
                z29 = z29 || ea0Var.f164047g;
                z31 = z31 || ea0Var.f164048h;
            }
        }
        if (z) {
            referralStatusDelegate = this;
            or0.b.f(referralStatusDelegate, data.f53178b, holder.f);
        } else {
            referralStatusDelegate = this;
        }
        if (z3) {
            kli.a.b(holder.i, data.f53179c, ty0.f.f275450a);
        }
        if (z4) {
            kli.a.b(holder.f164386j, data.d, ty0.f.f275450a);
        }
        if (z6) {
            ImageView imageView = holder.f164384g;
            data.getClass();
            imageView.setVisibility(8);
        }
        if (z11) {
            holder.f164385h.setBadgeAndVisibility(data.e, holder.f164389n);
        }
        if (z12 || z29) {
            data.getClass();
            holder.f164387l.setVisibility(8);
            ImageView imageView2 = holder.f164388m;
            imageView2.setVisibility(0);
            q(holder, data);
            r(holder, data);
            ArrayList arrayList = data.f;
            if (arrayList.isEmpty()) {
                imageView2.setImageResource(R$drawable.uikit_icn_24_check);
                Context context = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                rd0.e.q(imageView2, Integer.valueOf(kli.a.s(R$attr.uikit_colorPerformancePositive, context)));
            } else {
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    if (!((fa0) it8.next()).f164230b) {
                        imageView2.setImageResource(R$drawable.uikit_icn_24_chevron_right);
                        Context context2 = holder.itemView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        rd0.e.q(imageView2, Integer.valueOf(kli.a.s(R$attr.uikit_colorGreyTone20, context2)));
                        break;
                    }
                }
                imageView2.setImageResource(R$drawable.uikit_icn_24_check);
                Context context3 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                rd0.e.q(imageView2, Integer.valueOf(kli.a.s(R$attr.uikit_colorPerformancePositive, context3)));
            }
        }
        if (z29) {
            ArrayList<fa0> arrayList2 = data.f;
            linearLayout.removeAllViews();
            for (fa0 fa0Var : arrayList2) {
                Context context4 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                ms0.x3 x3Var = new ms0.x3(context4);
                if (fa0Var.f164230b) {
                    i2 = fa0Var.f164231c == da0.IconAndText ? R$attr.uikit_colorPerformancePositive : R$attr.uikit_colorGreyTone50;
                    i3 = R$drawable.uikit_icn_16_check;
                    i5 = R$attr.uikit_colorPerformancePositive;
                } else {
                    i2 = R$attr.uikit_colorGreyTone50;
                    i3 = R$drawable.uikit_icn_16_time;
                    i5 = R$attr.uikit_colorGreyTone20;
                }
                ms0.x3.setContent$default(x3Var, new ms0.y3(new ResourceImage(i3, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), fa0Var.f164229a, i2, i5), null, 2, null);
                linearLayout.addView(x3Var);
            }
        }
        if (z31 || z12) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            data.getClass();
            or0.b.c(referralStatusDelegate, data, itemView, true, null, 24);
        }
    }

    public final void q(ga0 ga0Var, Model model) {
        ga0Var.itemView.setClickable(true);
        View itemView = ga0Var.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        py0.c cVar = new py0.c(model.f53179c);
        or0.m.a(itemView);
        itemView.setOnClickListener(new kt(model, cVar, this, model, 15));
    }
}
