package a0j;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t CAUTIOUS;
    public static final t GOOD;
    public static final t GROWING;
    public static final t HIGH;
    public static final t LOW;
    public static final t POSITIVE;

    static {
        t tVar = new t("HIGH", 0);
        HIGH = tVar;
        t tVar2 = new t("GOOD", 1);
        GOOD = tVar2;
        t tVar3 = new t("POSITIVE", 2);
        POSITIVE = tVar3;
        t tVar4 = new t("GROWING", 3);
        GROWING = tVar4;
        t tVar5 = new t("CAUTIOUS", 4);
        CAUTIOUS = tVar5;
        t tVar6 = new t("LOW", 5);
        LOW = tVar6;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4, tVar5, tVar6};
        $VALUES = tVarArr;
        $ENTRIES = vc.s.n(tVarArr);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
