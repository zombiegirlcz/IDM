package fa;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l COMPLETED;
    public static final l IN_REVIEW;
    public static final l PENDING;

    static {
        l lVar = new l("PENDING", 0);
        PENDING = lVar;
        l lVar2 = new l("COMPLETED", 1);
        COMPLETED = lVar2;
        l lVar3 = new l("IN_REVIEW", 2);
        IN_REVIEW = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        $VALUES = lVarArr;
        $ENTRIES = s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
