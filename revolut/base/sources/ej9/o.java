package ej9;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.s0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o extends kotlin.jvm.internal.q implements Function1 {
    public static final o f = new o();

    public o() {
        super(1, cj9.c.class, "toDomain", "toDomain(Lcom/revolut/feature/pay_later/impl/network/models/PayLaterPlanDetailsDto;)Lcom/revolut/feature/pay_later/api/models/PayLaterPlanDetails;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        dj9.k p0 = (dj9.k) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        return new s0(p0.getCancellable());
    }
}
