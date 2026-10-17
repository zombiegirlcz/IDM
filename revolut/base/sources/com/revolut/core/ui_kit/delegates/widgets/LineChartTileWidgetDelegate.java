package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.LineChartResizableTileDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContainerWidgetDelegate;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.jt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/LineChartTileWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/ContainerWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/LineChartResizableTileDelegate$Model;", "Lip0/jt;", "Lcom/revolut/core/ui_kit/delegates/LineChartResizableTileDelegate;", "<init>", "()V", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LineChartTileWidgetDelegate extends ContainerWidgetDelegate<LineChartResizableTileDelegate.Model, jt, LineChartResizableTileDelegate> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/LineChartTileWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/ContainerWidgetDelegate$Model;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends ContainerWidgetDelegate.Model {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LineChartResizableTileDelegate.Model f55188c;
        public final op0.q d;
        public Parcelable e;
        public op0.r f;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.LineChartTileWidgetDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static Model a(Companion companion, String listId, LineChartResizableTileDelegate.Model item) {
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(item, "item");
                return new Model(listId, LineChartResizableTileDelegate.Model.e(item, null, 2097151), op0.q.MEDIUM);
            }

            public static Model b(Companion companion, String listId, LineChartResizableTileDelegate.Model item) {
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(item, "item");
                return new Model(listId, LineChartResizableTileDelegate.Model.e(item, null, 2097151), op0.q.SMALL);
            }
        }

        public Model(String str, LineChartResizableTileDelegate.Model model, op0.q qVar) {
            op0.r rVar = op0.r.SEEN;
            this.f55187b = str;
            this.f55188c = model;
            this.d = qVar;
            this.e = null;
            this.f = rVar;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF54948g() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f = rVar;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.ContainerWidgetDelegate.Model
        public final koi.j E() {
            return this.f55188c;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF54213a() {
            return this.f55187b;
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
            return Intrinsics.f(this.f55187b, model.f55187b) && Intrinsics.f(this.f55188c, model.f55188c) && this.d == model.d && Intrinsics.f(this.e, model.e) && this.f == model.f;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.e;
        }

        public final int hashCode() {
            int iB = okl.m.b(this.d, (this.f55188c.hashCode() + (this.f55187b.hashCode() * 31)) * 31, 31);
            Parcelable parcelable = this.e;
            return this.f.hashCode() + ((iB + (parcelable == null ? 0 : parcelable.hashCode())) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF54947c() {
            return this.d;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.e = parcelable;
        }
    }

    public LineChartTileWidgetDelegate() {
        int i = R$id.internal_line_chart_tile_widget_view_type;
        op0.v0 rule = new op0.v0(21);
        Intrinsics.checkNotNullParameter(rule, "rule");
        super(i, rule);
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.ContainerWidgetDelegate
    public final BaseRecyclerViewDelegate s() {
        return new LineChartResizableTileDelegate();
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.ContainerWidgetDelegate
    public final efm.r t(BaseRecyclerViewDelegate baseRecyclerViewDelegate, o10.c widgetModelProvider) {
        LineChartResizableTileDelegate innerDelegate = (LineChartResizableTileDelegate) baseRecyclerViewDelegate;
        Intrinsics.checkNotNullParameter(innerDelegate, "innerDelegate");
        Intrinsics.checkNotNullParameter(widgetModelProvider, "widgetModelProvider");
        efm.r rVarEmpty = efm.r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }
}
