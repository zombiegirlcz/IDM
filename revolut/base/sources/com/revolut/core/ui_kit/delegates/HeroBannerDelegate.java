package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.OnMeasureCallbackConstraintLayout;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.BadgeStatusView;
import com.revolut.core.ui_kit.views.HorizontalStepsProgressView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$color;
import com.revolut.core.ui_kit_resources.R$dimen;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.youTransactor.uCube.rpc.Constants;
import ip0.am;
import ip0.bm;
import ip0.cm;
import ip0.dk;
import ip0.dm;
import ip0.em;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00042\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0007\u0005\u0006\u0007\b\u0003\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/HeroBannerDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/HeroBannerDelegate$Model;", "Lip0/dm;", "Companion", "Model", "b", "ip0/cm", "ip0/am", "ip0/bm", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HeroBannerDelegate extends BaseRecyclerViewDelegate<Model, dm> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xt0.a f52423c;
    public final ihm.f d;
    public final ihm.f e;

    public static abstract class b {
        private b() {
        }
    }

    public HeroBannerDelegate() {
        this(0);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new dm(this, kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_hero_banner));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(dm holder, Model data, int i, List payloads) {
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        boolean z11;
        boolean z12;
        boolean z29;
        aw0.v1 v1Var;
        int iS;
        int iS2;
        int iS3;
        int color;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        HorizontalStepsProgressView horizontalStepsProgressView = holder.f163925l;
        AppCompatImageView appCompatImageView = holder.k;
        OnMeasureCallbackConstraintLayout onMeasureCallbackConstraintLayout = holder.f163922g;
        TextView textView = holder.i;
        TextView textView2 = holder.f163923h;
        ArrayList<bm> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof bm) {
                arrayList.add(obj2);
            }
        }
        if (payloads.size() != arrayList.size()) {
            arrayList = null;
        }
        boolean z31 = arrayList == null || arrayList.isEmpty();
        if (arrayList != null) {
            z = z31;
            z3 = z;
            z4 = z3;
            z6 = z4;
            z11 = z6;
            z12 = z11;
            for (bm bmVar : arrayList) {
                z31 = z31 || bmVar.f163627a;
                z = z || bmVar.f163628b;
                if (z3) {
                    z3 = true;
                } else {
                    bmVar.getClass();
                    z3 = false;
                }
                z6 = z6 || bmVar.f163629c;
                z11 = z11 || bmVar.d;
                z12 = z12 || bmVar.e;
                z4 = z4 || bmVar.f;
            }
        } else {
            z = z31;
            z3 = z;
            z4 = z3;
            z6 = z4;
            z11 = z6;
            z12 = z11;
        }
        if (z31) {
            Intrinsics.checkNotNullExpressionValue(textView2, "<get-title>(...)");
            kli.a.b(textView2, data.f52425b, ty0.f.f275450a);
        }
        if (z) {
            Intrinsics.checkNotNullExpressionValue(textView, "<get-description>(...)");
            kli.a.b(textView, data.f52426c, ty0.f.f275450a);
        }
        if (z3) {
            data.getClass();
            cm cmVar = cm.HERO;
            int dimensionPixelSize = holder.itemView.getResources().getDimensionPixelSize(R$dimen.internal_dp12);
            int dimensionPixelSize2 = holder.itemView.getResources().getDimensionPixelSize(R$dimen.internal_dp16);
            Intrinsics.checkNotNullExpressionValue(onMeasureCallbackConstraintLayout, "<get-root>(...)");
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(onMeasureCallbackConstraintLayout);
            int i2 = em.f164124c[cmVar.ordinal()];
            z29 = z4;
            if (i2 == 1) {
                constraintSet.constrainMinHeight(R$id.heroBanner_media, foh.i.j(LDSFile.EF_DG14_TAG));
                constraintSet.setVerticalBias(R$id.heroBanner_title, 0.5f);
                constraintSet.setGoneMargin(R$id.heroBanner_description, 4, dimensionPixelSize);
                constraintSet.setMargin(R$id.heroBanner_progress, 4, dimensionPixelSize);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                constraintSet.constrainMinHeight(R$id.heroBanner_media, foh.i.j(186));
                constraintSet.setVerticalBias(R$id.heroBanner_title, 1.0f);
                constraintSet.setGoneMargin(R$id.heroBanner_description, 4, dimensionPixelSize2);
                constraintSet.setMargin(R$id.heroBanner_progress, 4, dimensionPixelSize2);
            }
            constraintSet.applyTo(onMeasureCallbackConstraintLayout);
            onMeasureCallbackConstraintLayout.setOnMeasureCallback(new abf.c(cmVar, holder, 24));
        } else {
            z29 = z4;
        }
        if (z29) {
            BadgeStatusView badgeStatusView = holder.f163926m;
            Intrinsics.checkNotNullExpressionValue(badgeStatusView, "<get-badge>(...)");
            data.getClass();
            badgeStatusView.setVisibility(8);
        }
        if (z6) {
            Media media = data.d;
            Intrinsics.checkNotNullParameter(media, "media");
            holder.setItemRenderState(xv0.f.f309149a);
            UiKitMediaView mediaView = holder.f163924j;
            Intrinsics.checkNotNullExpressionValue(mediaView, "mediaView");
            jz0.d dVarA0 = or0.u.k(mediaView).a0();
            Intrinsics.checkNotNullExpressionValue(mediaView, "mediaView");
            ((jz0.b) dVarA0).b(media, mediaView, new fn2.c(holder, 16));
        }
        if (z11) {
            Context context = holder.itemView.getContext();
            int i3 = em.f164122a[data.f52428h.ordinal()];
            if (i3 == 1) {
                v1Var = aw0.v1.LIGHT;
            } else if (i3 == 2) {
                v1Var = aw0.v1.DARK;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.h(context);
                v1Var = kli.a.q(context) ? aw0.v1.DARK : aw0.v1.LIGHT;
            }
            int i5 = em.f164123b[v1Var.ordinal()];
            if (i5 == 1) {
                Intrinsics.h(context);
                iS = kli.a.s(R$attr.uikit_colorBlack, context);
                iS2 = kli.a.s(R$attr.uikit_colorBlack_80, context);
                iS3 = kli.a.s(R$attr.uikit_colorBlack_40, context);
                color = context.getColor(R$color.internal_widgetBackground);
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.h(context);
                iS = kli.a.s(R$attr.uikit_colorWhite, context);
                iS2 = kli.a.s(R$attr.uikit_colorWhite_80, context);
                iS3 = kli.a.s(R$attr.uikit_colorWhite_40, context);
                color = kli.a.q(context) ? kli.a.s(R$attr.uikit_colorWidgetBackground, context) : context.getColor(R$color.internal_widgetBackground_night);
            }
            textView2.setTextColor(iS);
            textView.setTextColor(iS2);
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_cross_small, (Integer) null, Integer.valueOf(iS3), (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, Constants.TAG_SUPPORTED_LOCALE_LIST);
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "<get-closeButton>(...)");
            yy0.f fVarQ = or0.u.k(appCompatImageView).Q();
            AppCompatImageView appCompatImageView2 = holder.k;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "<get-closeButton>(...)");
            yy0.f.e(fVarQ, resourceImage, appCompatImageView2, null, null, 12);
            horizontalStepsProgressView.setProgressColor(iS);
            onMeasureCallbackConstraintLayout.setBackgroundColor(color);
        }
        if (z12) {
            Intrinsics.checkNotNullExpressionValue(horizontalStepsProgressView, "<get-progress>(...)");
            b bVar = data.e;
            horizontalStepsProgressView.setVisibility(bVar != null ? 0 : 8);
            if (bVar instanceof u6) {
                horizontalStepsProgressView.setItemsCount(1);
                horizontalStepsProgressView.setOverallProgress(((u6) bVar).f54805a / 100.0f);
            } else if (bVar instanceof v6) {
                horizontalStepsProgressView.setItemsCount(((v6) bVar).f54858b);
                horizontalStepsProgressView.setOverallProgress(r2.f54857a);
            } else if (bVar != null) {
                throw new NoWhenBranchMatchedException();
            }
        }
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "<get-closeButton>(...)");
        appCompatImageView.setVisibility(data.f ? 0 : 8);
        if (data.f) {
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "<get-closeButton>(...)");
            or0.m.a(appCompatImageView);
            appCompatImageView.setOnClickListener(new au0.t1(data, 12, this, data));
        } else {
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "<get-closeButton>(...)");
            or0.u.o(appCompatImageView);
        }
        if (!data.f52427g) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.u.o(itemView);
        } else {
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            Clause clause = data.f52425b;
            py0.c cVar = clause != null ? new py0.c(clause) : null;
            or0.m.a(itemView2);
            itemView2.setOnClickListener(new au0.i3(data, cVar, this, data, 26));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/HeroBannerDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f52425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f52426c;
        public final Media d;
        public final b e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f52427g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final am f52428h;
        public final Object i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f52429j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f52430l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f52431m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f52432n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f52433p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f52434q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f52435r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public qv0.c f52436s;

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause title, Clause description, Media media, b bVar, boolean z, am colorScheme, Object obj2, AnalyticsContext analyticsContext, int i) {
            b bVar2 = (i & 16) != 0 ? null : bVar;
            boolean z3 = (i & 32) != 0 ? true : z;
            Object obj3 = (i & 512) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i & 1024) != 0 ? null : analyticsContext;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(media, "media");
            Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
            this(listId, title, description, media, bVar2, z3, true, colorScheme, obj3, (Parcelable) analyticsContext2);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new HeroBannerDelegate(0);
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52184j() {
            return this.i;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52179a() {
            return this.f52424a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52424a, model.f52424a) && Intrinsics.f(this.f52425b, model.f52425b) && Intrinsics.f(this.f52426c, model.f52426c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && this.f52427g == model.f52427g && this.f52428h == model.f52428h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52429j, model.f52429j) && this.k == model.k && this.f52430l == model.f52430l && this.f52431m == model.f52431m && this.f52432n == model.f52432n && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f52433p, model.f52433p) && Intrinsics.f(this.f52434q, model.f52434q) && Intrinsics.f(this.f52435r, model.f52435r) && Intrinsics.f(this.f52436s, model.f52436s);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52185l() {
            return this.k;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.k = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getK() {
            return this.f52429j;
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + p.a.a(p.a.a(this.f52424a.hashCode() * 31, 31, this.f52425b), 31, this.f52426c)) * 31;
            b bVar = this.e;
            int iHashCode2 = (this.f52428h.hashCode() + j6.a.c(j6.a.c((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f), 31, this.f52427g)) * 961;
            Object obj2 = this.i;
            int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52429j;
            int iB = j6.a.b(this.f52432n, j6.a.b(this.f52431m, j6.a.b(this.f52430l, j6.a.b(this.k, (iHashCode3 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31), 31), 31);
            p31.c cVar = this.o;
            int iHashCode4 = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52433p;
            int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52434q;
            int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52435r;
            return this.f52436s.hashCode() + ((iHashCode6 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF() {
            return this.f52435r;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52436s = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52182g() {
            return this.o;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52433p = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52186m() {
            return this.f52430l;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getO() {
            return this.f52432n;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52430l = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getE() {
            return this.f52436s;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getI() {
            return this.f52434q;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52183h() {
            return this.f52433p;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52435r = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52429j = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52187n() {
            return this.f52431m;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.o = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52434q = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            model.getClass();
            return new bm(!Intrinsics.f(model.f52425b, this.f52425b), !Intrinsics.f(model.f52426c, this.f52426c), !Intrinsics.f(model.d, this.d), model.f52428h != this.f52428h, !Intrinsics.f(model.e, this.e), false);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, TextLocalisedClause title, TextLocalisedClause description, CdnImage media, aw0.v1 colorScheme) {
            am amVar;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(media, "media");
            Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
            int i = t6.f54743a[colorScheme.ordinal()];
            if (i == 1) {
                amVar = am.LIGHT;
            } else if (i == 2) {
                amVar = am.DARK;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            this(listId, (Clause) title, (Clause) description, (Media) media, (b) null, false, true, amVar, (Object) null, (Parcelable) null);
        }

        public Model(String str, Clause clause, Clause clause2, Media media, b bVar, boolean z, boolean z3, am amVar, Object obj2, Parcelable parcelable) {
            int i = R$attr.uikit_dp0;
            this.f52424a = str;
            this.f52425b = clause;
            this.f52426c = clause2;
            this.d = media;
            this.e = bVar;
            this.f = z;
            this.f52427g = z3;
            this.f52428h = amVar;
            this.i = obj2;
            this.f52429j = parcelable;
            this.k = i;
            this.f52430l = i;
            this.f52431m = i;
            this.f52432n = i;
            this.o = null;
            this.f52433p = null;
            this.f52434q = null;
            this.f52435r = null;
            this.f52436s = c.d.f249513a;
        }
    }

    public HeroBannerDelegate(int i) {
        super(R$layout.internal_delegate_hero_banner, new dk(9));
        this.f52423c = null;
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
    }
}
