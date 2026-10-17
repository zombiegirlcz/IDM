package com.revolut.domain.models.moneyrequest;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/domain/models/moneyrequest/MoneyRequestDirection;", "", "<init>", "(Ljava/lang/String;I)V", "INCOMING", "OUTGOING", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MoneyRequestDirection {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MoneyRequestDirection[] $VALUES;
    public static final MoneyRequestDirection INCOMING = new MoneyRequestDirection("INCOMING", 0);
    public static final MoneyRequestDirection OUTGOING = new MoneyRequestDirection("OUTGOING", 1);

    private static final /* synthetic */ MoneyRequestDirection[] $values() {
        return new MoneyRequestDirection[]{INCOMING, OUTGOING};
    }

    static {
        MoneyRequestDirection[] moneyRequestDirectionArr$values = $values();
        $VALUES = moneyRequestDirectionArr$values;
        $ENTRIES = s.n(moneyRequestDirectionArr$values);
    }

    private MoneyRequestDirection(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static MoneyRequestDirection valueOf(String str) {
        return (MoneyRequestDirection) Enum.valueOf(MoneyRequestDirection.class, str);
    }

    public static MoneyRequestDirection[] values() {
        return (MoneyRequestDirection[]) $VALUES.clone();
    }
}
