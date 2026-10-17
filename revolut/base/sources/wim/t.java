package wim;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t IN;
    public static final t INVARIANT;
    public static final t OUT;

    static {
        t tVar = new t("INVARIANT", 0);
        INVARIANT = tVar;
        t tVar2 = new t("IN", 1);
        IN = tVar2;
        t tVar3 = new t("OUT", 2);
        OUT = tVar3;
        t[] tVarArr = {tVar, tVar2, tVar3};
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
