package com.revolut.shared.feature.wealth.models.transaction;

import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import com.revolut.shared.feature.wealth.models.transaction.TradingTransactionsFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {
    public static final TradingTransactionsFilter.TradingTransactionsFilterImpl a(InvestTransactionsFilter investTransactionsFilter) {
        Intrinsics.checkNotNullParameter(investTransactionsFilter, "<this>");
        InvestTransactionsFilter.InvestTransactionsFilterImpl investTransactionsFilterImpl = (InvestTransactionsFilter.InvestTransactionsFilterImpl) investTransactionsFilter;
        return new TradingTransactionsFilter.TradingTransactionsFilterImpl(investTransactionsFilterImpl.f105341a, investTransactionsFilterImpl.f105342b, investTransactionsFilterImpl.f105343c, investTransactionsFilterImpl.d, investTransactionsFilterImpl.e, investTransactionsFilterImpl.f, investTransactionsFilterImpl.f105344g);
    }
}
