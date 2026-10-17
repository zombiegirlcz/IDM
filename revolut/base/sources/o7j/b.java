package o7j;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b IDLE;
    public static final b PRICE_CLOSE;
    public static final b PRICE_SHOULD_BE_HIGHER;
    public static final b PRICE_SHOULD_BE_LOWER;

    static {
        b bVar = new b("PRICE_CLOSE", 0);
        PRICE_CLOSE = bVar;
        b bVar2 = new b("PRICE_SHOULD_BE_LOWER", 1);
        PRICE_SHOULD_BE_LOWER = bVar2;
        b bVar3 = new b("PRICE_SHOULD_BE_HIGHER", 2);
        PRICE_SHOULD_BE_HIGHER = bVar3;
        b bVar4 = new b("IDLE", 3);
        IDLE = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
