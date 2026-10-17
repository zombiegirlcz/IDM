package u13;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class e extends q implements Function1 {
    public static final e f = new e();

    public e() {
        super(1, v13.d.class, "toDomain", "toDomain(Lcom/revolut/feature/card_order_new/impl/delivery/api/repository/network/DeliveryMethodsDto;)Lcom/revolut/feature/cards/models/delivery/DeliveryMethods;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        v13.c p0 = (v13.c) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return v13.d.B(p0);
    }
}
