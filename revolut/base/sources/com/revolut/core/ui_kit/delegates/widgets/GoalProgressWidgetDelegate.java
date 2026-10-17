package com.revolut.core.ui_kit.delegates.widgets;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import aw0.b6;
import aw0.c6;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.internal.views.LinearGaugeChartView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView;
import com.revolut.core.ui_kit.internal.views.chart.HorizontalSingleLineChartLegendView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit.views.StatusProgressBarView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.bb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0007\u0003\b\t\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/GoalProgressWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/GoalProgressWidgetDelegate$Model;", "Lop0/z1;", "<init>", "()V", "Companion", "b", "Model", "op0/y1", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GoalProgressWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.z1> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f55143h;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004\b\t\n\u000bJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/GoalProgressWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/widgets/n1", "com/revolut/core/ui_kit/delegates/widgets/v1", "com/revolut/core/ui_kit/delegates/widgets/m1", "com/revolut/core/ui_kit/delegates/widgets/r1", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p, TrackableItem {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f55145c;
        public final r1 d;
        public final m1 e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final v1 f55146g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final op0.q f55147h;
        public Parcelable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object f55148j;
        public op0.r k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f55149l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final py0.c f55150m;

        public Model(String listId, Clause title, r1 content, m1 bottomContent, v1 v1Var, boolean z, Object obj2, int i) {
            v1Var = (i & 16) != 0 ? null : v1Var;
            z = (i & 32) != 0 ? false : z;
            obj2 = (i & 128) != 0 ? null : obj2;
            boolean z3 = (i & 256) != 0;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(bottomContent, "bottomContent");
            title = z ? yh5.b.a(title) : title;
            op0.q qVar = op0.q.MEDIUM;
            op0.r rVar = op0.r.SEEN;
            this.f55144b = listId;
            this.f55145c = title;
            this.d = content;
            this.e = bottomContent;
            this.f = z;
            this.f55146g = v1Var;
            this.f55147h = qVar;
            this.i = null;
            this.f55148j = obj2;
            this.k = rVar;
            this.f55149l = z3;
            this.f55150m = new py0.c(title);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: B, reason: from getter */
        public final boolean getF55169n() {
            return this.f55149l;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF54957n() {
            return this.k;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.k = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF54956m() {
            return this.f55148j;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getD() {
            return this.f55144b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF55210g() {
            return this.f55150m;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55144b, model.f55144b) && Intrinsics.f(this.f55145c, model.f55145c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f55146g, model.f55146g) && this.f55147h == model.f55147h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f55148j, model.f55148j) && this.k == model.k && this.f55149l == model.f55149l;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF54955l() {
            return this.i;
        }

        public final int hashCode() {
            int iC = j6.a.c((this.e.hashCode() + ((this.d.hashCode() + p.a.b(this.f55144b.hashCode() * 31, 31, this.f55145c)) * 31)) * 31, 31, this.f);
            v1 v1Var = this.f55146g;
            int iB = okl.m.b(this.f55147h, (iC + (v1Var == null ? 0 : v1Var.hashCode())) * 31, 31);
            Parcelable parcelable = this.i;
            int iHashCode = (iB + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            Object obj2 = this.f55148j;
            return Boolean.hashCode(this.f55149l) + okl.m.c(this.k, (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31, 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getE() {
            return this.f55147h;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.i = parcelable;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: x, reason: from getter */
        public final boolean getF54941g() {
            return this.f;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            r1 r1Var = model.d;
            boolean z = !Intrinsics.f(this.f55145c, model.f55145c);
            r1 r1Var2 = this.d;
            boolean z3 = !Intrinsics.f(r1Var2.f55488a, r1Var.f55488a);
            boolean z4 = !Intrinsics.f(r1Var2.f55489b, r1Var.f55489b);
            Model model2 = (Model) oldItem;
            v1 v1Var = model2.f55146g;
            m1 m1Var = model2.e;
            v1 v1Var2 = this.f55146g;
            boolean z6 = !Intrinsics.f(v1Var2, v1Var);
            m1 m1Var2 = this.e;
            boolean z11 = m1Var2.getClass() != m1Var.getClass();
            boolean z12 = !m1Var2.equals(m1Var);
            boolean z29 = this.f != model2.f;
            Class<?> cls = v1Var2 != null ? v1Var2.getClass() : null;
            return new op0.y1(z, z3, z4, false, z11, z12, z29, z6, !Intrinsics.f(cls, model2.f55146g != null ? r15.getClass() : null));
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.GoalProgressWidgetDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static abstract class b extends BaseDraggableWidgetDelegate.a {
        private b() {
        }
    }

    public GoalProgressWidgetDelegate() {
        super(R$layout.internal_delegate_widget_goal_progress, new op0.v0(14));
        this.f55143h = v0.a.d("create(...)");
    }

    public static void t(op0.z1 z1Var, List list, Color color) {
        View view = z1Var.itemView;
        LinearLayout linearLayout = z1Var.f227501p;
        Context context = view.getContext();
        Intrinsics.h(context);
        int iK = kli.a.k(context, 6.0f);
        while (list.size() > linearLayout.getChildCount()) {
            StatusProgressBarView statusProgressBarView = new StatusProgressBarView(context, null, R.attr.progressBarStyleHorizontal, 8);
            statusProgressBarView.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f / list.size()));
            statusProgressBarView.setProgressDrawable(ContextCompat.getDrawable(context, R$drawable.internal_vaults_progress));
            linearLayout.addView(statusProgressBarView);
        }
        while (list.size() < linearLayout.getChildCount()) {
            linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        }
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            int i3 = ((l1) obj2).f55416a;
            View childAt = linearLayout.getChildAt(i);
            Intrinsics.i(childAt, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.StatusProgressBarView");
            StatusProgressBarView statusProgressBarView2 = (StatusProgressBarView) childAt;
            statusProgressBarView2.setProgress(i3);
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(io0.a.c(context, color));
            Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
            statusProgressBarView2.setProgressTintList(colorStateListValueOf);
            ViewGroup.LayoutParams layoutParams = statusProgressBarView2.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i5 = i == list.size() + (-1) ? 0 : iK;
            if (i5 != marginLayoutParams.getMarginEnd()) {
                marginLayoutParams.setMarginEnd(i5);
                statusProgressBarView2.setLayoutParams(marginLayoutParams);
            }
            i = i2;
        }
    }

    public static void u(op0.z1 z1Var, Model model, Clause clause, Clause clause2) {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.bottomToBottom = 0;
        layoutParams.endToStart = R$id.goalProgressWidget_progressSecondaryDescription;
        layoutParams.startToStart = 0;
        layoutParams.goneEndMargin = com.google.android.gms.internal.mlkit_vision_face.a.a(z1Var.itemView, "getContext(...)", BitmapDescriptorFactory.HUE_RED);
        layoutParams.constrainedWidth = true;
        layoutParams.horizontalBias = BitmapDescriptorFactory.HUE_RED;
        layoutParams.horizontalChainStyle = 1;
        Context context = z1Var.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        layoutParams.setMarginEnd(kli.a.k(context, 4.0f));
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams2.bottomToBottom = 0;
        layoutParams2.endToEnd = 0;
        layoutParams2.startToEnd = R$id.goalProgressWidget_progressDescription;
        layoutParams2.goneStartMargin = com.google.android.gms.internal.mlkit_vision_face.a.a(z1Var.itemView, "getContext(...)", BitmapDescriptorFactory.HUE_RED);
        layoutParams2.constrainedWidth = true;
        Context context2 = z1Var.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        layoutParams2.setMarginStart(kli.a.k(context2, 4.0f));
        AppCompatTextView appCompatTextView = z1Var.f227502q;
        appCompatTextView.setLayoutParams(layoutParams);
        AppCompatTextView appCompatTextView2 = z1Var.f227503r;
        appCompatTextView2.setLayoutParams(layoutParams2);
        kli.a.d(appCompatTextView, clause, model, new y1(1, 0, ihm.f.class, z1Var.A, "onNext", "onNext(Ljava/lang/Object;)V"), 8);
        kli.a.d(appCompatTextView2, clause2, model, new z1(1, 0, ihm.f.class, z1Var.A, "onNext", "onNext(Ljava/lang/Object;)V"), 8);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.z1 z1Var = new op0.z1(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_goal_progress));
        p(z1Var, true);
        return z1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r3v37, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.z1 holder, Model data, int i, List list) {
        HorizontalSingleLineChartLegendView horizontalSingleLineChartLegendView;
        LinearGaugeChartView linearGaugeChartView;
        int i2;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        HorizontalSingleLineChartLegendView horizontalSingleLineChartLegendView2 = holder.v;
        AppCompatTextView appCompatTextView = holder.o;
        AppCompatTextView appCompatTextView2 = holder.f227500n;
        AppCompatTextView appCompatTextView3 = holder.f227499m;
        AppCompatTextView appCompatTextView4 = holder.f227498l;
        LinearGaugeChartView linearGaugeChartView2 = holder.u;
        LinearLayout linearLayout = holder.f227501p;
        AppCompatTextView appCompatTextView5 = holder.f227503r;
        FrameLayout frameLayout = holder.f227504s;
        AppCompatTextView appCompatTextView6 = holder.f227502q;
        SmallActionButton smallActionButton = holder.f227505t;
        r1 r1Var = data.d;
        int size = payloads.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            if (!(payloads.get(i3) instanceof op0.y1)) {
                payloads = null;
                break;
            }
            i3++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        boolean z41 = z31;
        int i5 = 0;
        while (i5 < size2) {
            op0.y1 y1Var = (op0.y1) payloads.get(i5);
            int i6 = i5;
            z = z || y1Var.f227482a;
            z3 = z3 || y1Var.f227483b;
            z4 = z4 || y1Var.f227484c;
            z41 = z41 || y1Var.d;
            z11 = z11 || y1Var.f227486h;
            z12 = z12 || y1Var.e;
            z29 = z29 || y1Var.f;
            z31 = z31 || y1Var.f227485g;
            z6 = z6 || y1Var.i;
            i5 = i6 + 1;
        }
        if (z) {
            kli.a.b(holder.k, data.f55145c, ty0.f.f275450a);
        }
        if (z41) {
            appCompatTextView4.setVisibility(8);
            appCompatTextView3.setVisibility(8);
            appCompatTextView2.setVisibility(8);
            appCompatTextView.setVisibility(8);
        }
        if (z3) {
            q1 q1Var = r1Var.f55488a;
            kli.a.b(appCompatTextView4, q1Var != null ? q1Var.f55478a : 0, ty0.f.f275450a);
            q1 q1Var2 = r1Var.f55488a;
            kli.a.b(appCompatTextView3, q1Var2 != null ? q1Var2.f55479b : null, ty0.f.f275450a);
        }
        if (z4) {
            p1 p1Var = r1Var.f55489b;
            kli.a.b(appCompatTextView2, p1Var != null ? p1Var.f55464a : null, ty0.f.f275450a);
            p1 p1Var2 = r1Var.f55489b;
            kli.a.b(appCompatTextView, p1Var2 != null ? p1Var2.f55465b : null, ty0.f.f275450a);
        }
        if (z6) {
            TagView tagView = holder.f227507x;
            if (tagView != null) {
                tagView.setVisibility(8);
            }
            CutoutImageView cutoutImageView = holder.f227506w;
            if (cutoutImageView != null) {
                cutoutImageView.setVisibility(8);
            }
            CircleBadgeView circleBadgeView = holder.f227508y;
            if (circleBadgeView != null) {
                circleBadgeView.setVisibility(8);
            }
            OverlappedIconsView overlappedIconsView = holder.z;
            if (overlappedIconsView != null) {
                overlappedIconsView.setVisibility(8);
            }
        }
        if (z11) {
            v1 v1Var = data.f55146g;
            int i21 = 6;
            if (v1Var instanceof s1) {
                s1 s1Var = (s1) v1Var;
                LayeredImage layeredImage = s1Var.f55502a;
                Context context = holder.itemView.getContext();
                CutoutImageView cutoutImageView2 = holder.f227506w;
                if (cutoutImageView2 == null) {
                    Intrinsics.h(context);
                    cutoutImageView2 = new CutoutImageView(context, null, i21, 0);
                    holder.f227506w = cutoutImageView2;
                    cutoutImageView2.setId(R$id.internal_goalProgressWidget_imageView);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kli.a.k(context, 40.0f), kli.a.k(context, 40.0f));
                    View view = holder.itemView;
                    Intrinsics.i(view, "null cannot be cast to non-null type android.view.ViewGroup");
                    holder.C = new ix0.l0((ViewGroup) view, zhm.u.c(cutoutImageView2));
                    frameLayout.addView(cutoutImageView2, layoutParams);
                }
                zi0.c.g(cutoutImageView2, layeredImage);
                CircleBadgeModel circleBadgeModel = s1Var.f55503b;
                CircleBadgeView circleBadgeView2 = holder.f227508y;
                CircleBadgeView circleBadgeView3 = circleBadgeView2;
                if (circleBadgeView2 == null) {
                    Context context2 = holder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    CircleBadgeView circleBadgeView4 = new CircleBadgeView(context2, null, 0, os0.a.SMALL, 6);
                    holder.f227508y = circleBadgeView4;
                    circleBadgeView4.setId(R$id.internal_goalProgressWidget_imageBadge);
                    ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
                    int i22 = R$id.goalProgressWidget_topRightContainer;
                    layoutParams2.bottomToBottom = i22;
                    layoutParams2.topToTop = i22;
                    layoutParams2.rightToRight = i22;
                    layoutParams2.leftToLeft = i22;
                    circleBadgeView4.setLayoutParams(layoutParams2);
                    holder.f227497j.addView(circleBadgeView4);
                    circleBadgeView3 = circleBadgeView4;
                }
                CutoutImageView cutoutImageView3 = holder.f227506w;
                if (cutoutImageView3 != null) {
                    ifk.b.a(cutoutImageView3, circleBadgeView3, false);
                }
                ix0.l0 l0Var = holder.C;
                if (l0Var != null) {
                    circleBadgeView3.setBadgeAndVisibility(circleBadgeModel, l0Var);
                }
            } else if (v1Var instanceof u1) {
                TagViewData tagViewData = ((u1) v1Var).f55520a;
                Context context3 = holder.itemView.getContext();
                TagView tagView2 = holder.f227507x;
                if (tagView2 == null) {
                    Intrinsics.h(context3);
                    i2 = 0;
                    tagView2 = new TagView(context3, null, i21, i2);
                    holder.f227507x = tagView2;
                    tagView2.setId(R$id.internal_goalProgressWidget_tagView);
                    frameLayout.addView(tagView2, new FrameLayout.LayoutParams(-2, -2));
                } else {
                    i2 = 0;
                }
                tagView2.setVisibility(i2);
                tagView2.setContent(tagViewData);
            } else if (v1Var instanceof t1) {
                List list2 = ((t1) v1Var).f55512a;
                Context context4 = holder.itemView.getContext();
                OverlappedIconsView overlappedIconsView2 = holder.z;
                if (overlappedIconsView2 == null) {
                    Intrinsics.h(context4);
                    overlappedIconsView2 = new OverlappedIconsView(context4, null, i21, 0);
                    holder.z = overlappedIconsView2;
                    overlappedIconsView2.setId(R$id.internal_goalProgressWidget_overlappedIconsView);
                    frameLayout.addView(overlappedIconsView2, new FrameLayout.LayoutParams(-2, -2));
                }
                OverlappedIconsView.setIcons$default(overlappedIconsView2, list2, bb.REGULAR12, null, 0, false, 20, null);
            } else if (v1Var != null) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (z12) {
            smallActionButton.setVisibility(8);
            linearLayout.setVisibility(8);
            appCompatTextView6.setVisibility(8);
            appCompatTextView5.setVisibility(8);
            linearGaugeChartView = linearGaugeChartView2;
            linearGaugeChartView.setVisibility(8);
            horizontalSingleLineChartLegendView = horizontalSingleLineChartLegendView2;
            horizontalSingleLineChartLegendView.setVisibility(8);
            ix0.c0 c0Var = ix0.c0.f169220a;
            kli.a.f(appCompatTextView6, c0Var);
            kli.a.f(appCompatTextView5, c0Var);
        } else {
            horizontalSingleLineChartLegendView = horizontalSingleLineChartLegendView2;
            linearGaugeChartView = linearGaugeChartView2;
        }
        if (z29) {
            m1 m1Var = data.e;
            if (m1Var instanceof e1) {
                smallActionButton.setVisibility(0);
                smallActionButton.setClickable(true);
                smallActionButton.setText(((e1) m1Var).f55337a);
            } else if (m1Var instanceof f1) {
                u(holder, data, ((f1) m1Var).f55353a, null);
            } else if (m1Var instanceof i1) {
                linearLayout.setVisibility(0);
                i1 i1Var = (i1) m1Var;
                t(holder, zhm.u.c(new l1(i1Var.f55376a)), i1Var.f55377b);
                u(holder, data, i1Var.f55378c, i1Var.d);
            } else if (m1Var instanceof k1) {
                linearLayout.setVisibility(0);
                k1 k1Var = (k1) m1Var;
                t(holder, k1Var.f55400a, k1Var.f55401b);
                u(holder, data, k1Var.f55402c, k1Var.d);
            } else if (m1Var instanceof g1) {
                g1 g1Var = (g1) m1Var;
                CompositeClause compositeClause = g1Var.f55357a;
                TextLocalisedClause textLocalisedClause = g1Var.f55358b;
                ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(0, -2);
                layoutParams3.bottomToTop = R$id.goalProgressWidget_progressSecondaryDescription;
                layoutParams3.startToStart = 0;
                layoutParams3.endToEnd = 0;
                ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(0, -2);
                layoutParams4.bottomToBottom = 0;
                layoutParams4.startToStart = 0;
                layoutParams4.endToEnd = 0;
                appCompatTextView6.setLayoutParams(layoutParams3);
                appCompatTextView5.setLayoutParams(layoutParams4);
                jb3.l.e(appCompatTextView6, R$attr.internal_textAppearanceEmphasis2);
                jb3.l.e(appCompatTextView5, R$attr.internal_textAppearanceEmphasis2);
                kli.a.d(appCompatTextView6, compositeClause, data, new w1(1, 0, ihm.f.class, holder.A, "onNext", "onNext(Ljava/lang/Object;)V"), 8);
                kli.a.d(appCompatTextView5, textLocalisedClause, data, new x1(1, 0, ihm.f.class, holder.A, "onNext", "onNext(Ljava/lang/Object;)V"), 8);
            } else {
                if (!(m1Var instanceof h1)) {
                    throw new NoWhenBranchMatchedException();
                }
                List list3 = ((h1) m1Var).f55367a;
                List list4 = list3;
                linearGaugeChartView.setVisibility(!list4.isEmpty() ? 0 : 8);
                horizontalSingleLineChartLegendView.setVisibility(list4.isEmpty() ? 8 : 0);
                ArrayList arrayList = new ArrayList(list3.size());
                int size3 = list3.size();
                for (int i32 = 0; i32 < size3; i32++) {
                    j1 j1Var = (j1) list3.get(i32);
                    float f = j1Var.f55391b;
                    Context context5 = holder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                    arrayList.add(new ms0.s1(f, kli.a.s(j1Var.f55392c, context5), (TextLocalisedClause) null, 12));
                }
                linearGaugeChartView.setModel(new com.revolut.core.ui_kit.internal.views.e(arrayList, false ? 1 : 0, 30));
                ArrayList arrayList2 = new ArrayList(list3.size());
                int size4 = list3.size();
                for (int i33 = 0; i33 < size4; i33++) {
                    j1 j1Var2 = (j1) list3.get(i33);
                    int i43 = j1Var2.f55392c;
                    arrayList2.add(new c6(i43, j1Var2.f55390a, Integer.valueOf(i43)));
                }
                horizontalSingleLineChartLegendView.setModel(new b6(arrayList2));
            }
        }
        smallActionButton.setAnalyticsContext(data.i);
        smallActionButton.setOnClickListener(new kp0.l(this, data, 12));
        holder.B = new ood.k(this, data, 8);
        holder.F(data.f55147h);
        if (z31) {
            p(holder, data.f);
        }
    }
}
