package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate;
import com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/FullScreenStateWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDynamicWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/FullScreenStateWidgetDelegate$Model;", "Lop0/p1;", "<init>", "()V", "a", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FullScreenStateWidgetDelegate extends BaseDynamicWidgetDelegate<Model, op0.p1> {
    public static final /* synthetic */ int i = 0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/FullScreenStateWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDynamicWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDynamicWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public final String e;
        public final List f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final op0.q f55123g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f55124h;
        public final py0.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public op0.r f55125j;
        public final Object k;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.FullScreenStateWidgetDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static Model a(Companion companion, String listId, BaseDynamicWidgetDelegate.BigHeaderModel header, FullScreenStateDelegate.Model fullScreenStateItem, int i) {
                FreelancerWidgetClickData.TaxHub.C0496TaxHub c0496TaxHub = (i & 16) != 0 ? null : FreelancerWidgetClickData.TaxHub.C0496TaxHub.f74461a;
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(header, "header");
                Intrinsics.checkNotNullParameter(fullScreenStateItem, "fullScreenStateItem");
                return new Model(listId, zhm.v.k(header, fullScreenStateItem), op0.q.DYNAMIC, new py0.c(header.f54992b), c0496TaxHub);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Model(String str, List list, op0.q qVar, py0.c cVar, Object obj2) {
            super(str, list, qVar, null, false);
            op0.r rVar = op0.r.SEEN;
            this.e = str;
            this.f = list;
            this.f55123g = qVar;
            this.f55124h = null;
            this.i = cVar;
            this.f55125j = rVar;
            this.k = obj2;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF55211h() {
            return this.f55125j;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f55125j = rVar;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate.Model
        /* JADX INFO: renamed from: E, reason: from getter */
        public final List getF() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate.Model
        /* JADX INFO: renamed from: F */
        public final boolean getF55198g() {
            return false;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF51981p() {
            return this.k;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF51972a() {
            return this.e;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF55210g() {
            return this.i;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f55123g == model.f55123g && Intrinsics.f(this.f55124h, model.f55124h) && Intrinsics.f(this.i, model.i) && this.f55125j == model.f55125j && Intrinsics.f(this.k, model.k);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF51982q() {
            return this.f55124h;
        }

        public final int hashCode() {
            int iB = okl.m.b(this.f55123g, j6.a.c(p.a.d(this.e.hashCode() * 31, 31, this.f), 31, false), 31);
            Parcelable parcelable = this.f55124h;
            int iHashCode = (iB + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            py0.c cVar = this.i;
            int iC = okl.m.c(this.f55125j, (iHashCode + (cVar == null ? 0 : cVar.f240642a.hashCode())) * 31, 31);
            Object obj2 = this.k;
            return iC + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate.Model, gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getD() {
            return this.f55123g;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f55124h = parcelable;
        }
    }

    public static abstract class a extends BaseDraggableWidgetDelegate.a {
        private a() {
        }
    }

    public FullScreenStateWidgetDelegate() {
        super(R$id.internal_full_screen_state_widget_delegate, new op0.v0(9));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.p1 p1Var = new op0.p1(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_dynamic));
        p(p1Var, true);
        return p1Var;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate
    public final boolean s(koi.j listItem) {
        Intrinsics.checkNotNullParameter(listItem, "listItem");
        return listItem instanceof FullScreenStateDelegate.Model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void p(op0.p1 holder, Model data, int i2, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        t(holder, data, i2, payloads);
        holder.f227376t = new ood.k(this, data, 7);
    }
}
