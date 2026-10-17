package com.revolut.domain.models.banktransfer;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b%\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006&"}, d2 = {"Lcom/revolut/domain/models/banktransfer/AccountFieldType;", "", "<init>", "(Ljava/lang/String;I)V", "ACCOUNT_NUMBER", "SORT_CODE", "BSB_CODE", "BSB", "ROUTING_NUMBER", "ROUTING", "IFSC", "BIC", "IBAN", "CLABE", "RFC_CURP", "MSISDN", "ALIPAY_ID", "ALIAS_VALUE", "ALIAS_NAME", "BRAZIL_CPF_ID", "BRAZIL_CNPJ_ID", "BRAZIL_BANK_NUMBER", "BRAZIL_BRANCH_NUMBER", "BRAZIL_ACCOUNT_TYPE", "CARD_TOKEN", "CARD_LAST_FOUR", "ABM_CODE", "UPI_ID", "COLOMBIA_ACH_ACCOUNT_TYPE", "COLOMBIA_BANK_CODE", "COLOMBIA_DOCUMENT_NUMBER", "COLOMBIA_DOCUMENT_TYPE", "INSTITUTION_NAME", "FIRST_NAME", "LAST_NAME", "COMPANY_NAME", "EMAIL", "IL_BANK_CODE", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountFieldType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountFieldType[] $VALUES;
    public static final AccountFieldType ACCOUNT_NUMBER = new AccountFieldType("ACCOUNT_NUMBER", 0);
    public static final AccountFieldType SORT_CODE = new AccountFieldType("SORT_CODE", 1);
    public static final AccountFieldType BSB_CODE = new AccountFieldType("BSB_CODE", 2);
    public static final AccountFieldType BSB = new AccountFieldType("BSB", 3);
    public static final AccountFieldType ROUTING_NUMBER = new AccountFieldType("ROUTING_NUMBER", 4);
    public static final AccountFieldType ROUTING = new AccountFieldType("ROUTING", 5);
    public static final AccountFieldType IFSC = new AccountFieldType("IFSC", 6);
    public static final AccountFieldType BIC = new AccountFieldType("BIC", 7);
    public static final AccountFieldType IBAN = new AccountFieldType("IBAN", 8);
    public static final AccountFieldType CLABE = new AccountFieldType("CLABE", 9);
    public static final AccountFieldType RFC_CURP = new AccountFieldType("RFC_CURP", 10);
    public static final AccountFieldType MSISDN = new AccountFieldType("MSISDN", 11);
    public static final AccountFieldType ALIPAY_ID = new AccountFieldType("ALIPAY_ID", 12);
    public static final AccountFieldType ALIAS_VALUE = new AccountFieldType("ALIAS_VALUE", 13);
    public static final AccountFieldType ALIAS_NAME = new AccountFieldType("ALIAS_NAME", 14);
    public static final AccountFieldType BRAZIL_CPF_ID = new AccountFieldType("BRAZIL_CPF_ID", 15);
    public static final AccountFieldType BRAZIL_CNPJ_ID = new AccountFieldType("BRAZIL_CNPJ_ID", 16);
    public static final AccountFieldType BRAZIL_BANK_NUMBER = new AccountFieldType("BRAZIL_BANK_NUMBER", 17);
    public static final AccountFieldType BRAZIL_BRANCH_NUMBER = new AccountFieldType("BRAZIL_BRANCH_NUMBER", 18);
    public static final AccountFieldType BRAZIL_ACCOUNT_TYPE = new AccountFieldType("BRAZIL_ACCOUNT_TYPE", 19);
    public static final AccountFieldType CARD_TOKEN = new AccountFieldType("CARD_TOKEN", 20);
    public static final AccountFieldType CARD_LAST_FOUR = new AccountFieldType("CARD_LAST_FOUR", 21);
    public static final AccountFieldType ABM_CODE = new AccountFieldType("ABM_CODE", 22);
    public static final AccountFieldType UPI_ID = new AccountFieldType("UPI_ID", 23);
    public static final AccountFieldType COLOMBIA_ACH_ACCOUNT_TYPE = new AccountFieldType("COLOMBIA_ACH_ACCOUNT_TYPE", 24);
    public static final AccountFieldType COLOMBIA_BANK_CODE = new AccountFieldType("COLOMBIA_BANK_CODE", 25);
    public static final AccountFieldType COLOMBIA_DOCUMENT_NUMBER = new AccountFieldType("COLOMBIA_DOCUMENT_NUMBER", 26);
    public static final AccountFieldType COLOMBIA_DOCUMENT_TYPE = new AccountFieldType("COLOMBIA_DOCUMENT_TYPE", 27);
    public static final AccountFieldType INSTITUTION_NAME = new AccountFieldType("INSTITUTION_NAME", 28);
    public static final AccountFieldType FIRST_NAME = new AccountFieldType("FIRST_NAME", 29);
    public static final AccountFieldType LAST_NAME = new AccountFieldType("LAST_NAME", 30);
    public static final AccountFieldType COMPANY_NAME = new AccountFieldType("COMPANY_NAME", 31);
    public static final AccountFieldType EMAIL = new AccountFieldType("EMAIL", 32);
    public static final AccountFieldType IL_BANK_CODE = new AccountFieldType("IL_BANK_CODE", 33);

    private static final /* synthetic */ AccountFieldType[] $values() {
        return new AccountFieldType[]{ACCOUNT_NUMBER, SORT_CODE, BSB_CODE, BSB, ROUTING_NUMBER, ROUTING, IFSC, BIC, IBAN, CLABE, RFC_CURP, MSISDN, ALIPAY_ID, ALIAS_VALUE, ALIAS_NAME, BRAZIL_CPF_ID, BRAZIL_CNPJ_ID, BRAZIL_BANK_NUMBER, BRAZIL_BRANCH_NUMBER, BRAZIL_ACCOUNT_TYPE, CARD_TOKEN, CARD_LAST_FOUR, ABM_CODE, UPI_ID, COLOMBIA_ACH_ACCOUNT_TYPE, COLOMBIA_BANK_CODE, COLOMBIA_DOCUMENT_NUMBER, COLOMBIA_DOCUMENT_TYPE, INSTITUTION_NAME, FIRST_NAME, LAST_NAME, COMPANY_NAME, EMAIL, IL_BANK_CODE};
    }

    static {
        AccountFieldType[] accountFieldTypeArr$values = $values();
        $VALUES = accountFieldTypeArr$values;
        $ENTRIES = s.n(accountFieldTypeArr$values);
    }

    private AccountFieldType(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static AccountFieldType valueOf(String str) {
        return (AccountFieldType) Enum.valueOf(AccountFieldType.class, str);
    }

    public static AccountFieldType[] values() {
        return (AccountFieldType[]) $VALUES.clone();
    }
}
