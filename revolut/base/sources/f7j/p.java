package f7j;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.trading.orders.ui.invest.placement.models.TargetPriceInputValue;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements e4i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l4i.a f132645b;

    public p(l4i.a amountConverter, int i) {
        this.f132644a = i;
        switch (i) {
            case 2:
                Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
                this.f132645b = amountConverter;
                break;
            default:
                Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
                this.f132645b = amountConverter;
                break;
        }
    }

    public Amount a(TargetPriceInputValue inputValue, nel.n instrument) {
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        return new Amount(inputValue.f106872a, f(instrument.i));
    }

    public Asset b(aul.b inputMode, nel.n instrument, xi0.b displayCurrency) {
        Intrinsics.checkNotNullParameter(inputMode, "inputMode");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        int i = gul.b.f146976a[inputMode.ordinal()];
        if (i == 1) {
            return yoj.b.b(instrument);
        }
        if (i == 2) {
            return f(displayCurrency);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // e4i.a
    public l4i.a e() {
        switch (this.f132644a) {
        }
        return this.f132645b;
    }

    public p(l4i.a converter, n keyboardSuggestionMapper) {
        this.f132644a = 0;
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(keyboardSuggestionMapper, "keyboardSuggestionMapper");
        this.f132645b = converter;
    }
}
