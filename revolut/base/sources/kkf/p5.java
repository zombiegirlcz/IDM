package kkf;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class p5 extends yji.n implements elf.s0 {

    @NotNull
    public static final k5 Companion = new k5();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184884l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f184885m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l61.a f184886n;

    public p5(klf.h0 commonDataSource, com.revolut.domain.interactors.transactions.a transactionsInteractor, l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.f184884l = commonDataSource;
        this.f184885m = transactionsInteractor;
        this.f184886n = userCompanyInteractor;
    }

    public static TextLocalisedClause Z2() {
        return new TextLocalisedClause(R$string.transactionUI_transaction_details_rev_payment_footer_link_commodities_terms, null, new Click(12, Integer.valueOf(R$attr.uikit_colorAccent), (Object) "https://www.revolut.com/legal/precious-metals/", "ID_EXTRAS_REV_PAYMENT_COMMODITY_TERMS_URL", false), 10);
    }

    public static TextLocalisedClause b3(String str) {
        return new TextLocalisedClause(R$string.transactionUI_transaction_details_rev_payment_footer_link_cryptocurrency_terms, null, new Click(12, Integer.valueOf(R$attr.uikit_colorAccent), (Object) str, "ID_EXTRAS_REV_PAYMENT_CRYPTO_TERMS_URL", false), 10);
    }

    public static TextLocalisedClause c3(String str) {
        return new TextLocalisedClause(R$string.transactionUI_transaction_details_rev_payment_footer_link_personal_terms, null, new Click(12, Integer.valueOf(R$attr.uikit_colorAccent), (Object) str, "ID_EXTRAS_REV_PAYMENT_PERSONAL_TERMS_URL", false), 10);
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        int iHashCode = str.hashCode();
        if (iHashCode == -2142126088 ? str.equals("ID_EXTRAS_REV_PAYMENT_COMMODITY_TERMS_URL") : iHashCode == -1406558043 ? str.equals("ID_EXTRAS_REV_PAYMENT_PERSONAL_TERMS_URL") : iHashCode == -1370261210 && str.equals("ID_EXTRAS_REV_PAYMENT_CRYPTO_TERMS_URL")) {
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 == null) {
                return Boolean.FALSE;
            }
            A2(new ExternalDestination.Browser(str2, null));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
