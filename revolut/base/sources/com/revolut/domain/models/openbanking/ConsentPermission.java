package com.revolut.domain.models.openbanking;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/revolut/domain/models/openbanking/ConsentPermission;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "a", "PROFILE", "COMMON_CUSTOMER_BASIC_READ", "COMMON_CUSTOMER_DETAIL_READ", "BANK_ACCOUNTS_BASIC_READ", "BANK_ACCOUNTS_DETAIL_READ", "BANK_PAYEES_READ", "BANK_REGULAR_PAYMENTS_READ", "BANK_TRANSACTIONS_READ", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConsentPermission {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ConsentPermission[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String value;
    public static final ConsentPermission PROFILE = new ConsentPermission("PROFILE", 0, "profile");
    public static final ConsentPermission COMMON_CUSTOMER_BASIC_READ = new ConsentPermission("COMMON_CUSTOMER_BASIC_READ", 1, "common:customer.basic:read");
    public static final ConsentPermission COMMON_CUSTOMER_DETAIL_READ = new ConsentPermission("COMMON_CUSTOMER_DETAIL_READ", 2, "common:customer.detail:read");
    public static final ConsentPermission BANK_ACCOUNTS_BASIC_READ = new ConsentPermission("BANK_ACCOUNTS_BASIC_READ", 3, "bank:accounts.basic:read");
    public static final ConsentPermission BANK_ACCOUNTS_DETAIL_READ = new ConsentPermission("BANK_ACCOUNTS_DETAIL_READ", 4, "bank:accounts.detail:read");
    public static final ConsentPermission BANK_PAYEES_READ = new ConsentPermission("BANK_PAYEES_READ", 5, "bank:payees:read");
    public static final ConsentPermission BANK_REGULAR_PAYMENTS_READ = new ConsentPermission("BANK_REGULAR_PAYMENTS_READ", 6, "bank:regular_payments:read");
    public static final ConsentPermission BANK_TRANSACTIONS_READ = new ConsentPermission("BANK_TRANSACTIONS_READ", 7, "bank:transactions:read");

    /* JADX INFO: renamed from: com.revolut.domain.models.openbanking.ConsentPermission$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    private static final /* synthetic */ ConsentPermission[] $values() {
        return new ConsentPermission[]{PROFILE, COMMON_CUSTOMER_BASIC_READ, COMMON_CUSTOMER_DETAIL_READ, BANK_ACCOUNTS_BASIC_READ, BANK_ACCOUNTS_DETAIL_READ, BANK_PAYEES_READ, BANK_REGULAR_PAYMENTS_READ, BANK_TRANSACTIONS_READ};
    }

    static {
        ConsentPermission[] consentPermissionArr$values = $values();
        $VALUES = consentPermissionArr$values;
        $ENTRIES = s.n(consentPermissionArr$values);
        INSTANCE = new Companion();
    }

    private ConsentPermission(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ConsentPermission valueOf(String str) {
        return (ConsentPermission) Enum.valueOf(ConsentPermission.class, str);
    }

    public static ConsentPermission[] values() {
        return (ConsentPermission[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
