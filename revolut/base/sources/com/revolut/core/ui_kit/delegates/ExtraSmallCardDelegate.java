package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0007\u0005\u0006\u0007\b\t\u0003\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ExtraSmallCardDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ExtraSmallCardDelegate$Model;", "Lip0/hh;", "Companion", "Model", "ip0/gh", "c", "b", "ip0/dh", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExtraSmallCardDelegate extends BaseRecyclerViewDelegate<Model, ip0.hh> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final aw0.d0 f52286h = new aw0.d0(1, 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.d0 f52287c;
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xt0.a f52288g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ExtraSmallCardDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ip0.gh f52290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f52291c;
        public final Media d;
        public final boolean e;
        public final c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b f52292g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final aw0.v1 f52293h;
        public final Object i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f52294j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f52295l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f52296m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f52297n;
        public qv0.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f52298p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f52299q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f52300r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p31.c f52301s;

        public Model(String listId, ip0.gh text, Media media, e6 e6Var, d6 d6Var, Object obj2, int i) {
            media = (i & 8) != 0 ? null : media;
            boolean z = (i & 16) != 0;
            e6Var = (i & 32) != 0 ? null : e6Var;
            d6Var = (i & 64) != 0 ? null : d6Var;
            aw0.v1 colorScheme = aw0.v1.DARK;
            int i2 = R$attr.uikit_dp0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
            this.f52289a = listId;
            this.f52290b = text;
            this.f52291c = true;
            this.d = media;
            this.e = z;
            this.f = e6Var;
            this.f52292g = d6Var;
            this.f52293h = colorScheme;
            this.i = obj2;
            this.f52294j = null;
            this.k = i2;
            this.f52295l = i2;
            this.f52296m = i2;
            this.f52297n = i2;
            this.o = c.d.f249513a;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ExtraSmallCardDelegate(3);
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getI() {
            return this.i;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52289a() {
            return this.f52289a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52289a, model.f52289a) && Intrinsics.f(this.f52290b, model.f52290b) && this.f52291c == model.f52291c && Intrinsics.f(this.d, model.d) && this.e == model.e && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52292g, model.f52292g) && this.f52293h == model.f52293h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52294j, model.f52294j) && this.k == model.k && this.f52295l == model.f52295l && this.f52296m == model.f52296m && this.f52297n == model.f52297n;
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
        public final Parcelable getF52294j() {
            return this.f52294j;
        }

        public final int hashCode() {
            int iC = j6.a.c((this.f52290b.hashCode() + (this.f52289a.hashCode() * 31)) * 31, 31, this.f52291c);
            Media media = this.d;
            int iC2 = j6.a.c((iC + (media == null ? 0 : media.hashCode())) * 31, 31, this.e);
            c cVar = this.f;
            int iHashCode = (iC2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            b bVar = this.f52292g;
            int iHashCode2 = (this.f52293h.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
            Object obj2 = this.i;
            int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52294j;
            return Integer.hashCode(this.f52297n) + j6.a.b(this.f52296m, j6.a.b(this.f52295l, j6.a.b(this.k, (iHashCode3 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52298p() {
            return this.f52298p;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.o = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52299q() {
            return this.f52299q;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52300r = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52295l() {
            return this.f52295l;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52297n() {
            return this.f52297n;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52295l = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getO() {
            return this.o;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52301s() {
            return this.f52301s;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52300r() {
            return this.f52300r;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52298p = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52294j = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52296m() {
            return this.f52296m;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52299q = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52301s = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new ip0.dh(!Intrinsics.f(model.d, this.d), model.e != this.e, !Intrinsics.f(model.f, this.f), !Intrinsics.f(model.f52292g, this.f52292g), !Intrinsics.f(model.f52290b, this.f52290b), model.f52293h != this.f52293h);
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.ExtraSmallCardDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static abstract class b {
        private b() {
        }
    }

    public static abstract class c {

        public static final class a extends c {
            private a() {
            }
        }

        private c() {
        }
    }

    public ExtraSmallCardDelegate() {
        this(3);
    }

    public static void r(ip0.hh hhVar, aw0.v1 v1Var, Media media) {
        int i;
        Context context = hhVar.itemView.getContext();
        if (media != null) {
            int i2 = ip0.ih.f164693a[v1Var.ordinal()];
            if (i2 == 1) {
                i = R$attr.uikit_colorWhite;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$attr.uikit_colorBlack;
            }
        } else {
            i = R$attr.uikit_colorForeground;
        }
        TextView textView = hhVar.f164553g;
        Intrinsics.h(context);
        textView.setTextColor(kli.a.s(i, context));
        hhVar.f164554h.setTextColor(kli.a.s(i, context));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.hh(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.hh holder, Model data, int i, List payloads) {
        ExtraSmallCardDelegate extraSmallCardDelegate;
        Model model;
        TextClause textClause;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ImageView imageView = holder.f;
        UiKitMediaView uiKitMediaView = holder.k;
        boolean z = data.f52291c;
        b bVar = data.f52292g;
        aw0.v1 v1Var = data.f52293h;
        boolean z3 = data.e;
        Media media = data.d;
        if (z) {
            ip0.gh ghVar = data.f52290b;
            if (ghVar instanceof ip0.fh) {
                textClause = ((ip0.fh) ghVar).f164265a;
            } else {
                if (!(ghVar instanceof ip0.eh)) {
                    throw new NoWhenBranchMatchedException();
                }
                textClause = ((ip0.eh) ghVar).f164098a;
            }
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            py0.c cVar = new py0.c(textClause);
            or0.m.a(itemView);
            extraSmallCardDelegate = this;
            itemView.setOnClickListener(new au0.i3(data, cVar, this, data, 24));
        } else {
            extraSmallCardDelegate = this;
            holder.itemView.setOnClickListener(null);
            holder.itemView.setClickable(false);
        }
        View view = holder.f164556l;
        boolean zIsEmpty = payloads.isEmpty();
        xt0.a aVar = extraSmallCardDelegate.f52288g;
        if (zIsEmpty) {
            r(holder, v1Var, media);
            uiKitMediaView.setExternalMediaRegistry(aVar);
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            ((jz0.b) or0.u.k(itemView2).a0()).b(media, uiKitMediaView, null);
            view.setVisibility(z3 ? 0 : 8);
            q(holder, data);
            s(holder, data);
            zi0.c.g(imageView, bVar instanceof d6 ? ((d6) bVar).f54012a : null);
            View itemView3 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
            model = data;
            or0.b.c(extraSmallCardDelegate, model, itemView3, false, null, 28);
        } else {
            List list = payloads;
            ArrayList<ip0.dh> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.ExtraSmallCardDelegate.Payload");
                arrayList.add((ip0.dh) obj2);
            }
            for (ip0.dh dhVar : arrayList) {
                if (dhVar.f163897a) {
                    uiKitMediaView.setExternalMediaRegistry(aVar);
                    View itemView4 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
                    ((jz0.b) or0.u.k(itemView4).a0()).b(media, uiKitMediaView, null);
                }
                if (dhVar.f163898b) {
                    view.setVisibility(z3 ? 0 : 8);
                }
                if (dhVar.e) {
                    q(holder, data);
                }
                if (dhVar.f163899c) {
                    s(holder, data);
                }
                if (dhVar.d) {
                    zi0.c.g(imageView, bVar instanceof d6 ? ((d6) bVar).f54012a : null);
                }
                if (dhVar.f) {
                    r(holder, v1Var, media);
                }
            }
            model = data;
        }
        aw0.d0 d0Var = extraSmallCardDelegate.f52287c;
        if (d0Var != null) {
            ConstraintLayout constraintLayout = holder.f164557m;
            int id10 = uiKitMediaView.getId();
            ConstraintSet constraintSetL = ip0.v7.l(constraintLayout);
            constraintSetL.setDimensionRatio(id10, d0Var.f10274a + ":" + d0Var.f10275b);
            constraintSetL.applyTo(constraintLayout);
        }
        extraSmallCardDelegate.f.onNext(model);
    }

    public final void q(ip0.hh hhVar, Model model) {
        ip0.gh ghVar = model.f52290b;
        if (ghVar instanceof ip0.eh) {
            TextView textView = hhVar.f164553g;
            TextView textView2 = hhVar.f164554h;
            textView.setMaxLines(3);
            or0.b.e(this, ((ip0.eh) ghVar).f164098a, hhVar.f164553g, null, 12);
            textView2.setVisibility(8);
            textView2.setMaxLines(0);
            return;
        }
        if (!(ghVar instanceof ip0.fh)) {
            throw new NoWhenBranchMatchedException();
        }
        TextView textView3 = hhVar.f164553g;
        TextView textView4 = hhVar.f164554h;
        textView3.setMaxLines(1);
        ip0.fh fhVar = (ip0.fh) ghVar;
        or0.b.e(this, fhVar.f164265a, hhVar.f164553g, null, 12);
        textView4.setVisibility(0);
        textView4.setMaxLines(1);
        or0.b.e(this, fhVar.f164266b, textView4, null, 12);
        jb3.l.e(textView4, R$attr.internal_textAppearanceEmphasis3);
    }

    public final void s(ip0.hh hhVar, Model model) {
        int i;
        boolean z;
        TextView textView = hhVar.f164555j;
        ImageView imageView = hhVar.i;
        textView.setVisibility(model.f instanceof e6 ? 0 : 8);
        c cVar = model.f;
        if (!(cVar instanceof c.a)) {
            if (!(cVar instanceof e6)) {
                t(false, hhVar, model);
                return;
            } else {
                kli.a.b(hhVar.f164555j, ((e6) cVar).f54088a, ty0.f.f275450a);
                t(false, hhVar, model);
                return;
            }
        }
        int i2 = R$drawable.uikit_icn_16_cross;
        int i3 = ip0.ih.f164693a[model.f52293h.ordinal()];
        if (i3 == 1) {
            i = R$attr.uikit_colorWhite;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.uikit_colorBlack;
        }
        zi0.c.g(imageView, new ResourceImage(i2, (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, (ImageTransformations) null, (Clause) null, 246));
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 12.0f);
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK2 = kli.a.k(context2, 48.0f);
        Object parent = imageView.getParent();
        Intrinsics.i(parent, "null cannot be cast to non-null type android.view.View");
        View view = (View) parent;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i5 = marginLayoutParams.topMargin;
        int i6 = marginLayoutParams.rightMargin;
        int iAbs = Math.abs(iK2 - imageView.getWidth()) / 2;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
        ((ViewGroup.MarginLayoutParams) layoutParams3).width = iK;
        ((ViewGroup.MarginLayoutParams) layoutParams3).height = iK;
        imageView.setLayoutParams(layoutParams3);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            z = true;
            view.addOnLayoutChangeListener(new ip0.jh(imageView, i6, iAbs, i5, view, 0));
        } else {
            Rect rect = new Rect();
            imageView.getHitRect(rect);
            int i21 = rect.right;
            rect.right = Math.min(i6, iAbs) + i21 + i21;
            rect.top -= Math.min(i5, iAbs);
            rect.left -= iAbs;
            rect.bottom += iAbs;
            TouchDelegate touchDelegate = new TouchDelegate(rect, imageView);
            TouchDelegate touchDelegate2 = view.getTouchDelegate();
            xv0.c cVar2 = touchDelegate2 instanceof xv0.c ? (xv0.c) touchDelegate2 : null;
            if (cVar2 != null) {
                cVar2.a("closeButtonHitZone", touchDelegate);
            } else {
                xv0.c cVar3 = new xv0.c(imageView);
                cVar3.a("closeButtonHitZone", touchDelegate);
                view.setTouchDelegate(cVar3);
            }
            z = true;
        }
        t(z, hhVar, model);
    }

    public final void t(boolean z, ip0.hh hhVar, Model model) {
        ImageView imageView = hhVar.i;
        int i = 0;
        if (z) {
            imageView.setOnClickListener(new ap0.f(this, model, 26));
            imageView.setOnTouchListener(new j01.e(new View[]{imageView}));
        } else {
            imageView.setOnClickListener(null);
            imageView.setClickable(false);
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtraSmallCardDelegate(int i) {
        super(R$layout.internal_delegate_extra_small_card, new ip0.zf(9));
        aw0.d0 d0Var = (i & 1) != 0 ? null : f52286h;
        this.f52287c = d0Var;
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.f52288g = null;
    }
}
