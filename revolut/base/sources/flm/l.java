package flm;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l ALREADY_SELECTED;
    public static final l CANCELLED;
    public static final l REREGISTER;
    public static final l SUCCESSFUL;

    static {
        l lVar = new l("SUCCESSFUL", 0);
        SUCCESSFUL = lVar;
        l lVar2 = new l("REREGISTER", 1);
        REREGISTER = lVar2;
        l lVar3 = new l("CANCELLED", 2);
        CANCELLED = lVar3;
        l lVar4 = new l("ALREADY_SELECTED", 3);
        ALREADY_SELECTED = lVar4;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
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
