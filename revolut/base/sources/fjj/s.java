package fjj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends gim.c {
    public PaymentMethod.Pocket u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a f135668w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f135669x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a aVar, gim.c cVar) {
        super(cVar);
        this.f135668w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f135669x |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a.I2(this.f135668w, null, this);
    }
}
