package ggh;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ALL_SHARES_LOCKED;
    public static final b HARD_LOCKUP;
    public static final b SOFT_LOCKUP;
    public static final b UNLOCKED;

    static {
        b bVar = new b("UNLOCKED", 0);
        UNLOCKED = bVar;
        b bVar2 = new b("SOFT_LOCKUP", 1);
        SOFT_LOCKUP = bVar2;
        b bVar3 = new b("HARD_LOCKUP", 2);
        HARD_LOCKUP = bVar3;
        b bVar4 = new b("ALL_SHARES_LOCKED", 3);
        ALL_SHARES_LOCKED = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
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
