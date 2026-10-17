package ou3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l COMPLETED;
    public static final l IN_PROGRESS;
    public static final l TO_DO;

    static {
        l lVar = new l("COMPLETED", 0);
        COMPLETED = lVar;
        l lVar2 = new l("IN_PROGRESS", 1);
        IN_PROGRESS = lVar2;
        l lVar3 = new l("TO_DO", 2);
        TO_DO = lVar3;
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
