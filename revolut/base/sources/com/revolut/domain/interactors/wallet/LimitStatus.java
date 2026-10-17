package com.revolut.domain.interactors.wallet;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/domain/interactors/wallet/LimitStatus;", "", "<init>", "(Ljava/lang/String;I)V", "INFINITE", "NORMAL", "CLOSE_TO", "REACHED", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LimitStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LimitStatus[] $VALUES;
    public static final LimitStatus INFINITE = new LimitStatus("INFINITE", 0);
    public static final LimitStatus NORMAL = new LimitStatus("NORMAL", 1);
    public static final LimitStatus CLOSE_TO = new LimitStatus("CLOSE_TO", 2);
    public static final LimitStatus REACHED = new LimitStatus("REACHED", 3);

    private static final /* synthetic */ LimitStatus[] $values() {
        return new LimitStatus[]{INFINITE, NORMAL, CLOSE_TO, REACHED};
    }

    static {
        LimitStatus[] limitStatusArr$values = $values();
        $VALUES = limitStatusArr$values;
        $ENTRIES = s.n(limitStatusArr$values);
    }

    private LimitStatus(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static LimitStatus valueOf(String str) {
        return (LimitStatus) Enum.valueOf(LimitStatus.class, str);
    }

    public static LimitStatus[] values() {
        return (LimitStatus[]) $VALUES.clone();
    }
}
