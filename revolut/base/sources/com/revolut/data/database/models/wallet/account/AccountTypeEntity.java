package com.revolut.data.database.models.wallet.account;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lg.b;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/data/database/models/wallet/account/AccountTypeEntity;", "", "<init>", "(Ljava/lang/String;I)V", "PERSONAL", "PERSONAL_VAULT", "GROUP_VAULT", "BILL_POCKET", "SAVINGS", "JOINT", "JOINT_VAULT", "JOINT_SAVINGS", "PRO", "PRO_VAULT", "JUNIOR", "JUNIOR_VAULT", "JUNIOR_SAVINGS", "UNKNOWN", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountTypeEntity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountTypeEntity[] $VALUES;

    @b("PERSONAL")
    public static final AccountTypeEntity PERSONAL = new AccountTypeEntity("PERSONAL", 0);

    @b("PERSONAL_VAULT")
    public static final AccountTypeEntity PERSONAL_VAULT = new AccountTypeEntity("PERSONAL_VAULT", 1);

    @b("GROUP_VAULT")
    public static final AccountTypeEntity GROUP_VAULT = new AccountTypeEntity("GROUP_VAULT", 2);

    @b("BILL_POCKET")
    public static final AccountTypeEntity BILL_POCKET = new AccountTypeEntity("BILL_POCKET", 3);

    @b("SAVINGS")
    public static final AccountTypeEntity SAVINGS = new AccountTypeEntity("SAVINGS", 4);

    @b("JOINT")
    public static final AccountTypeEntity JOINT = new AccountTypeEntity("JOINT", 5);

    @b("JOINT_VAULT")
    public static final AccountTypeEntity JOINT_VAULT = new AccountTypeEntity("JOINT_VAULT", 6);

    @b("JOINT_SAVINGS")
    public static final AccountTypeEntity JOINT_SAVINGS = new AccountTypeEntity("JOINT_SAVINGS", 7);

    @b("PRO")
    public static final AccountTypeEntity PRO = new AccountTypeEntity("PRO", 8);

    @b("PRO_VAULT")
    public static final AccountTypeEntity PRO_VAULT = new AccountTypeEntity("PRO_VAULT", 9);

    @b("JUNIOR")
    public static final AccountTypeEntity JUNIOR = new AccountTypeEntity("JUNIOR", 10);

    @b("JUNIOR_VAULT")
    public static final AccountTypeEntity JUNIOR_VAULT = new AccountTypeEntity("JUNIOR_VAULT", 11);

    @b("JUNIOR_SAVINGS")
    public static final AccountTypeEntity JUNIOR_SAVINGS = new AccountTypeEntity("JUNIOR_SAVINGS", 12);

    @b("UNKNOWN")
    public static final AccountTypeEntity UNKNOWN = new AccountTypeEntity("UNKNOWN", 13);

    private static final /* synthetic */ AccountTypeEntity[] $values() {
        return new AccountTypeEntity[]{PERSONAL, PERSONAL_VAULT, GROUP_VAULT, BILL_POCKET, SAVINGS, JOINT, JOINT_VAULT, JOINT_SAVINGS, PRO, PRO_VAULT, JUNIOR, JUNIOR_VAULT, JUNIOR_SAVINGS, UNKNOWN};
    }

    static {
        AccountTypeEntity[] accountTypeEntityArr$values = $values();
        $VALUES = accountTypeEntityArr$values;
        $ENTRIES = s.n(accountTypeEntityArr$values);
    }

    private AccountTypeEntity(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static AccountTypeEntity valueOf(String str) {
        return (AccountTypeEntity) Enum.valueOf(AccountTypeEntity.class, str);
    }

    public static AccountTypeEntity[] values() {
        return (AccountTypeEntity[]) $VALUES.clone();
    }
}
