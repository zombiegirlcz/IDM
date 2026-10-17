package uyl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l CARD;
    public static final l CVV;
    public static final l EXPIRE_DATE;
    public static final l NONE;
    public static final l POSTCODE;

    static {
        l lVar = new l("CARD", 0);
        CARD = lVar;
        l lVar2 = new l("EXPIRE_DATE", 1);
        EXPIRE_DATE = lVar2;
        l lVar3 = new l("CVV", 2);
        CVV = lVar3;
        l lVar4 = new l("POSTCODE", 3);
        POSTCODE = lVar4;
        l lVar5 = new l("NONE", 4);
        NONE = lVar5;
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
