package kx7;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zw7.b1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j0 extends kotlin.jvm.internal.q implements Function1 {
    public static final j0 f = new j0();

    public j0() {
        super(1, hx7.q.class, "toDomain", "toDomain(Lcom/revolut/feature/insurance_pet/impl/network/model/PolicyRenewalRejectionDto;)Lcom/revolut/feature/insurance_pet/api/model/PolicyRenewalRejection;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ix7.y p0 = (ix7.y) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        return new b1(p0.getPetLoss());
    }
}
