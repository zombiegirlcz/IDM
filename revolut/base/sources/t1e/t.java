package t1e;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t GRADIENT_PURPLE;
    public static final t PLAIN;
    public static final t UNKNOWN;

    static {
        t tVar = new t("PLAIN", 0);
        PLAIN = tVar;
        t tVar2 = new t("GRADIENT_PURPLE", 1);
        GRADIENT_PURPLE = tVar2;
        t tVar3 = new t("UNKNOWN", 2);
        UNKNOWN = tVar3;
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
