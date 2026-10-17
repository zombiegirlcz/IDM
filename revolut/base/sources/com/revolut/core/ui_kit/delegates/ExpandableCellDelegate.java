package com.revolut.core.ui_kit.delegates;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.internal.views.LabelView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0007\u0003\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ExpandableCellDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ExpandableCellDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/z5;", "<init>", "()V", "Companion", "Model", "ip0/mg", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExpandableCellDelegate extends BaseRecyclerViewDelegate<Model, z5> {

    @NotNull
    private static final a Companion = new a();
    public static final ResourceImage f = new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52255c;
    public final Object d;
    public final AccelerateDecelerateInterpolator e;

    public static final class a {
        private a() {
        }
    }

    public ExpandableCellDelegate() {
        super(R$layout.internal_delegate_expandable_cell, new ip0.zf(5));
        this.f52255c = v0.a.d("create(...)");
        this.d = yhm.j.c(yhm.k.NONE, new il9.p(16));
        this.e = new AccelerateDecelerateInterpolator();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new z5(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_expandable_cell));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(z5 holder, Model data, int i, List list) {
        Image image;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        View itemView = holder.itemView;
        TextView textView = holder.i;
        LabelView labelView = holder.f;
        ImageView imageView = holder.f55675h;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        Clause clause = data.f52257b;
        y5 y5Var = data.d;
        boolean z = data.e;
        py0.c cVar = clause != null ? new py0.c(clause) : null;
        or0.m.a(itemView);
        itemView.setOnClickListener(new ip0.ng(data, cVar, this, data, 0));
        boolean z3 = y5Var instanceof w5;
        if (z3) {
            image = ((w5) y5Var).f54893a;
        } else {
            if (!(y5Var instanceof x5) && y5Var != null) {
                throw new NoWhenBranchMatchedException();
            }
            image = null;
        }
        py0.b bVar = image != null ? new py0.b(image) : null;
        or0.m.a(imageView);
        imageView.setOnClickListener(new ip0.ng(data, bVar, this, data, 1));
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.mg)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z4 = zIsEmpty;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        for (int i3 = 0; i3 < size2; i3++) {
            ip0.mg mgVar = (ip0.mg) payloads.get(i3);
            z4 = z4 || mgVar.f165373a;
            z6 = z6 || mgVar.f165374b;
            z12 = z12 || mgVar.f165375c;
            z11 = z11 || mgVar.d;
            z29 = z29 || mgVar.e;
        }
        if (z4) {
            LabelView.setText$default(labelView, data.f52257b, 0, 2, null);
        }
        if (z6 || z11) {
            TextView textView2 = holder.f55674g;
            Clause clause2 = data.f52258c;
            if (!z) {
                clause2 = null;
            }
            kli.a.b(textView2, clause2, ty0.f.f275450a);
        }
        if (z12) {
            if (z3) {
                zi0.c.g(imageView, ((w5) y5Var).f54893a);
                kli.a.b(textView, null, ty0.f.f275450a);
            } else if (y5Var instanceof x5) {
                zi0.c.g(imageView, null);
                kli.a.b(textView, ((x5) y5Var).f55594a, ty0.f.f275450a);
            } else {
                if (y5Var != null) {
                    throw new NoWhenBranchMatchedException();
                }
                zi0.c.g(imageView, null);
                kli.a.b(textView, null, ty0.f.f275450a);
            }
        }
        if (z11) {
            float f4 = BitmapDescriptorFactory.HUE_RED;
            float f5 = z ? 180.0f : 0.0f;
            if (zIsEmpty) {
                labelView.setEndImageRotation$ui_kit_components_release(f5);
            } else {
                if (!z) {
                    f4 = 180.0f;
                }
                AppCompatImageView appCompatImageView = labelView.i;
                ObjectAnimator objectAnimatorOfFloat = appCompatImageView != null ? ObjectAnimator.ofFloat(appCompatImageView, (Property<AppCompatImageView, Float>) FrameLayout.ROTATION, f4, f5) : null;
                if (objectAnimatorOfFloat != null) {
                    objectAnimatorOfFloat.setDuration(300L);
                    objectAnimatorOfFloat.setInterpolator(this.e);
                    objectAnimatorOfFloat.start();
                }
            }
        }
        if (z29) {
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            or0.b.c(this, data, itemView2, false, null, 28);
        }
        View itemView3 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
        Intrinsics.checkNotNullParameter(itemView3, "<this>");
        int i5 = z ? R$string.common_accessibility_value_expanded : R$string.common_accessibility_value_collapsed;
        Context context = itemView3.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ty0.c cVarB0 = jh.d.f(context).b0();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i5, null, null, 14);
        Context context2 = itemView3.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        SpannableStringBuilder spannableStringBuilderA = ty0.c.a(cVarB0, textLocalisedClause, context2, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        if (Build.VERSION.SDK_INT >= 30) {
            itemView3.setStateDescription(spannableStringBuilderA);
            return;
        }
        itemView3.setContentDescription(((Object) spannableStringBuilderA) + ", " + ((Object) or0.m.b(itemView3)));
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ExpandableCellDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/y5", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f52257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f52258c;
        public final y5 d;
        public final boolean e;
        public final Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Parcelable f52259g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public qv0.c f52260h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f52261j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f52262l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f52263m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f52264n;
        public final int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f52265p;

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause title, Clause clause, ResourceImage resourceImage, boolean z, Object obj2, AnalyticsContext analyticsContext, int i) {
            clause = (i & 4) != 0 ? null : clause;
            resourceImage = (i & 8) != 0 ? null : resourceImage;
            obj2 = (i & 32) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i & 64) != 0 ? null : analyticsContext;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            this(listId, title, clause, resourceImage != null ? new w5(resourceImage) : null, z, obj2, analyticsContext2);
        }

        public static Model e(Model model, int i) {
            String listId = model.f52256a;
            Clause title = model.f52257b;
            Clause clause = model.f52258c;
            y5 y5Var = model.d;
            boolean z = (i & 16) != 0 ? model.e : true;
            Object obj2 = model.f;
            Parcelable parcelable = model.f52259g;
            qv0.c positionInBox = model.f52260h;
            p31.c cVar = model.i;
            p31.c cVar2 = model.f52261j;
            p31.c cVar3 = model.k;
            p31.c cVar4 = model.f52262l;
            model.getClass();
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            return new Model(listId, title, clause, y5Var, z, obj2, parcelable, positionInBox, cVar, cVar2, cVar3, cVar4);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new ExpandableCellDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF54968n() {
            return this.f;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52630a() {
            return this.f52256a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52256a, model.f52256a) && Intrinsics.f(this.f52257b, model.f52257b) && Intrinsics.f(this.f52258c, model.f52258c) && Intrinsics.f(this.d, model.d) && this.e == model.e && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52259g, model.f52259g) && Intrinsics.f(this.f52260h, model.f52260h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52261j, model.f52261j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52262l, model.f52262l);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52633g() {
            return this.f52263m;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52263m = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.f52259g;
        }

        public final int hashCode() {
            int iA = p.a.a(this.f52256a.hashCode() * 31, 31, this.f52257b);
            Clause clause = this.f52258c;
            int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
            y5 y5Var = this.d;
            int iC = j6.a.c((iHashCode + (y5Var == null ? 0 : y5Var.hashCode())) * 31, 31, this.e);
            Object obj2 = this.f;
            int iHashCode2 = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52259g;
            int i = h30.l.i(this.f52260h, (iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.i;
            int iHashCode3 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52261j;
            int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.k;
            int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52262l;
            return iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52638n() {
            return this.i;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52260h = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getK() {
            return this.f52261j;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.k = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52634h() {
            return this.f52264n;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52635j() {
            return this.f52265p;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52264n = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getO() {
            return this.f52260h;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52637m() {
            return this.f52262l;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52636l() {
            return this.k;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.i = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52259g = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getI() {
            return this.o;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52261j = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52262l = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new ip0.mg(!Intrinsics.f(r0.f52257b, this.f52257b), !Intrinsics.f(r0.f52258c, this.f52258c), !Intrinsics.f(r0.d, this.d), ((Model) oldItem).e != this.e, or0.b.l(this, (qv0.i) oldItem));
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Model(String listId, TextLocalisedClause title, x5 x5Var, boolean z, Parcelable parcelable) {
            this(listId, title, null, x5Var, z, parcelable, null);
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
        }

        public /* synthetic */ Model(String str, Clause clause, Clause clause2, y5 y5Var, boolean z, Object obj2, Parcelable parcelable) {
            this(str, clause, clause2, y5Var, z, obj2, parcelable, c.d.f249513a, null, null, null, null);
        }

        public Model(String str, Clause clause, Clause clause2, y5 y5Var, boolean z, Object obj2, Parcelable parcelable, qv0.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, p31.c cVar5) {
            this.f52256a = str;
            this.f52257b = clause;
            this.f52258c = clause2;
            this.d = y5Var;
            this.e = z;
            this.f = obj2;
            this.f52259g = parcelable;
            this.f52260h = cVar;
            this.i = cVar2;
            this.f52261j = cVar3;
            this.k = cVar4;
            this.f52262l = cVar5;
            int i = R$attr.uikit_dp16;
            this.f52263m = i;
            this.f52264n = i;
            this.o = i;
            this.f52265p = i;
        }
    }
}
