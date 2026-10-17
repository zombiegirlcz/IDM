package com.revolut.data.network.models.exchange;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lg.b;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/data/network/models/exchange/Side;", "", "<init>", "(Ljava/lang/String;I)V", "BUY", "SELL", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Side {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Side[] $VALUES;

    @b("BUY")
    public static final Side BUY = new Side("BUY", 0);

    @b("SELL")
    public static final Side SELL = new Side("SELL", 1);

    private static final /* synthetic */ Side[] $values() {
        return new Side[]{BUY, SELL};
    }

    static {
        Side[] sideArr$values = $values();
        $VALUES = sideArr$values;
        $ENTRIES = s.n(sideArr$values);
    }

    private Side(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static Side valueOf(String str) {
        return (Side) Enum.valueOf(Side.class, str);
    }

    public static Side[] values() {
        return (Side[]) $VALUES.clone();
    }
}
