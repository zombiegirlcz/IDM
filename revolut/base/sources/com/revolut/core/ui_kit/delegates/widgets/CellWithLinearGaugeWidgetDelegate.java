package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.CellWithLinearGaugeDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContainerWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.tracking.TrackableAction;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.y8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/CellWithLinearGaugeWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/ContainerWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/CellWithLinearGaugeDelegate$Model;", "Lip0/y8;", "Lcom/revolut/core/ui_kit/delegates/CellWithLinearGaugeDelegate;", "<init>", "()V", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellWithLinearGaugeWidgetDelegate extends ContainerWidgetDelegate<CellWithLinearGaugeDelegate.Model, y8, CellWithLinearGaugeDelegate> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/CellWithLinearGaugeWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/ContainerWidgetDelegate$Model;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends ContainerWidgetDelegate.Model {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CellWithLinearGaugeDelegate.Model f55015c;
        public final op0.q d;
        public final TrackableAction e;
        public Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public op0.r f55016g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final py0.c f55017h;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.CellWithLinearGaugeWidgetDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public Model(String str, CellWithLinearGaugeDelegate.Model model, op0.q qVar, TrackableAction trackableAction) {
            op0.r rVar = op0.r.SEEN;
            this.f55014b = str;
            this.f55015c = model;
            this.d = qVar;
            this.e = trackableAction;
            this.f = null;
            this.f55016g = rVar;
            TextLocalisedClause f58284a = trackableAction.getF58284a();
            this.f55017h = f58284a != null ? new py0.c(f58284a) : null;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getK() {
            return this.f55016g;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f55016g = rVar;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.ContainerWidgetDelegate.Model
        public final koi.j E() {
            return this.f55015c;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55154b() {
            return this.f55014b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF54970q() {
            return this.f55017h;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55014b, model.f55014b) && Intrinsics.f(this.f55015c, model.f55015c) && this.d == model.d && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f55016g == model.f55016g;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getI() {
            return this.f;
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + okl.m.b(this.d, (this.f55015c.hashCode() + (this.f55014b.hashCode() * 31)) * 31, 31)) * 31;
            Parcelable parcelable = this.f;
            return this.f55016g.hashCode() + ((iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF55161n() {
            return this.d;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }
    }

    public CellWithLinearGaugeWidgetDelegate() {
        int i = R$id.internal_cell_with_linear_gauge_widget_view_type;
        ood.g0 rule = new ood.g0(23);
        Intrinsics.checkNotNullParameter(rule, "rule");
        super(i, rule);
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.ContainerWidgetDelegate
    public final BaseRecyclerViewDelegate s() {
        return new CellWithLinearGaugeDelegate();
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.ContainerWidgetDelegate
    public final efm.r t(BaseRecyclerViewDelegate baseRecyclerViewDelegate, o10.c widgetModelProvider) {
        CellWithLinearGaugeDelegate innerDelegate = (CellWithLinearGaugeDelegate) baseRecyclerViewDelegate;
        Intrinsics.checkNotNullParameter(innerDelegate, "innerDelegate");
        Intrinsics.checkNotNullParameter(widgetModelProvider, "widgetModelProvider");
        efm.r rVarEmpty = efm.r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }
}
