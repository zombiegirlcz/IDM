package com.revolut.core.ui_kit.delegates;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.hq;
import ip0.kt;
import ip0.mt;
import ip0.nt;
import ip0.ot;
import ip0.pt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\r²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/LinearProgressWithAmountDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/LinearProgressWithAmountDelegate$Model;", "Lip0/pt;", "<init>", "()V", "Model", "ip0/ot", "", "totalAbsoluteProgress", "", "totalProgressBarsSpacingWidth", "totalProgressWidth", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LinearProgressWithAmountDelegate extends BaseRecyclerViewDelegate<Model, pt> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52672c;
    public final ihm.f d;

    public LinearProgressWithAmountDelegate() {
        super(R$layout.internal_delegate_linear_progress_with_amount, new hq(19));
        this.f52672c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
    }

    public static void q(pt ptVar, b8 b8Var) {
        float f;
        LayeredImage layeredImage;
        if (b8Var instanceof a8) {
            layeredImage = ((a8) b8Var).f53669a;
            f = 40.0f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
            layeredImage = null;
        }
        float f4 = ptVar.f165867n;
        AppCompatImageView appCompatImageView = ptVar.f165862g;
        boolean z = f == f4;
        boolean zF = Intrinsics.f(layeredImage, ptVar.o);
        if (!z) {
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(ptVar.itemView, "getContext(...)", f);
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = iA;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = iA;
            appCompatImageView.setLayoutParams(layoutParams2);
        }
        if (!zF) {
            xv0.m.e0(ptVar, layeredImage, appCompatImageView, null, 6);
        }
        ptVar.f165867n = f;
        ptVar.o = layeredImage;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new pt(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_linear_progress_with_amount));
    }

    /* JADX WARN: Type inference failed for: r2v19, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(pt holder, Model model, int i, List payloads) {
        py0.c cVar;
        int i2;
        Model data = model;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, model, i, payloads);
        AppCompatTextView appCompatTextView = holder.f165865l;
        boolean zIsEmpty = payloads.isEmpty();
        Iterator it8 = payloads.iterator();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (!(next instanceof ot)) {
                zIsEmpty = true;
                z3 = true;
                z4 = true;
                z6 = true;
                z11 = true;
                z12 = true;
                z29 = true;
                z31 = true;
                break;
            }
            zIsEmpty = zIsEmpty || ((ot) next).f165724a;
            z = z || ((ot) next).i;
            z3 = z3 || ((ot) next).f165728h;
            z4 = z4 || ((ot) next).f165725b;
            z6 = z6 || ((ot) next).f165726c;
            z11 = z11 || ((ot) next).d;
            z12 = z12 || ((ot) next).e;
            z29 = z29 || ((ot) next).f165727g;
            z31 = z31 || ((ot) next).f;
        }
        View view = holder.itemView;
        ty0.c cVarX = h30.l.x(view, "itemView", view);
        LinearProgressWithAmountDelegate linearProgressWithAmountDelegate = this;
        ip0.ad adVar = new ip0.ad(linearProgressWithAmountDelegate, 18);
        if (zIsEmpty) {
            ty0.c.b(cVarX, data.f52675c, holder.f165863h, null, null, 12);
        }
        if (z) {
            int i3 = i8.f54286a[data.f52677h.ordinal()];
            if (i3 == 1) {
                i2 = R$attr.internal_textAppearanceHeading1;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$attr.internal_textAppearanceHeading3;
            }
            jb3.l.e(holder.f165863h, i2);
        }
        if (z3) {
            Model.a aVar = data.f;
            boolean z41 = aVar instanceof b8;
            if (z41) {
                q(holder, (b8) aVar);
            } else if (aVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            kli.a.d(appCompatTextView, null, data, null, 8);
            if (!z41) {
                q(holder, null);
            }
            appCompatTextView.setVisibility(8);
            holder.f165866m.setVisibility(8);
            holder.f165862g.setVisibility(z41 ? 0 : 8);
        }
        if (z4) {
            kli.a.d(holder.i, data.d, data, null, 12);
        }
        if (z6) {
            kli.a.d(holder.k, data.e, data, adVar, 8);
        }
        if (z11 || z12) {
            LinearLayout linearLayout = holder.f165864j;
            linearLayout.removeAllViews();
            int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 6.0f);
            Lazy lazyB = yhm.j.b(new ie7.a(data, 8));
            Lazy lazyB2 = yhm.j.b(new et0.k(iA, data, 1));
            int i5 = 19;
            Lazy lazyB3 = yhm.j.b(new a2.a(holder, i5, lazyB, lazyB2));
            ip0.ad adVar2 = new ip0.ad(data, i5);
            e8 e8Var = data.f52678j;
            Model.e eVar = data.i;
            int i6 = 0;
            for (Object obj2 : e8Var.f54089a) {
                int i21 = i6 + 1;
                if (i6 < 0) {
                    zhm.v.s();
                    throw null;
                }
                LinearLayout linearLayout2 = linearLayout;
                h8 h8Var = (h8) obj2;
                boolean z49 = z29;
                Model.b bVar = e8Var.f54090b ? eVar.f52690b : eVar.f52689a;
                Model.e eVar2 = eVar;
                boolean z54 = z31;
                ie7.a aVar2 = new ie7.a(lazyB3, 9);
                mt mtVar = new mt(holder, adVar2, i6, lazyB2);
                Lazy lazy = lazyB3;
                Lazy lazy2 = lazyB2;
                ip0.ad adVar3 = adVar2;
                ProgressBar progressBar = new ProgressBar(linearLayout2.getContext(), null, R.attr.progressBarStyleHorizontal);
                progressBar.setLayoutParams(new LinearLayout.LayoutParams(0, -1, h8Var.f54236b));
                progressBar.setProgress(h8Var.f54235a);
                ViewCompat.setScreenReaderFocusable(progressBar, true);
                if (bVar instanceof Model.b.C0410b) {
                    progressBar.setProgressDrawable(ContextCompat.getDrawable(progressBar.getContext(), R$drawable.internal_vaults_progress));
                    Context context = progressBar.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    progressBar.setProgressTintList(ColorStateList.valueOf(kli.a.s(((Model.b.C0410b) bVar).f52688a, context)));
                    linearLayout = linearLayout2;
                } else {
                    if (!(bVar instanceof Model.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nt ntVar = new nt(linearProgressWithAmountDelegate, progressBar, linearLayout2, (Model.b.a) bVar, aVar2, mtVar, h8Var);
                    linearLayout = linearLayout2;
                    progressBar.post(ntVar);
                }
                linearLayout.addView(progressBar);
                if (i6 < zhm.v.j(e8Var.f54089a)) {
                    Space space = new Space(linearLayout.getContext(), null);
                    space.setLayoutParams(new LinearLayout.LayoutParams(iA, 1));
                    linearLayout.addView(space);
                }
                linearProgressWithAmountDelegate = this;
                i6 = i21;
                z29 = z49;
                eVar = eVar2;
                z31 = z54;
                lazyB3 = lazy;
                lazyB2 = lazy2;
                adVar2 = adVar3;
            }
            cVar = null;
        } else {
            cVar = null;
        }
        boolean z74 = z29;
        boolean z83 = z31;
        if (data.f52676g) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            ?? r2 = data.f52675c;
            py0.c cVar2 = r2 != 0 ? new py0.c(r2) : cVar;
            or0.m.a(itemView);
            data = model;
            itemView.setOnClickListener(new kt(model, cVar2, this, model, 2));
        } else {
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            or0.u.o(itemView2);
        }
        if (z74 || z83) {
            View itemView3 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
            or0.b.c(this, data, itemView3, data.f52676g, null, 24);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\t\b\t\n\u000b\f\r\u000e\u000f\u0010J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/LinearProgressWithAmountDelegate$Model;", "Lqv0/i;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "Companion", "d", "com/revolut/core/ui_kit/delegates/f8", "com/revolut/core/ui_kit/delegates/h8", "e", "b", "a", "com/revolut/core/ui_kit/delegates/g8", "com/revolut/core/ui_kit/delegates/e8", "c", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, TrackableItem, qv0.p {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f52674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f52675c;
        public final TextLocalisedClause d;
        public final Object e;
        public final a f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f52676g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final g8 f52677h;
        public final e i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final e8 f52678j;
        public Parcelable k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public qv0.c f52679l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f52680m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f52681n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f52682p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f52683q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f52684r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f52685s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f52686t;

        public static abstract class a {
            private a() {
            }
        }

        public static abstract class b {
            private b() {
            }

            public static final class a extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final List f52687a;

                public a(List colors) {
                    Intrinsics.checkNotNullParameter(colors, "colors");
                    this.f52687a = colors;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof a) && Intrinsics.f(this.f52687a, ((a) obj2).f52687a);
                }

                public final int hashCode() {
                    return this.f52687a.hashCode();
                }

                public a() {
                    this(zhm.v.k(Integer.valueOf(R$attr.uikit_colorBlue), Integer.valueOf(R$attr.uikit_colorGreen)));
                }
            }

            /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.LinearProgressWithAmountDelegate$Model$b$b, reason: collision with other inner class name */
            public static final class C0410b extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f52688a;

                public C0410b(int i) {
                    this.f52688a = i;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof C0410b) && this.f52688a == ((C0410b) obj2).f52688a;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.f52688a);
                }

                public C0410b() {
                    this(R$attr.uikit_colorBlue);
                }
            }
        }

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.LinearProgressWithAmountDelegate$Model$c, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static abstract class d {
            private d() {
            }
        }

        public Model(String listId, Clause titleText, TextLocalisedClause textLocalisedClause, Clause clause, d progress, e progressBarColors, a8 a8Var, int i) {
            e8 e8Var;
            boolean z = (i & 64) != 0;
            a8 a8Var2 = (i & 128) != 0 ? null : a8Var;
            g8 titleStyle = g8.DEFAULT;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(titleText, "titleText");
            Intrinsics.checkNotNullParameter(progress, "progress");
            Intrinsics.checkNotNullParameter(progressBarColors, "progressBarColors");
            Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
            INSTANCE.getClass();
            Intrinsics.checkNotNullParameter(progress, "progress");
            if (progress instanceof d8) {
                ArrayList arrayList = ((d8) progress).f54013a;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(new h8(((f8) it8.next()).f54147a, 1.0f / arrayList.size()));
                }
                e8Var = new e8(arrayList2);
            } else {
                if (!(progress instanceof c8)) {
                    throw new NoWhenBranchMatchedException();
                }
                e8Var = new e8(zhm.u.c(new h8(((c8) progress).f53746a, 1.0f)));
            }
            int i2 = R$attr.uikit_dp16;
            this.f52673a = listId;
            this.f52674b = null;
            this.f52675c = titleText;
            this.d = textLocalisedClause;
            this.e = clause;
            this.f = a8Var2;
            this.f52676g = z;
            this.f52677h = titleStyle;
            this.i = progressBarColors;
            this.f52678j = e8Var;
            this.k = null;
            this.f52679l = c.d.f249513a;
            this.f52680m = null;
            this.f52681n = null;
            this.o = null;
            this.f52682p = null;
            this.f52683q = i2;
            this.f52684r = i2;
            this.f52685s = i2;
            this.f52686t = i2;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new LinearProgressWithAmountDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getI() {
            return this.f52674b;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55249b() {
            return this.f52673a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52673a, model.f52673a) && Intrinsics.f(this.f52674b, model.f52674b) && Intrinsics.f(this.f52675c, model.f52675c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f52676g == model.f52676g && this.f52677h == model.f52677h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52678j, model.f52678j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52679l, model.f52679l) && Intrinsics.f(this.f52680m, model.f52680m) && Intrinsics.f(this.f52681n, model.f52681n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f52682p, model.f52682p) && this.f52683q == model.f52683q && this.f52684r == model.f52684r && this.f52685s == model.f52685s && this.f52686t == model.f52686t;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getK() {
            return this.f52683q;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52683q = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getE() {
            return this.k;
        }

        public final int hashCode() {
            int iHashCode = this.f52673a.hashCode() * 31;
            Object obj2 = this.f52674b;
            int iB = p.a.b((iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31, this.f52675c);
            TextLocalisedClause textLocalisedClause = this.d;
            int iHashCode2 = (iB + (textLocalisedClause == null ? 0 : textLocalisedClause.hashCode())) * 31;
            Object obj3 = this.e;
            int iHashCode3 = (iHashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
            a aVar = this.f;
            int iD = p.a.d((this.i.hashCode() + ((this.f52677h.hashCode() + j6.a.c((iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f52676g)) * 31)) * 31, 31, this.f52678j.f54089a);
            Parcelable parcelable = this.k;
            int i = h30.l.i(this.f52679l, (iD + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f52680m;
            int iHashCode4 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52681n;
            int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.o;
            int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52682p;
            return Integer.hashCode(this.f52686t) + j6.a.b(this.f52685s, j6.a.b(this.f52684r, j6.a.b(this.f52683q, (iHashCode6 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52298p() {
            return this.f52680m;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52679l = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52299q() {
            return this.f52681n;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.o = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52295l() {
            return this.f52684r;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52297n() {
            return this.f52686t;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52684r = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getO() {
            return this.f52679l;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52301s() {
            return this.f52682p;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52300r() {
            return this.o;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52680m = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.k = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52296m() {
            return this.f52685s;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52681n = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52682p = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            return new ot(!Intrinsics.f(this.f52675c, model.f52675c), !Intrinsics.f(this.d, model.d), !Intrinsics.f(this.e, model.e), !Intrinsics.f(this.f52678j, model.f52678j), !Intrinsics.f(this.i, model.i), !Intrinsics.f(this.f52679l, model.f52679l), this.f52676g != model.f52676g, !Intrinsics.f(this.f, model.f), this.f52677h != model.f52677h);
        }

        public static final class e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b.C0410b f52689a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f52690b;

            public e(b.C0410b inProgressColor, b completeColor) {
                Intrinsics.checkNotNullParameter(inProgressColor, "inProgressColor");
                Intrinsics.checkNotNullParameter(completeColor, "completeColor");
                this.f52689a = inProgressColor;
                this.f52690b = completeColor;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof e)) {
                    return false;
                }
                e eVar = (e) obj2;
                return Intrinsics.f(this.f52689a, eVar.f52689a) && Intrinsics.f(this.f52690b, eVar.f52690b);
            }

            public final int hashCode() {
                return this.f52690b.hashCode() + (Integer.hashCode(this.f52689a.f52688a) * 31);
            }

            public e() {
                this(new b.C0410b(R$attr.uikit_colorBlue), new b.C0410b(R$attr.uikit_colorGreen));
            }
        }
    }
}
