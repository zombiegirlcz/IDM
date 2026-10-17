package bw0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l ACTION_ACCENT;
    public static final l ACTION_ERROR;
    public static final l ACTION_INFO;
    public static final l ERROR;
    public static final l INFO;
    public static final l LOADING;
    public static final l WARNING;

    static {
        l lVar = new l("INFO", 0);
        INFO = lVar;
        l lVar2 = new l("ERROR", 1);
        ERROR = lVar2;
        l lVar3 = new l("WARNING", 2);
        WARNING = lVar3;
        l lVar4 = new l("ACTION_ERROR", 3);
        ACTION_ERROR = lVar4;
        l lVar5 = new l("ACTION_INFO", 4);
        ACTION_INFO = lVar5;
        l lVar6 = new l("ACTION_ACCENT", 5);
        ACTION_ACCENT = lVar6;
        l lVar7 = new l("LOADING", 6);
        LOADING = lVar7;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7};
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
