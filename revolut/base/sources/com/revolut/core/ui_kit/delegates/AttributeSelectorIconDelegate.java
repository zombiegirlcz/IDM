package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.drawables.BorderGradientDrawable;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0007\b\u0003\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/AttributeSelectorIconDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/AttributeSelectorIconDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/j0;", "<init>", "()V", "Companion", "Model", "ip0/o1", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AttributeSelectorIconDelegate extends BaseRecyclerViewDelegate<Model, j0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51655c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/AttributeSelectorIconDelegate$Model;", "Lqv0/q;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/h0", "com/revolut/core/ui_kit/delegates/g0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, TrackableItem, qv0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ResourceImage f51657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NumberClause f51658c;
        public final Clause d;
        public final Object e;
        public final TagViewData f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final h0 f51659g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final g0 f51660h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final rub.j f51661j;
        public qv0.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f51662l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f51663m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f51664n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f51665p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f51666q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f51667r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f51668s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Parcelable f51669t;

        public Model(String listId, ResourceImage icon, NumberClause title, MoneyClause moneyClause, Clause clause, TagViewData tagViewData, h0 state, g0 selectedState, rub.j jVar, AnalyticsContext analyticsContext, int i) {
            moneyClause = (i & 8) != 0 ? null : moneyClause;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(selectedState, "selectedState");
            int i2 = R$attr.uikit_dp0;
            this.f51656a = listId;
            this.f51657b = icon;
            this.f51658c = title;
            this.d = moneyClause;
            this.e = clause;
            this.f = tagViewData;
            this.f51659g = state;
            this.f51660h = selectedState;
            this.i = true;
            this.f51661j = jVar;
            this.k = c.d.f249513a;
            this.f51662l = null;
            this.f51663m = null;
            this.f51664n = null;
            this.o = null;
            this.f51665p = i2;
            this.f51666q = i2;
            this.f51667r = i2;
            this.f51668s = i2;
            this.f51669t = analyticsContext;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new AttributeSelectorIconDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF() {
            return this.f51661j;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51656a() {
            return this.f51656a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51656a, model.f51656a) && Intrinsics.f(this.f51657b, model.f51657b) && Intrinsics.f(this.f51658c, model.f51658c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f51659g == model.f51659g && this.f51660h == model.f51660h && this.i == model.i && Intrinsics.f(this.f51661j, model.f51661j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f51662l, model.f51662l) && Intrinsics.f(this.f51663m, model.f51663m) && Intrinsics.f(this.f51664n, model.f51664n) && Intrinsics.f(this.o, model.o) && this.f51665p == model.f51665p && this.f51666q == model.f51666q && this.f51667r == model.f51667r && this.f51668s == model.f51668s && Intrinsics.f(this.f51669t, model.f51669t);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF51665p() {
            return this.f51665p;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51665p = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF51669t() {
            return this.f51669t;
        }

        public final int hashCode() {
            int iHashCode = (this.f51658c.hashCode() + org.bouncycastle.jcajce.provider.digest.a.b(this.f51657b, this.f51656a.hashCode() * 31, 31)) * 31;
            Clause clause = this.d;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Object obj2 = this.e;
            int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            TagViewData tagViewData = this.f;
            int iC = j6.a.c((this.f51660h.hashCode() + ((this.f51659g.hashCode() + ((iHashCode3 + (tagViewData == null ? 0 : tagViewData.hashCode())) * 31)) * 31)) * 31, 31, this.i);
            rub.j jVar = this.f51661j;
            int i = h30.l.i(this.k, (iC + (jVar == null ? 0 : jVar.hashCode())) * 31, 31);
            p31.c cVar = this.f51662l;
            int iHashCode4 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f51663m;
            int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f51664n;
            int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.o;
            int iB = j6.a.b(this.f51668s, j6.a.b(this.f51667r, j6.a.b(this.f51666q, j6.a.b(this.f51665p, (iHashCode6 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 31);
            Parcelable parcelable = this.f51669t;
            return iB + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF51662l() {
            return this.f51662l;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.k = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF51663m() {
            return this.f51663m;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f51664n = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF51666q() {
            return this.f51666q;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF51668s() {
            return this.f51668s;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f51666q = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getK() {
            return this.k;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getO() {
            return this.o;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF51664n() {
            return this.f51664n;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f51662l = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f51669t = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF51667r() {
            return this.f51667r;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f51663m = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.o = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            return new ip0.o1(!Intrinsics.f(this.f51657b, model.f51657b), !Intrinsics.f(this.f51658c, model.f51658c), !Intrinsics.f(this.d, model.d), !Intrinsics.f(this.e, model.e), !Intrinsics.f(this.f, model.f), this.f51659g != model.f51659g, this.f51660h != model.f51660h, !Intrinsics.f(this.k, model.k));
        }
    }

    public AttributeSelectorIconDelegate() {
        super(R$layout.internal_delegate_attribute_selector_icon, new ip0.c(15));
        this.f51655c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new j0(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    /* JADX WARN: Type inference failed for: r8v14, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(j0 holder, Model data, int i, List list) {
        Drawable borderGradientDrawable;
        float f;
        List<ip0.o1> payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        TagView tagView = holder.f54316j;
        AppCompatTextView appCompatTextView = holder.i;
        AppCompatTextView appCompatTextView2 = holder.f54315h;
        AppCompatTextView appCompatTextView3 = holder.f54314g;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.o1)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        for (ip0.o1 o1Var : payloads) {
            zIsEmpty = zIsEmpty || o1Var.f165601a;
            z = z || o1Var.f165602b;
            z3 = z3 || o1Var.f165603c;
            z4 = z4 || o1Var.d;
            z6 = z6 || o1Var.e;
            z11 = z11 || o1Var.f165605h;
            z12 = z12 || o1Var.f165604g;
            z29 = z29 || o1Var.f;
        }
        if (zIsEmpty) {
            ResourceImage icon = data.f51657b;
            Intrinsics.checkNotNullParameter(icon, "icon");
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            yy0.f.e(jh.d.f(context).Q(), icon, holder.f, null, null, 12);
        }
        if (z) {
            NumberClause title = data.f51658c;
            Intrinsics.checkNotNullParameter(title, "title");
            kli.a.b(appCompatTextView3, title, ty0.f.f275450a);
        }
        if (z3) {
            kli.a.b(appCompatTextView2, data.d, ty0.f.f275450a);
        }
        if (z4) {
            kli.a.b(appCompatTextView, data.e, ty0.f.f275450a);
        }
        if (z6) {
            TagViewData tagViewData = data.f;
            tagView.setVisibility(tagViewData == null ? 8 : 0);
            if (tagViewData != null) {
                tagView.setContent(tagViewData);
            }
        }
        if (z11 || z12 || z29) {
            Intrinsics.checkNotNullParameter(data, "data");
            float fA = r6.b.a(holder.itemView, "getContext(...)", 2.0f);
            int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(holder.itemView, "getContext(...)", 16.0f);
            Context context2 = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iS = kli.a.s(R$attr.uikit_colorElevatedWidgetBackground, context2);
            View view = holder.k;
            int i3 = i0.f54268a[data.f51659g.ordinal()];
            if (i3 == 1) {
                Context context3 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                RoundedBackgroundDrawable roundedBackgroundDrawable = new RoundedBackgroundDrawable(context3, iS, 4);
                roundedBackgroundDrawable.f(iA);
                borderGradientDrawable = roundedBackgroundDrawable;
                view.setBackground(borderGradientDrawable);
            } else if (i3 != 2) {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Context context32 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context32, "getContext(...)");
                RoundedBackgroundDrawable roundedBackgroundDrawable2 = new RoundedBackgroundDrawable(context32, iS, 4);
                roundedBackgroundDrawable2.f(iA);
                borderGradientDrawable = roundedBackgroundDrawable2;
                view.setBackground(borderGradientDrawable);
            } else {
                int i5 = i0.f54269b[data.f51660h.ordinal()];
                if (i5 == 1) {
                    float f4 = iA;
                    List listK = zhm.v.k(Integer.valueOf(R$attr.uikit_colorPurple), Integer.valueOf(R$attr.uikit_colorIndigo));
                    ArrayList arrayList = new ArrayList(zhm.w.t(listK, 10));
                    Iterator it8 = listK.iterator();
                    while (it8.hasNext()) {
                        int iIntValue = ((Number) it8.next()).intValue();
                        Context context4 = holder.itemView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                        arrayList.add(Integer.valueOf(kli.a.s(iIntValue, context4)));
                    }
                    borderGradientDrawable = new BorderGradientDrawable(f4, fA, zhm.d0.c1(arrayList), iS);
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    float f5 = iA;
                    List listK2 = zhm.v.k(Integer.valueOf(R$attr.uikit_colorAccent), Integer.valueOf(R$attr.uikit_colorAccent));
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(listK2, 10));
                    Iterator it9 = listK2.iterator();
                    while (it9.hasNext()) {
                        ((Number) it9.next()).intValue();
                        Context context5 = holder.itemView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                        arrayList2.add(Integer.valueOf(kli.a.s(R$attr.uikit_colorAccent, context5)));
                    }
                    borderGradientDrawable = new BorderGradientDrawable(f5, fA, zhm.d0.c1(arrayList2), iS);
                }
                view.setBackground(borderGradientDrawable);
            }
        }
        if (z29) {
            h0 state = data.f51659g;
            Intrinsics.checkNotNullParameter(state, "state");
            int i6 = i0.f54268a[state.ordinal()];
            if (i6 == 1 || i6 == 2) {
                f = 1.0f;
            } else {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 0.4f;
            }
            holder.f.setAlpha(f);
            appCompatTextView3.setAlpha(f);
            appCompatTextView2.setAlpha(f);
            appCompatTextView.setAlpha(f);
            tagView.setAlpha(f);
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        py0.c cVar = new py0.c(data.f51658c);
        boolean z31 = data.i;
        or0.m.a(itemView);
        if (z31) {
            itemView.setOnClickListener(new au0.i3(data, cVar, this, data, 3));
        } else {
            or0.u.o(itemView);
        }
    }
}
