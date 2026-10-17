package com.revolut.core.ui_kit.delegates;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.ak0;
import ip0.bk0;
import ip0.ck0;
import ip0.dk0;
import ip0.ek0;
import ip0.fk0;
import ip0.gk0;
import ip0.kt;
import ip0.ri0;
import ip0.yj0;
import ip0.zj0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0006\u0007\b\u0003\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/TextDelegate;", "Lcom/revolut/core/ui_kit/delegates/BaseTextDelegate;", "Lcom/revolut/core/ui_kit/delegates/TextDelegate$Model;", "Lip0/fk0;", "<init>", "()V", "Model", "com/fasterxml/jackson/core/m", "ip0/yj0", "ip0/zj0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TextDelegate extends BaseTextDelegate<Model, fk0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53530c;
    public final ihm.f d;

    public TextDelegate() {
        int i = R$layout.internal_delegate_text;
        ri0 rule = new ri0(8);
        Intrinsics.checkNotNullParameter(rule, "rule");
        super(i, rule);
        this.f53530c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new fk0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_text));
    }

    @Override // com.revolut.core.ui_kit.delegates.BaseTextDelegate
    public final void p(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.d.onNext(clickData);
    }

    public final void q(Model model, fk0 fk0Var) {
        float f;
        com.fasterxml.jackson.core.m mVar = model.e;
        if (!(mVar instanceof ak0)) {
            if (!(mVar instanceof dk0) && !(mVar instanceof ek0) && !(mVar instanceof bk0) && !(mVar instanceof ck0)) {
                throw new NoWhenBranchMatchedException();
            }
            or0.b.f(this, null, fk0Var.f164273g);
            return;
        }
        ak0 ak0Var = (ak0) mVar;
        int i = gk0.f164433a[ak0Var.d.ordinal()];
        if (i == 1) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = 0.5f;
        }
        ImageView imageView = fk0Var.f164273g;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.horizontalBias = f;
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = com.google.android.gms.internal.mlkit_vision_face.a.a(fk0Var.itemView, "getContext(...)", 16.0f);
        imageView.setLayoutParams(layoutParams2);
        or0.b.f(this, ak0Var.e, fk0Var.f164273g);
    }

    public final void r(Model model, fk0 fk0Var) {
        kli.a.a(fk0Var.f, model.f53532b, model, new bi(1, 0, ihm.f.class, this.d, "onNext", "onNext(Ljava/lang/Object;)V"), ty0.d.f275448a);
        TextView textView = fk0Var.f;
        com.fasterxml.jackson.core.m mVar = model.e;
        jb3.l.e(textView, mVar.f26179b);
        if (mVar instanceof dk0) {
            Resources resources = fk0Var.itemView.getContext().getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.internal_MarketingDisplay2_min_text_size);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(com.revolut.core.ui_kit_resources.R$dimen.internal_MarketingDisplay2_text_size);
            TextViewCompat.setAutoSizeTextTypeWithDefaults(textView, 1);
            TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(textView, dimensionPixelSize, dimensionPixelSize2, 1, 0);
            textView.setMaxLines(3);
        } else {
            if (!(mVar instanceof ak0) && !(mVar instanceof ek0) && !(mVar instanceof bk0) && !(mVar instanceof ck0)) {
                throw new NoWhenBranchMatchedException();
            }
            TextViewCompat.setAutoSizeTextTypeWithDefaults(textView, 0);
            textView.setMaxLines(Integer.MAX_VALUE);
        }
        Context context = fk0Var.itemView.getContext();
        Intrinsics.h(context);
        TypedArray typedArrayObtainStyledAttributes = fk0Var.itemView.getContext().obtainStyledAttributes(kli.a.x(mVar.f26179b, context), new int[]{R.attr.lineSpacingExtra});
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        textView.setLineSpacing(typedArrayObtainStyledAttributes.getDimension(0, textView.getLineSpacingExtra()), 1.0f);
        int i = gk0.f164433a[mVar.b().ordinal()];
        if (i == 1) {
            textView.setGravity(8388611);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textView.setGravity(1);
        }
        textView.setBreakStrategy(mVar.f26180c);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void p(fk0 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f;
        boolean z = data.d;
        Clause clause = data.f53532b;
        if (z) {
            textView.setMovementMethod(null);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            py0.c cVar = clause != null ? new py0.c(clause) : null;
            or0.m.a(itemView);
            itemView.setOnClickListener(new kt(data, cVar, this, data, 21));
        } else {
            View view = holder.itemView;
            textView.setMovementMethod(((bp0.y) h30.l.x(view, "itemView", view)).g(clause) ? ix0.c0.f169220a : null);
            holder.itemView.setOnClickListener(null);
            holder.itemView.setClickable(false);
        }
        if (payloads.isEmpty()) {
            r(data, holder);
            q(data, holder);
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            or0.b.c(this, data, itemView2, false, null, 28);
        } else {
            List list = payloads;
            ArrayList<zj0> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.TextDelegate.Payload");
                arrayList.add((zj0) obj2);
            }
            for (zj0 zj0Var : arrayList) {
                if (zj0Var.f167475a || zj0Var.f167476b) {
                    r(data, holder);
                    q(data, holder);
                }
                if (zj0Var.d) {
                    View itemView3 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
                    or0.b.c(this, data, itemView3, false, null, 28);
                }
            }
        }
        View itemView4 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
        hx7.b.v(itemView4, data.f);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/TextDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f53532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final aw0.j0 f53533c;
        public final boolean d;
        public final com.fasterxml.jackson.core.m e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f53534g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f53535h;
        public qv0.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f53536j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f53537l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f53538m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f53539n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f53540p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f53541q;

        public Model(String listId, Clause label, aw0.j0 backgroundType, boolean z, com.fasterxml.jackson.core.m style, String str, Object obj2, Parcelable parcelable, int i, int i2, int i3, int i5, int i6) {
            backgroundType = (i6 & 4) != 0 ? aw0.j0.DEFAULT : backgroundType;
            z = (i6 & 8) != 0 ? false : z;
            style = (i6 & 16) != 0 ? new ck0(yj0.CENTER_HORIZONTAL) : style;
            str = (i6 & 32) != 0 ? null : str;
            obj2 = (i6 & 64) != 0 ? null : obj2;
            parcelable = (i6 & 128) != 0 ? null : parcelable;
            i = (i6 & 8192) != 0 ? R$attr.uikit_dp16 : i;
            i2 = (i6 & 16384) != 0 ? R$attr.uikit_dp16 : i2;
            i3 = (32768 & i6) != 0 ? R$attr.uikit_dp16 : i3;
            i5 = (i6 & 65536) != 0 ? R$attr.uikit_dp16 : i5;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
            Intrinsics.checkNotNullParameter(style, "style");
            c.d positionInBox = c.d.f249513a;
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            this.f53531a = listId;
            this.f53532b = label;
            this.f53533c = backgroundType;
            this.d = z;
            this.e = style;
            this.f = str;
            this.f53534g = obj2;
            this.f53535h = parcelable;
            this.i = positionInBox;
            this.f53536j = null;
            this.k = null;
            this.f53537l = null;
            this.f53538m = null;
            this.f53539n = i;
            this.o = i2;
            this.f53540p = i3;
            this.f53541q = i5;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new TextDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getK() {
            return this.f53534g;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51926a() {
            return this.f53531a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53531a, model.f53531a) && Intrinsics.f(this.f53532b, model.f53532b) && this.f53533c == model.f53533c && this.d == model.d && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f53534g, model.f53534g) && Intrinsics.f(this.f53535h, model.f53535h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f53536j, model.f53536j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f53537l, model.f53537l) && Intrinsics.f(this.f53538m, model.f53538m) && this.f53539n == model.f53539n && this.o == model.o && this.f53540p == model.f53540p && this.f53541q == model.f53541q;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getK() {
            return this.f53539n;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53539n = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getO() {
            return this.f53535h;
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + j6.a.c((this.f53533c.hashCode() + p.a.a(this.f53531a.hashCode() * 31, 31, this.f53532b)) * 31, 31, this.d)) * 31;
            String str = this.f;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Object obj2 = this.f53534g;
            int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f53535h;
            int i = h30.l.i(this.i, (iHashCode3 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f53536j;
            int iHashCode4 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.k;
            int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f53537l;
            int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f53538m;
            return Integer.hashCode(this.f53541q) + j6.a.b(this.f53540p, j6.a.b(this.o, j6.a.b(this.f53539n, (iHashCode6 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF51929g() {
            return this.f53536j;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.i = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF51930h() {
            return this.k;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f53537l = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF51932l() {
            return this.o;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF51934n() {
            return this.f53541q;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.o = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF() {
            return this.i;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF51931j() {
            return this.f53538m;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getI() {
            return this.f53537l;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f53536j = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53535h = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF51933m() {
            return this.f53540p;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.k = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f53538m = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new zj0(!Intrinsics.f(model.f53532b, this.f53532b), !Intrinsics.f(model.e, this.e), model.d != this.d, (Intrinsics.f(model.f53536j, this.f53536j) && Intrinsics.f(model.k, this.k) && Intrinsics.f(model.f53537l, this.f53537l) && Intrinsics.f(model.f53538m, this.f53538m)) ? false : true, !Intrinsics.f(model.f, this.f));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(int i, int i2, int i3, Clause label, String listId) {
            boolean z = (i3 & 4) == 0;
            int i5 = (i3 & 64) != 0 ? R$attr.uikit_dp16 : i;
            int i6 = (i3 & 128) != 0 ? R$attr.uikit_dp16 : i2;
            int i21 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(label, "label");
            this(listId, label, null, z, null, null, null, null, i5, i6, i21, i21, 7700);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause label, boolean z, com.fasterxml.jackson.core.m style, Object obj2, AnalyticsContext analyticsContext, int i, int i2, int i3, int i5, int i6) {
            boolean z3 = (i6 & 4) != 0 ? false : z;
            String str = (i6 & 16) != 0 ? null : "profile.lastLogin.title";
            Object obj3 = (i6 & 32) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i6 & 64) != 0 ? null : analyticsContext;
            int i21 = (i6 & 128) != 0 ? R$attr.uikit_dp16 : i;
            int i22 = (i6 & 256) != 0 ? R$attr.uikit_dp16 : i2;
            int i32 = (i6 & 512) != 0 ? R$attr.uikit_dp16 : i3;
            int i33 = (i6 & 1024) != 0 ? R$attr.uikit_dp16 : i5;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(style, "style");
            this(listId, label, null, z3, style, str, obj3, analyticsContext2, i21, i22, i32, i33, 7684);
        }
    }
}
