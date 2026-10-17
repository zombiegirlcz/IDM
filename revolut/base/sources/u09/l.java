package u09;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l AVAILABLE;
    public static final l LOCKED;
    public static final l PROGRESS;

    static {
        l lVar = new l("AVAILABLE", 0);
        AVAILABLE = lVar;
        l lVar2 = new l("LOCKED", 1);
        LOCKED = lVar2;
        l lVar3 = new l("PROGRESS", 2);
        PROGRESS = lVar3;
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
