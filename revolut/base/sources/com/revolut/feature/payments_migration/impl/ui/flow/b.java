package com.revolut.feature.payments_migration.impl.ui.flow;

import aii.r;
import k6a.l;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements qii.a, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f80260a;

    public b(c cVar) {
        this.f80260a = cVar;
    }

    @Override // qii.a
    public final void a(r rVar, qii.b wrapperFlowModel) {
        l output = (l) rVar;
        Intrinsics.checkNotNullParameter(output, "p0");
        Intrinsics.checkNotNullParameter(wrapperFlowModel, "p1");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
        if (Intrinsics.f(output, l.f181660a)) {
            this.f80260a.I2(wrapperFlowModel);
        }
    }

    public final boolean equals(Object obj2) {
        if ((obj2 instanceof qii.a) && (obj2 instanceof n)) {
            return Intrinsics.f(getFunctionDelegate(), ((n) obj2).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.n
    public final Function getFunctionDelegate() {
        return new q(2, 0, c.class, this.f80260a, "onCardsResult", "onCardsResult$feature_retail_payments_migration_impl_release(Lcom/revolut/feature/payments_migration/impl/ui/screen/move_payment/cards/CardsPaymentControllerContract$OutputData;Lcom/revolut/kompot/common/flow/WrapperFlowModel;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
