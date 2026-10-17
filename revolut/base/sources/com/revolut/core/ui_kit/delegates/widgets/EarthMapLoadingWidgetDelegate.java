package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/EarthMapLoadingWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/EarthMapLoadingWidgetDelegate$Model;", "Lop0/h1;", "<init>", "()V", "Model", "op0/g1", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EarthMapLoadingWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.h1> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/EarthMapLoadingWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Ltw0/y;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements tw0.y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f55092c;
        public Parcelable d;
        public op0.r e;
        public final op0.q f;

        public Model() {
            op0.r widgetState = op0.r.SEEN;
            Intrinsics.checkNotNullParameter("TRIPS_GLOBE_WIDGET_ID_", "listId");
            Intrinsics.checkNotNullParameter(widgetState, "widgetState");
            this.f55091b = "TRIPS_GLOBE_WIDGET_ID_";
            this.f55092c = true;
            this.d = null;
            this.e = widgetState;
            this.f = op0.q.DYNAMIC;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getE() {
            return this.e;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.e = rVar;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55091b() {
            return this.f55091b;
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
            return Intrinsics.f(this.f55091b, model.f55091b) && this.f55092c == model.f55092c && Intrinsics.f(this.d, model.d) && this.e == model.e;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.d;
        }

        public final int hashCode() {
            int iC = j6.a.c(this.f55091b.hashCode() * 31, 31, this.f55092c);
            Parcelable parcelable = this.d;
            return this.e.hashCode() + ((iC + (parcelable == null ? 0 : parcelable.hashCode())) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.d = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                return new op0.g1(this.f55092c != model.f55092c);
            }
            return null;
        }
    }

    public EarthMapLoadingWidgetDelegate() {
        super(R$layout.internal_delegate_widget_loading_earth_map, new op0.v0(3));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.h1 h1Var = new op0.h1(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_loading_earth_map));
        p(h1Var, false);
        return h1Var;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.h1 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof op0.g1)) {
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
        for (int i3 = 0; i3 < size2; i3++) {
            zIsEmpty = zIsEmpty || ((op0.g1) payloads.get(i3)).f227265a;
        }
        if (zIsEmpty) {
            holder.k.setVisibility(data.f55092c ? 0 : 8);
        }
        io3.h.s(holder.f227287j);
    }
}
