package e76;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, d8l.d.class, "toDomain", "toDomain(Lcom/revolut/shared/feature/market_data/models/data/network/models/ChargeDto;)Lcom/revolut/shared/feature/market_data/models/domain/models/ChargeBreakdown;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        e8l.d p0 = (e8l.d) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return d8l.d.B(p0);
    }
}
