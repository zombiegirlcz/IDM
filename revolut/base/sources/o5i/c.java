package o5i;

import ael.d0;
import ang.f;
import com.revolut.feature_market_data_api.models.OrderQuoteParamsVariant;
import efm.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rd0.e;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kgm.c f222441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1j.b f222442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f222443c;
    public final d0 d;
    public final ybl.b e;
    public final o7.b f;

    public c(kgm.c orderQuoteFeeAndLimitsInteractor, t1j.b transferQuoteInteractor, f userInteractor, d0 stocksInteractor, ybl.b instrumentTickerInteractor, o7.b orderQuoteInteractor) {
        Intrinsics.checkNotNullParameter(orderQuoteFeeAndLimitsInteractor, "orderQuoteFeeAndLimitsInteractor");
        Intrinsics.checkNotNullParameter(transferQuoteInteractor, "transferQuoteInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        this.f222441a = orderQuoteFeeAndLimitsInteractor;
        this.f222442b = transferQuoteInteractor;
        this.f222443c = userInteractor;
        this.d = stocksInteractor;
        this.e = instrumentTickerInteractor;
        this.f = orderQuoteInteractor;
    }

    public final r a(OrderQuoteParamsVariant orderQuoteParams) {
        Flow flowU;
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        boolean z = orderQuoteParams instanceof OrderQuoteParamsVariant.Legacy;
        o7.b bVar = this.f;
        if (z) {
            flowU = o7.b.s(bVar, ((OrderQuoteParamsVariant.Legacy) orderQuoteParams).f97018a);
        } else {
            if (!(orderQuoteParams instanceof OrderQuoteParamsVariant.Migrated)) {
                throw new NoWhenBranchMatchedException();
            }
            flowU = o7.b.u(bVar, ((OrderQuoteParamsVariant.Migrated) orderQuoteParams).f97019a);
        }
        return e.c(flowU, g.f186406a);
    }
}
