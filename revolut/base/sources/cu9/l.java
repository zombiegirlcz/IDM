package cu9;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l ACCEPT;
    public static final l CANCEL;
    public static final l DECLINE;
    public static final l REMIND;
    public static final l REVIEW;

    static {
        l lVar = new l("ACCEPT", 0);
        ACCEPT = lVar;
        l lVar2 = new l("DECLINE", 1);
        DECLINE = lVar2;
        l lVar3 = new l("CANCEL", 2);
        CANCEL = lVar3;
        l lVar4 = new l("REMIND", 3);
        REMIND = lVar4;
        l lVar5 = new l("REVIEW", 4);
        REVIEW = lVar5;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5};
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
