package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import aw0.a6;
import aw0.w5;
import aw0.x5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.ResizableTileHeaderView;
import com.revolut.core.ui_kit.internal.views.barchart.HorizontalBarView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.tracking.TrackableAction;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/HorizontalBarsTileWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/HorizontalBarsTileWidgetDelegate$Model;", "Lop0/h2;", "<init>", "()V", "Model", "op0/g2", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HorizontalBarsTileWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.h2> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/HorizontalBarsTileWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/widgets/h2", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MoneyClause f55155c;
        public final TextLocalisedClause d;
        public final Clause e;
        public final List f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f55156g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TrackableAction.Custom f55157h;
        public Parcelable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object f55158j;
        public op0.r k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final uw0.i f55159l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final py0.c f55160m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final op0.q f55161n;

        public Model(String listId, MoneyClause title, TextLocalisedClause topLabel, CompositeClause compositeClause, List bars, long j2, TrackableAction.Custom trackableAction, Object obj2) {
            op0.r widgetState = op0.r.SEEN;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(topLabel, "topLabel");
            Intrinsics.checkNotNullParameter(bars, "bars");
            Intrinsics.checkNotNullParameter(trackableAction, "trackableAction");
            Intrinsics.checkNotNullParameter(widgetState, "widgetState");
            this.f55154b = listId;
            this.f55155c = title;
            this.d = topLabel;
            this.e = compositeClause;
            this.f = bars;
            this.f55156g = j2;
            this.f55157h = trackableAction;
            this.i = null;
            this.f55158j = obj2;
            this.k = widgetState;
            this.f55159l = new uw0.i(listId, uw0.g.UNTIL_ANY_FINISHED, true);
            TextLocalisedClause f58284a = trackableAction.getF58284a();
            this.f55160m = new py0.c(f58284a != null ? f58284a : title);
            this.f55161n = op0.q.SMALL;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF55275n() {
            return this.k;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.k = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF() {
            return this.f55158j;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51656a() {
            return this.f55154b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF54970q() {
            return this.f55160m;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55154b, model.f55154b) && Intrinsics.f(this.f55155c, model.f55155c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f55156g == model.f55156g && Intrinsics.f(this.f55157h, model.f55157h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f55158j, model.f55158j) && this.k == model.k;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.i;
        }

        public final int hashCode() {
            int iA = t61.a.a(v7.a(this.f55154b.hashCode() * 31, 31, this.f55155c), 31, this.d);
            Clause clause = this.e;
            int iA2 = t61.a.a(a0.d.c(p.a.d((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f), 31, this.f55156g), 31, this.f55157h.f58284a);
            Parcelable parcelable = this.i;
            int iHashCode = (iA2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            Object obj2 = this.f55158j;
            return this.k.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getK() {
            return this.f55161n;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.i = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                return new op0.g2(!Intrinsics.f(this.f55155c, model.f55155c), !Intrinsics.f(this.e, model.e), !Intrinsics.f(this.d, model.d), !Intrinsics.f(this.f, model.f), this.f55161n != model.f55161n, this.f55156g != model.f55156g, !Intrinsics.f(this.f55159l, model.f55159l), !Intrinsics.f(this.f55157h, model.f55157h));
            }
            return null;
        }
    }

    public HorizontalBarsTileWidgetDelegate() {
        super(R$layout.internal_delegate_widget_horizontal_bars_tile, new op0.v0(15));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.h2 h2Var = new op0.h2(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_horizontal_bars_tile));
        p(h2Var, true);
        return h2Var;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.h2 holder, Model data, int i, List list) {
        a6 a6Var;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        HorizontalBarView horizontalBarView = holder.k;
        ResizableTileHeaderView resizableTileHeaderView = holder.f227288j;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof op0.g2)) {
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
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        for (int i3 = 0; i3 < size2; i3++) {
            op0.g2 g2Var = (op0.g2) payloads.get(i3);
            z = z || g2Var.f227266a;
            z3 = z3 || g2Var.f227268c;
            z4 = z4 || g2Var.f227267b;
            z6 = z6 || g2Var.e;
            z11 = z11 || g2Var.d;
            z12 = z12 || g2Var.f;
            zIsEmpty = zIsEmpty || g2Var.f227269g;
        }
        if (zIsEmpty) {
            horizontalBarView.setDataChangeAnimationRequest(data.f55159l);
        }
        if (z) {
            resizableTileHeaderView.setTitle(data.f55155c);
        }
        if (z3) {
            resizableTileHeaderView.setTopLabel(data.d);
        }
        if (z4) {
            resizableTileHeaderView.setBottomSubtitle(data.e);
        }
        if (z6) {
            holder.F(data.f55161n);
        }
        if (z11 || z12) {
            int i5 = (int) data.f55156g;
            List<h2> list2 = data.f;
            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
            for (h2 h2Var : list2) {
                float f = i5 > 0 ? h2Var.f55368a / i5 : BitmapDescriptorFactory.HUE_RED;
                g2 g2Var2 = h2Var.f55369b;
                g2Var2.getClass();
                int i6 = f2.f55354a[g2Var2.ordinal()];
                if (i6 == 1) {
                    a6Var = x5.f10605a;
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a6Var = w5.f10586a;
                }
                arrayList.add(new ps0.m(null, null, R$attr.uikit_colorGrey50, f, a6Var));
            }
            horizontalBarView.setBars(new ps0.n(arrayList, i5, 32));
        }
    }
}
