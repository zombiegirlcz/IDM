package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.LoadingChartTileDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContainerWidgetDelegate;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.vv;
import ip0.xv;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/LineChartLoadingTileWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/ContainerWidgetDelegate;", "Lip0/vv;", "Lip0/xv;", "Lcom/revolut/core/ui_kit/delegates/LoadingChartTileDelegate;", "<init>", "()V", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LineChartLoadingTileWidgetDelegate extends ContainerWidgetDelegate<vv, xv, LoadingChartTileDelegate> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/LineChartLoadingTileWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/ContainerWidgetDelegate$Model;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends ContainerWidgetDelegate.Model {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final vv f55186c;
        public final op0.q d;
        public Parcelable e;
        public op0.r f;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.LineChartLoadingTileWidgetDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static Model a(Companion companion, String listId) {
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                return new Model(listId, new vv(a0.d.r(listId, "_inner_medium_loading_chart_id")), op0.q.MEDIUM);
            }

            public static Model b(Companion companion, String listId) {
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                return new Model(listId, new vv(a0.d.r(listId, "_inner_small_loading_chart_id")), op0.q.SMALL);
            }
        }

        public Model(String str, vv vvVar, op0.q qVar) {
            op0.r rVar = op0.r.SEEN;
            this.f55185b = str;
            this.f55186c = vvVar;
            this.d = qVar;
            this.e = null;
            this.f = rVar;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getD() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f = rVar;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.ContainerWidgetDelegate.Model
        public final koi.j E() {
            return this.f55186c;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55277b() {
            return this.f55185b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF54970q() {
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
            return Intrinsics.f(this.f55185b, model.f55185b) && Intrinsics.f(this.f55186c, model.f55186c) && this.d == model.d && Intrinsics.f(this.e, model.e) && this.f == model.f;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF55278c() {
            return this.e;
        }

        public final int hashCode() {
            int iB = okl.m.b(this.d, (this.f55186c.hashCode() + (this.f55185b.hashCode() * 31)) * 31, 31);
            Parcelable parcelable = this.e;
            return this.f.hashCode() + ((iB + (parcelable == null ? 0 : parcelable.hashCode())) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getE() {
            return this.d;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.e = parcelable;
        }
    }

    public LineChartLoadingTileWidgetDelegate() {
        int i = R$id.internal_line_chart_loading_tile_widget_view_type;
        op0.v0 rule = new op0.v0(20);
        Intrinsics.checkNotNullParameter(rule, "rule");
        super(i, rule);
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.ContainerWidgetDelegate
    public final BaseRecyclerViewDelegate s() {
        return new LoadingChartTileDelegate();
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.ContainerWidgetDelegate
    public final efm.r t(BaseRecyclerViewDelegate baseRecyclerViewDelegate, o10.c widgetModelProvider) {
        LoadingChartTileDelegate innerDelegate = (LoadingChartTileDelegate) baseRecyclerViewDelegate;
        Intrinsics.checkNotNullParameter(innerDelegate, "innerDelegate");
        Intrinsics.checkNotNullParameter(widgetModelProvider, "widgetModelProvider");
        efm.r rVarNever = efm.r.never();
        Intrinsics.checkNotNullExpressionValue(rVarNever, "never(...)");
        return rVarNever;
    }
}
