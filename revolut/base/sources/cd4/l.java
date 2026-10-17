package cd4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u80.q;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pair f23187b;

    public /* synthetic */ l(int i, Pair pair) {
        this.f23186a = i;
        this.f23187b = pair;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data content;
        su4.h hVarL2;
        su4.h hVarA;
        switch (this.f23186a) {
            case 0:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                Pair pair = this.f23187b;
                return new j((Clause) pair.f186385a, (Clause) pair.f186386b, (List) getDefaultLoadingItems.invoke(), false);
            case 1:
                koe.h hVar = (koe.h) obj2;
                return koe.h.a(hVar, null, zi0.c.P(d0.A0((Iterable) zi0.c.I(hVar.f186315b), this.f23187b.f186385a), false, null, 3), null, null, 13);
            default:
                su4.i update = (su4.i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data data = update.f265649a;
                try {
                    Object content2 = data.getContent();
                    if (content2 != null) {
                        hVarL2 = (su4.h) content2;
                        Pair pair2 = this.f23187b;
                        if (pair2 == null) {
                            hVarA = su4.h.a(hVarL2, null, null, false, false, null, null, 7167);
                        } else {
                            OrderQuoteParams orderQuoteParams = (OrderQuoteParams) pair2.f186385a;
                            OrderQuote orderQuote = (OrderQuote) pair2.f186386b;
                            if (Intrinsics.f(orderQuoteParams, com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a.I2(hVarL2))) {
                                Amount amount = orderQuote.d;
                                if (amount == null) {
                                    amount = orderQuote.f104754c;
                                }
                                xi0.b bVar = orderQuoteParams.f104783a;
                                hVarA = su4.h.a(hVarL2, null, null, false, false, new CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData(bVar, orderQuoteParams.f104784b, orderQuote.f104757j.f104793b, q.a(amount.f104717a, bVar), orderQuote), null, 7167);
                            }
                        }
                        hVarL2 = com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a.L2(hVarA);
                    } else {
                        hVarL2 = null;
                    }
                    content = new Data(hVarL2, data.getError(), data.getLoading());
                    break;
                } catch (Throwable th10) {
                    content = new Data(null, th10, data.getLoading());
                }
                Intrinsics.checkNotNullParameter(content, "content");
                return new su4.i(content);
        }
    }

    public /* synthetic */ l(Pair pair, com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a aVar) {
        this.f23186a = 2;
        this.f23187b = pair;
    }
}
