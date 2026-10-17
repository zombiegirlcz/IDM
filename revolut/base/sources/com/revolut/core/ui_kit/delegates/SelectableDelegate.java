package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.click.animator.ripple.UIKitRippleDrawable;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.od0;
import ip0.pd0;
import ip0.qd0;
import ip0.vd0;
import ip0.xd0;
import koi.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import qv0.c;
import qv0.i;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \b*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0005:\b\t\n\u0007\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SelectableDelegate;", "Lqv0/i;", "InnerItem", "Lkoi/b;", "InnerVH", "Lcom/revolut/core/ui_kit/recycler/BaseGroupRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/SelectableDelegate$Model;", "Lip0/xd0;", "Companion", "Model", "ip0/pd0", "ip0/vd0", "b", "ip0/qd0", "com/revolut/core/ui_kit/delegates/lg", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectableDelegate<InnerItem extends qv0.i, InnerVH extends koi.b> extends BaseGroupRecyclerViewDelegate<Model<InnerItem>, xd0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final iv0.t f53303g = new iv0.t();
    public final koi.k d;
    public final ihm.f e;
    public final ip0.za f;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.SelectableDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.SelectableDelegate$b$b, reason: collision with other inner class name */
        public static final class C0424b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0424b f53319a = new C0424b();

            private C0424b() {
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f53320a = new c();

            private c() {
            }
        }

        private b() {
        }

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f53318a;

            public a(boolean z) {
                this.f53318a = z;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && this.f53318a == ((a) obj2).f53318a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f53318a);
            }

            public a() {
                this(false);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableDelegate(koi.k innerDelegate) {
        super(f53303g.a(innerDelegate.getClass()), new od0(innerDelegate, 0));
        Intrinsics.checkNotNullParameter(innerDelegate, "innerDelegate");
        this.d = innerDelegate;
        this.e = v0.a.d("create(...)");
        this.f = new ip0.za(20);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.internal_delegate_selectable, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        xd0 xd0Var = new xd0(viewInflate, this.d.g(parent));
        xd0Var.f167144h.addView(((koi.b) xd0Var.f).itemView);
        Context context = xd0Var.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        UIKitRippleDrawable uIKitRippleDrawableE = dr0.l.e(context, new Color.Solid(R$attr.uikit_colorSelectableItemBackground), null, new ShapeDrawable(new OvalShape()), 12);
        ImageView imageView = xd0Var.f167145j;
        imageView.setForeground(uIKitRippleDrawableE);
        ViewCompat.setAccessibilityDelegate(imageView, new lg(xd0Var));
        return xd0Var;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        xd0 xd0Var = holder instanceof xd0 ? (xd0) holder : null;
        if (xd0Var == null || (imageView = xd0Var.f167145j) == null) {
            return;
        }
        imageView.setActivated(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x02b4 A[LOOP:3: B:162:0x02b2->B:163:0x02b4, LOOP_END] */
    @Override // com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(koi.b r27, qv0.l r28, int r29, java.util.List r30) {
        /*
            Method dump skipped, instruction units count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.SelectableDelegate.q(koi.b, qv0.l, int, java.util.List):void");
    }

    public final efm.r r() {
        efm.r rVarHide = this.e.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0001\fJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SelectableDelegate$Model;", "Lkoi/j;", "InnerItem", "Lqv0/l;", "Ls31/c;", "Lgx0/a;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/p;", "Loy0/b;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/kg", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model<InnerItem extends koi.j> implements qv0.l, s31.c, gx0.a, TrackableItem, qv0.p, oy0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final koi.j f53305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final qd0 f53306c;
        public final b d;
        public final vd0 e;
        public final kg f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f53307g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f53308h;
        public final Clause i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f53309j;
        public final Object k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public qv0.c f53310l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public qv0.k f53311m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f53312n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f53313p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f53314q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f53315r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f53316s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f53317t;
        public final int u;

        public Model(String listId, koi.j innerItem, qd0 selectedState, b state, vd0 style, kg topMargin, boolean z, boolean z3, Clause clause, Parcelable parcelable, Object obj2, qv0.c positionInBox, qv0.k positionInGroup, p31.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, hx7.i iVar, int i, int i2, int i3, int i5) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(innerItem, "innerItem");
            Intrinsics.checkNotNullParameter(selectedState, "selectedState");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(topMargin, "topMargin");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
            this.f53304a = listId;
            this.f53305b = innerItem;
            this.f53306c = selectedState;
            this.d = state;
            this.e = style;
            this.f = topMargin;
            this.f53307g = z;
            this.f53308h = z3;
            this.i = clause;
            this.f53309j = parcelable;
            this.k = obj2;
            this.f53310l = positionInBox;
            this.f53311m = positionInGroup;
            this.f53312n = cVar;
            this.o = cVar2;
            this.f53313p = cVar3;
            this.f53314q = cVar4;
            this.f53315r = i;
            this.f53316s = i2;
            this.f53317t = i3;
            this.u = i5;
        }

        public static Model e(Model model, RowDelegate.Model model2, qd0 selectedState, b bVar, vd0 vd0Var, int i) {
            String listId = model.f53304a;
            koi.j innerItem = (i & 2) != 0 ? model.f53305b : model2;
            b state = (i & 8) != 0 ? model.d : bVar;
            vd0 style = (i & 16) != 0 ? model.e : vd0Var;
            kg topMargin = model.f;
            boolean z = (i & 64) != 0 ? model.f53307g : true;
            boolean z3 = model.f53308h;
            Clause clause = model.i;
            Parcelable parcelable = model.f53309j;
            Object obj2 = model.k;
            qv0.c positionInBox = model.f53310l;
            qv0.k positionInGroup = model.f53311m;
            p31.c cVar = model.f53312n;
            p31.c cVar2 = model.o;
            p31.c cVar3 = model.f53313p;
            p31.c cVar4 = model.f53314q;
            int i2 = model.f53315r;
            int i3 = model.f53316s;
            int i5 = model.f53317t;
            int i6 = model.u;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(innerItem, "innerItem");
            Intrinsics.checkNotNullParameter(selectedState, "selectedState");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(topMargin, "topMargin");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
            return new Model(listId, innerItem, selectedState, state, style, topMargin, z, z3, clause, parcelable, obj2, positionInBox, positionInGroup, cVar, cVar2, cVar3, cVar4, null, i2, i3, i5, i6);
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: C1 */
        public final boolean getF52234l() {
            return true;
        }

        @Override // qv0.l
        public final void R0(qv0.k kVar) {
            Intrinsics.checkNotNullParameter(kVar, "<set-?>");
            this.f53311m = kVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF52053j() {
            return this.k;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52049b() {
            return this.f53304a;
        }

        @Override // gx0.a
        public final py0.d d() {
            koi.j jVar = this.f53305b;
            gx0.a aVar = jVar instanceof gx0.a ? (gx0.a) jVar : null;
            if (aVar != null) {
                return aVar.d();
            }
            return null;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53304a, model.f53304a) && Intrinsics.f(this.f53305b, model.f53305b) && this.f53306c == model.f53306c && Intrinsics.f(this.d, model.d) && this.e == model.e && this.f == model.f && this.f53307g == model.f53307g && this.f53308h == model.f53308h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f53309j, model.f53309j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f53310l, model.f53310l) && this.f53311m == model.f53311m && Intrinsics.f(this.f53312n, model.f53312n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f53313p, model.f53313p) && Intrinsics.f(this.f53314q, model.f53314q) && Intrinsics.f(null, null) && this.f53315r == model.f53315r && this.f53316s == model.f53316s && this.f53317t == model.f53317t && this.u == model.u;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52054l() {
            return this.f53315r;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: f0, reason: from getter */
        public final qv0.k getV() {
            return this.f53311m;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53315r = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getK() {
            return this.f53309j;
        }

        @Override // oy0.b
        /* JADX INFO: renamed from: getContentDescription, reason: from getter */
        public final Clause getF59810c() {
            return this.i;
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.c((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f53306c.hashCode() + ((this.f53305b.hashCode() + (this.f53304a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f53307g), 31, this.f53308h);
            Clause clause = this.i;
            int iHashCode = (iC + (clause == null ? 0 : clause.hashCode())) * 31;
            Parcelable parcelable = this.f53309j;
            int iHashCode2 = (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            Object obj2 = this.k;
            int iHashCode3 = (this.f53311m.hashCode() + h30.l.i(this.f53310l, (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31)) * 31;
            p31.c cVar = this.f53312n;
            int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.o;
            int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f53313p;
            int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f53314q;
            return Integer.hashCode(this.u) + j6.a.b(this.f53317t, j6.a.b(this.f53316s, j6.a.b(this.f53315r, (((iHashCode6 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31) + 0) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getK() {
            return this.f53314q;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53310l = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52909l() {
            return this.f53312n;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.o = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52055m() {
            return this.f53316s;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getO() {
            return this.u;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53316s = i;
        }

        @Override // s31.c
        public final hx7.i p() {
            return null;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52908j() {
            return this.f53310l;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52911n() {
            return this.f53313p;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52910m() {
            return this.o;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f53314q = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53309j = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52056n() {
            return this.f53317t;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f53312n = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f53313p = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Model model;
            Object obj2;
            boolean z;
            Model model2;
            boolean z3;
            boolean z4;
            boolean z6;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (!(oldItem instanceof Model)) {
                return null;
            }
            Model model3 = (Model) oldItem;
            Object objZ = this.f53305b.z(model3.f53305b);
            boolean z11 = false;
            boolean z12 = true;
            if (this.f53306c != model3.f53306c) {
                model = model3;
                obj2 = objZ;
                z = true;
            } else {
                model = model3;
                obj2 = objZ;
                z = false;
            }
            if (this.e != model.e) {
                model2 = model;
                z3 = true;
            } else {
                model2 = model;
                z3 = false;
            }
            boolean z29 = !Intrinsics.f(this.d, model2.d);
            if (this.f != model2.f) {
                z4 = false;
                z11 = true;
            } else {
                z4 = false;
            }
            if (this.f53307g != model2.f53307g) {
                z6 = true;
            } else {
                z6 = true;
                z12 = z4;
            }
            if (this.f53308h != model2.f53308h) {
                z4 = z6;
            }
            return new pd0(obj2, z, z3, z29, z11, z12, z4, Intrinsics.f(this.i, model2.i) ^ z6, or0.b.m(this, (qv0.l) oldItem));
        }

        public /* synthetic */ Model(String str, koi.j jVar, qd0 qd0Var, b bVar, vd0 vd0Var, kg kgVar, boolean z, boolean z3, Parcelable parcelable, Object obj2, qv0.c cVar, qv0.k kVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, p31.c cVar5, int i, int i2, int i3, int i5, int i6) {
            this(str, jVar, qd0Var, (i6 & 8) != 0 ? b.C0424b.f53319a : bVar, vd0Var, (i6 & 32) != 0 ? kg.LARGE : kgVar, (i6 & 64) != 0 ? false : z, (i6 & 128) != 0 ? false : z3, null, (i6 & 512) != 0 ? null : parcelable, (i6 & 1024) != 0 ? null : obj2, (i6 & 2048) != 0 ? c.d.f249513a : cVar, (i6 & 4096) != 0 ? qv0.k.OutOfGroup : kVar, (i6 & 8192) != 0 ? null : cVar2, (i6 & 16384) != 0 ? null : cVar3, (32768 & i6) != 0 ? null : cVar4, (65536 & i6) != 0 ? null : cVar5, null, (262144 & i6) != 0 ? R$attr.uikit_dp0 : i, (524288 & i6) != 0 ? R$attr.uikit_dp0 : i2, (1048576 & i6) != 0 ? R$attr.uikit_dp0 : i3, (i6 & PKIFailureInfo.badSenderNonce) != 0 ? R$attr.uikit_dp0 : i5);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, koi.j innerItem, boolean z, b bVar, vd0 vd0Var, int i) {
            qv0.c cVar;
            qd0 qd0Var;
            b state = (i & 8) != 0 ? b.C0424b.f53319a : bVar;
            vd0 style = (i & 16) != 0 ? vd0.CHECKBOX : vd0Var;
            if ((i & 128) != 0) {
                cVar = c.d.f249513a;
            } else {
                cVar = c.b.f249511a;
            }
            qv0.c positionInBox = cVar;
            int i2 = R$attr.uikit_dp0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(innerItem, "innerItem");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            if (z) {
                qd0Var = qd0.SELECTED;
            } else {
                qd0Var = qd0.UNSELECTED;
            }
            this(listId, innerItem, qd0Var, state, style, null, false, false, null, null, positionInBox, null, null, null, null, null, i2, i2, i2, i2, 4576);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, qv0.i innerItem, qd0 selectedState, b bVar, vd0 vd0Var, boolean z, AnalyticsContext analyticsContext, Object obj2, kg kgVar, boolean z3, int i) {
            b state = (i & 8) != 0 ? b.C0424b.f53319a : bVar;
            vd0 style = (i & 16) != 0 ? vd0.CHECKBOX : vd0Var;
            boolean z4 = (i & 32) != 0 ? false : z;
            AnalyticsContext analyticsContext2 = (i & 128) != 0 ? null : analyticsContext;
            Object obj3 = (i & 256) != 0 ? null : obj2;
            kg topMargin = (i & 512) != 0 ? kg.LARGE : kgVar;
            boolean z6 = (i & 1024) != 0 ? false : z3;
            int i2 = R$attr.uikit_dp0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(innerItem, "innerItem");
            Intrinsics.checkNotNullParameter(selectedState, "selectedState");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(topMargin, "topMargin");
            this(listId, innerItem, selectedState, state, style, topMargin, z6, z4, analyticsContext2, obj3, c.d.f249513a, null, null, null, null, null, i2, i2, i2, i2, 258048);
        }
    }
}
