package u6c;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l JOINT;
    public static final l PERSONAL_FIAT;
    public static final l UNDEFINED;

    static {
        l lVar = new l("PERSONAL_FIAT", 0);
        PERSONAL_FIAT = lVar;
        l lVar2 = new l("JOINT", 1);
        JOINT = lVar2;
        l lVar3 = new l("UNDEFINED", 2);
        UNDEFINED = lVar3;
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
