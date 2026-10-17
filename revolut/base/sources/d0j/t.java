package d0j;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t ACTIVATE_CHALLENGE;
    public static final t TAP_TO_REVEAL;
    public static final t UNKNOWN;

    static {
        t tVar = new t("TAP_TO_REVEAL", 0);
        TAP_TO_REVEAL = tVar;
        t tVar2 = new t("ACTIVATE_CHALLENGE", 1);
        ACTIVATE_CHALLENGE = tVar2;
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
