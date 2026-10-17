package vgl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b NONE;
    public static final b TICKER;
    public static final b TICKER_PERIODICALLY;

    static {
        b bVar = new b("NONE", 0);
        NONE = bVar;
        b bVar2 = new b("TICKER", 1);
        TICKER = bVar2;
        b bVar3 = new b("TICKER_PERIODICALLY", 2);
        TICKER_PERIODICALLY = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
