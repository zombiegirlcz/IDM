package guf;

import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g extends q implements Function1 {
    public static final g f = new g();

    public g() {
        super(1, hrf.a.class, "<init>", "<init>(Lcom/revolut/shared/feature/market_data/models/domain/models/OrderQuote;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        OrderQuote p0 = (OrderQuote) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new hrf.a(p0);
    }
}
