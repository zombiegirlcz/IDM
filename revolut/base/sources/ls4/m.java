package ls4;

import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentAnticipationQuote;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentAnticipationQuotes;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.a f199624b;

    public /* synthetic */ m(com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.a aVar, int i) {
        this.f199623a = i;
        this.f199624b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f199623a) {
            case 0:
                CreditCardInstalmentAnticipationQuotes quotes = (CreditCardInstalmentAnticipationQuotes) obj2;
                Intrinsics.checkNotNullParameter(quotes, "quotes");
                Iterator it8 = quotes.e.iterator();
                if (!it8.hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = ((CreditCardInstalmentAnticipationQuote) it8.next()).f68783b;
                while (it8.hasNext()) {
                    int i2 = ((CreditCardInstalmentAnticipationQuote) it8.next()).f68783b;
                    if (i > i2) {
                        i = i2;
                    }
                }
                return new e(i, quotes, this.f199624b.o.f69436c);
            default:
                yp4.d result = (yp4.d) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f199624b.K2(result.f315784a.intValue());
                return Unit.f186387a;
        }
    }
}
