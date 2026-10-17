package lzi;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b AFTER_WEEKEND;
    public static final b BEFORE_WEEKEND;
    public static final b EXACT;

    static {
        b bVar = new b("EXACT", 0);
        EXACT = bVar;
        b bVar2 = new b("BEFORE_WEEKEND", 1);
        BEFORE_WEEKEND = bVar2;
        b bVar3 = new b("AFTER_WEEKEND", 2);
        AFTER_WEEKEND = bVar3;
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
