package ba6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CARD_ORDERED;
    public static final b LOCKED;
    public static final b UNLOCKED;

    static {
        b bVar = new b("LOCKED", 0);
        LOCKED = bVar;
        b bVar2 = new b("UNLOCKED", 1);
        UNLOCKED = bVar2;
        b bVar3 = new b("CARD_ORDERED", 2);
        CARD_ORDERED = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
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
