package com.revolut.domain.models.transactions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/domain/models/transactions/DeclineReasonSeverity;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "CRITICAL", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeclineReasonSeverity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeclineReasonSeverity[] $VALUES;
    public static final DeclineReasonSeverity WARNING = new DeclineReasonSeverity("WARNING", 0);
    public static final DeclineReasonSeverity CRITICAL = new DeclineReasonSeverity("CRITICAL", 1);

    private static final /* synthetic */ DeclineReasonSeverity[] $values() {
        return new DeclineReasonSeverity[]{WARNING, CRITICAL};
    }

    static {
        DeclineReasonSeverity[] declineReasonSeverityArr$values = $values();
        $VALUES = declineReasonSeverityArr$values;
        $ENTRIES = s.n(declineReasonSeverityArr$values);
    }

    private DeclineReasonSeverity(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static DeclineReasonSeverity valueOf(String str) {
        return (DeclineReasonSeverity) Enum.valueOf(DeclineReasonSeverity.class, str);
    }

    public static DeclineReasonSeverity[] values() {
        return (DeclineReasonSeverity[]) $VALUES.clone();
    }
}
