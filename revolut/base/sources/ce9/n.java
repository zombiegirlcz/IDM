package ce9;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n FORCE_REFRESH;
    public static final n LOAD_NEXT_PAGE;
    public static final n REFRESH;
    public static final n RETRY_LAST_PAGE;

    static {
        n nVar = new n("REFRESH", 0);
        REFRESH = nVar;
        n nVar2 = new n("FORCE_REFRESH", 1);
        FORCE_REFRESH = nVar2;
        n nVar3 = new n("LOAD_NEXT_PAGE", 2);
        LOAD_NEXT_PAGE = nVar3;
        n nVar4 = new n("RETRY_LAST_PAGE", 3);
        RETRY_LAST_PAGE = nVar4;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4};
        $VALUES = nVarArr;
        $ENTRIES = s.n(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
