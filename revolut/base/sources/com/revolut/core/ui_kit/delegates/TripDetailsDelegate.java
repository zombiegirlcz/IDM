package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.kt;
import ip0.mm0;
import ip0.nm0;
import ip0.om0;
import ip0.pm0;
import ip0.ri0;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/TripDetailsDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseBoxRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/TripDetailsDelegate$Model;", "Lip0/om0;", "<init>", "()V", "Model", "ip0/nm0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TripDetailsDelegate extends BaseBoxRecyclerViewDelegate<Model, om0> {
    public final ihm.f e;

    public TripDetailsDelegate() {
        super(R$layout.internal_delegate_trip_details, false, new ri0(23));
        this.e = v0.a.d("create(...)");
    }

    public static CompositeClause q(Clause clause, rw0.g gVar) {
        int i;
        List listC = zhm.u.c(clause);
        int i2 = pm0.f165852a[gVar.ordinal()];
        if (i2 == 1) {
            i = R$attr.uikit_colorPerformancePositive;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.uikit_colorPerformanceNegative;
        }
        return new CompositeClause(listC, null, new Custom(Integer.valueOf(i), false, null, false, null, 254), null, 10);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public static void r(rw0.e eVar, mm0 mm0Var, TextView textView, TextView textView2, ImageView imageView, TextView textView3, TextView textView4, TextView textView5, boolean z) {
        int i;
        int i2;
        rw0.d dVar = eVar.d;
        rw0.g gVar = eVar.f;
        boolean z3 = mm0Var.f165400a;
        boolean z4 = mm0Var.f165404h;
        if (z3) {
            kli.a.b(textView, eVar.f257798a, ty0.f.f275450a);
        }
        if (mm0Var.f165401b || z4) {
            int i3 = eVar.f257799b;
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int[] iArr = pm0.f165852a;
            int i5 = iArr[gVar.ordinal()];
            if (i5 == 1) {
                i = R$attr.uikit_colorPerformancePositive;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$attr.uikit_colorPerformanceNegative;
            }
            Integer numValueOf = Integer.valueOf(i);
            int i6 = iArr[gVar.ordinal()];
            if (i6 == 1) {
                i2 = R$attr.uikit_colorStatusSuccess_10;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$attr.uikit_colorStatusDanger_10;
            }
            zi0.c.g(imageView, LayeredImage.Companion.b(companion, i3, numValueOf, i2, 5.0f, null, null, 48));
        }
        if (mm0Var.d || z4) {
            kli.a.b(textView3, q(eVar.f257800c, gVar), ty0.f.f275450a);
        }
        if (mm0Var.e || mm0Var.f || z4) {
            aim.e eVarB = zhm.u.b();
            eVarB.add(q(dVar.f257796a, gVar));
            Clause clause = dVar.f257797b;
            if (clause != null) {
                eVarB.add(clause);
            }
            if (z) {
                Intrinsics.checkNotNullParameter(eVarB, "<this>");
                Collections.reverse(eVarB);
            }
            kli.a.b(textView4, new CompositeClause(zhm.u.a(eVarB), new DotDividerClause((Integer) null), null, null, 12), ty0.f.f275450a);
        }
        if (mm0Var.f165403g) {
            kli.a.b(textView5, eVar.e, ty0.f.f275450a);
        }
        if (!mm0Var.f165402c || textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void s(rw0.j jVar, mm0 mm0Var, TextView textView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        if (mm0Var.f165400a) {
            kli.a.b(textView, jVar.f257808a, ty0.f.f275450a);
        }
        if (mm0Var.f165402c && textView2 != null) {
            kli.a.b(textView2, jVar.f257809b, ty0.f.f275450a);
        }
        if (mm0Var.d) {
            kli.a.b(textView3, jVar.f257810c, ty0.f.f275450a);
        }
        if (mm0Var.e || mm0Var.f) {
            rw0.d dVar = jVar.d;
            if (dVar == null) {
                textView4.setVisibility(8);
            } else {
                Clause[] elements = {dVar.f257796a, dVar.f257797b};
                Intrinsics.checkNotNullParameter(elements, "elements");
                kli.a.b(textView4, new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), null, null, 12), ty0.f.f275450a);
            }
        }
        if (mm0Var.f165403g) {
            textView5.setVisibility(8);
        }
        if (mm0Var.f165401b) {
            imageView.setVisibility(8);
        }
    }

    public static mm0 t(mm0 mm0Var, mm0 mm0Var2) {
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        boolean z11;
        boolean z12;
        boolean z29 = true;
        boolean z31 = false;
        boolean z41 = mm0Var.f165400a || mm0Var2.f165400a;
        if (mm0Var.f165401b || mm0Var2.f165401b) {
            z = true;
        } else {
            z = true;
            z29 = false;
        }
        if (mm0Var.f165402c || mm0Var2.f165402c) {
            z3 = false;
            z31 = z;
        } else {
            z3 = false;
        }
        if (mm0Var.d || mm0Var2.d) {
            z4 = z;
        } else {
            z4 = z;
            z = z3;
        }
        if (mm0Var.e || mm0Var2.e) {
            z6 = z3;
            z3 = z4;
        } else {
            z6 = z3;
        }
        if (mm0Var.f || mm0Var2.f) {
            z11 = z4;
        } else {
            z11 = z4;
            z4 = z6;
        }
        if (mm0Var.f165403g || mm0Var2.f165403g) {
            z12 = z6;
            z6 = z11;
        } else {
            z12 = z6;
        }
        if (!mm0Var.f165404h && !mm0Var2.f165404h) {
            z11 = z12;
        }
        return new mm0(z41, z29, z31, z, z3, z4, z6, z11);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new om0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_trip_details));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v26, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.revolut.core.ui_kit.models.Clause] */
    @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void p(om0 holder, Model model, int i, List list) {
        CompositeClause compositeClause;
        int i2;
        int iA;
        int iA2;
        List list2;
        Image image;
        TextClause textClause;
        ?? r72;
        Model data = model;
        List<nm0> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, model, i, list);
        TextView textView = holder.f165685p;
        int size = payloads.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            if (!(payloads.get(i3) instanceof nm0)) {
                payloads = null;
                break;
            }
            i3++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        mm0 mm0Var = new mm0(zIsEmpty, zIsEmpty, zIsEmpty, zIsEmpty, zIsEmpty, zIsEmpty, zIsEmpty, zIsEmpty);
        mm0 mm0Var2 = new mm0(zIsEmpty, zIsEmpty, zIsEmpty, zIsEmpty, zIsEmpty, zIsEmpty, zIsEmpty, zIsEmpty);
        mm0 mm0VarT = mm0Var;
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        for (nm0 nm0Var : payloads) {
            zIsEmpty = zIsEmpty || nm0Var.f165535a;
            z = z || nm0Var.f165537c;
            z3 = z3 || nm0Var.d;
            mm0VarT = t(mm0VarT, nm0Var.f165536b);
            mm0Var2 = t(mm0Var2, nm0Var.e);
            z4 = z4 || nm0Var.f;
            z6 = z6 || nm0Var.f165538g;
            z11 = z11 || nm0Var.f165539h;
            z12 = z12 || nm0Var.i;
            z29 = z29 || nm0Var.f165540j;
        }
        if (zIsEmpty) {
            rw0.c cVar = data.f53565c.f257813a;
            if (cVar instanceof rw0.a) {
                rw0.a aVar = (rw0.a) cVar;
                Object obj2 = aVar.f257793a;
                rw0.h hVar = aVar.f257794b;
                textClause = hVar.f257804a;
                image = hVar.f257805b;
                list2 = null;
                r72 = obj2;
            } else {
                if (!(cVar instanceof rw0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                rw0.i iVar = ((rw0.b) cVar).f257795a;
                Clause clause = iVar.f257806a;
                list2 = iVar.f257807b;
                image = null;
                textClause = null;
                r72 = clause;
            }
            TextView textView2 = holder.f;
            OverlappedIconsView overlappedIconsView = holder.f165679g;
            kli.a.b(textView2, r72, ty0.f.f275450a);
            if (list2 != null) {
                overlappedIconsView.setVisibility(0);
                OverlappedIconsView.setIcons$default(holder.f165679g, list2, mx0.bb.SMALL, mx0.cb.TOP_TO_BOTTOM, 0, false, 24, null);
            } else {
                overlappedIconsView.setVisibility(8);
            }
            kli.a.b(holder.f165680h, textClause, ty0.f.f275450a);
            zi0.c.g(holder.i, image);
        }
        if (z) {
            kli.a.b(holder.o, data.f53565c.f257814b, ty0.f.f275450a);
        }
        if (z4) {
            rw0.n nVar = data.f53565c;
            rw0.m mVar = nVar.d;
            if (mVar instanceof rw0.k) {
                i2 = R$attr.internal_textAppearanceHeading3;
            } else {
                if (!(mVar instanceof rw0.l)) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$attr.internal_textAppearanceEmphasis2;
            }
            TextView textView3 = holder.f165687r;
            jb3.l.e(textView, i2);
            jb3.l.e(textView3, i2);
            rw0.m mVar2 = nVar.d;
            if (mVar2 instanceof rw0.k) {
                iA = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 8.0f);
            } else {
                if (!(mVar2 instanceof rw0.l)) {
                    throw new NoWhenBranchMatchedException();
                }
                iA = 0;
            }
            rw0.m mVar3 = nVar.d;
            if (mVar3 instanceof rw0.k) {
                iA2 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 2.0f);
            } else {
                if (!(mVar3 instanceof rw0.l)) {
                    throw new NoWhenBranchMatchedException();
                }
                iA2 = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 6.0f);
            }
            textView.setPadding(textView.getPaddingLeft(), iA, textView.getPaddingRight(), iA2);
            textView3.setPadding(textView3.getPaddingLeft(), iA, textView3.getPaddingRight(), iA2);
        }
        if (z6) {
            rw0.f fVar = data.f53565c.f;
            if (fVar != null) {
                CompositeClause compositeClause2 = fVar.f257802b;
                TextClause textClause2 = new TextClause(" + ", (Style) null, (Integer) null, false, (aw0.o9) null, (List) null, 126);
                if (fVar.f257803c == null) {
                    textClause2 = null;
                }
                Clause[] elements = {compositeClause2, textClause2};
                Intrinsics.checkNotNullParameter(elements, "elements");
                compositeClause = new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14);
            } else {
                compositeClause = null;
            }
            kli.a.b(holder.f165690w, fVar != null ? fVar.f257801a : null, ty0.f.f275450a);
            kli.a.b(holder.f165691x, compositeClause, ty0.f.f275450a);
            kli.a.b(holder.f165692y, fVar != null ? fVar.f257803c : null, ty0.f.f275450a);
        }
        if (z3) {
            kli.a.b(holder.f165686q, data.f53565c.f257815c, ty0.f.f275450a);
        }
        rw0.m mVar4 = data.f53565c.d;
        if (mVar4 instanceof rw0.k) {
            r(((rw0.k) mVar4).f257811a, mm0VarT, holder.f165681j, null, holder.k, holder.f165685p, holder.f165688s, holder.u, false);
        } else {
            if (!(mVar4 instanceof rw0.l)) {
                throw new NoWhenBranchMatchedException();
            }
            s(((rw0.l) mVar4).f257812a, mm0VarT, holder.f165681j, holder.k, null, holder.f165685p, holder.f165688s, holder.u);
        }
        rw0.m mVar5 = data.f53565c.e;
        if (mVar5 instanceof rw0.k) {
            r(((rw0.k) mVar5).f257811a, mm0Var2, holder.f165682l, holder.f165684n, holder.f165683m, holder.f165687r, holder.f165689t, holder.v, true);
        } else {
            mm0 mm0Var3 = mm0Var2;
            if (!(mVar5 instanceof rw0.l)) {
                throw new NoWhenBranchMatchedException();
            }
            s(((rw0.l) mVar5).f257812a, mm0Var3, holder.f165682l, holder.f165683m, holder.f165684n, holder.f165687r, holder.f165689t, holder.v);
        }
        if (z29 || z12) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, data.d, null, 24);
            data = data;
        }
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        boolean z31 = data.d;
        Clause clause2 = data.e;
        py0.c cVar2 = clause2 != null ? new py0.c(clause2) : null;
        or0.m.a(itemView2);
        if (z31) {
            itemView2.setOnClickListener(new kt(data, cVar2, this, model, 24));
        } else {
            or0.u.o(itemView2);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/TripDetailsDelegate$Model;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/q;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.p, TrackableItem, qv0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f53564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final rw0.n f53565c;
        public final boolean d;
        public final Clause e;
        public Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public qv0.c f53566g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f53567h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f53568j;
        public final int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f53569l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f53570m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f53571n;
        public p31.c o;

        public Model(String listId, rw0.n details, boolean z, TextLocalisedClause textLocalisedClause, AnalyticsContext analyticsContext, Object obj2) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(details, "details");
            int i = R$attr.uikit_dp16;
            this.f53563a = listId;
            this.f53564b = obj2;
            this.f53565c = details;
            this.d = z;
            this.e = textLocalisedClause;
            this.f = analyticsContext;
            this.f53566g = c.d.f249513a;
            this.f53567h = i;
            this.i = i;
            this.f53568j = i;
            this.k = i;
            this.f53569l = null;
            this.f53570m = null;
            this.f53571n = null;
            this.o = null;
        }

        public static mm0 e(rw0.m mVar, rw0.m mVar2) {
            rw0.d dVar;
            rw0.d dVar2;
            if (mVar instanceof rw0.k) {
                rw0.k kVar = mVar2 instanceof rw0.k ? (rw0.k) mVar2 : null;
                TextClause textClause = kVar != null ? kVar.f257811a.f257798a : null;
                rw0.e eVar = ((rw0.k) mVar).f257811a;
                rw0.d dVar3 = eVar.d;
                return new mm0(!Intrinsics.f(textClause, eVar.f257798a), !(kVar != null && kVar.f257811a.f257799b == eVar.f257799b), kVar == null, !Intrinsics.f(kVar != null ? kVar.f257811a.f257800c : null, eVar.f257800c), !Intrinsics.f(kVar != null ? kVar.f257811a.d.f257796a : null, dVar3.f257796a), !Intrinsics.f(kVar != null ? kVar.f257811a.d.f257797b : null, dVar3.f257797b), !Intrinsics.f(kVar != null ? kVar.f257811a.e : null, eVar.e), (kVar != null ? kVar.f257811a.f : null) != eVar.f);
            }
            if (!(mVar instanceof rw0.l)) {
                throw new NoWhenBranchMatchedException();
            }
            rw0.l lVar = mVar2 instanceof rw0.l ? (rw0.l) mVar2 : null;
            TimeClause timeClause = lVar != null ? lVar.f257812a.f257808a : null;
            rw0.d dVar4 = ((rw0.l) mVar).f257812a.d;
            return new mm0(!Intrinsics.f(timeClause, r13.f257808a), lVar == null, !Intrinsics.f(lVar != null ? lVar.f257812a.f257809b : null, r13.f257809b), !Intrinsics.f(lVar != null ? lVar.f257812a.f257810c : null, r13.f257810c), !Intrinsics.f((lVar == null || (dVar2 = lVar.f257812a.d) == null) ? null : dVar2.f257796a, dVar4 != null ? dVar4.f257796a : null), !Intrinsics.f((lVar == null || (dVar = lVar.f257812a.d) == null) ? null : dVar.f257797b, dVar4 != null ? dVar4.f257797b : null), lVar == null, lVar == null);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new TripDetailsDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55046j() {
            return this.f53564b;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55042b() {
            return this.f53563a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53563a, model.f53563a) && Intrinsics.f(this.f53564b, model.f53564b) && Intrinsics.f(this.f53565c, model.f53565c) && this.d == model.d && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f53566g, model.f53566g) && this.f53567h == model.f53567h && this.i == model.i && this.f53568j == model.f53568j && this.k == model.k && Intrinsics.f(this.f53569l, model.f53569l) && Intrinsics.f(this.f53570m, model.f53570m) && Intrinsics.f(this.f53571n, model.f53571n) && Intrinsics.f(this.o, model.o);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF55051q() {
            return this.f53567h;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53567h = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getI() {
            return this.f;
        }

        public final int hashCode() {
            int iHashCode = this.f53563a.hashCode() * 31;
            Object obj2 = this.f53564b;
            int iC = j6.a.c((this.f53565c.hashCode() + ((iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31)) * 31, 31, this.d);
            Clause clause = this.e;
            int iHashCode2 = (iC + (clause == null ? 0 : clause.hashCode())) * 31;
            Parcelable parcelable = this.f;
            int iB = j6.a.b(this.k, j6.a.b(this.f53568j, j6.a.b(this.i, j6.a.b(this.f53567h, h30.l.i(this.f53566g, (iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31), 31), 31), 31);
            p31.c cVar = this.f53569l;
            int iHashCode3 = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f53570m;
            int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f53571n;
            int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.o;
            return iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF55048m() {
            return this.f53569l;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53566g = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF55049n() {
            return this.f53570m;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f53571n = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF55052r() {
            return this.i;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF55054t() {
            return this.k;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.i = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF55047l() {
            return this.f53566g;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF55050p() {
            return this.o;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getO() {
            return this.f53571n;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f53569l = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF55053s() {
            return this.f53568j;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f53570m = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.o = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            rw0.n nVar = model.f53565c;
            rw0.n nVar2 = model.f53565c;
            rw0.c cVar = nVar.f257813a;
            rw0.n nVar3 = this.f53565c;
            rw0.c cVar2 = nVar3.f257813a;
            rw0.f fVar = nVar3.f;
            rw0.m mVar = nVar3.d;
            boolean z = !cVar.equals(cVar2);
            mm0 mm0VarE = e(mVar, nVar2.d);
            boolean z3 = !nVar2.f257814b.equals(nVar3.f257814b);
            mm0 mm0VarE2 = e(mVar, nVar2.e);
            boolean z4 = (nVar2.d.equals(mVar) && nVar2.e.equals(nVar3.e)) ? false : true;
            boolean z6 = !Intrinsics.f(nVar2.f, fVar);
            rw0.f fVar2 = nVar2.f;
            return new nm0(z, mm0VarE, z3, !Intrinsics.f(nVar2.f257815c, nVar3.f257815c), mm0VarE2, z4, z6, ((fVar2 != null ? fVar2.f257803c : null) != null) != ((fVar != null ? fVar.f257803c : null) != null), model.d != this.d, or0.b.l(this, (qv0.i) oldItem));
        }

        public /* synthetic */ Model(String str, rw0.n nVar) {
            this(str, nVar, false, null, null, null);
        }
    }
}
