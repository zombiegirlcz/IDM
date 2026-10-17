package f5j;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l BENEFICIARY;
    public static final l CHAT;
    public static final l INTERNATIONAL_BENEFICIARY;

    static {
        l lVar = new l("BENEFICIARY", 0);
        BENEFICIARY = lVar;
        l lVar2 = new l("INTERNATIONAL_BENEFICIARY", 1);
        INTERNATIONAL_BENEFICIARY = lVar2;
        l lVar3 = new l("CHAT", 2);
        CHAT = lVar3;
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
