package w21;

import com.revolut.domain.models.openbanking.ConsentAccountType;
import com.revolut.domain.models.openbanking.ConsentType;
import com.revolut.domain.models.openbanking.PermissionType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f293915a = r0.k(new Pair("UK", ConsentAccountType.UK), new Pair("US", ConsentAccountType.US), new Pair("IBAN", ConsentAccountType.IBAN), new Pair("PULLED_TRANSFER", ConsentAccountType.PULLED_TRANSFER));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f293916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f293917c;
    public static final Object d;
    public static final LinkedHashMap e;

    static {
        ConsentType consentType = ConsentType.ACCOUNTS;
        Pair pair = new Pair("accounts", consentType);
        ConsentType consentType2 = ConsentType.PAYMENTS;
        Pair pair2 = new Pair("payments", consentType2);
        ConsentType consentType3 = ConsentType.FUND_CONFIRMATIONS;
        Pair pair3 = new Pair("fundsconfirmations", consentType3);
        ConsentType consentType4 = ConsentType.AU_READ_ONLY;
        f293916b = r0.k(pair, pair2, pair3, new Pair("auReadOnlyAccessConsent", consentType4));
        f293917c = r0.k(new Pair("accounts", consentType), new Pair("payments", consentType2), new Pair("fundconfirmations", consentType3), new Pair("auReadOnlyAccessConsent", consentType4));
        Map mapK = r0.k(new Pair("profile", PermissionType.PROFILE), new Pair("common:customer.basic:read", PermissionType.COMMON_CUSTOMER_BASIC_READ), new Pair("common:customer.detail:read", PermissionType.COMMON_CUSTOMER_DETAIL_READ), new Pair("bank:accounts.basic:read", PermissionType.BANK_ACCOUNTS_BASIC_READ), new Pair("bank:accounts.detail:read", PermissionType.BANK_ACCOUNTS_DETAIL_READ), new Pair("bank:payees:read", PermissionType.BANK_PAYEES_READ), new Pair("bank:regular_payments:read", PermissionType.BANK_REGULAR_PAYMENTS_READ), new Pair("bank:transactions:read", PermissionType.BANK_TRANSACTIONS_READ));
        d = mapK;
        e = r0.p(r0.k(new Pair("ReadAccountsBasic", PermissionType.READ_ACCOUNTS_BASIC), new Pair("ReadAccountsDetail", PermissionType.READ_ACCOUNTS_DETAIL), new Pair("ReadBalances", PermissionType.READ_BALANCES), new Pair("ReadTransactionsBasic", PermissionType.READ_TRANSACTIONS_BASIC), new Pair("ReadTransactionsDetail", PermissionType.READ_TRANSACTIONS_DETAIL), new Pair("ReadTransactionsCredits", PermissionType.READ_TRANSACTIONS_CREDITS), new Pair("ReadTransactionsDebits", PermissionType.READ_TRANSACTIONS_DEBITS), new Pair("ReadBeneficiariesBasic", PermissionType.READ_BENEFICIARIES_BASIC), new Pair("ReadBeneficiariesDetail", PermissionType.READ_BENEFICIARIES_DETAIL), new Pair("ReadDirectDebits", PermissionType.READ_DIRECT_DEBITS), new Pair("ReadOffers", PermissionType.READ_OFFERS), new Pair("ReadPAN", PermissionType.READ_PAN), new Pair("ReadParty", PermissionType.READ_PARTY), new Pair("ReadPartyPSU", PermissionType.READ_PARTY_PSU), new Pair("ReadProducts", PermissionType.READ_PRODUCTS), new Pair("ReadScheduledPaymentsBasic", PermissionType.READ_SCHEDULED_PAYMENTS_BASIC), new Pair("ReadScheduledPaymentsDetail", PermissionType.READ_SCHEDULED_PAYMENTS_DETAIL), new Pair("ReadStandingOrdersBasic", PermissionType.READ_STANDING_ORDERS_BASIC), new Pair("ReadStandingOrdersDetail", PermissionType.READ_STANDING_ORDERS_DETAIL), new Pair("ReadStatementsBasic", PermissionType.READ_STATEMENTS_BASIC), new Pair("ReadStatementsDetail", PermissionType.READ_STATEMENTS_DETAIL)), mapK);
    }
}
