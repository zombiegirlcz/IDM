package com.revolut.domain.models.openbanking;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b \b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lcom/revolut/domain/models/openbanking/PermissionType;", "", "<init>", "(Ljava/lang/String;I)V", "READ_ACCOUNTS_BASIC", "READ_ACCOUNTS_DETAIL", "READ_BALANCES", "READ_TRANSACTIONS_BASIC", "READ_TRANSACTIONS_DETAIL", "READ_TRANSACTIONS_CREDITS", "READ_TRANSACTIONS_DEBITS", "READ_BENEFICIARIES_BASIC", "READ_BENEFICIARIES_DETAIL", "READ_DIRECT_DEBITS", "READ_OFFERS", "READ_PAN", "READ_PARTY", "READ_PARTY_PSU", "READ_PRODUCTS", "READ_SCHEDULED_PAYMENTS_BASIC", "READ_SCHEDULED_PAYMENTS_DETAIL", "READ_STANDING_ORDERS_BASIC", "READ_STANDING_ORDERS_DETAIL", "READ_STATEMENTS_BASIC", "READ_STATEMENTS_DETAIL", "PROFILE", "COMMON_CUSTOMER_BASIC_READ", "COMMON_CUSTOMER_DETAIL_READ", "BANK_ACCOUNTS_BASIC_READ", "BANK_ACCOUNTS_DETAIL_READ", "BANK_PAYEES_READ", "BANK_REGULAR_PAYMENTS_READ", "BANK_TRANSACTIONS_READ", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PermissionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PermissionType[] $VALUES;
    public static final PermissionType READ_ACCOUNTS_BASIC = new PermissionType("READ_ACCOUNTS_BASIC", 0);
    public static final PermissionType READ_ACCOUNTS_DETAIL = new PermissionType("READ_ACCOUNTS_DETAIL", 1);
    public static final PermissionType READ_BALANCES = new PermissionType("READ_BALANCES", 2);
    public static final PermissionType READ_TRANSACTIONS_BASIC = new PermissionType("READ_TRANSACTIONS_BASIC", 3);
    public static final PermissionType READ_TRANSACTIONS_DETAIL = new PermissionType("READ_TRANSACTIONS_DETAIL", 4);
    public static final PermissionType READ_TRANSACTIONS_CREDITS = new PermissionType("READ_TRANSACTIONS_CREDITS", 5);
    public static final PermissionType READ_TRANSACTIONS_DEBITS = new PermissionType("READ_TRANSACTIONS_DEBITS", 6);
    public static final PermissionType READ_BENEFICIARIES_BASIC = new PermissionType("READ_BENEFICIARIES_BASIC", 7);
    public static final PermissionType READ_BENEFICIARIES_DETAIL = new PermissionType("READ_BENEFICIARIES_DETAIL", 8);
    public static final PermissionType READ_DIRECT_DEBITS = new PermissionType("READ_DIRECT_DEBITS", 9);
    public static final PermissionType READ_OFFERS = new PermissionType("READ_OFFERS", 10);
    public static final PermissionType READ_PAN = new PermissionType("READ_PAN", 11);
    public static final PermissionType READ_PARTY = new PermissionType("READ_PARTY", 12);
    public static final PermissionType READ_PARTY_PSU = new PermissionType("READ_PARTY_PSU", 13);
    public static final PermissionType READ_PRODUCTS = new PermissionType("READ_PRODUCTS", 14);
    public static final PermissionType READ_SCHEDULED_PAYMENTS_BASIC = new PermissionType("READ_SCHEDULED_PAYMENTS_BASIC", 15);
    public static final PermissionType READ_SCHEDULED_PAYMENTS_DETAIL = new PermissionType("READ_SCHEDULED_PAYMENTS_DETAIL", 16);
    public static final PermissionType READ_STANDING_ORDERS_BASIC = new PermissionType("READ_STANDING_ORDERS_BASIC", 17);
    public static final PermissionType READ_STANDING_ORDERS_DETAIL = new PermissionType("READ_STANDING_ORDERS_DETAIL", 18);
    public static final PermissionType READ_STATEMENTS_BASIC = new PermissionType("READ_STATEMENTS_BASIC", 19);
    public static final PermissionType READ_STATEMENTS_DETAIL = new PermissionType("READ_STATEMENTS_DETAIL", 20);
    public static final PermissionType PROFILE = new PermissionType("PROFILE", 21);
    public static final PermissionType COMMON_CUSTOMER_BASIC_READ = new PermissionType("COMMON_CUSTOMER_BASIC_READ", 22);
    public static final PermissionType COMMON_CUSTOMER_DETAIL_READ = new PermissionType("COMMON_CUSTOMER_DETAIL_READ", 23);
    public static final PermissionType BANK_ACCOUNTS_BASIC_READ = new PermissionType("BANK_ACCOUNTS_BASIC_READ", 24);
    public static final PermissionType BANK_ACCOUNTS_DETAIL_READ = new PermissionType("BANK_ACCOUNTS_DETAIL_READ", 25);
    public static final PermissionType BANK_PAYEES_READ = new PermissionType("BANK_PAYEES_READ", 26);
    public static final PermissionType BANK_REGULAR_PAYMENTS_READ = new PermissionType("BANK_REGULAR_PAYMENTS_READ", 27);
    public static final PermissionType BANK_TRANSACTIONS_READ = new PermissionType("BANK_TRANSACTIONS_READ", 28);

    private static final /* synthetic */ PermissionType[] $values() {
        return new PermissionType[]{READ_ACCOUNTS_BASIC, READ_ACCOUNTS_DETAIL, READ_BALANCES, READ_TRANSACTIONS_BASIC, READ_TRANSACTIONS_DETAIL, READ_TRANSACTIONS_CREDITS, READ_TRANSACTIONS_DEBITS, READ_BENEFICIARIES_BASIC, READ_BENEFICIARIES_DETAIL, READ_DIRECT_DEBITS, READ_OFFERS, READ_PAN, READ_PARTY, READ_PARTY_PSU, READ_PRODUCTS, READ_SCHEDULED_PAYMENTS_BASIC, READ_SCHEDULED_PAYMENTS_DETAIL, READ_STANDING_ORDERS_BASIC, READ_STANDING_ORDERS_DETAIL, READ_STATEMENTS_BASIC, READ_STATEMENTS_DETAIL, PROFILE, COMMON_CUSTOMER_BASIC_READ, COMMON_CUSTOMER_DETAIL_READ, BANK_ACCOUNTS_BASIC_READ, BANK_ACCOUNTS_DETAIL_READ, BANK_PAYEES_READ, BANK_REGULAR_PAYMENTS_READ, BANK_TRANSACTIONS_READ};
    }

    static {
        PermissionType[] permissionTypeArr$values = $values();
        $VALUES = permissionTypeArr$values;
        $ENTRIES = s.n(permissionTypeArr$values);
    }

    private PermissionType(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static PermissionType valueOf(String str) {
        return (PermissionType) Enum.valueOf(PermissionType.class, str);
    }

    public static PermissionType[] values() {
        return (PermissionType[]) $VALUES.clone();
    }
}
