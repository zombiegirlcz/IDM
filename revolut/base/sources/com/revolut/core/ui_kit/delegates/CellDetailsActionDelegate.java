package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.LabelView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsActionDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/CellDetailsActionDelegate$Model;", "Lip0/a6;", "<init>", "()V", "ip0/v5", "Model", "ip0/z5", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsActionDelegate extends BaseRecyclerViewDelegate<Model, ip0.a6> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51780c;
    public final ihm.f d;
    public final Object e;
    public final Object f;

    public CellDetailsActionDelegate() {
        super(R$layout.internal_delegate_cell_details_action, new ip0.g4(10));
        this.f51780c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = te0.w.y0(new il9.p(13));
        this.f = te0.w.y0(new il9.p(14));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.a6(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_action));
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.a6 holder, Model model, int i, List payloads) {
        boolean z;
        LabelView labelView;
        Image image;
        TranslateAnimation translateAnimation;
        ip0.z5 z5Var;
        TranslateAnimation translateAnimation2;
        int i2;
        String str;
        int i3;
        int i5;
        Model data = model;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, model, i, payloads);
        AppCompatImageView appCompatImageView = holder.f163397h;
        LabelView labelView2 = holder.f163396g;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof ip0.v5) {
                arrayList.add(obj2);
            }
        }
        boolean zIsEmpty = payloads.isEmpty();
        Iterator it8 = arrayList.iterator();
        boolean z3 = zIsEmpty;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        boolean z41 = z31;
        boolean z49 = z41;
        while (true) {
            Iterator it9 = it8;
            if (!it8.hasNext()) {
                break;
            }
            ip0.v5 v5Var = (ip0.v5) it9.next();
            zIsEmpty = zIsEmpty || v5Var.f166768a;
            z3 = z3 || v5Var.f166770c;
            z4 = z4 || v5Var.d;
            z6 = z6 || v5Var.e;
            z31 = z31 || v5Var.f166772h;
            z11 = z11 || v5Var.f;
            z12 = z12 || v5Var.f166769b;
            z29 = z29 || v5Var.f166771g;
            z49 = z49 || v5Var.i;
            z41 = z41 || v5Var.f166773j;
            it8 = it9;
        }
        if (zIsEmpty) {
            z = z3;
            or0.b.e(this, data.f51782b, holder.f, null, 12);
        } else {
            z = z3;
        }
        if (z || z4) {
            LabelView labelView3 = holder.f163396g;
            Image image2 = data.d;
            ip0.z5 z5Var2 = data.f51786j;
            ip0.w5 w5Var = ip0.w5.f166935a;
            if (Intrinsics.f(z5Var2, w5Var)) {
                labelView = labelView3;
                image = image2;
                translateAnimation = null;
            } else {
                TranslateAnimation translateAnimation3 = (TranslateAnimation) this.e.getValue();
                labelView = labelView3;
                translateAnimation3.setInterpolator(z5Var2.a());
                image = image2;
                translateAnimation3.setDuration(300L);
                translateAnimation = translateAnimation3;
            }
            if (Intrinsics.f(z5Var2, w5Var)) {
                z5Var = z5Var2;
                translateAnimation2 = null;
            } else {
                TranslateAnimation translateAnimation4 = (TranslateAnimation) this.f.getValue();
                translateAnimation4.setInterpolator(z5Var2.c());
                z5Var = z5Var2;
                translateAnimation4.setDuration(z5Var.e());
                translateAnimation2 = translateAnimation4;
            }
            labelView.setStartIcon(image, translateAnimation, translateAnimation2, z5Var.b(), z5Var.d(), z5Var.f());
        }
        if (z6) {
            i2 = 0;
            LabelView.setText$default(labelView2, data.e, 0, 2, null);
        } else {
            i2 = 0;
        }
        if (z11) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            str = "itemView";
            i3 = i2;
            i5 = 1;
            or0.b.c(this, data, itemView, false, null, 28);
        } else {
            str = "itemView";
            i3 = i2;
            i5 = 1;
        }
        if (z12) {
            if (data.f51783c != 0) {
                appCompatImageView.setVisibility(i3);
                appCompatImageView.setImageResource(data.f51783c);
            } else {
                appCompatImageView.setVisibility(8);
            }
        }
        if (z29) {
            holder.i.setVisibility(data.f51784g ? i3 : 8);
        }
        if (z49) {
            ViewGroup.LayoutParams layoutParams = labelView2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.matchConstraintPercentWidth = data.i.b();
            labelView2.setLayoutParams(layoutParams2);
        }
        if (z41) {
            hx7.b.v(labelView2, data.k);
        }
        labelView2.setAnalyticsContext(data.f51788m);
        if (data.f51785h) {
            Context context = labelView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            labelView2.setTextColor(kli.a.u(R$attr.uikit_colorAccent, context));
            labelView2.setOnClickListener(new ip0.j5(holder, i5, this, data));
        } else {
            or0.u.o(labelView2);
            Context context2 = labelView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            labelView2.setTextColor(kli.a.u(R$attr.uikit_colorForeground, context2));
        }
        if (data.f51783c == 0) {
            or0.u.o(appCompatImageView);
        } else {
            View[] viewArr = new View[i5];
            viewArr[i3] = appCompatImageView;
            j01.c cVar = new j01.c(viewArr, model, this.f51780c, null, 24);
            data = model;
            or0.u.t(appCompatImageView, data, cVar);
        }
        View view = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, str);
        gq0.b bVarF = hx7.b.f(data.f51782b);
        Clause clause = data.e;
        gq0.b bVarF2 = clause != null ? hx7.b.f(clause) : null;
        gq0.d[] elements = new gq0.d[2];
        elements[i3] = bVarF;
        elements[i5] = bVarF2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        hx7.b.u(kotlin.collections.d.L(elements), view);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsActionDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f51782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f51783c;
        public final Image d;
        public final Clause e;
        public final aw0.j0 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f51784g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f51785h;
        public final aw0.u0 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ip0.z5 f51786j;
        public final String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Object f51787l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Parcelable f51788m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public qv0.c f51789n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f51790p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p31.c f51791q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public p31.c f51792r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f51793s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f51794t;
        public final int u;
        public final int v;

        public Model(String listId, Clause cellTitle, int i, Image image, Clause clause, aw0.j0 backgroundType, boolean z, boolean z3, aw0.u0 actionMaxWidth, ip0.z5 preActionAnimation, String str, Object obj2, Parcelable parcelable, qv0.c positionInBox, p31.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, int i2, int i3, int i5, int i6) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
            Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
            Intrinsics.checkNotNullParameter(actionMaxWidth, "actionMaxWidth");
            Intrinsics.checkNotNullParameter(preActionAnimation, "preActionAnimation");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            this.f51781a = listId;
            this.f51782b = cellTitle;
            this.f51783c = i;
            this.d = image;
            this.e = clause;
            this.f = backgroundType;
            this.f51784g = z;
            this.f51785h = z3;
            this.i = actionMaxWidth;
            this.f51786j = preActionAnimation;
            this.k = str;
            this.f51787l = obj2;
            this.f51788m = parcelable;
            this.f51789n = positionInBox;
            this.o = cVar;
            this.f51790p = cVar2;
            this.f51791q = cVar3;
            this.f51792r = cVar4;
            this.f51793s = i2;
            this.f51794t = i3;
            this.u = i5;
            this.v = i6;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new CellDetailsActionDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF53128j() {
            return this.f51787l;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52693a() {
            return this.f51781a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51781a, model.f51781a) && Intrinsics.f(this.f51782b, model.f51782b) && this.f51783c == model.f51783c && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && this.f51784g == model.f51784g && this.f51785h == model.f51785h && this.i == model.i && Intrinsics.f(this.f51786j, model.f51786j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f51787l, model.f51787l) && Intrinsics.f(this.f51788m, model.f51788m) && Intrinsics.f(this.f51789n, model.f51789n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f51790p, model.f51790p) && Intrinsics.f(this.f51791q, model.f51791q) && Intrinsics.f(this.f51792r, model.f51792r) && this.f51793s == model.f51793s && this.f51794t == model.f51794t && this.u == model.u && this.v == model.v;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getI() {
            return this.f51793s;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51793s = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF53923g() {
            return this.f51788m;
        }

        public final int hashCode() {
            int iB = j6.a.b(this.f51783c, p.a.a(this.f51781a.hashCode() * 31, 31, this.f51782b), 31);
            Image image = this.d;
            int iHashCode = (iB + (image == null ? 0 : image.hashCode())) * 31;
            Clause clause = this.e;
            int iHashCode2 = (this.f51786j.hashCode() + ((this.i.hashCode() + j6.a.c(j6.a.c((this.f.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31, 31, this.f51784g), 31, this.f51785h)) * 31)) * 31;
            String str = this.k;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Object obj2 = this.f51787l;
            int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f51788m;
            int i = h30.l.i(this.f51789n, (iHashCode4 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.o;
            int iHashCode5 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f51790p;
            int iHashCode6 = (iHashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f51791q;
            int iHashCode7 = (iHashCode6 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f51792r;
            return Integer.hashCode(this.v) + j6.a.b(this.u, j6.a.b(this.f51794t, j6.a.b(this.f51793s, (iHashCode7 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getK() {
            return this.o;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f51789n = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52699l() {
            return this.f51790p;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f51791q = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53921j() {
            return this.f51794t;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53922l() {
            return this.v;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f51794t = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52698j() {
            return this.f51789n;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52701n() {
            return this.f51792r;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52700m() {
            return this.f51791q;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.o = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f51788m = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getK() {
            return this.u;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f51790p = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f51792r = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new ip0.v5(!Intrinsics.f(model.f51782b, this.f51782b), model.f51783c != this.f51783c, !Intrinsics.f(model.d, this.d), !Intrinsics.f(model.f51786j, this.f51786j), !Intrinsics.f(model.e, this.e), or0.b.l(this, (qv0.i) oldItem), model.f51784g != this.f51784g, model.f51785h != this.f51785h, model.i != this.i, !Intrinsics.f(model.k, this.k));
        }

        public /* synthetic */ Model(String str, Clause clause, int i, Image image, Clause clause2, aw0.j0 j0Var, boolean z, boolean z3, aw0.u0 u0Var, ip0.z5 z5Var, Object obj2, int i2, int i3, int i5, int i6, int i21) {
            this(str, clause, (i21 & 4) != 0 ? 0 : i, image, clause2, (i21 & 32) != 0 ? aw0.j0.DEFAULT : j0Var, (i21 & 64) != 0 ? false : z, (i21 & 128) != 0 ? true : z3, (i21 & 256) != 0 ? aw0.u0.MEDIUM : u0Var, (i21 & 512) != 0 ? ip0.w5.f166935a : z5Var, null, (i21 & 2048) != 0 ? null : obj2, null, c.d.f249513a, null, null, null, null, (262144 & i21) != 0 ? R$attr.uikit_dp0 : i2, (524288 & i21) != 0 ? R$attr.uikit_dp0 : i3, (1048576 & i21) != 0 ? R$attr.uikit_dp16 : i5, (i21 & PKIFailureInfo.badSenderNonce) != 0 ? R$attr.uikit_dp16 : i6);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause cellTitle, int i, Image image, Clause clause, boolean z, boolean z3, aw0.u0 u0Var, Object obj2, int i2, int i3, int i5) {
            boolean z4 = (i5 & 32) != 0 ? false : z;
            boolean z6 = (i5 & 64) != 0 ? true : z3;
            aw0.u0 actionMaxWidth = (i5 & 128) != 0 ? aw0.u0.MEDIUM : u0Var;
            Object obj3 = (i5 & 512) != 0 ? null : obj2;
            int i6 = (i5 & 2048) != 0 ? R$attr.uikit_dp0 : i2;
            int i21 = (i5 & 4096) != 0 ? R$attr.uikit_dp0 : i3;
            int i22 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
            Intrinsics.checkNotNullParameter(actionMaxWidth, "actionMaxWidth");
            this(listId, cellTitle, i, image, clause, null, z4, z6, actionMaxWidth, null, obj3, i6, i21, i22, i22, 246304);
        }
    }
}
