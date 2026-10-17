package s33;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d extends q implements Function1 {
    public static final d f = new d();

    public d() {
        super(1, r33.b.class, "toDomain", "toDomain(Lcom/revolut/feature/card_order_new/impl/pricing/api/network/PricingPlanCancellationFeeDto;)Lcom/revolut/feature/card_order_new/api/models/delivery_method/PricingPlanCancellationFee;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        r33.c p0 = (r33.c) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        return new d13.a(mo3.a.o(p0.getFee()));
    }
}
