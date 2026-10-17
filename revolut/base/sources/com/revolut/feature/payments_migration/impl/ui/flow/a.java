package com.revolut.feature.payments_migration.impl.ui.flow;

import aii.r;
import j6a.i;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements qii.a, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f80259a;

    public a(c cVar) {
        this.f80259a = cVar;
    }

    @Override // qii.a
    public final void a(r rVar, qii.b wrapperFlowModel) {
        i output = (i) rVar;
        Intrinsics.checkNotNullParameter(output, "p0");
        Intrinsics.checkNotNullParameter(wrapperFlowModel, "p1");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(wrapperFlowModel, "wrapperFlowModel");
        if (Intrinsics.f(output, i.f171704a)) {
            this.f80259a.I2(wrapperFlowModel);
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
        return new q(2, 0, c.class, this.f80259a, "onAccountDetailsResult", "onAccountDetailsResult$feature_retail_payments_migration_impl_release(Lcom/revolut/feature/payments_migration/impl/ui/screen/move_payment/account_details/AccountDetailsPaymentControllerContract$OutputData;Lcom/revolut/kompot/common/flow/WrapperFlowModel;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
