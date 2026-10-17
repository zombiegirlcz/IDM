package com.revolut.core.ui_kit.delegates.widgets;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.CircleProgressBar;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.animated_numbers.AnimatedNumbersView;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0007\b\u0003\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/AvatarWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/AvatarWidgetDelegate$Model;", "Lop0/i;", "<init>", "()V", "Companion", "Model", "op0/h", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AvatarWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.i> {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public AvatarWidgetDelegate() {
        super(R$layout.internal_delegate_avatar, new ood.g0(13));
    }

    public static void t(View view, float f) {
        int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(view, "getContext(...)", f);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int marginStart = marginLayoutParams.getMarginStart();
        int i = marginLayoutParams.topMargin;
        marginLayoutParams.setMarginStart(marginStart);
        marginLayoutParams.topMargin = i;
        marginLayoutParams.setMarginEnd(iA);
        marginLayoutParams.bottomMargin = iA;
        view.setLayoutParams(marginLayoutParams);
    }

    public static void u(op0.i iVar, Model model) {
        Clause clause = model.d;
        if (clause == null) {
            iVar.f227295m.setVisibility(8);
            iVar.k.setVisibility(8);
            iVar.f227294l.setVisibility(8);
            return;
        }
        if (model.f54965j) {
            TextView textView = iVar.k;
            AnimatedNumbersView animatedNumbersView = iVar.f227295m;
            textView.setVisibility(8);
            animatedNumbersView.setVisibility(0);
            animatedNumbersView.setCurrentClause(clause);
            animatedNumbersView.setOnBarrelAnimationEndListener(new oa2.b(model, iVar, 23));
        } else {
            iVar.f227295m.setVisibility(8);
            kli.a.b(iVar.k, clause, ty0.f.f275450a);
        }
        iVar.f227294l.setVisibility(0);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.i iVar = new op0.i(kotlin.jvm.internal.s.r(parent, this.f54986c));
        p(iVar, true);
        return iVar;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void p(op0.i holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        CircleBadgeView circleBadgeView = holder.f227300s;
        LottieAnimationView lottieAnimationView = holder.f227299r;
        CircleProgressBar circleProgressBar = holder.f227297p;
        TextView textView = holder.f227296n;
        ProgressStyle progressStyle = data.f54964h;
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        boolean zN5 = ue0.e.n(payloads);
        boolean zN6 = ue0.e.n(payloads);
        boolean zN7 = ue0.e.n(payloads);
        boolean zN8 = ue0.e.n(payloads);
        boolean zN9 = ue0.e.n(payloads);
        boolean zN10 = ue0.e.n(payloads);
        boolean zN11 = ue0.e.n(payloads);
        boolean zN12 = ue0.e.n(payloads);
        Iterator it8 = payloads.iterator();
        while (true) {
            Iterator it9 = it8;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it9.next();
            boolean z = zN;
            if (next instanceof op0.h) {
                zN = z || ((op0.h) next).f227278a;
                zN2 = zN2 || ((op0.h) next).f227279b;
                zN3 = zN3 || ((op0.h) next).f227280c;
                zN4 = zN4 || ((op0.h) next).d;
                zN5 = zN5 || ((op0.h) next).e;
                zN6 = zN6 || ((op0.h) next).f;
                zN7 = zN7 || ((op0.h) next).f227281g;
                zN8 = zN8 || ((op0.h) next).f227282h;
                zN9 = zN9 || ((op0.h) next).i;
                zN10 = zN10 || ((op0.h) next).f227283j;
                zN11 = zN11 || ((op0.h) next).k;
                zN12 = zN12 || ((op0.h) next).f227284l;
            } else {
                zN = z;
            }
            it8 = it9;
        }
        if (zN) {
            yy0.f.e(or0.u.k(holder.f227293j).Q(), data.f54962c, holder.f227293j, null, null, 12);
        }
        if (zN2) {
            u(holder, data);
        }
        if (zN3) {
            kli.a.b(textView, data.e, ty0.f.f275450a);
        }
        if (zN4) {
            textView.setMaxLines(data.f);
        }
        if (zN5) {
            kli.a.b(holder.o, data.f54963g, ty0.f.f275450a);
        }
        if (zN6) {
            if (progressStyle != null) {
                circleProgressBar.setVisibility(0);
                circleProgressBar.a(progressStyle);
            } else {
                circleProgressBar.setVisibility(8);
            }
        }
        if (zN7) {
            holder.f227298q.setVisibility(8);
        }
        if (zN8) {
            if (data.i != null) {
                lottieAnimationView.setVisibility(0);
                yy0.f.e(or0.u.k(lottieAnimationView).Q(), data.i, holder.f227299r, null, null, 12);
            } else {
                lottieAnimationView.setVisibility(8);
            }
        }
        if (zN9) {
            u(holder, data);
        }
        if (zN11) {
            holder.F(data.f54967m);
        }
        if (zN10) {
            int i2 = h.f55363a[data.k.ordinal()];
            if (i2 == 1) {
                Context context = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                textView.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
                t(circleBadgeView, -4.0f);
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Context context2 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                textView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context2));
                t(circleBadgeView, 4.0f);
            }
        }
        if (zN12) {
            circleBadgeView.setBadgeAndVisibility(data.f54966l, holder.f227301t);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\b\tJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/AvatarWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "Companion", "com/revolut/core/ui_kit/delegates/widgets/g", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f54961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f54962c;
        public final Clause d;
        public final Clause e;
        public final int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Clause f54963g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ProgressStyle f54964h;
        public final LottieImage i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f54965j;
        public final g k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final CircleBadgeModel f54966l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final op0.q f54967m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Object f54968n;
        public Parcelable o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public op0.r f54969p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final py0.d f54970q;

        public Model(String str, Image image, Clause clause, Clause clause2, int i, Clause clause3, ProgressStyle progressStyle, LottieImage lottieImage, boolean z, g gVar, CircleBadgeModel circleBadgeModel, op0.q qVar, Object obj2, Parcelable parcelable, op0.r rVar) {
            this.f54961b = str;
            this.f54962c = image;
            this.d = clause;
            this.e = clause2;
            this.f = i;
            this.f54963g = clause3;
            this.f54964h = progressStyle;
            this.i = lottieImage;
            this.f54965j = z;
            this.k = gVar;
            this.f54966l = circleBadgeModel;
            this.f54967m = qVar;
            this.f54968n = obj2;
            this.o = parcelable;
            this.f54969p = rVar;
            clause = clause == null ? clause2 == null ? clause3 : clause2 : clause;
            this.f54970q = clause != null ? new py0.c(clause) : new py0.b(image);
        }

        public static Model E(Model model, op0.q widgetSize) {
            String listId = model.f54961b;
            Image image = model.f54962c;
            Clause clause = model.d;
            Clause clause2 = model.e;
            int i = model.f;
            Clause clause3 = model.f54963g;
            ProgressStyle progressStyle = model.f54964h;
            LottieImage lottieImage = model.i;
            boolean z = model.f54965j;
            g style = model.k;
            CircleBadgeModel circleBadgeModel = model.f54966l;
            Object obj2 = model.f54968n;
            Parcelable parcelable = model.o;
            op0.r widgetState = model.f54969p;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
            Intrinsics.checkNotNullParameter(widgetState, "widgetState");
            return new Model(listId, image, clause, clause2, i, clause3, progressStyle, lottieImage, z, style, circleBadgeModel, widgetSize, obj2, parcelable, widgetState);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getI() {
            return this.f54969p;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f54969p = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF51629j() {
            return this.f54968n;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51624a() {
            return this.f54961b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d, reason: from getter */
        public final py0.d getF55228j() {
            return this.f54970q;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f54961b, model.f54961b) && Intrinsics.f(this.f54962c, model.f54962c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f54963g, model.f54963g) && Intrinsics.f(this.f54964h, model.f54964h) && Intrinsics.f(this.i, model.i) && this.f54965j == model.f54965j && this.k == model.k && Intrinsics.f(this.f54966l, model.f54966l) && this.f54967m == model.f54967m && Intrinsics.f(this.f54968n, model.f54968n) && Intrinsics.f(this.o, model.o) && this.f54969p == model.f54969p;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getK() {
            return this.o;
        }

        public final int hashCode() {
            int iC = a10.b.c(this.f54962c, this.f54961b.hashCode() * 31, 31);
            Clause clause = this.d;
            int iHashCode = (iC + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.e;
            int iB = j6.a.b(this.f, (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31);
            Clause clause3 = this.f54963g;
            int iHashCode2 = (iB + (clause3 == null ? 0 : clause3.hashCode())) * 31;
            ProgressStyle progressStyle = this.f54964h;
            int iHashCode3 = (iHashCode2 + (progressStyle == null ? 0 : progressStyle.hashCode())) * 961;
            LottieImage lottieImage = this.i;
            int iHashCode4 = (this.k.hashCode() + j6.a.c((iHashCode3 + (lottieImage == null ? 0 : lottieImage.hashCode())) * 31, 31, this.f54965j)) * 31;
            CircleBadgeModel circleBadgeModel = this.f54966l;
            int iB2 = okl.m.b(this.f54967m, (iHashCode4 + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode())) * 31, 31);
            Object obj2 = this.f54968n;
            int iHashCode5 = (iB2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.o;
            return this.f54969p.hashCode() + ((iHashCode5 + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF55174g() {
            return this.f54967m;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.o = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new op0.h(!Intrinsics.f(model.f54962c, this.f54962c), !Intrinsics.f(model.d, this.d), !Intrinsics.f(model.e, this.e), model.f != this.f, !Intrinsics.f(model.f54963g, this.f54963g), !Intrinsics.f(model.f54964h, this.f54964h), !true, !Intrinsics.f(model.i, this.i), model.f54965j != this.f54965j, model.k != this.k, model.f54967m != this.f54967m, !Intrinsics.f(model.f54966l, this.f54966l));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Image image, Clause clause, Clause clause2, Clause clause3, ProgressStyle progressStyle, LottieImage lottieImage, g gVar, CircleBadgeModel circleBadgeModel, Object obj2, AnalyticsContext analyticsContext, int i) {
            CircleBadgeModel circleBadgeModel2;
            InactiveCircleBadge inactiveCircleBadge;
            Clause clause4 = (i & 4) != 0 ? null : clause;
            int i2 = (i & 16) != 0 ? 1 : 2;
            Clause clause5 = (i & 32) != 0 ? null : clause3;
            ProgressStyle progressStyle2 = (i & 64) != 0 ? null : progressStyle;
            LottieImage lottieImage2 = (i & 256) != 0 ? null : lottieImage;
            boolean z = (i & 512) == 0;
            g style = (i & 1024) != 0 ? g.DEFAULT : gVar;
            if ((i & 2048) != 0) {
                AvatarWidgetDelegate.Companion.getClass();
                Intrinsics.checkNotNullParameter(style, "<this>");
                int i3 = f.f55349a[style.ordinal()];
                if (i3 == 1) {
                    inactiveCircleBadge = new InactiveCircleBadge(dw0.a.Locked);
                } else {
                    if (i3 != 2 && i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    inactiveCircleBadge = null;
                }
                circleBadgeModel2 = inactiveCircleBadge;
            } else {
                circleBadgeModel2 = circleBadgeModel;
            }
            Object obj3 = (i & 4096) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i & 8192) != 0 ? null : analyticsContext;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(style, "style");
            this(listId, image, clause4, clause2, i2, clause5, progressStyle2, lottieImage2, z, style, circleBadgeModel2, op0.q.SMALL, obj3, analyticsContext2, op0.r.SEEN);
        }
    }
}
