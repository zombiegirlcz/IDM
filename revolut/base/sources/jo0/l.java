package jo0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l BUSINESS_V2;
    public static final l INVEST;
    public static final l V1;
    public static final l V2;

    static {
        l lVar = new l("V1", 0);
        V1 = lVar;
        l lVar2 = new l("V2", 1);
        V2 = lVar2;
        l lVar3 = new l("INVEST", 2);
        INVEST = lVar3;
        l lVar4 = new l("BUSINESS_V2", 3);
        BUSINESS_V2 = lVar4;
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
