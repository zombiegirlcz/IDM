package i4i;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f extends q implements Function1 {
    public static final f f = new f();

    public f() {
        super(1, g4i.a.class, "toDomain", "toDomain(Lcom/revolut/feature_market_data_impl/data/network/models/ExchangeLimitsDto;)Lcom/revolut/feature_market_data_api/models/ExchangeLimits;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        h4i.a p0 = (h4i.a) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        return new z3i.a(d8l.e.a(p0.getLimits()));
    }
}
