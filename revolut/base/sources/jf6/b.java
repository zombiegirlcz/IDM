package jf6;

import com.revolut.domain.models.openbanking.OpenBankingAccountData;
import com.revolut.domain.models.openbanking.PaymentConsentType;
import com.revolut.domain.models.openbanking.PaymentFrequency;
import if6.f;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f173653a = r0.k(new Pair("DomesticPaymentConsent", PaymentConsentType.DOMESTIC_PAYMENT), new Pair("DomesticScheduledPaymentConsent", PaymentConsentType.DOMESTIC_SCHEDULED_PAYMENT), new Pair("DomesticStandingOrderConsent", PaymentConsentType.DOMESTIC_RECURRING_ORDER), new Pair("InternationalPaymentConsent", PaymentConsentType.INTERNATIONAL_PAYMENT), new Pair("InternationalScheduledPaymentConsent", PaymentConsentType.INTERNATIONAL_SCHEDULED_PAYMENT), new Pair("InternationalStandingOrderConsent", PaymentConsentType.INTERNATIONAL_RECURRING_ORDER));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f173654b = r0.k(new Pair("EvryDay", PaymentFrequency.DAILY), new Pair("IntrvlWkDay", PaymentFrequency.WEEKLY), new Pair("IntrvlMnthDay", PaymentFrequency.MONTHLY));

    public static final OpenBankingAccountData a(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar.getIban() != null) {
            return new OpenBankingAccountData.Iban(fVar.getIban());
        }
        String accountNumber = fVar.getAccountNumber();
        if (accountNumber == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String sortCode = fVar.getSortCode();
        if (sortCode != null) {
            return new OpenBankingAccountData.Local(accountNumber, sortCode);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
