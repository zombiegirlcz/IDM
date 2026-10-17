package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.ActionStatusView;
import com.revolut.core.ui_kit.internal.views.LazyInflatableCachedView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.StatusProgressBarView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.e70;
import ip0.fg0;
import ip0.ln0;
import ip0.mn0;
import ip0.nn0;
import ip0.ri0;
import ip0.w10;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0007\b\u0003\t\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/VaultsProgressDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/VaultsProgressDelegate$Model;", "Lip0/nn0;", "<init>", "()V", "Companion", "Model", "ip0/ln0", "ip0/mn0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VaultsProgressDelegate extends BaseRecyclerViewDelegate<Model, nn0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f53574c;
    public final e01.a d;
    public final ihm.f e;

    public VaultsProgressDelegate() {
        super(R$layout.internal_delegate_vaults_progress, new ri0(28));
        this.f53574c = yhm.j.c(yhm.k.NONE, new e70(14));
        this.d = new e01.a();
        this.e = v0.a.d("create(...)");
        v0.a.d("create(...)");
    }

    public static void p(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = kli.a.w(i, context);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        layoutParams2.goneBottomMargin = kli.a.w(i, context2);
        view.setLayoutParams(layoutParams2);
    }

    public static void q(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).topMargin = kli.a.w(i, context);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new nn0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_vaults_progress));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ihm.f r() {
        return (ihm.f) this.f53574c.getValue();
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(nn0 holder, Model data, int i, List list) {
        Long l2;
        int i2;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        TextView textView = holder.f165547l;
        TextView textView2 = holder.f165546j;
        SmallActionButton smallActionButton = holder.f165549n;
        TextView textView3 = holder.k;
        ActionStatusView actionStatusView = holder.o;
        LazyInflatableCachedView lazyInflatableCachedView = holder.f165545h;
        TextView textView4 = holder.f;
        StatusProgressBarView statusProgressBarView = holder.f165548m;
        efm.r map = smallActionButton.f56386h.map(new fg0(new w10(data, 21), 20));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.d.a(map, holder);
        data.getClass();
        int i3 = data.f53580j;
        ImageView imageView = holder.f165544g;
        or0.u.o(imageView);
        int size = payloads.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                break;
            }
            if (!(payloads.get(i5) instanceof ln0)) {
                payloads = null;
                break;
            }
            i5++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        boolean z41 = z31;
        boolean z49 = z41;
        boolean z54 = z49;
        boolean z74 = z54;
        boolean z83 = z74;
        boolean z89 = z83;
        boolean z96 = z89;
        boolean z100 = z96;
        int i6 = 0;
        while (i6 < size2) {
            ln0 ln0Var = (ln0) payloads.get(i6);
            List list2 = payloads;
            z = z || ln0Var.f165233a;
            z100 = z100 || ln0Var.f165234b;
            z3 = z3 || ln0Var.f165235c;
            z4 = z4 || ln0Var.d;
            z6 = z6 || ln0Var.e;
            z11 = z11 || ln0Var.f;
            z12 = z12 || ln0Var.f165236g;
            z29 = z29 || ln0Var.f165237h;
            z31 = z31 || ln0Var.k;
            z41 = z41 || ln0Var.i;
            z49 = z49 || ln0Var.f165238j;
            z54 = z54 || ln0Var.f165239l;
            z74 = z74 || ln0Var.f165240m;
            z83 = z83 || ln0Var.f165241n;
            z89 = z89 || ln0Var.o;
            z96 = z96 || ln0Var.f165242p;
            i6++;
            payloads = list2;
        }
        if (z) {
            l2 = null;
            or0.b.e(this, data.f53576b, textView4, null, 12);
        } else {
            l2 = null;
        }
        if (z100) {
            Image image = data.f53577c;
            knm.b.z(imageView, image != null, l2, 14);
            View view = holder.itemView;
            yy0.f.e(h30.l.z(view, "itemView", view), image, holder.f165544g, null, null, 12);
        }
        if (z3) {
            kli.a.b(holder.i, data.d, ty0.f.f275450a);
        }
        if (z4) {
            si siVar = data.e;
            lazyInflatableCachedView.setVisibility(siVar != null ? 0 : 8);
            if (siVar != null) {
                if (siVar instanceof ri) {
                    ip0.za factory = new ip0.za(25);
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    kli.a.d((UIKitTextView) lazyInflatableCachedView.c(1, factory), ((ri) siVar).f54682a, data, new ti(1, 0, ihm.f.class, this.e, "onNext", "onNext(Ljava/lang/Object;)V"), 8);
                } else {
                    if (!(siVar instanceof qi)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ip0.za factory2 = new ip0.za(26);
                    Intrinsics.checkNotNullParameter(factory2, "factory");
                    ((TagView) lazyInflatableCachedView.c(2, factory2)).setContent(((qi) siVar).f54640a);
                }
            }
        }
        if (z6) {
            or0.b.e(this, null, textView2, null, 12);
        }
        if (z11) {
            i2 = 8;
            kli.a.d(textView3, data.f53578g, data, new ui(1, 0, ihm.f.class, this.e, "onNext", "onNext(Ljava/lang/Object;)V"), 8);
        } else {
            i2 = 8;
        }
        if (z12) {
            or0.b.e(this, data.f, textView, null, 12);
        }
        if (z29) {
            actionStatusView.setVisibility(i2);
        }
        if (z31) {
            statusProgressBarView.setVisibility(data.i ? 0 : i2);
        }
        if (z6 || z11 || z12 || z29 || z31) {
            p((statusProgressBarView.getVisibility() == 0 && (textView2.getVisibility() == 0 || textView3.getVisibility() == 0 || actionStatusView.getVisibility() == 0)) ? R$attr.uikit_dp0 : R$attr.uikit_dp16, statusProgressBarView);
            if (statusProgressBarView.getVisibility() != 0 && textView4.getVisibility() == 0 && (textView2.getVisibility() == 0 || textView3.getVisibility() == 0 || actionStatusView.getVisibility() == 0)) {
                p(R$attr.uikit_dp0, statusProgressBarView);
                p(R$attr.uikit_dp0, textView4);
                if (textView2.getVisibility() == 0) {
                    q(R$attr.uikit_dp8, textView2);
                } else if (textView3.getVisibility() == 0) {
                    q(R$attr.uikit_dp8, textView3);
                } else if (actionStatusView.getVisibility() == 0) {
                    q(R$attr.uikit_dp8, actionStatusView);
                }
            } else if (textView2.getVisibility() != 0 && textView3.getVisibility() == 0) {
                q(R$attr.uikit_dp16, textView3);
            }
            if (textView2.getVisibility() == 0 && textView3.getVisibility() != 0 && textView.getVisibility() != 0 && actionStatusView.getVisibility() != 0) {
                p(R$attr.uikit_dp16, textView2);
            }
        }
        if (z41) {
            statusProgressBarView.setProgress(i3);
        }
        if (z49) {
            statusProgressBarView.setTallyMarkPercent(data.k);
        }
        if (z41 || z54) {
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            mn0 mn0Var = data.f53581l;
            statusProgressBarView.setProgressTintList(ColorStateList.valueOf((i3 < 0 || i3 >= 100) ? io0.a.c(context, mn0Var.f165408b) : io0.a.c(context, mn0Var.f165407a)));
        }
        if (z74 || z83) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, data.f53582m, null, 24);
        }
        if (z89) {
            pi piVar = data.f53579h;
            if (piVar != null) {
                i2 = 0;
            }
            smallActionButton.setVisibility(i2);
            if (piVar != null) {
                smallActionButton.i(piVar.f54614b);
                smallActionButton.setText(piVar.f54613a);
                smallActionButton.setEnabled(piVar.f54615c);
            }
        }
        if (z96) {
            AnimationRequest animationRequest = data.f53583n;
            if (animationRequest != null && !animationRequest.f57724a) {
                animationRequest.f57724a = true;
                jr0.f fVar = jr0.g.Companion;
                View itemView2 = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                fVar.getClass();
                jr0.f.a(itemView2).a();
                View itemView3 = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
                fVar.getClass();
                jr0.f.a(itemView3).c();
            } else if (animationRequest == null) {
                jr0.f fVar2 = jr0.g.Companion;
                View itemView4 = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
                fVar2.getClass();
                jr0.f.a(itemView4).a();
            }
        }
        boolean z101 = data.f53582m;
        View itemView5 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView5, "itemView");
        or0.m.a(itemView5);
        if (z101) {
            itemView5.setOnClickListener(new au0.t1(data, 22, this, data));
        } else {
            or0.u.o(itemView5);
        }
        if (z101) {
            textView3.setMovementMethod(null);
            UIKitTextView uIKitTextView = (UIKitTextView) ((View) lazyInflatableCachedView.f56206a.get(1));
            if (uIKitTextView != null) {
                uIKitTextView.setMovementMethod(null);
                return;
            }
            return;
        }
        ix0.c0 c0Var = ix0.c0.f169220a;
        kli.a.f(textView3, c0Var);
        UIKitTextView uIKitTextView2 = (UIKitTextView) ((View) lazyInflatableCachedView.f56206a.get(1));
        if (uIKitTextView2 != null) {
            kli.a.f(uIKitTextView2, c0Var);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\b\tJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/VaultsProgressDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lqv0/q;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/pi", "com/revolut/core/ui_kit/delegates/si", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, qv0.q, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f53576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f53577c;
        public final Clause d;
        public final si e;
        public final Clause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Clause f53578g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final pi f53579h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f53580j;
        public final Integer k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final mn0 f53581l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f53582m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final AnimationRequest f53583n;
        public final Object o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Parcelable f53584p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public qv0.c f53585q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f53586r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p31.c f53587s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p31.c f53588t;
        public p31.c u;
        public int v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f53589w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final int f53590x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final int f53591y;

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause clause, TextClause textClause, si endTopValue, Clause clause2, boolean z, int i, mn0 progressBarColors, a2l.x xVar, AnimationRequest animationRequest, int i2) {
            TextClause textClause2 = (i2 & 16) != 0 ? null : textClause;
            Clause clause3 = (i2 & 128) != 0 ? null : clause2;
            a2l.x xVar2 = (65536 & i2) != 0 ? null : xVar;
            AnimationRequest animationRequest2 = (i2 & 262144) != 0 ? null : animationRequest;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(endTopValue, "endTopValue");
            Intrinsics.checkNotNullParameter(progressBarColors, "progressBarColors");
            this(listId, clause, null, textClause2, endTopValue, null, clause3, null, z, i, null, progressBarColors, false, animationRequest2, xVar2, 0, 0, 0, 0, 267386880);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new VaultsProgressDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getO() {
            return this.o;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53575a() {
            return this.f53575a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53575a, model.f53575a) && Intrinsics.f(this.f53576b, model.f53576b) && Intrinsics.f(this.f53577c, model.f53577c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f53578g, model.f53578g) && Intrinsics.f(this.f53579h, model.f53579h) && this.i == model.i && this.f53580j == model.f53580j && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f53581l, model.f53581l) && this.f53582m == model.f53582m && Intrinsics.f(this.f53583n, model.f53583n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f53584p, model.f53584p) && Intrinsics.f(this.f53585q, model.f53585q) && Intrinsics.f(this.f53586r, model.f53586r) && Intrinsics.f(this.f53587s, model.f53587s) && Intrinsics.f(this.f53588t, model.f53588t) && Intrinsics.f(this.u, model.u) && this.v == model.v && this.f53589w == model.f53589w && this.f53590x == model.f53590x && this.f53591y == model.f53591y;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getV() {
            return this.v;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.v = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF53584p() {
            return this.f53584p;
        }

        public final int hashCode() {
            int iHashCode = this.f53575a.hashCode() * 31;
            Clause clause = this.f53576b;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Image image = this.f53577c;
            int iC = j6.a.c((iHashCode2 + (image == null ? 0 : image.hashCode())) * 31, 31, false);
            Clause clause2 = this.d;
            int iHashCode3 = (iC + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            si siVar = this.e;
            int iHashCode4 = (iHashCode3 + (siVar == null ? 0 : siVar.hashCode())) * 31;
            Clause clause3 = this.f;
            int iHashCode5 = (iHashCode4 + (clause3 == null ? 0 : clause3.hashCode())) * 29791;
            Clause clause4 = this.f53578g;
            int iHashCode6 = (iHashCode5 + (clause4 == null ? 0 : clause4.hashCode())) * 31;
            pi piVar = this.f53579h;
            int iB = j6.a.b(this.f53580j, j6.a.c((iHashCode6 + (piVar == null ? 0 : piVar.hashCode())) * 31, 31, this.i), 31);
            Integer num = this.k;
            int iC2 = j6.a.c((this.f53581l.hashCode() + ((iB + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.f53582m);
            AnimationRequest animationRequest = this.f53583n;
            int iHashCode7 = (iC2 + (animationRequest == null ? 0 : animationRequest.hashCode())) * 31;
            Object obj2 = this.o;
            int iHashCode8 = (iHashCode7 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f53584p;
            int i = h30.l.i(this.f53585q, (iHashCode8 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f53586r;
            int iHashCode9 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f53587s;
            int iHashCode10 = (iHashCode9 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f53588t;
            int iHashCode11 = (iHashCode10 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.u;
            return Integer.hashCode(this.f53591y) + j6.a.b(this.f53590x, j6.a.b(this.f53589w, j6.a.b(this.v, (iHashCode11 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF53586r() {
            return this.f53586r;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53585q = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF53587s() {
            return this.f53587s;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f53588t = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53589w() {
            return this.f53589w;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53591y() {
            return this.f53591y;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53589w = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF53585q() {
            return this.f53585q;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getU() {
            return this.u;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF53588t() {
            return this.f53588t;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f53586r = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53584p = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF53590x() {
            return this.f53590x;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f53587s = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.u = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            boolean z3;
            boolean z4;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            boolean z6 = !Intrinsics.f(model.f53576b, this.f53576b);
            boolean z11 = !Intrinsics.f(model.f53577c, this.f53577c);
            boolean z12 = !Intrinsics.f(model.d, this.d);
            boolean z29 = !Intrinsics.f(model.e, this.e);
            boolean z31 = !true;
            boolean z41 = !Intrinsics.f(model.f53578g, this.f53578g);
            boolean z49 = !Intrinsics.f(model.f, this.f);
            boolean z54 = !true;
            boolean z74 = model.f53580j != this.f53580j;
            boolean z83 = !Intrinsics.f(model.k, this.k);
            boolean z89 = model.i != this.i;
            boolean z96 = !Intrinsics.f(model.f53581l, this.f53581l);
            boolean zL = or0.b.l((qv0.i) oldItem, this);
            if (model.f53582m != this.f53582m) {
                z = true;
                z3 = z96;
                z4 = true;
            } else {
                z = true;
                z3 = z96;
                z4 = false;
            }
            return new ln0(z6, z11, z12, z29, z31, z41, z49, z54, z74, z83, z89, z3, zL, z4, !Intrinsics.f(model.f53579h, this.f53579h), model.f53583n != this.f53583n ? z : false);
        }

        public Model(String listId, Clause clause, Image image, Clause clause2, si siVar, Clause clause3, Clause clause4, pi piVar, boolean z, int i, Integer num, mn0 progressBarColors, boolean z3, AnimationRequest animationRequest, Object obj2, int i2, int i3, int i5, int i6, int i21) {
            int i22 = (i21 & 16777216) != 0 ? R$attr.uikit_dp0 : i2;
            int i32 = (i21 & 33554432) != 0 ? R$attr.uikit_dp0 : i3;
            int i33 = (i21 & 67108864) != 0 ? R$attr.uikit_dp0 : i5;
            int i43 = (i21 & 134217728) != 0 ? R$attr.uikit_dp0 : i6;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(progressBarColors, "progressBarColors");
            c.d positionInBox = c.d.f249513a;
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            this.f53575a = listId;
            this.f53576b = clause;
            this.f53577c = image;
            this.d = clause2;
            this.e = siVar;
            this.f = clause3;
            this.f53578g = clause4;
            this.f53579h = piVar;
            this.i = z;
            this.f53580j = i;
            this.k = num;
            this.f53581l = progressBarColors;
            this.f53582m = z3;
            this.f53583n = animationRequest;
            this.o = obj2;
            this.f53584p = null;
            this.f53585q = positionInBox;
            this.f53586r = null;
            this.f53587s = null;
            this.f53588t = null;
            this.u = null;
            this.v = i22;
            this.f53589w = i32;
            this.f53590x = i33;
            this.f53591y = i43;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause clause, ResourceImage resourceImage, Clause clause2, Clause clause3, Clause clause4, Clause clause5, pi piVar, boolean z, int i, mn0 mn0Var, boolean z3, Object obj2, AnimationRequest animationRequest, int i2) {
            Clause clause6 = (i2 & 2) != 0 ? null : clause;
            ResourceImage resourceImage2 = (i2 & 4) != 0 ? null : resourceImage;
            Clause clause7 = (i2 & 16) != 0 ? null : clause2;
            Clause clause8 = (i2 & 32) != 0 ? null : clause3;
            Clause clause9 = (i2 & 128) != 0 ? null : clause4;
            Clause clause10 = (i2 & 256) != 0 ? null : clause5;
            pi piVar2 = (i2 & 1024) != 0 ? null : piVar;
            boolean z4 = (i2 & 2048) != 0 ? true : z;
            int i3 = (i2 & 4096) != 0 ? 0 : i;
            Integer num = (i2 & 8192) != 0 ? null : 50;
            mn0 progressBarColors = (i2 & 16384) != 0 ? new mn0(R$attr.uikit_colorBlue, R$attr.uikit_colorGreen) : mn0Var;
            boolean z6 = (32768 & i2) != 0 ? false : z3;
            Object obj3 = (65536 & i2) != 0 ? null : obj2;
            int i5 = R$attr.uikit_dp0;
            AnimationRequest animationRequest2 = (i2 & 4194304) != 0 ? null : animationRequest;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(progressBarColors, "progressBarColors");
            this(listId, clause6, resourceImage2, clause7, clause8 != null ? new ri(clause8) : null, clause10, clause9, piVar2, z4, i3, num, progressBarColors, z6, animationRequest2, obj3, i5, i5, i5, i5, 15728640);
        }
    }
}
