package vu0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CLAIMED;
    public static final b REJECTED;
    public static final b UNDECIDED;

    static {
        b bVar = new b("UNDECIDED", 0);
        UNDECIDED = bVar;
        b bVar2 = new b("CLAIMED", 1);
        CLAIMED = bVar2;
        b bVar3 = new b("REJECTED", 2);
        REJECTED = bVar3;
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
