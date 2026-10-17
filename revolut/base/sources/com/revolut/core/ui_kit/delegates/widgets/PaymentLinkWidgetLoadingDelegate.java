package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/PaymentLinkWidgetLoadingDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/PaymentLinkWidgetLoadingDelegate$Model;", "Lop0/i3;", "<init>", "()V", "Model", "op0/h3", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentLinkWidgetLoadingDelegate extends BaseDraggableWidgetDelegate<Model, op0.i3> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/PaymentLinkWidgetLoadingDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Ltw0/y;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements tw0.y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextLocalisedClause f55207c;
        public Parcelable d;
        public op0.r e;
        public final op0.q f;

        public Model(TextLocalisedClause title, String listId) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f55206b = listId;
            this.f55207c = title;
            this.d = null;
            this.e = op0.r.SEEN;
            this.f = op0.q.MEDIUM;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF55257h() {
            return this.e;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.e = rVar;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55254b() {
            return this.f55206b;
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
            return Intrinsics.f(this.f55206b, model.f55206b) && Intrinsics.f(this.f55207c, model.f55207c) && Intrinsics.f(this.d, model.d);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.d;
        }

        public final int hashCode() {
            int iA = t61.a.a(this.f55206b.hashCode() * 31, 31, this.f55207c);
            Parcelable parcelable = this.d;
            return iA + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getI() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.d = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new op0.h3(!Intrinsics.f(r5.f55207c, this.f55207c), ((Model) oldItem).f != this.f);
        }
    }

    public PaymentLinkWidgetLoadingDelegate() {
        super(R$layout.internal_delegate_widget_payment_link_loading, new op0.v0(26));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.i3 i3Var = new op0.i3(kotlin.jvm.internal.s.r(parent, this.f54986c));
        p(i3Var, false);
        return i3Var;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.i3 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        for (Object obj2 : payloads) {
            if (obj2 instanceof op0.h3) {
                boolean z = true;
                zN = zN || ((op0.h3) obj2).f227289a;
                if (!zN2 && !((op0.h3) obj2).f227290b) {
                    z = false;
                }
                zN2 = z;
            }
        }
        if (zN) {
            TextView textView = holder.k;
            Intrinsics.checkNotNullExpressionValue(textView, "<get-titleView>(...)");
            kli.a.b(textView, data.f55207c, ty0.f.f275450a);
        }
        if (zN2) {
            holder.F(data.f);
        }
        holder.f227306j.l0();
    }
}
