package com.revolut.domain.models.tracking;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/domain/models/tracking/MoneyRequestAppSource;", "", "<init>", "(Ljava/lang/String;I)V", "SPLIT_BILL", "DEFAULT", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MoneyRequestAppSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MoneyRequestAppSource[] $VALUES;
    public static final MoneyRequestAppSource SPLIT_BILL = new MoneyRequestAppSource("SPLIT_BILL", 0);
    public static final MoneyRequestAppSource DEFAULT = new MoneyRequestAppSource("DEFAULT", 1);

    private static final /* synthetic */ MoneyRequestAppSource[] $values() {
        return new MoneyRequestAppSource[]{SPLIT_BILL, DEFAULT};
    }

    static {
        MoneyRequestAppSource[] moneyRequestAppSourceArr$values = $values();
        $VALUES = moneyRequestAppSourceArr$values;
        $ENTRIES = s.n(moneyRequestAppSourceArr$values);
    }

    private MoneyRequestAppSource(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static MoneyRequestAppSource valueOf(String str) {
        return (MoneyRequestAppSource) Enum.valueOf(MoneyRequestAppSource.class, str);
    }

    public static MoneyRequestAppSource[] values() {
        return (MoneyRequestAppSource[]) $VALUES.clone();
    }
}
