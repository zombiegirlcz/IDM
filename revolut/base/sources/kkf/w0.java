package kkf;

import com.revolut.feature.support.api.navigation.HelpCentreFeatureConfig;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class w0 extends yji.n implements elf.s0 {

    @NotNull
    public static final t0 Companion = new t0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184990l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g2e.t f184991m;

    public w0(klf.h0 commonDataSource, g2e.t cardTransactionCurrencyNameMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(cardTransactionCurrencyNameMapper, "cardTransactionCurrencyNameMapper");
        this.f184990l = commonDataSource;
        this.f184991m = cardTransactionCurrencyNameMapper;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z = true;
        if (Intrinsics.f(str, "ID_ACTION_ATM_DCC_LEARN_MORE")) {
            A2(zh9.u0.c(new HelpCentreFeatureConfig.Topic("question.why-did-the-atm-charge-a-fee-for-my-cash-withdrawal", "transaction_details_redesign")));
        } else if (Intrinsics.f(str, "ID_ACTION_MERCHANT_DCC_LEARN_MORE")) {
            A2(zh9.u0.c(new HelpCentreFeatureConfig.Topic("question.why-did-the-merchant-charge-a-fee-for-my-card-payment", "transaction_details_redesign")));
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
