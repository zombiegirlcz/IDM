package maa;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l BUSINESSES;
    public static final l INDIVIDUALS;
    public static final l NONE;

    static {
        l lVar = new l("NONE", 0);
        NONE = lVar;
        l lVar2 = new l("INDIVIDUALS", 1);
        INDIVIDUALS = lVar2;
        l lVar3 = new l("BUSINESSES", 2);
        BUSINESSES = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        $VALUES = lVarArr;
        $ENTRIES = vc.s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
