package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.ToleranceLevelCompactView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0007\u0007\b\t\n\u000b\u0003\fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/BannerDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/BannerDelegate$Model;", "Lip0/y2;", "<init>", "()V", "Companion", "Model", "ip0/v2", "ip0/w2", "ip0/u2", "ip0/x2", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BannerDelegate extends BaseRecyclerViewDelegate<Model, ip0.y2> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51699c;
    public final ihm.f d;
    public final ihm.f e;

    public BannerDelegate() {
        super(R$layout.internal_delegate_banner, new ip0.c(25));
        this.f51699c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
    }

    public static void q(ip0.y2 y2Var, Model model) {
        int i = g1.f54175b[model.f51705j.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            y2Var.i.setMaxLines(Integer.MAX_VALUE);
        } else if (model.f51702c == null && model.f51701b == null) {
            y2Var.i.setMaxLines(Integer.MAX_VALUE);
        } else {
            y2Var.i.setMaxLines(2);
        }
    }

    public static void s(ip0.y2 y2Var, Model model) {
        int i = g1.f54176c[model.f51703g.ordinal()];
        if (i == 1) {
            ImageView imageView = y2Var.f;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = foh.i.j(20);
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = foh.i.j(20);
            imageView.setLayoutParams(layoutParams2);
            LottieAnimationView lottieAnimationView = y2Var.f167237g;
            ViewGroup.LayoutParams layoutParams3 = lottieAnimationView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = foh.i.j(20);
            ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = foh.i.j(20);
            lottieAnimationView.setLayoutParams(layoutParams4);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ImageView imageView2 = y2Var.f;
        ViewGroup.LayoutParams layoutParams5 = imageView2.getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
        ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = foh.i.j(10);
        ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = foh.i.j(10);
        imageView2.setLayoutParams(layoutParams6);
        LottieAnimationView lottieAnimationView2 = y2Var.f167237g;
        ViewGroup.LayoutParams layoutParams7 = lottieAnimationView2.getLayoutParams();
        if (layoutParams7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
        ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = foh.i.j(10);
        ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin = foh.i.j(10);
        lottieAnimationView2.setLayoutParams(layoutParams8);
    }

    public static void t(ip0.y2 y2Var, Model model) {
        int i = g1.f54174a[model.f51704h.ordinal()];
        if (i == 1) {
            y2Var.f167238h.setMaxLines(1);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            y2Var.f167238h.setMaxLines(Integer.MAX_VALUE);
        }
    }

    public static void u(ip0.y2 y2Var, Model model) {
        ms0.h5 h5Var;
        f1 f1Var = model.i;
        if (!(f1Var instanceof e1)) {
            if (f1Var != null) {
                throw new NoWhenBranchMatchedException();
            }
            y2Var.k.setVisibility(8);
            return;
        }
        y2Var.k.setVisibility(0);
        ToleranceLevelCompactView toleranceLevelCompactView = y2Var.k;
        e1 e1Var = (e1) f1Var;
        float f = e1Var.f54073a;
        int i = g1.d[e1Var.f54074b.ordinal()];
        if (i == 1) {
            h5Var = ms0.f5.f208252a;
        } else if (i == 2) {
            h5Var = ms0.g5.f208264a;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            h5Var = ms0.e5.f208239a;
        }
        toleranceLevelCompactView.setModel(new ms0.i5(h5Var, f));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.y2(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_banner));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.y2 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.i;
        TextView textView2 = holder.f167238h;
        ImageView imageView = holder.f;
        LottieAnimationView lottieAnimationView = holder.f167237g;
        if (payloads.isEmpty()) {
            or0.b.p(this, lottieAnimationView, imageView, data.f51701b);
            s(holder, data);
            kli.a.b(textView2, data.f51702c, ty0.f.f275450a);
            kli.a.b(textView, data.d, ty0.f.f275450a);
            q(holder, data);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
            r(holder, data);
            t(holder, data);
            u(holder, data);
        } else {
            List list = payloads;
            ArrayList<ip0.x2> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.BannerDelegate.Payload");
                arrayList.add((ip0.x2) obj2);
            }
            for (ip0.x2 x2Var : arrayList) {
                if (x2Var.f167083a) {
                    or0.b.p(this, lottieAnimationView, imageView, data.f51701b);
                    s(holder, data);
                    q(holder, data);
                }
                if (x2Var.f167084b) {
                    or0.b.e(this, data.f51702c, textView2, null, 12);
                    q(holder, data);
                }
                if (x2Var.f167085c) {
                    or0.b.e(this, data.d, textView, null, 12);
                }
                if (x2Var.f167086g) {
                    View itemView2 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                    or0.b.c(this, data, itemView2, false, null, 28);
                }
                if (x2Var.f167087h) {
                    r(holder, data);
                }
                if (x2Var.d) {
                    t(holder, data);
                }
                if (x2Var.e) {
                    q(holder, data);
                }
                if (x2Var.i) {
                    u(holder, data);
                }
            }
        }
        ComplexImage complexImage = data.f51701b;
        int i2 = 0;
        if (complexImage instanceof ComplexImage.Lottie) {
            if (((ComplexImage.Lottie) complexImage).f55835b) {
                lottieAnimationView.setClipToOutline(true);
                lottieAnimationView.setOutlineProvider(new h1());
            } else {
                lottieAnimationView.setClipToOutline(false);
            }
        } else if (!(complexImage instanceof ComplexImage.Regular) && !(complexImage instanceof ComplexImage.Overlapped) && !(complexImage instanceof ComplexImage.Video) && !(complexImage instanceof ComplexImage.Avatar) && complexImage != null) {
            throw new NoWhenBranchMatchedException();
        }
        if (data.e) {
            View itemView3 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
            Clause clause = data.f51702c;
            py0.c cVar = clause != null ? new py0.c(clause) : null;
            or0.m.a(itemView3);
            itemView3.setOnClickListener(new au0.i3(data, cVar, this, data, 7));
        } else {
            holder.itemView.setOnClickListener(null);
            holder.itemView.setClickable(false);
        }
        ImageView imageView2 = holder.f167239j;
        or0.m.a(imageView2);
        imageView2.setOnClickListener(new ip0.z2(data, this, data, i2));
        imageView2.setOnTouchListener(new j01.e(new View[]{imageView2}));
        this.d.onNext(data);
    }

    public final void r(ip0.y2 y2Var, Model model) {
        if (!model.f) {
            ImageView imageView = y2Var.f167239j;
            imageView.setVisibility(8);
            imageView.setOnClickListener(null);
            imageView.setOnTouchListener(null);
            return;
        }
        ImageView imageView2 = y2Var.f167239j;
        imageView2.setVisibility(0);
        or0.m.a(imageView2);
        imageView2.setOnClickListener(new ip0.z2(model, this, model, 1));
        imageView2.setOnTouchListener(new j01.e(new View[]{imageView2}));
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/BannerDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/f1", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ComplexImage f51701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f51702c;
        public final Clause d;
        public final boolean e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ip0.v2 f51703g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ip0.w2 f51704h;
        public final f1 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ip0.u2 f51705j;
        public final Object k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Parcelable f51706l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public qv0.c f51707m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f51708n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f51709p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f51710q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f51711r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f51712s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f51713t;
        public final int u;

        public Model(String listId, ComplexImage complexImage, Clause clause, Clause clause2, boolean z, boolean z3, ip0.v2 imagePaddings, ip0.w2 w2Var, f1 f1Var, ip0.u2 u2Var, Object obj2, Parcelable parcelable, int i, int i2, int i3, int i5, int i6) {
            imagePaddings = (i6 & 64) != 0 ? ip0.v2.BIG : imagePaddings;
            ip0.w2 labelMaxLines = (i6 & 128) != 0 ? ip0.w2.ONE : w2Var;
            f1 f1Var2 = (i6 & 256) != 0 ? null : f1Var;
            ip0.u2 descriptionMaxLines = (i6 & 512) != 0 ? ip0.u2.DEFAULT : u2Var;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(imagePaddings, "imagePaddings");
            Intrinsics.checkNotNullParameter(labelMaxLines, "labelMaxLines");
            Intrinsics.checkNotNullParameter(descriptionMaxLines, "descriptionMaxLines");
            c.d positionInBox = c.d.f249513a;
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            this.f51700a = listId;
            this.f51701b = complexImage;
            this.f51702c = clause;
            this.d = clause2;
            this.e = z;
            this.f = z3;
            this.f51703g = imagePaddings;
            this.f51704h = labelMaxLines;
            this.i = f1Var2;
            this.f51705j = descriptionMaxLines;
            this.k = obj2;
            this.f51706l = parcelable;
            this.f51707m = positionInBox;
            this.f51708n = null;
            this.o = null;
            this.f51709p = null;
            this.f51710q = null;
            this.f51711r = i;
            this.f51712s = i2;
            this.f51713t = i3;
            this.u = i5;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new BannerDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF51565t() {
            return this.k;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51552a() {
            return this.f51700a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51700a, model.f51700a) && Intrinsics.f(this.f51701b, model.f51701b) && Intrinsics.f(this.f51702c, model.f51702c) && Intrinsics.f(this.d, model.d) && this.e == model.e && this.f == model.f && this.f51703g == model.f51703g && this.f51704h == model.f51704h && Intrinsics.f(this.i, model.i) && this.f51705j == model.f51705j && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f51706l, model.f51706l) && Intrinsics.f(this.f51707m, model.f51707m) && Intrinsics.f(this.f51708n, model.f51708n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f51709p, model.f51709p) && Intrinsics.f(this.f51710q, model.f51710q) && this.f51711r == model.f51711r && this.f51712s == model.f51712s && this.f51713t == model.f51713t && this.u == model.u;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF51561p() {
            return this.f51711r;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51711r = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getU() {
            return this.f51706l;
        }

        public final int hashCode() {
            int iHashCode = this.f51700a.hashCode() * 31;
            ComplexImage complexImage = this.f51701b;
            int iHashCode2 = (iHashCode + (complexImage == null ? 0 : complexImage.hashCode())) * 31;
            Clause clause = this.f51702c;
            int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.d;
            int iHashCode4 = (this.f51704h.hashCode() + ((this.f51703g.hashCode() + j6.a.c(j6.a.c((iHashCode3 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.e), 31, this.f)) * 31)) * 31;
            f1 f1Var = this.i;
            int iHashCode5 = (this.f51705j.hashCode() + ((iHashCode4 + (f1Var == null ? 0 : f1Var.hashCode())) * 31)) * 31;
            Object obj2 = this.k;
            int iHashCode6 = (iHashCode5 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f51706l;
            int i = h30.l.i(this.f51707m, (iHashCode6 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f51708n;
            int iHashCode7 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.o;
            int iHashCode8 = (iHashCode7 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f51709p;
            int iHashCode9 = (iHashCode8 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f51710q;
            return Integer.hashCode(this.u) + j6.a.b(this.f51713t, j6.a.b(this.f51712s, j6.a.b(this.f51711r, (iHashCode9 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF51558l() {
            return this.f51708n;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f51707m = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF51559m() {
            return this.o;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f51709p = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF51562q() {
            return this.f51712s;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF51564s() {
            return this.u;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f51712s = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getK() {
            return this.f51707m;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getO() {
            return this.f51710q;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF51560n() {
            return this.f51709p;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f51708n = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f51706l = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF51563r() {
            return this.f51713t;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.o = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f51710q = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            boolean z3 = !Intrinsics.f(model.f51701b, this.f51701b);
            boolean z4 = !Intrinsics.f(model.f51702c, this.f51702c);
            boolean z6 = !Intrinsics.f(model.d, this.d);
            boolean z11 = false;
            boolean z12 = model.f51703g != this.f51703g;
            if (model.f51704h != this.f51704h) {
                z = false;
                z11 = true;
            } else {
                z = false;
            }
            return new ip0.x2(z3, z4, z6, z11, model.f51705j != this.f51705j ? true : z, z12, !Intrinsics.f(model.f51707m, this.f51707m), model.f != this.f ? true : z, !Intrinsics.f(model.i, this.i));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, ComplexImage.Regular regular, Clause clause, Clause clause2, boolean z, boolean z3, Object obj2, AnalyticsContext analyticsContext, ip0.w2 w2Var, e1 e1Var, ip0.u2 u2Var, int i) {
            boolean z4 = (i & 16) != 0 ? true : z;
            boolean z6 = (i & 32) != 0 ? false : z3;
            Object obj3 = (i & 64) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i & 128) != 0 ? null : analyticsContext;
            ip0.v2 imagePaddings = ip0.v2.BIG;
            ip0.w2 labelMaxLines = (i & 512) != 0 ? ip0.w2.ONE : w2Var;
            e1 e1Var2 = (i & 1024) != 0 ? null : e1Var;
            ip0.u2 descriptionMaxLines = (i & 2048) != 0 ? ip0.u2.DEFAULT : u2Var;
            int i2 = R$attr.uikit_dp0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(imagePaddings, "imagePaddings");
            Intrinsics.checkNotNullParameter(labelMaxLines, "labelMaxLines");
            Intrinsics.checkNotNullParameter(descriptionMaxLines, "descriptionMaxLines");
            this(listId, regular, clause, clause2, z4, z6, imagePaddings, labelMaxLines, e1Var2, descriptionMaxLines, obj3, analyticsContext2, i2, i2, i2, i2, 122880);
        }
    }
}
