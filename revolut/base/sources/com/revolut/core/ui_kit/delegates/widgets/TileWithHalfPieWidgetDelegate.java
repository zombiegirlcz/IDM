package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.ResizableTileHeaderView;
import com.revolut.core.ui_kit.internal.views.gaugechart.SegmentedGaugeChartView;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/TileWithHalfPieWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/TileWithHalfPieWidgetDelegate$Model;", "Lop0/v4;", "<init>", "()V", "Model", "op0/u4", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TileWithHalfPieWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.v4> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/TileWithHalfPieWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p {

        @NotNull
        private static final a Companion = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextLocalisedClause f55255c;
        public final MoneyClause d;
        public final List e;
        public Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f55256g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public op0.r f55257h;
        public final op0.q i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final py0.c f55258j;
        public final com.revolut.core.ui_kit.models.f k;

        public static final class a {
            private a() {
            }
        }

        public Model(String listId, TextLocalisedClause topLabel, MoneyClause title, List segments, Object obj2) {
            op0.r widgetState = op0.r.SEEN;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(topLabel, "topLabel");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(segments, "segments");
            Intrinsics.checkNotNullParameter(widgetState, "widgetState");
            this.f55254b = listId;
            this.f55255c = topLabel;
            this.d = title;
            this.e = segments;
            this.f = null;
            this.f55256g = obj2;
            this.f55257h = widgetState;
            this.i = op0.q.SMALL;
            this.f55258j = new py0.c(topLabel);
            this.k = com.revolut.core.ui_kit.models.j0.a(zhm.d0.d1(segments), null, null, true, aw0.n4.NO_SORT, aw0.o4.HALF_CIRCLE, 196);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF55013j() {
            return this.f55257h;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f55257h = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55012h() {
            return this.f55256g;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55009b() {
            return this.f55254b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF54970q() {
            return this.f55258j;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55254b, model.f55254b) && Intrinsics.f(this.f55255c, model.f55255c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f55256g, model.f55256g) && this.f55257h == model.f55257h;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.f;
        }

        public final int hashCode() {
            int iD = p.a.d(v7.a(t61.a.a(this.f55254b.hashCode() * 31, 31, this.f55255c), 961, this.d), 31, this.e);
            Parcelable parcelable = this.f;
            int iHashCode = (iD + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            Object obj2 = this.f55256g;
            return this.f55257h.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF55011g() {
            return this.i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) != null) {
                return new op0.u4(!Intrinsics.f(this.f55255c, r5.f55255c), !Intrinsics.f(this.d, r5.d), false, !Intrinsics.f(this.e, r5.e));
            }
            return null;
        }
    }

    public TileWithHalfPieWidgetDelegate() {
        super(R$layout.internal_delegate_widget_tile_with_half_pie, new op0.v3(13));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.v4 v4Var = new op0.v4(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_tile_with_half_pie));
        v4Var.f227459j.setTopLabelMaxLines(1);
        pt0.m mVar = pt0.m.f239578a;
        SegmentedGaugeChartView segmentedGaugeChartView = v4Var.k;
        segmentedGaugeChartView.setChartSize(mVar);
        segmentedGaugeChartView.setGesturesEnabled(false);
        v4Var.F(op0.q.SMALL);
        p(v4Var, true);
        return v4Var;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.v4 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ResizableTileHeaderView resizableTileHeaderView = holder.f227459j;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof op0.u4)) {
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
            op0.u4 u4Var = (op0.u4) payloads.get(i3);
            zIsEmpty = zIsEmpty || u4Var.f227447a;
            z = z || u4Var.f227448b;
            z3 = z3 || u4Var.f227449c;
            z4 = z4 || u4Var.d;
        }
        if (zIsEmpty) {
            resizableTileHeaderView.setTopLabel(data.f55255c);
        }
        if (z) {
            resizableTileHeaderView.setTitle(data.d);
        }
        if (z3) {
            resizableTileHeaderView.setBottomSubtitle(null);
        }
        if (z4) {
            holder.k.setData(data.k);
        }
    }
}
