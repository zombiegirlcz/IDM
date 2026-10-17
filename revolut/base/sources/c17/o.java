package c17;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o E_COMMERCE;
    public static final o ONBOARDING;
    public static final o SETTINGS;

    static {
        o oVar = new o("E_COMMERCE", 0);
        E_COMMERCE = oVar;
        o oVar2 = new o("ONBOARDING", 1);
        ONBOARDING = oVar2;
        o oVar3 = new o("SETTINGS", 2);
        SETTINGS = oVar3;
        o[] oVarArr = {oVar, oVar2, oVar3};
        $VALUES = oVarArr;
        $ENTRIES = vc.s.n(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
