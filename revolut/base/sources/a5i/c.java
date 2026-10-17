package a5i;

import ael.d0;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction_price_description.TransactionPriceDescriptionScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionPriceDescriptionScreenContract$InputData f1411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f1412b;

    public c(TransactionPriceDescriptionScreenContract$InputData inputData, d0 stocksInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        this.f1411a = inputData;
        this.f1412b = stocksInteractor;
    }
}
