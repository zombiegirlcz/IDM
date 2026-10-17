package ql4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t ACTIVE;
    public static final t CANCELLED;
    public static final t SETTLED;
    public static final t UNKNOWN;

    static {
        t tVar = new t("ACTIVE", 0);
        ACTIVE = tVar;
        t tVar2 = new t("CANCELLED", 1);
        CANCELLED = tVar2;
        t tVar3 = new t("SETTLED", 2);
        SETTLED = tVar3;
        t tVar4 = new t("UNKNOWN", 3);
        UNKNOWN = tVar4;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4};
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
