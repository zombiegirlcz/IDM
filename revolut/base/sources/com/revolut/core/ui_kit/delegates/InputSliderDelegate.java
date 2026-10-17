package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.slider.SliderTitledView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ar;
import ip0.hq;
import ip0.sq;
import ip0.tq;
import ip0.uq;
import ip0.vq;
import ip0.wk;
import ip0.xq;
import ip0.yq;
import ip0.zq;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0007\b\t\u0003\n\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/InputSliderDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/InputSliderDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/q7;", "<init>", "()V", "Companion", "ip0/vq", "Model", "ip0/zq", "ip0/uq", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InputSliderDelegate extends BaseRecyclerViewDelegate<Model, q7> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52559c;
    public final ihm.f d;
    public final ihm.f e;

    public InputSliderDelegate() {
        super(R$layout.internal_delegate_input_slider, new hq(3));
        this.f52559c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
    }

    public static void p(Model model, q7 q7Var) {
        if (model.d == null && model.f52563g == null) {
            or0.u.z(q7Var.f, 0, com.google.android.gms.internal.mlkit_vision_face.a.a(q7Var.itemView, "getContext(...)", BitmapDescriptorFactory.HUE_RED), 0, 0, false, 29);
        } else {
            or0.u.z(q7Var.f, 0, com.google.android.gms.internal.mlkit_vision_face.a.a(q7Var.itemView, "getContext(...)", 8.0f), 0, 0, false, 29);
        }
    }

    public static void r(q7 q7Var, boolean z) {
        View view = q7Var.itemView;
        Intrinsics.i(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setAlpha(z ? 1.0f : 0.4f);
            childAt.setEnabled(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void s(uq uqVar, q7 q7Var) {
        SliderTitledView sliderTitledView = q7Var.f;
        if (Intrinsics.f(uqVar, sq.f166385a)) {
            sliderTitledView.setLabelsVisible(false);
        } else {
            if (!(uqVar instanceof tq)) {
                throw new NoWhenBranchMatchedException();
            }
            tq tqVar = (tq) uqVar;
            sliderTitledView.setStartLabel(tqVar.f166560a);
            sliderTitledView.setEndLabel(tqVar.f166561b);
            sliderTitledView.setLabelsVisible(true);
        }
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new q7(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.revolut.core.ui_kit.models.Clause, kotlin.jvm.functions.Function1] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(q7 holder, Model model, int i, List payloads) {
        int i2;
        uq uqVar;
        int i3;
        zq zqVar;
        int i5;
        float f;
        InputSliderDelegate inputSliderDelegate;
        ?? r4;
        float f4;
        int i6;
        int i21;
        zq zqVar2;
        int i22;
        uq uqVar2;
        o7 o7Var;
        Model data = model;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, model, i, payloads);
        AppCompatTextView appCompatTextView = holder.i;
        SliderTitledView sliderTitledView = holder.f;
        AppCompatTextView appCompatTextView2 = holder.f54621g;
        AppCompatTextView appCompatTextView3 = holder.f54622h;
        boolean z = data.i;
        Clause clause = data.f52563g;
        Clause clause2 = data.d;
        m7 m7Var = data.f52565j;
        uq uqVar3 = data.f52561b;
        int i32 = data.f;
        zq zqVar3 = data.f52564h;
        int i33 = data.e;
        int i43 = data.f52562c;
        float f5 = data.k;
        if (z) {
            py0.c cVar = clause2 != null ? new py0.c(clause2) : null;
            or0.m.a(appCompatTextView3);
            i2 = i43;
            zqVar = zqVar3;
            f = f5;
            uqVar = uqVar3;
            i3 = i32;
            i5 = i33;
            appCompatTextView3.setOnClickListener(new ar(data, cVar, this, model, 0));
            appCompatTextView3.setOnTouchListener(new j01.e(new View[]{appCompatTextView3}));
            py0.c cVar2 = clause != null ? new py0.c(clause) : null;
            or0.m.a(appCompatTextView2);
            inputSliderDelegate = this;
            data = model;
            appCompatTextView2.setOnClickListener(new ar(data, cVar2, inputSliderDelegate, model, 1));
            appCompatTextView2.setOnTouchListener(new j01.e(new View[]{appCompatTextView2}));
            sliderTitledView.setOnValueChangeListener(new wk(inputSliderDelegate, data, 5));
        } else {
            i2 = i43;
            uqVar = uqVar3;
            i3 = i32;
            zqVar = zqVar3;
            i5 = i33;
            f = f5;
            inputSliderDelegate = this;
            appCompatTextView3.setOnClickListener(null);
            appCompatTextView3.setOnTouchListener(null);
            appCompatTextView2.setOnClickListener(null);
            appCompatTextView2.setOnTouchListener(null);
            sliderTitledView.setOnValueChangeListener(null);
        }
        sliderTitledView.setAnalyticsContext(data.f52566l);
        int i59 = 12;
        if (payloads.isEmpty()) {
            sliderTitledView.setStickyDistancePercentage(f);
            sliderTitledView.setRange(i2, i5);
            sliderTitledView.setStickyValues(zqVar);
            sliderTitledView.setValue(i3);
            s(uqVar, holder);
            sliderTitledView.setTooltipMode(null);
            r(holder, z);
            holder.F(m7Var);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, model, itemView, false, null, 28);
            or0.b.e(this, clause2, appCompatTextView3, null, 12);
            or0.b.e(this, null, appCompatTextView, null, 12);
            or0.b.e(this, clause, appCompatTextView2, null, 12);
            p(model, holder);
            return;
        }
        Iterator it8 = payloads.iterator();
        while (it8.hasNext()) {
            Object next = it8.next();
            Intrinsics.i(next, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.InputSliderDelegate.Payload");
            vq vqVar = (vq) next;
            if (vqVar.f) {
                r4 = 0;
                or0.b.e(inputSliderDelegate, clause2, appCompatTextView3, null, i59);
                p(data, holder);
            } else {
                r4 = 0;
            }
            if (vqVar.f166872g) {
                or0.b.e(inputSliderDelegate, r4, appCompatTextView, r4, i59);
                p(data, holder);
            }
            if (vqVar.k) {
                f4 = f;
                sliderTitledView.setStickyDistancePercentage(f4);
            } else {
                f4 = f;
            }
            if (vqVar.f166871c || vqVar.d) {
                i6 = i5;
                i21 = i2;
                sliderTitledView.setRange(i21, i6);
            } else {
                i6 = i5;
                i21 = i2;
            }
            Iterator it9 = it8;
            if (vqVar.i) {
                zqVar2 = zqVar;
                sliderTitledView.setStickyValues(zqVar2);
            } else {
                zqVar2 = zqVar;
            }
            AppCompatTextView appCompatTextView4 = appCompatTextView;
            if (vqVar.f166869a) {
                i22 = i3;
                sliderTitledView.setValue(i22);
                p(data, holder);
            } else {
                i22 = i3;
            }
            if (vqVar.e) {
                r(holder, z);
            }
            if (vqVar.f166870b) {
                uqVar2 = uqVar;
                s(uqVar2, holder);
            } else {
                uqVar2 = uqVar;
            }
            AppCompatTextView appCompatTextView5 = appCompatTextView3;
            Clause clause3 = clause2;
            if (vqVar.f166873h) {
                o7Var = null;
                or0.b.e(inputSliderDelegate, clause, appCompatTextView2, null, 12);
            } else {
                o7Var = null;
            }
            if (vqVar.f166874j) {
                holder.F(m7Var);
            }
            if (vqVar.f166875l) {
                sliderTitledView.setTooltipMode(o7Var);
            }
            zqVar = zqVar2;
            uqVar = uqVar2;
            f = f4;
            i5 = i6;
            i2 = i21;
            i3 = i22;
            appCompatTextView = appCompatTextView4;
            clause2 = clause3;
            appCompatTextView3 = appCompatTextView5;
            i59 = 12;
            data = model;
            it8 = it9;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/InputSliderDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/m7", "com/revolut/core/ui_kit/delegates/o7", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final uq f52561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f52562c;
        public final Clause d;
        public final int e;
        public final int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Clause f52563g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final zq f52564h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final m7 f52565j;
        public final float k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Parcelable f52566l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Object f52567m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f52568n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f52569p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f52570q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public qv0.c f52571r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public p31.c f52572s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public p31.c f52573t;
        public p31.c u;
        public p31.c v;

        public Model(String str, uq uqVar, int i, Clause clause, int i2, int i3, Clause clause2, zq zqVar, boolean z, m7 m7Var, float f, Parcelable parcelable, Object obj2, int i5, int i6, int i21) {
            int i22 = (i21 & 32768) != 0 ? R$attr.uikit_dp16 : i5;
            int i32 = (i21 & 65536) != 0 ? R$attr.uikit_dp16 : i6;
            int i33 = R$attr.uikit_dp16;
            this.f52560a = str;
            this.f52561b = uqVar;
            this.f52562c = i;
            this.d = clause;
            this.e = i2;
            this.f = i3;
            this.f52563g = clause2;
            this.f52564h = zqVar;
            this.i = z;
            this.f52565j = m7Var;
            this.k = f;
            this.f52566l = parcelable;
            this.f52567m = obj2;
            this.f52568n = i22;
            this.o = i32;
            this.f52569p = i33;
            this.f52570q = i33;
            this.f52571r = c.d.f249513a;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new InputSliderDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF51698j() {
            return this.f52567m;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51693a() {
            return this.f52560a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52560a, model.f52560a) && Intrinsics.f(this.f52561b, model.f52561b) && this.f52562c == model.f52562c && Intrinsics.f(this.d, model.d) && this.e == model.e && this.f == model.f && Intrinsics.f(this.f52563g, model.f52563g) && Intrinsics.f(this.f52564h, model.f52564h) && this.i == model.i && this.f52565j == model.f52565j && Float.compare(this.k, model.k) == 0 && Intrinsics.f(this.f52566l, model.f52566l) && Intrinsics.f(this.f52567m, model.f52567m) && this.f52568n == model.f52568n && this.o == model.o && this.f52569p == model.f52569p && this.f52570q == model.f52570q && Intrinsics.f(this.f52571r, model.f52571r);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF53410n() {
            return this.f52568n;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52568n = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.f52566l;
        }

        public final int hashCode() {
            int iB = j6.a.b(this.f52562c, (this.f52561b.hashCode() + (this.f52560a.hashCode() * 31)) * 31, 31);
            Clause clause = this.d;
            int iB2 = j6.a.b(this.f, j6.a.b(this.e, (iB + (clause == null ? 0 : clause.hashCode())) * 961, 31), 31);
            Clause clause2 = this.f52563g;
            int iB3 = m72.b.b(this.k, (this.f52565j.hashCode() + j6.a.c((this.f52564h.hashCode() + ((iB2 + (clause2 == null ? 0 : clause2.hashCode())) * 31)) * 31, 31, this.i)) * 31, 961);
            Parcelable parcelable = this.f52566l;
            int iHashCode = (iB3 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            Object obj2 = this.f52567m;
            return this.f52571r.hashCode() + j6.a.b(this.f52570q, j6.a.b(this.f52569p, j6.a.b(this.o, j6.a.b(this.f52568n, (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31, 31), 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF53407j() {
            return this.f52572s;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52571r = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getK() {
            return this.f52573t;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.u = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getO() {
            return this.o;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53412q() {
            return this.f52570q;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.o = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getI() {
            return this.f52571r;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF53409m() {
            return this.v;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF53408l() {
            return this.u;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52572s = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52566l = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF53411p() {
            return this.f52569p;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52573t = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.v = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            boolean z;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            boolean z3 = false;
            if (model.f != this.f) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            boolean z4 = !Intrinsics.f(model.f52561b, this.f52561b);
            boolean z6 = model.f52562c != this.f52562c ? true : z;
            boolean z11 = model.e != this.e ? true : z;
            boolean z12 = model.i != this.i ? true : z;
            boolean z29 = !Intrinsics.f(model.d, this.d);
            boolean z31 = !true;
            boolean z41 = !Intrinsics.f(model.f52563g, this.f52563g);
            boolean z49 = !Intrinsics.f(model.f52564h, this.f52564h);
            boolean z54 = model.f52565j != this.f52565j ? true : z;
            if (model.k == this.k) {
                z = true;
            }
            return new vq(z3, z4, z6, z11, z12, z29, z31, z41, z49, z54, !z, !true);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, int i, int i2, xq xqVar, boolean z, Object obj2, int i3, int i5, int i6) {
            zq stickyValues = (i6 & 256) != 0 ? new yq(zhm.f0.f322471a) : xqVar;
            boolean z3 = (i6 & 512) != 0 ? true : z;
            m7 gravity = m7.START;
            Object obj3 = (i6 & 16384) != 0 ? null : obj2;
            Intrinsics.checkNotNullParameter(listId, "listId");
            sq labels = sq.f166385a;
            Intrinsics.checkNotNullParameter(labels, "labels");
            Intrinsics.checkNotNullParameter(stickyValues, "stickyValues");
            Intrinsics.checkNotNullParameter(gravity, "gravity");
            this(listId, labels, 0, null, i, i2, null, stickyValues, z3, gravity, 2.0f, null, obj3, i3, i5, 393216);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, uq labels, int i, Clause clause, int i2, int i3, Clause clause2, zq zqVar, boolean z, m7 m7Var, AnalyticsContext analyticsContext, Object obj2, int i5) {
            zq stickyValues = (i5 & 256) != 0 ? new yq(zhm.f0.f322471a) : zqVar;
            boolean z3 = (i5 & 512) != 0 ? true : z;
            m7 gravity = (i5 & 1024) != 0 ? m7.START : m7Var;
            float f = (i5 & 2048) != 0 ? 2.0f : 0.1f;
            AnalyticsContext analyticsContext2 = (i5 & 8192) != 0 ? null : analyticsContext;
            Object obj3 = (i5 & 16384) != 0 ? null : obj2;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(labels, "labels");
            Intrinsics.checkNotNullParameter(stickyValues, "stickyValues");
            Intrinsics.checkNotNullParameter(gravity, "gravity");
            this(listId, labels, i, clause, i2, i3, clause2, stickyValues, z3, gravity, f, analyticsContext2, obj3, 0, 0, 491520);
        }
    }
}
