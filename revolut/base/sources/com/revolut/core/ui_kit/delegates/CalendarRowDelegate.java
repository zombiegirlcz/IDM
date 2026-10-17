package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CalendarRowDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseBoxRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/CalendarRowDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/x1;", "<init>", "()V", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CalendarRowDelegate extends BaseBoxRecyclerViewDelegate<Model, x1> {
    public final Rect e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f51750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f51751h;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0007\b\t\nJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CalendarRowDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/s1", "com/revolut/core/ui_kit/delegates/w1", "com/revolut/core/ui_kit/delegates/r1", "com/revolut/core/ui_kit/delegates/t1", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TimeClause f51753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeClause f51754c;
        public final Object d;
        public final Clause e;
        public final w1 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Image f51755g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final s1 f51756h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f51757j;
        public final r1 k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public qv0.c f51758l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f51759m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f51760n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f51761p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f51762q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f51763r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f51764s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f51765t;
        public final Object u;
        public Parcelable v;

        public Model(String listId, TimeClause dateTitle, TimeClause dateSubtitle, Clause title, Clause clause, Image image, s1 containerColor, boolean z, q1 q1Var, Object obj2, AnalyticsContext analyticsContext, int i) {
            w1 subtitleMode = (i & 32) != 0 ? v1.f54844a : u1.f54798a;
            Image image2 = (i & 64) != 0 ? null : image;
            boolean z3 = (i & 512) != 0 ? true : z;
            q1 q1Var2 = (i & 1024) != 0 ? null : q1Var;
            AnalyticsContext analyticsContext2 = (i & 4096) != 0 ? null : analyticsContext;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(dateTitle, "dateTitle");
            Intrinsics.checkNotNullParameter(dateSubtitle, "dateSubtitle");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitleMode, "subtitleMode");
            Intrinsics.checkNotNullParameter(containerColor, "containerColor");
            int i2 = R$attr.uikit_dp4;
            int i3 = R$attr.uikit_dp0;
            this.f51752a = listId;
            this.f51753b = dateTitle;
            this.f51754c = dateSubtitle;
            this.d = title;
            this.e = clause;
            this.f = subtitleMode;
            this.f51755g = image2;
            this.f51756h = containerColor;
            this.i = true;
            this.f51757j = z3;
            this.k = q1Var2;
            this.f51758l = c.d.f249513a;
            this.f51759m = null;
            this.f51760n = null;
            this.o = null;
            this.f51761p = null;
            this.f51762q = i2;
            this.f51763r = i2;
            this.f51764s = i3;
            this.f51765t = i2;
            this.u = obj2;
            this.v = analyticsContext2;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new CalendarRowDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF53090n() {
            return this.u;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53082a() {
            return this.f51752a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51752a, model.f51752a) && Intrinsics.f(this.f51753b, model.f51753b) && Intrinsics.f(this.f51754c, model.f51754c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f51755g, model.f51755g) && this.f51756h == model.f51756h && this.i == model.i && this.f51757j == model.f51757j && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f51758l, model.f51758l) && Intrinsics.f(this.f51759m, model.f51759m) && Intrinsics.f(this.f51760n, model.f51760n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f51761p, model.f51761p) && this.f51762q == model.f51762q && this.f51763r == model.f51763r && this.f51764s == model.f51764s && this.f51765t == model.f51765t && Intrinsics.f(this.u, model.u) && Intrinsics.f(this.v, model.v);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52168p() {
            return this.f51762q;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51762q = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getO() {
            return this.v;
        }

        public final int hashCode() {
            int iB = p.a.b(h30.l.d(this.f51754c, h30.l.d(this.f51753b, this.f51752a.hashCode() * 31, 31), 31), 31, this.d);
            Clause clause = this.e;
            int iHashCode = (this.f.hashCode() + ((iB + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
            Image image = this.f51755g;
            int iC = j6.a.c(j6.a.c((this.f51756h.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31)) * 31, 31, this.i), 31, this.f51757j);
            r1 r1Var = this.k;
            int i = h30.l.i(this.f51758l, (iC + (r1Var == null ? 0 : ((q1) r1Var).f54616a.hashCode())) * 31, 31);
            p31.c cVar = this.f51759m;
            int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f51760n;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.o;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f51761p;
            int iB2 = j6.a.b(this.f51765t, j6.a.b(this.f51764s, j6.a.b(this.f51763r, j6.a.b(this.f51762q, (iHashCode4 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 31);
            Object obj2 = this.u;
            int iHashCode5 = (iB2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.v;
            return iHashCode5 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52165l() {
            return this.f51761p;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f51758l = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52166m() {
            return this.f51759m;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f51760n = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52169q() {
            return this.f51763r;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52171s() {
            return this.f51765t;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f51763r = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getK() {
            return this.f51758l;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getO() {
            return this.o;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52167n() {
            return this.f51760n;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f51761p = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.v = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52170r() {
            return this.f51764s;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f51759m = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.o = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            boolean z3 = !Intrinsics.f(model.f51753b, this.f51753b);
            boolean z4 = !Intrinsics.f(model.f51754c, this.f51754c);
            boolean z6 = !Intrinsics.f(model.d, this.d);
            boolean z11 = !Intrinsics.f(model.e, this.e);
            boolean z12 = !Intrinsics.f(model.f, this.f);
            boolean z29 = !Intrinsics.f(model.f51755g, this.f51755g);
            boolean z31 = false;
            boolean z41 = model.f51756h != this.f51756h;
            if (model.i != this.i) {
                z = false;
                z31 = true;
            } else {
                z = false;
            }
            return new t1(z3, z4, z6, z11, z12, z29, z41, z31, model.f51757j != this.f51757j ? true : z, !Intrinsics.f(model.k, this.k));
        }
    }

    public CalendarRowDelegate() {
        super(R$layout.internal_delegate_calendar_row, true, new ip0.g4(2));
        this.e = new Rect();
        this.f = v0.a.d("create(...)");
        this.f51750g = v0.a.d("create(...)");
        this.f51751h = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new x1(kotlin.jvm.internal.s.r(parent, this.f58164c));
    }

    /* JADX WARN: Type inference failed for: r1v26, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(x1 holder, Model data, int i, List payloads) {
        boolean z;
        String str;
        String str2;
        boolean z3;
        AppCompatImageView appCompatImageView;
        boolean z4;
        ConstraintSet constraintSet;
        int i2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        AppCompatTextView appCompatTextView = holder.f55586j;
        ConstraintLayout constraintLayout = holder.f55585h;
        AppCompatTextView appCompatTextView2 = holder.k;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof t1) {
                arrayList.add(obj2);
            }
        }
        boolean zIsEmpty = payloads.isEmpty();
        Iterator it8 = arrayList.iterator();
        boolean z6 = zIsEmpty;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        boolean z41 = z31;
        boolean z49 = z41;
        boolean z54 = z49;
        while (true) {
            z = z6;
            if (!it8.hasNext()) {
                break;
            }
            t1 t1Var = (t1) it8.next();
            boolean z74 = zIsEmpty || t1Var.f54724a;
            boolean z83 = z || t1Var.f54725b;
            z11 = z11 || t1Var.f54726c;
            z12 = z12 || t1Var.d;
            z29 = z29 || t1Var.e;
            z31 = z31 || t1Var.f;
            z41 = z41 || t1Var.f54727g;
            boolean z89 = z83;
            z54 = z54 || t1Var.f54728h;
            z49 = z49 || t1Var.f54729j;
            z6 = z89;
            zIsEmpty = z74;
        }
        if (zIsEmpty) {
            AppCompatTextView appCompatTextView3 = holder.f;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "<get-dateTitle>(...)");
            kli.a.b(appCompatTextView3, data.f51753b, ty0.f.f275450a);
        }
        if (z) {
            AppCompatTextView appCompatTextView4 = holder.f55584g;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "<get-dateSubtitle>(...)");
            kli.a.b(appCompatTextView4, data.f51754c, ty0.f.f275450a);
        }
        if (z11) {
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "<get-title>(...)");
            kli.a.b(appCompatTextView, data.d, ty0.f.f275450a);
        }
        if (z12) {
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "<get-subtitle>(...)");
            kli.a.b(appCompatTextView2, data.e, ty0.f.f275450a);
        }
        if (z29) {
            w1 mode = data.f;
            Intrinsics.checkNotNullParameter(mode, "mode");
            if (Intrinsics.f(mode, u1.f54798a)) {
                i2 = Integer.MAX_VALUE;
            } else {
                if (!Intrinsics.f(mode, v1.f54844a)) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 2;
            }
            appCompatTextView2.setMaxLines(i2);
        }
        if (z31) {
            AppCompatImageView appCompatImageView2 = holder.i;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "<get-icon>(...)");
            zi0.c.g(appCompatImageView2, data.f51755g);
        }
        if (z41) {
            c.e eVar = new c.e((qv0.h) null, 3);
            ConstraintLayout constraintLayout2 = holder.f55585h;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "<get-container>(...)");
            Context context = constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            str2 = "<get-container>(...)";
            z3 = z49;
            str = "getContext(...)";
            appCompatImageView = null;
            or0.b.b(this, eVar, constraintLayout2, true, null, new dr0.i(new Color.SolidInt(kli.a.s(data.f51756h.a(), context))), this.e, 8);
        } else {
            str = "getContext(...)";
            str2 = "<get-container>(...)";
            z3 = z49;
            appCompatImageView = null;
        }
        if (z3) {
            ip0.z4 onButtonClicked = new ip0.z4(this, data, 0);
            ip0.z4 onIconClicked = new ip0.z4(this, data, 1);
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(onButtonClicked, "onButtonClicked");
            Intrinsics.checkNotNullParameter(onIconClicked, "onIconClicked");
            r1 r1Var = data.k;
            ConstraintSet constraintSet2 = new ConstraintSet();
            constraintSet2.clone(constraintLayout);
            constraintSet2.clear(appCompatTextView.getId(), 7);
            constraintSet2.clear(appCompatTextView2.getId(), 7);
            if (r1Var instanceof q1) {
                constraintLayout.removeView(appCompatImageView);
                AppCompatImageView appCompatImageView3 = holder.f55588m;
                if (appCompatImageView3 == null) {
                    appCompatImageView3 = new AppCompatImageView(constraintLayout.getContext());
                    holder.f55588m = appCompatImageView3;
                    appCompatImageView3.setId(R$id.internal_calendar_row_action_icon);
                    constraintLayout.addView(appCompatImageView3);
                }
                zi0.c.f(appCompatImageView3, ((q1) r1Var).f54616a, !r1Var.equals(holder.f55587l), new a2.a(appCompatImageView3, 16, data, onIconClicked));
                int id10 = appCompatImageView3.getId();
                constraintSet2.constrainWidth(id10, -2);
                constraintSet2.constrainHeight(id10, -2);
                z4 = false;
                constraintSet2.connect(id10, 7, 0, 7);
                constraintSet2.connect(id10, 3, 0, 3);
                constraintSet2.connect(id10, 4, 0, 4);
                Context context2 = constraintLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, str);
                int iK = kli.a.k(context2, 12.0f);
                constraintSet = constraintSet2;
                constraintSet.connect(appCompatTextView.getId(), 7, id10, 6, iK);
                constraintSet.connect(appCompatTextView2.getId(), 7, id10, 6, iK);
            } else {
                constraintSet = constraintSet2;
                z4 = false;
                if (r1Var != null) {
                    throw new NoWhenBranchMatchedException();
                }
                constraintLayout.removeView(appCompatImageView);
                constraintLayout.removeView(holder.f55588m);
                holder.f55588m = appCompatImageView;
                constraintSet.connect(appCompatTextView.getId(), 7, 0, 7, 0);
                constraintSet.connect(appCompatTextView2.getId(), 7, 0, 7, 0);
            }
            constraintSet.applyTo(constraintLayout);
            holder.f55587l = r1Var;
        } else {
            z4 = false;
        }
        if (z54) {
            boolean z96 = data.i;
            constraintLayout.setEnabled(z96);
            appCompatTextView.setEnabled(z96);
            appCompatTextView2.setEnabled(z96);
            if (z96) {
                constraintLayout.setAlpha(1.0f);
                appCompatTextView.setAlpha(1.0f);
                appCompatTextView2.setAlpha(1.0f);
            } else {
                constraintLayout.setAlpha(0.4f);
                appCompatTextView.setAlpha(0.4f);
                appCompatTextView2.setAlpha(0.4f);
            }
        }
        Intrinsics.checkNotNullExpressionValue(constraintLayout, str2);
        py0.c cVar = new py0.c(data.d);
        boolean z100 = (data.i && data.f51757j) ? true : z4;
        or0.m.a(constraintLayout);
        if (z100) {
            constraintLayout.setOnClickListener(new au0.i3(data, cVar, this, data, 10));
        } else {
            or0.u.o(constraintLayout);
        }
    }
}
