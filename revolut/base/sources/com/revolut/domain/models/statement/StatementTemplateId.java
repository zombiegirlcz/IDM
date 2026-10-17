package com.revolut.domain.models.statement;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/domain/models/statement/StatementTemplateId;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSACTION_LIST", "TRANSACTION_LIST_CSV", "SINGLE_TRANSACTION", "ACCOUNT_CONFIRMATION", "CARD_CONFIRMATION", "SUBJECT_CONFIRMATION", "DIRECT_DEPOSIT_US", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StatementTemplateId {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StatementTemplateId[] $VALUES;
    public static final StatementTemplateId TRANSACTION_LIST = new StatementTemplateId("TRANSACTION_LIST", 0);
    public static final StatementTemplateId TRANSACTION_LIST_CSV = new StatementTemplateId("TRANSACTION_LIST_CSV", 1);
    public static final StatementTemplateId SINGLE_TRANSACTION = new StatementTemplateId("SINGLE_TRANSACTION", 2);
    public static final StatementTemplateId ACCOUNT_CONFIRMATION = new StatementTemplateId("ACCOUNT_CONFIRMATION", 3);
    public static final StatementTemplateId CARD_CONFIRMATION = new StatementTemplateId("CARD_CONFIRMATION", 4);
    public static final StatementTemplateId SUBJECT_CONFIRMATION = new StatementTemplateId("SUBJECT_CONFIRMATION", 5);
    public static final StatementTemplateId DIRECT_DEPOSIT_US = new StatementTemplateId("DIRECT_DEPOSIT_US", 6);

    private static final /* synthetic */ StatementTemplateId[] $values() {
        return new StatementTemplateId[]{TRANSACTION_LIST, TRANSACTION_LIST_CSV, SINGLE_TRANSACTION, ACCOUNT_CONFIRMATION, CARD_CONFIRMATION, SUBJECT_CONFIRMATION, DIRECT_DEPOSIT_US};
    }

    static {
        StatementTemplateId[] statementTemplateIdArr$values = $values();
        $VALUES = statementTemplateIdArr$values;
        $ENTRIES = s.n(statementTemplateIdArr$values);
    }

    private StatementTemplateId(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static StatementTemplateId valueOf(String str) {
        return (StatementTemplateId) Enum.valueOf(StatementTemplateId.class, str);
    }

    public static StatementTemplateId[] values() {
        return (StatementTemplateId[]) $VALUES.clone();
    }
}
