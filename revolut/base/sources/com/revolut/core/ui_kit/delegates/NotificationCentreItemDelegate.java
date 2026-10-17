package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.CutoutLottieAnimationView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.bz;
import ip0.fv;
import ip0.wy;
import ip0.yy;
import ip0.zy;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0007\u0006\u0007\b\t\n\u000b\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/NotificationCentreItemDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/NotificationCentreItemDelegate$Model;", "Lip0/zy;", "<init>", "()V", "Model", "ip0/wy", "ip0/xy", "ip0/az", "ip0/bz", "ip0/yy", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NotificationCentreItemDelegate extends BaseRecyclerViewDelegate<Model, zy> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52865c;
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    public NotificationCentreItemDelegate() {
        super(R$layout.internal_delegate_notification_centre_item, new fv(24));
        this.f52865c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new zy(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_notification_centre_item));
    }

    /* JADX WARN: Type inference failed for: r2v31, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(zy holder, Model data, int i, List payloads) {
        boolean z;
        TextView textView;
        boolean z3;
        yp0.o oVar;
        View view;
        TextView textView2;
        CutoutLottieAnimationView cutoutLottieAnimationView;
        wy wyVar;
        int i2;
        int iJ;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView3 = holder.f167552p;
        TextView textView4 = holder.o;
        SmallActionButton smallActionButton = holder.f167551n;
        SmallActionButton smallActionButton2 = holder.f167550m;
        TextView textView5 = holder.i;
        View view2 = holder.k;
        TextView textView6 = holder.f167547h;
        CutoutLottieAnimationView cutoutLottieAnimationView2 = holder.f;
        String str = data.f52866a;
        boolean z4 = data.k;
        wy wyVar2 = data.e;
        wy wyVar3 = data.d;
        x9 x9Var = data.f52871j;
        boolean z6 = data.f;
        this.e.onNext(new bz(str, data.f52872l));
        List list = payloads;
        boolean zIsEmpty = list.isEmpty();
        boolean zIsEmpty2 = list.isEmpty();
        boolean zIsEmpty3 = list.isEmpty();
        boolean zIsEmpty4 = list.isEmpty();
        boolean zIsEmpty5 = list.isEmpty();
        boolean zIsEmpty6 = list.isEmpty();
        boolean zIsEmpty7 = list.isEmpty();
        boolean zIsEmpty8 = list.isEmpty();
        boolean zIsEmpty9 = list.isEmpty();
        boolean zIsEmpty10 = list.isEmpty();
        boolean zIsEmpty11 = list.isEmpty();
        Iterator it8 = payloads.iterator();
        while (true) {
            z = zIsEmpty;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            boolean z11 = zIsEmpty11;
            if (next instanceof y9) {
                boolean z12 = z || ((y9) next).f55638a;
                zIsEmpty2 = zIsEmpty2 || ((y9) next).f55639b;
                z = z12;
                zIsEmpty3 = zIsEmpty3 || ((y9) next).f55640c;
                zIsEmpty4 = zIsEmpty4 || ((y9) next).d;
                zIsEmpty5 = zIsEmpty5 || ((y9) next).i;
                zIsEmpty6 = zIsEmpty6 || ((y9) next).f55643j;
                zIsEmpty7 = zIsEmpty7 || ((y9) next).f55642h;
                zIsEmpty8 = zIsEmpty8 || ((y9) next).k;
                boolean z29 = zIsEmpty9 || ((y9) next).e;
                zIsEmpty9 = z29;
                zIsEmpty10 = z29 || ((y9) next).f;
                zIsEmpty11 = z11 || ((y9) next).f55641g;
            } else {
                zIsEmpty11 = z11;
            }
            zIsEmpty = z;
        }
        boolean z31 = zIsEmpty11;
        if (z) {
            view2.setVisibility(z6 ? 0 : 8);
            holder.f167549l.setVisibility(z6 ? 0 : 8);
        }
        if (zIsEmpty10) {
            ViewGroup.LayoutParams layoutParams = cutoutLottieAnimationView2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            z3 = zIsEmpty2;
            int i3 = aa.f53673a[x9Var.ordinal()];
            textView = textView3;
            if (i3 == 1) {
                iJ = foh.i.j(24);
            } else if (i3 == 2) {
                iJ = foh.i.j(40);
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                iJ = foh.i.j(56);
            }
            layoutParams.width = iJ;
            layoutParams.height = iJ;
            cutoutLottieAnimationView2.setLayoutParams(layoutParams);
        } else {
            textView = textView3;
            z3 = zIsEmpty2;
        }
        if (zIsEmpty9 || zIsEmpty10) {
            int i5 = aa.f53673a[x9Var.ordinal()];
            if (i5 == 1) {
                oVar = new yp0.o(yp0.n.FACTOR_100, 0);
            } else {
                if (i5 != 2 && i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                oVar = null;
            }
            rd0.e.r(cutoutLottieAnimationView2, oVar);
            yy0.f.e(or0.u.k(cutoutLottieAnimationView2).Q(), data.f52869g, holder.f, null, null, 12);
        }
        if (z31) {
            holder.f167546g.setBadgeAndVisibility(data.f52870h, holder.f167553q);
        }
        if (z3) {
            kli.a.d(textView6, data.f52867b, data, new ba(1, 0, ihm.f.class, this.d, "onNext", "onNext(Ljava/lang/Object;)V"), 8);
        }
        if (zIsEmpty3) {
            kli.a.d(textView5, data.f52868c, data, new ca(1, 0, ihm.f.class, this.d, "onNext", "onNext(Ljava/lang/Object;)V"), 8);
        }
        if (zIsEmpty4) {
            or0.b.e(this, null, holder.f167548j, null, 12);
        }
        if (zIsEmpty5) {
            c6d.b.a(smallActionButton2, wyVar3);
        }
        if (zIsEmpty6) {
            c6d.b.a(smallActionButton, wyVar2);
        }
        if (zIsEmpty8) {
            qv0.c positionInBox = data.f52874n;
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            cutoutLottieAnimationView = cutoutLottieAnimationView2;
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView2 = textView5;
            int iW = kli.a.w(R$attr.uikit_dp4, context);
            int i6 = iW / 2;
            boolean z41 = positionInBox instanceof c.a;
            c.b bVar = c.b.f249511a;
            if (z41 || Intrinsics.f(positionInBox, bVar)) {
                view = smallActionButton;
                i2 = i6;
            } else {
                view = smallActionButton;
                i2 = iW;
            }
            wyVar = wyVar2;
            int i21 = ((positionInBox instanceof c.f) || Intrinsics.f(positionInBox, bVar)) ? i6 : iW;
            marginLayoutParams.setMarginStart(iW);
            marginLayoutParams.topMargin = i2;
            marginLayoutParams.setMarginEnd(iW);
            marginLayoutParams.bottomMargin = i21;
            view2.setLayoutParams(marginLayoutParams);
        } else {
            view = smallActionButton;
            textView2 = textView5;
            cutoutLottieAnimationView = cutoutLottieAnimationView2;
            wyVar = wyVar2;
        }
        if (zIsEmpty7) {
            Model.a aVar = data.i;
            int i22 = aVar == null ? R$attr.uikit_dp16 : R$attr.uikit_dp4;
            Context context2 = cutoutLottieAnimationView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iW2 = kli.a.w(i22, context2);
            ViewGroup.LayoutParams layoutParams3 = textView6.getLayoutParams();
            Intrinsics.i(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            if (((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd() != iW2) {
                ViewGroup.LayoutParams layoutParams4 = textView6.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams2.setMarginEnd(iW2);
                textView6.setLayoutParams(marginLayoutParams2);
            }
            if (aVar instanceof z9) {
                z9 z9Var = (z9) aVar;
                or0.b.e(this, z9Var.f55684a, textView4, null, 12);
                or0.b.e(this, z9Var.f55685b, textView, null, 12);
            } else {
                TextView textView7 = textView;
                if (aVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                textView4.setVisibility(8);
                textView7.setVisibility(8);
            }
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, data.k, null, 24);
        q(smallActionButton2, yy.PRIMARY_ACTION_CLICK, wyVar3 != null && wyVar3.f167069b.a(), data);
        q(view, yy.SECONDARY_ACTION_CLICK, wyVar != null && wyVar.f167069b.a(), data);
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        q(itemView2, yy.ITEM_CLICK, z4, data);
        if (z4) {
            textView6.setMovementMethod(null);
            textView2.setMovementMethod(null);
        } else {
            ix0.c0 c0Var = ix0.c0.f169220a;
            kli.a.f(textView6, c0Var);
            kli.a.f(textView2, c0Var);
        }
        this.f.onNext(data);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final void q(View view, yy yyVar, boolean z, Model model) {
        if (!z) {
            view.setOnClickListener(null);
            return;
        }
        py0.c cVar = new py0.c(model.f52867b);
        or0.m.a(view);
        view.setOnClickListener(new ip0.d6(model, cVar, this, model, yyVar, 6));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003\b\t\nJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/NotificationCentreItemDelegate$Model;", "Lqv0/q;", "Lo31/c;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/y9", "a", "com/revolut/core/ui_kit/delegates/x9", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, o31.c, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f52867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f52868c;
        public final wy d;
        public final wy e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Image f52869g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final CircleBadgeModel f52870h;
        public final a i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final x9 f52871j;
        public final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Object f52872l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Parcelable f52873m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public qv0.c f52874n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f52875p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f52876q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f52877r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f52878s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f52879t;
        public final int u;
        public final int v;

        public static abstract class a {
            private a() {
            }
        }

        public Model(String listId, Clause title, Clause clause, wy wyVar, wy wyVar2, boolean z, Image image, x9 iconSize, CircleBadgeModel circleBadgeModel, a aVar, boolean z3, Object obj2, Parcelable parcelable, int i, int i2, int i3, int i5) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(iconSize, "iconSize");
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(iconSize, "iconSize");
            c.d positionInBox = c.d.f249513a;
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            this.f52866a = listId;
            this.f52867b = title;
            this.f52868c = clause;
            this.d = wyVar;
            this.e = wyVar2;
            this.f = z;
            this.f52869g = image;
            this.f52870h = circleBadgeModel;
            this.i = aVar;
            this.f52871j = iconSize;
            this.k = z3;
            this.f52872l = obj2;
            this.f52873m = parcelable;
            this.f52874n = positionInBox;
            this.o = null;
            this.f52875p = null;
            this.f52876q = null;
            this.f52877r = null;
            this.f52878s = i;
            this.f52879t = i2;
            this.u = i3;
            this.v = i5;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new NotificationCentreItemDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF54956m() {
            return this.f52872l;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getD() {
            return this.f52866a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52866a, model.f52866a) && Intrinsics.f(this.f52867b, model.f52867b) && Intrinsics.f(this.f52868c, model.f52868c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f52869g, model.f52869g) && Intrinsics.f(this.f52870h, model.f52870h) && Intrinsics.f(this.i, model.i) && this.f52871j == model.f52871j && this.k == model.k && Intrinsics.f(this.f52872l, model.f52872l) && Intrinsics.f(this.f52873m, model.f52873m) && Intrinsics.f(this.f52874n, model.f52874n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f52875p, model.f52875p) && Intrinsics.f(this.f52876q, model.f52876q) && Intrinsics.f(this.f52877r, model.f52877r) && this.f52878s == model.f52878s && this.f52879t == model.f52879t && this.u == model.u && this.v == model.v;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52461h() {
            return this.f52878s;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52878s = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF54955l() {
            return this.f52873m;
        }

        public final int hashCode() {
            int iB = p.a.b(this.f52866a.hashCode() * 31, 31, this.f52867b);
            Clause clause = this.f52868c;
            int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 961;
            wy wyVar = this.d;
            int iHashCode2 = (iHashCode + (wyVar == null ? 0 : wyVar.hashCode())) * 31;
            wy wyVar2 = this.e;
            int iC = j6.a.c((iHashCode2 + (wyVar2 == null ? 0 : wyVar2.hashCode())) * 31, 31, this.f);
            Image image = this.f52869g;
            int iHashCode3 = (iC + (image == null ? 0 : image.hashCode())) * 31;
            CircleBadgeModel circleBadgeModel = this.f52870h;
            int iHashCode4 = (iHashCode3 + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode())) * 31;
            a aVar = this.i;
            int iC2 = j6.a.c((this.f52871j.hashCode() + ((iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31, 31, this.k);
            Object obj2 = this.f52872l;
            int iHashCode5 = (iC2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52873m;
            int i = h30.l.i(this.f52874n, (iHashCode5 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.o;
            int iHashCode6 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52875p;
            int iHashCode7 = (iHashCode6 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52876q;
            int iHashCode8 = (iHashCode7 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52877r;
            return Integer.hashCode(this.v) + j6.a.b(this.u, j6.a.b(this.f52879t, j6.a.b(this.f52878s, (iHashCode8 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getD() {
            return this.o;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52874n = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getE() {
            return this.f52875p;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52876q = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getI() {
            return this.f52879t;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getK() {
            return this.v;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52879t = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52459c() {
            return this.f52874n;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52460g() {
            return this.f52877r;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF() {
            return this.f52876q;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.o = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52873m = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52462j() {
            return this.u;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52875p = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52877r = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (!(oldItem instanceof Model)) {
                return null;
            }
            Model model = (Model) oldItem;
            return new y9(model.f != this.f, !Intrinsics.f(model.f52867b, this.f52867b), !Intrinsics.f(model.f52868c, this.f52868c), !true, !Intrinsics.f(model.f52869g, this.f52869g), model.f52871j != this.f52871j, !Intrinsics.f(model.f52870h, this.f52870h), !Intrinsics.f(model.i, this.i), !Intrinsics.f(model.d, this.d), !Intrinsics.f(model.e, this.e), (Intrinsics.f(model.f52874n, this.f52874n) && this.f52878s == model.f52878s && this.f52879t == model.f52879t && this.u == model.u && this.v == model.v) ? false : true);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause title, Clause clause, wy wyVar, wy wyVar2, boolean z, Image image, z9 z9Var, x9 x9Var, Object obj2, AnalyticsContext analyticsContext, int i) {
            Clause clause2 = (i & 4) != 0 ? null : clause;
            wy wyVar3 = (i & 16) != 0 ? null : wyVar;
            wy wyVar4 = (i & 32) != 0 ? null : wyVar2;
            boolean z3 = (i & 64) != 0 ? false : z;
            z9 z9Var2 = (i & 512) != 0 ? null : z9Var;
            x9 iconSize = (i & 1024) != 0 ? x9.DP_40 : x9Var;
            boolean z4 = (i & 2048) != 0;
            Object obj3 = (i & 4096) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i & 8192) != 0 ? null : analyticsContext;
            int i2 = R$attr.uikit_dp0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(iconSize, "iconSize");
            this(listId, title, clause2, wyVar3, wyVar4, z3, image, iconSize, null, z9Var2, z4, obj3, analyticsContext2, i2, i2, i2, i2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Model(String str, Clause clause, Clause clause2, wy wyVar, Image image, x9 x9Var, AccentCircleBadge accentCircleBadge, Object obj2, int i) {
            Clause clause3 = (i & 4) != 0 ? null : clause2;
            wy wyVar2 = (i & 16) != 0 ? null : wyVar;
            x9 x9Var2 = (i & 256) != 0 ? x9.DP_40 : x9Var;
            boolean z = (i & 2048) != 0;
            Object obj3 = (i & 4096) != 0 ? null : obj2;
            int i2 = R$attr.uikit_dp0;
            this(str, clause, clause3, wyVar2, null, false, image, x9Var2, accentCircleBadge, null, z, obj3, null, i2, i2, i2, i2);
        }
    }
}
