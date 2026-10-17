package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/ChartWithDetailsLoadingWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/ChartWithDetailsLoadingWidgetDelegate$Model;", "Lop0/m0;", "<init>", "()V", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChartWithDetailsLoadingWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.m0> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/ChartWithDetailsLoadingWidgetDelegate$Model;", "Lqv0/q;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "Ltw0/y;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.q, qv0.p, tw0.y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Parcelable f55035c;
        public final Object d;
        public op0.r e;
        public qv0.c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p31.c f55036g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p31.c f55037h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f55038j;
        public final op0.q k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f55039l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f55040m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f55041n;
        public final int o;

        public Model(String listId, zod.l lVar, int i) {
            lVar = (i & 4) != 0 ? null : lVar;
            Intrinsics.checkNotNullParameter(listId, "listId");
            op0.r rVar = op0.r.SEEN;
            c.e eVar = new c.e((qv0.h) null, 3);
            this.f55034b = listId;
            this.f55035c = null;
            this.d = lVar;
            this.e = rVar;
            this.f = eVar;
            this.f55036g = null;
            this.f55037h = null;
            this.i = null;
            this.f55038j = null;
            this.k = op0.q.MEDIUM;
            int i2 = R$attr.uikit_dp0;
            this.f55039l = i2;
            this.f55040m = i2;
            this.f55041n = i2;
            this.o = i2;
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

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF51674g() {
            return this.d;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52014a() {
            return this.f55034b;
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
            return Intrinsics.f(this.f55034b, model.f55034b) && Intrinsics.f(this.f55035c, model.f55035c) && Intrinsics.f(this.d, model.d) && this.e == model.e && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f55036g, model.f55036g) && Intrinsics.f(this.f55037h, model.f55037h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f55038j, model.f55038j);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52020l() {
            return this.f55039l;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f55039l = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52024q() {
            return this.f55035c;
        }

        public final int hashCode() {
            int iHashCode = this.f55034b.hashCode() * 31;
            Parcelable parcelable = this.f55035c;
            int iHashCode2 = (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            Object obj2 = this.d;
            int i = h30.l.i(this.f, okl.m.c(this.e, (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31), 31);
            p31.c cVar = this.f55036g;
            int iHashCode3 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f55037h;
            int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.i;
            int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f55038j;
            return iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52018h() {
            return this.f55036g;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getI() {
            return this.f55037h;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.i = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52021m() {
            return this.f55040m;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getO() {
            return this.o;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f55040m = i;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getK() {
            return this.k;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF52017g() {
            return this.f;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getK() {
            return this.f55038j;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52019j() {
            return this.i;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f55036g = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f55035c = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52022n() {
            return this.f55041n;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f55037h = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f55038j = cVar;
        }
    }

    public ChartWithDetailsLoadingWidgetDelegate() {
        super(R$layout.internal_delegate_widget_chart_with_details_loading, new ood.g0(26));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.m0 m0Var = new op0.m0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_chart_with_details_loading));
        m0Var.F(op0.q.MEDIUM);
        io3.h.s(m0Var.f227348j);
        p(m0Var, false);
        return m0Var;
    }
}
