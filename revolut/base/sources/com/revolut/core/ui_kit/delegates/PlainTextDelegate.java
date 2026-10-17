package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ExpandableTextView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.ix;
import ip0.kt;
import ip0.n10;
import ip0.o10;
import ip0.tz;
import ip0.wk;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0007\b\u0003\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PlainTextDelegate;", "Lcom/revolut/core/ui_kit/delegates/BaseTextDelegate;", "Lcom/revolut/core/ui_kit/delegates/PlainTextDelegate$Model;", "Lip0/o10;", "<init>", "()V", "Companion", "ip0/n10", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlainTextDelegate extends BaseTextDelegate<Model, o10> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52925c;
    public final e01.a d;
    public final e01.a e;
    public final e01.a f;

    public static final class a {
        private a() {
        }
    }

    public PlainTextDelegate() {
        int i = R$layout.internal_delegate_plain_text;
        tz rule = new tz(13);
        Intrinsics.checkNotNullParameter(rule, "rule");
        super(i, rule);
        this.f52925c = v0.a.d("create(...)");
        this.d = new e01.a();
        this.e = new e01.a();
        this.f = new e01.a();
    }

    public static void r(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = kli.a.w(i, context);
        view.setLayoutParams(layoutParams2);
    }

    public static void s(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = kli.a.w(i, context);
        view.setLayoutParams(layoutParams2);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new o10(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.core.ui_kit.delegates.BaseTextDelegate
    public final void p(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.d.b(clickData);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(o10 holder, Model data, int i, List list) {
        boolean z;
        Model model;
        int i2;
        PlainTextDelegate plainTextDelegate;
        int i3;
        int i5;
        int i6;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        TextView textView = holder.f165606g;
        ExpandableTextView expandableTextView = holder.f165607h;
        int size = payloads.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size) {
                break;
            }
            if (!(payloads.get(i21) instanceof n10)) {
                payloads = null;
                break;
            }
            i21++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        Iterator it8 = payloads.iterator();
        boolean z3 = zIsEmpty;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        boolean z41 = z31;
        boolean z49 = z41;
        boolean z54 = z49;
        while (true) {
            z = z4;
            if (!it8.hasNext()) {
                break;
            }
            n10 n10Var = (n10) it8.next();
            z3 = z3 || n10Var.f165437a;
            boolean z74 = z || n10Var.f165438b;
            z6 = z6 || n10Var.f165439c;
            z11 = z11 || n10Var.d;
            z12 = z12 || n10Var.e;
            z29 = z29 || n10Var.f;
            z31 = z31 || n10Var.f165440g;
            z49 = z49 || n10Var.i;
            z41 = z41 || n10Var.f165441h;
            z54 = z54 || n10Var.f165442j;
            z4 = z74;
        }
        if (z3) {
            or0.b.f(this, data.f52927b, holder.f);
        }
        if (z) {
            or0.b.e(this, data.f52928c, textView, null, 12);
        }
        if (z6) {
            expandableTextView.setText(data.e);
        }
        if (zIsEmpty) {
            expandableTextView.f0(data.f);
        } else if (z11) {
            mx0.v5 newState = data.f;
            expandableTextView.getClass();
            Intrinsics.checkNotNullParameter(newState, "newState");
            expandableTextView.f0(newState);
        }
        if (z11 || z12) {
            expandableTextView.setLinks(data.f, data.f52929g);
        }
        if (!z29) {
            model = data;
        } else if (data.i) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            Clause clause = data.f52928c;
            py0.c cVar = clause != null ? new py0.c(clause) : null;
            or0.m.a(itemView);
            model = data;
            itemView.setOnClickListener(new kt(data, cVar, this, data, 10));
        } else {
            model = data;
            holder.itemView.setOnClickListener(null);
            holder.itemView.setClickable(false);
        }
        if (z31) {
            expandableTextView.setImageWithVisibility(model.f52930h);
        }
        if (z41) {
            textView.setMaxLines(model.d);
        }
        if (z49) {
            qv0.c cVar2 = model.f52933m;
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            i2 = 1;
            plainTextDelegate = this;
            or0.b.b(plainTextDelegate, cVar2, itemView2, false, null, null, null, 56);
            s(model.f52939t, holder.f165608j);
            r(model.f52937r, holder.i);
            s(model.u, holder.k);
            r(model.f52938s, holder.f165609l);
        } else {
            i2 = 1;
            plainTextDelegate = this;
        }
        if (z54) {
            int i22 = qa.f54629a[model.f52931j.ordinal()];
            if (i22 == i2) {
                i3 = R$attr.internal_textAppearanceHeading3;
                i5 = R$attr.uikit_colorForeground;
                i6 = R$attr.internal_textAppearanceBody2;
            } else if (i22 == 2) {
                i3 = R$attr.internal_textAppearanceEmphasis1;
                i5 = R$attr.uikit_colorGreyTone50;
                i6 = R$attr.internal_textAppearanceBody2;
            } else {
                if (i22 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R$attr.internal_textAppearanceEmphasis1;
                i5 = R$attr.uikit_colorGreyTone50;
                i6 = R$attr.internal_textAppearanceBody1;
            }
            if (holder.f165610m != i3) {
                holder.f165610m = i3;
                jb3.l.e(textView, i3);
            }
            if (holder.o != i5) {
                holder.o = i5;
                expandableTextView.setTextColorAttr(i5);
            }
            if (holder.f165611n != i6) {
                holder.f165611n = i6;
                expandableTextView.setTextAppearanceAttr(i6);
            }
        }
        efm.r rVarMergeWith = expandableTextView.f.mergeWith(expandableTextView.f58532h.d);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        plainTextDelegate.d.a(rVarMergeWith, holder);
        plainTextDelegate.e.a(te0.w.a0(expandableTextView.f58532h.f52692c, new mul.k(24)), holder);
        efm.r map = expandableTextView.f58531g.map(new ix(24, new wk(holder, model, 7)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        plainTextDelegate.f.a(map, holder);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\b\tJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PlainTextDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "com/revolut/core/ui_kit/delegates/pa", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f52927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f52928c;
        public final int d;
        public final Clause e;
        public final mx0.v5 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f52929g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Image f52930h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final pa f52931j;
        public final Object k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Parcelable f52932l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public qv0.c f52933m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f52934n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f52935p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f52936q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f52937r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f52938s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f52939t;
        public final int u;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.PlainTextDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public Model(String str, Image image, Clause clause, int i, Clause clause2, mx0.v5 v5Var, List list, Image image2, boolean z, pa paVar, Object obj2, Parcelable parcelable, int i2, int i3, int i5, int i6, int i21) {
            paVar = (i21 & 512) != 0 ? pa.NORMAL : paVar;
            this.f52926a = str;
            this.f52927b = image;
            this.f52928c = clause;
            this.d = i;
            this.e = clause2;
            this.f = v5Var;
            this.f52929g = list;
            this.f52930h = image2;
            this.i = z;
            this.f52931j = paVar;
            this.k = obj2;
            this.f52932l = parcelable;
            this.f52933m = c.d.f249513a;
            this.f52934n = null;
            this.o = null;
            this.f52935p = null;
            this.f52936q = null;
            this.f52937r = i2;
            this.f52938s = i3;
            this.f52939t = i5;
            this.u = i6;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new PlainTextDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52567m() {
            return this.k;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53853a() {
            return this.f52926a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52926a, model.f52926a) && Intrinsics.f(this.f52927b, model.f52927b) && Intrinsics.f(this.f52928c, model.f52928c) && this.d == model.d && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52929g, model.f52929g) && Intrinsics.f(this.f52930h, model.f52930h) && this.i == model.i && this.f52931j == model.f52931j && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52932l, model.f52932l) && Intrinsics.f(this.f52933m, model.f52933m) && Intrinsics.f(this.f52934n, model.f52934n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f52935p, model.f52935p) && Intrinsics.f(this.f52936q, model.f52936q) && this.f52937r == model.f52937r && this.f52938s == model.f52938s && this.f52939t == model.f52939t && this.u == model.u;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF() {
            return this.f52937r;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52937r = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF53862j() {
            return this.f52932l;
        }

        public final int hashCode() {
            int iHashCode = this.f52926a.hashCode() * 31;
            Image image = this.f52927b;
            int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
            Clause clause = this.f52928c;
            int iD = p.a.d((this.f.hashCode() + p.a.a(j6.a.b(this.d, (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31, 31), 31, this.e)) * 31, 31, this.f52929g);
            Image image2 = this.f52930h;
            int iHashCode3 = (this.f52931j.hashCode() + j6.a.c((iD + (image2 == null ? 0 : image2.hashCode())) * 31, 31, this.i)) * 31;
            Object obj2 = this.k;
            int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52932l;
            int i = h30.l.i(this.f52933m, (iHashCode4 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f52934n;
            int iHashCode5 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.o;
            int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52935p;
            int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52936q;
            return Integer.hashCode(this.u) + j6.a.b(this.f52939t, j6.a.b(this.f52938s, j6.a.b(this.f52937r, (iHashCode7 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getE() {
            return this.f52934n;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52933m = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF() {
            return this.o;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52935p = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53856g() {
            return this.f52938s;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getI() {
            return this.u;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52938s = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getD() {
            return this.f52933m;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF53486h() {
            return this.f52936q;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF53485g() {
            return this.f52935p;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52934n = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52932l = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF53857h() {
            return this.f52939t;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.o = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52936q = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            boolean z3;
            boolean z4;
            boolean z6;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            boolean z11 = !Intrinsics.f(model.f52927b, this.f52927b);
            boolean z12 = !Intrinsics.f(model.f52928c, this.f52928c);
            boolean z29 = !Intrinsics.f(model.e, this.e);
            boolean z31 = !Intrinsics.f(model.f, this.f);
            boolean z41 = !Intrinsics.f(model.f52929g, this.f52929g);
            boolean z49 = false;
            boolean z54 = model.i != this.i;
            boolean z74 = !Intrinsics.f(model.f52930h, this.f52930h);
            if (model.d != this.d) {
                z = false;
                z49 = true;
            } else {
                z = false;
            }
            boolean zL = or0.b.l((qv0.i) oldItem, this);
            if (model.f52931j != this.f52931j) {
                z3 = true;
                z6 = zL;
                z4 = z11;
            } else {
                z3 = z;
                z4 = z11;
                z6 = zL;
            }
            return new n10(z4, z12, z29, z31, z41, z54, z74, z49, z6, z3);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause clause, Clause text, mx0.v5 v5Var, UrlImage urlImage, boolean z, pa paVar, Object obj2, AnalyticsContext analyticsContext, int i, int i2, int i3, int i5, int i6) {
            Clause clause2 = (i6 & 4) != 0 ? null : clause;
            mx0.v5 state = (i6 & 32) != 0 ? mx0.t5.e : v5Var;
            zhm.f0 links = zhm.f0.f322471a;
            UrlImage urlImage2 = (i6 & 128) != 0 ? null : urlImage;
            boolean z3 = (i6 & 256) != 0 ? false : z;
            pa style = (i6 & 512) != 0 ? pa.NORMAL : paVar;
            Object obj3 = (i6 & 1024) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i6 & 2048) != 0 ? null : analyticsContext;
            int i21 = (i6 & 4096) != 0 ? R$attr.uikit_dp16 : i;
            int i22 = (i6 & 8192) != 0 ? R$attr.uikit_dp16 : i2;
            int i32 = (i6 & 16384) != 0 ? R$attr.uikit_dp16 : i3;
            int i33 = (i6 & 32768) != 0 ? R$attr.uikit_dp16 : i5;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(links, "links");
            Intrinsics.checkNotNullParameter(style, "style");
            this(listId, null, clause2, 2, text, state, links, urlImage2, z3, style, obj3, analyticsContext2, i21, i22, i32, i33, 122880);
        }

        public Model(String listId, UrlImage urlImage, Clause clause, Clause text, mx0.v5 v5Var, List list, String str, Object obj2, AnalyticsContext analyticsContext, int i, int i2, int i3, int i5, int i6) {
            UrlImage urlImage2;
            UrlImage urlImage3 = (i6 & 2) != 0 ? null : urlImage;
            int i21 = (i6 & 8) != 0 ? 2 : 4;
            mx0.v5 state = (i6 & 32) != 0 ? mx0.t5.e : v5Var;
            List links = (i6 & 64) != 0 ? zhm.f0.f322471a : list;
            String str2 = (i6 & 128) != 0 ? null : str;
            Object obj3 = (i6 & 512) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i6 & 1024) != 0 ? null : analyticsContext;
            int i22 = (i6 & 2048) != 0 ? R$attr.uikit_dp16 : i;
            int i32 = (i6 & 4096) != 0 ? R$attr.uikit_dp16 : i2;
            int i33 = (i6 & 8192) != 0 ? R$attr.uikit_dp16 : i3;
            int i43 = (i6 & 16384) != 0 ? R$attr.uikit_dp16 : i5;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(links, "links");
            if (str2 != null) {
                INSTANCE.getClass();
                urlImage2 = new UrlImage(str2, (String) null, (UrlImageDrawable) new UrlImageDrawable.ResDrawable(R$drawable.internal_background_delegate_plain_text_image, null), 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations((CircleTransformation) null, true, false, (Integer) 8, (Integer) null, (Integer) null, 443), (Integer) null, (Integer) null, false, false, (Clause) null, 516090);
            } else {
                urlImage2 = null;
            }
            this(listId, urlImage3, clause, i21, text, state, links, urlImage2, false, null, obj3, analyticsContext2, i22, i32, i33, i43, 123392);
        }
    }
}
