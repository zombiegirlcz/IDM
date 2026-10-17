package com.revolut.domain.models.support;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/domain/models/support/Obstacles;", "", "<init>", "(Ljava/lang/String;I)V", "TRADING", "PENDING_TRANSACTIONS", "NEGATIVE_BALANCE", "POSITIVE_BALANCE", "VAULTS", "PREMIUM_PLAN", "METAL_PLAN", "PLUS_PLAN", "DEVICE_INSURANCE", "OPEN_DISPUTES", "LOUNGE_PASSES", "UNKNOWN", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Obstacles {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Obstacles[] $VALUES;
    public static final Obstacles TRADING = new Obstacles("TRADING", 0);
    public static final Obstacles PENDING_TRANSACTIONS = new Obstacles("PENDING_TRANSACTIONS", 1);
    public static final Obstacles NEGATIVE_BALANCE = new Obstacles("NEGATIVE_BALANCE", 2);
    public static final Obstacles POSITIVE_BALANCE = new Obstacles("POSITIVE_BALANCE", 3);
    public static final Obstacles VAULTS = new Obstacles("VAULTS", 4);
    public static final Obstacles PREMIUM_PLAN = new Obstacles("PREMIUM_PLAN", 5);
    public static final Obstacles METAL_PLAN = new Obstacles("METAL_PLAN", 6);
    public static final Obstacles PLUS_PLAN = new Obstacles("PLUS_PLAN", 7);
    public static final Obstacles DEVICE_INSURANCE = new Obstacles("DEVICE_INSURANCE", 8);
    public static final Obstacles OPEN_DISPUTES = new Obstacles("OPEN_DISPUTES", 9);
    public static final Obstacles LOUNGE_PASSES = new Obstacles("LOUNGE_PASSES", 10);
    public static final Obstacles UNKNOWN = new Obstacles("UNKNOWN", 11);

    private static final /* synthetic */ Obstacles[] $values() {
        return new Obstacles[]{TRADING, PENDING_TRANSACTIONS, NEGATIVE_BALANCE, POSITIVE_BALANCE, VAULTS, PREMIUM_PLAN, METAL_PLAN, PLUS_PLAN, DEVICE_INSURANCE, OPEN_DISPUTES, LOUNGE_PASSES, UNKNOWN};
    }

    static {
        Obstacles[] obstaclesArr$values = $values();
        $VALUES = obstaclesArr$values;
        $ENTRIES = s.n(obstaclesArr$values);
    }

    private Obstacles(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static Obstacles valueOf(String str) {
        return (Obstacles) Enum.valueOf(Obstacles.class, str);
    }

    public static Obstacles[] values() {
        return (Obstacles[]) $VALUES.clone();
    }
}
