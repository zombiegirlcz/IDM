package ncd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l PARTNER_BANK;
    public static final l PARTNER_FUND;
    public static final l REVOLUT;

    static {
        l lVar = new l("PARTNER_BANK", 0);
        PARTNER_BANK = lVar;
        l lVar2 = new l("PARTNER_FUND", 1);
        PARTNER_FUND = lVar2;
        l lVar3 = new l("REVOLUT", 2);
        REVOLUT = lVar3;
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
