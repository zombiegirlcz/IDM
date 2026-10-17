package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import aw0.b5;
import aw0.c5;
import aw0.e5;
import aw0.f5;
import aw0.h5;
import aw0.k7;
import aw0.l5;
import aw0.m5;
import aw0.o5;
import aw0.o9;
import aw0.p5;
import aw0.q5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.ResizableTileHeaderView;
import com.revolut.core.ui_kit.internal.views.chart.HistogramView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0007\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/ComparisonBarsTileWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/ComparisonBarsTileWidgetDelegate$Model;", "Lop0/u0;", "<init>", "()V", "Companion", "Model", "op0/t0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ComparisonBarsTileWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.u0> {

    @NotNull
    private static final a Companion = new a();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/ComparisonBarsTileWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextLocalisedClause f55056c;
        public final Object d;
        public final dj0.d e;
        public final dj0.d f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f55057g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f55058h;
        public op0.r i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final op0.q f55059j;
        public final py0.c k;

        public Model(String listId, TextLocalisedClause topLabel, Clause title, dj0.d positiveValue, dj0.d negativeValue, Object obj2) {
            op0.r widgetState = op0.r.SEEN;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(topLabel, "topLabel");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(positiveValue, "positiveValue");
            Intrinsics.checkNotNullParameter(negativeValue, "negativeValue");
            Intrinsics.checkNotNullParameter(widgetState, "widgetState");
            this.f55055b = listId;
            this.f55056c = topLabel;
            this.d = title;
            this.e = positiveValue;
            this.f = negativeValue;
            this.f55057g = obj2;
            this.f55058h = null;
            this.i = widgetState;
            this.f55059j = op0.q.SMALL;
            this.k = new py0.c(topLabel);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF55275n() {
            return this.i;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.i = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF() {
            return this.f55057g;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51656a() {
            return this.f55055b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF54970q() {
            return this.k;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55055b, model.f55055b) && Intrinsics.f(this.f55056c, model.f55056c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f55057g, model.f55057g) && Intrinsics.f(this.f55058h, model.f55058h) && this.i == model.i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.f55058h;
        }

        public final int hashCode() {
            int iC = v7.c(v7.c(p.a.b(t61.a.a(this.f55055b.hashCode() * 31, 31, this.f55056c), 31, this.d), 31, this.e), 31, this.f);
            Object obj2 = this.f55057g;
            int iHashCode = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f55058h;
            return this.i.hashCode() + ((iHashCode + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getK() {
            return this.f55059j;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f55058h = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) != null) {
                return new op0.t0(!Intrinsics.f(this.f55056c, r6.f55056c), !Intrinsics.f(this.d, r6.d), !Intrinsics.f(this.e, r6.e), !Intrinsics.f(this.f, r6.f));
            }
            return null;
        }
    }

    public static final class a {
        private a() {
        }
    }

    public ComparisonBarsTileWidgetDelegate() {
        super(R$layout.internal_delegate_widget_comparison_bars_tile, new ood.g0(29));
    }

    public static CompositeClause s(int i, int i2, dj0.d dVar) {
        Integer numValueOf = Integer.valueOf(i2);
        Float fValueOf = Float.valueOf(10.0f);
        List listK = zhm.v.k(new ImageClause(i, numValueOf, fValueOf, fValueOf, 16), new MoneyClause(dVar.a(), new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, null, 12));
        m70.a.t(kotlin.jvm.internal.t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static e5 t(String str, dj0.d dVar, aw0.b1 b1Var) {
        MoneyClause contentDescription = new MoneyClause(dVar.a(), new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, null, 12);
        long j2 = dVar.f115082a;
        long jAbs = j2 == Long.MIN_VALUE ? Long.MAX_VALUE : Math.abs(j2);
        h5.Companion.getClass();
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        h5 h5Var = new h5(null, contentDescription);
        b5 b5Var = c5.Companion;
        List fractions = zhm.u.c(new f5(jAbs, b1Var));
        b5Var.getClass();
        Intrinsics.checkNotNullParameter(fractions, "fractions");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        return new e5(str, h5Var, zhm.u.c(new c5(contentDescription, fractions)), true, null, 104);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.u0 u0Var = new op0.u0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_comparison_bars_tile));
        ResizableTileHeaderView resizableTileHeaderView = u0Var.f227438j;
        resizableTileHeaderView.setTopLabelMaxLines(1);
        resizableTileHeaderView.setRightSubtitle(null);
        resizableTileHeaderView.setBottomSubtitle(null);
        resizableTileHeaderView.setRightImage(null);
        HistogramView histogramView = u0Var.f227440m;
        histogramView.setRoundedCorners(false);
        histogramView.setGesturesEnabled(false);
        histogramView.setBackgroundEnabled(false);
        histogramView.setYAxis(null);
        histogramView.setTooltip(null);
        histogramView.d(new q5(12.0f, BitmapDescriptorFactory.HUE_RED, (l5) null, (o5) null, m5.FIXED, aw0.k0.GRADIENT, (p5) null, ISO781611.SMT_DO_DS));
        u0Var.F(op0.q.SMALL);
        p(u0Var, true);
        return u0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void p(op0.u0 holder, Model data, int i, List list) {
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        ResizableTileHeaderView resizableTileHeaderView = holder.f227438j;
        dj0.d dVar = data.f;
        dj0.d dVar2 = data.e;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof op0.t0)) {
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
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        for (int i3 = 0; i3 < size2; i3++) {
            op0.t0 t0Var = (op0.t0) payloads.get(i3);
            zIsEmpty = zIsEmpty || t0Var.f227419a;
            z = z || t0Var.f227420b;
            z3 = z3 || t0Var.f227421c;
            z4 = z4 || t0Var.d;
        }
        if (zIsEmpty) {
            resizableTileHeaderView.setTopLabel(data.f55056c);
        }
        if (z) {
            resizableTileHeaderView.setTitle(data.d);
        }
        if (z3) {
            kli.a.d(holder.k, s(R$drawable.uikit_icn_16_plus_circle, R$attr.uikit_colorPerformancePositive, dVar2), data, null, 12);
        }
        if (z4) {
            kli.a.d(holder.f227439l, s(R$drawable.uikit_icn_16_minus_circle, R$attr.uikit_colorPerformanceNegative, dVar), data, null, 12);
        }
        if (z3 || z4) {
            holder.f227440m.setItems(zhm.v.k(t("positive", dVar2, aw0.z0.f10637a), t("negative", dVar, aw0.y0.f10614a)));
        }
    }
}
