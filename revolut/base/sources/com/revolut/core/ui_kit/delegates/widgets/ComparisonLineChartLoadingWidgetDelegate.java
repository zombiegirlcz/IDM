package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/ComparisonLineChartLoadingWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/ComparisonLineChartLoadingWidgetDelegate$Model;", "Lop0/x0;", "<init>", "()V", "Model", "op0/w0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ComparisonLineChartLoadingWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.x0> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/ComparisonLineChartLoadingWidgetDelegate$Model;", "Lqv0/q;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "Ltw0/y;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.q, qv0.p, tw0.y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final op0.q f55061c;
        public Parcelable d;
        public final zod.l e;
        public op0.r f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public qv0.c f55062g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p31.c f55063h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f55064j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f55065l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f55066m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f55067n;
        public final int o;

        public Model(String listId, zod.l lVar) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            op0.q qVar = op0.q.MEDIUM;
            op0.r rVar = op0.r.SEEN;
            c.e eVar = new c.e((qv0.h) null, 3);
            int i = R$attr.uikit_dp0;
            this.f55060b = listId;
            this.f55061c = qVar;
            this.d = null;
            this.e = lVar;
            this.f = rVar;
            this.f55062g = eVar;
            this.f55063h = null;
            this.i = null;
            this.f55064j = null;
            this.k = null;
            this.f55065l = i;
            this.f55066m = i;
            this.f55067n = i;
            this.o = i;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF52328h() {
            return this.e;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52324a() {
            return this.f55060b;
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
            return Intrinsics.f(this.f55060b, model.f55060b) && this.f55061c == model.f55061c && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f55062g, model.f55062g) && Intrinsics.f(this.f55063h, model.f55063h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f55064j, model.f55064j) && Intrinsics.f(this.k, model.k) && this.f55065l == model.f55065l && this.f55066m == model.f55066m && this.f55067n == model.f55067n && this.o == model.o;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getO() {
            return this.f55065l;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f55065l = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.d;
        }

        public final int hashCode() {
            int iB = okl.m.b(this.f55061c, this.f55060b.hashCode() * 31, 31);
            Parcelable parcelable = this.d;
            int iHashCode = (iB + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            zod.l lVar = this.e;
            int i = h30.l.i(this.f55062g, okl.m.c(this.f, (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31, 31), 31);
            p31.c cVar = this.f55063h;
            int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.i;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f55064j;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.k;
            return Integer.hashCode(this.o) + j6.a.b(this.f55067n, j6.a.b(this.f55066m, j6.a.b(this.f55065l, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getK() {
            return this.f55063h;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f55062g = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52330l() {
            return this.i;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f55064j = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52333p() {
            return this.f55066m;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52335r() {
            return this.o;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f55066m = i;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getD() {
            return this.f55061c;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52329j() {
            return this.f55062g;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52332n() {
            return this.k;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52331m() {
            return this.f55064j;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f55063h = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.d = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52334q() {
            return this.f55067n;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.i = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.k = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                return new op0.w0(this.f55061c != model.f55061c);
            }
            return null;
        }
    }

    public ComparisonLineChartLoadingWidgetDelegate() {
        super(R$layout.internal_delegate_widget_comparison_line_chart_loading, new op0.v0(0));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.x0 x0Var = new op0.x0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_comparison_line_chart_loading));
        p(x0Var, true);
        return x0Var;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.x0 holder, Model data, int i, List payloads) {
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
            if (!(payloads.get(i2) instanceof op0.w0)) {
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
            zIsEmpty = zIsEmpty || ((op0.w0) payloads.get(i3)).f227462a;
        }
        if (zIsEmpty) {
            holder.F(data.f55061c);
        }
        io3.h.s(holder.f227473j);
    }
}
