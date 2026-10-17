package h93;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t APPROVED;
    public static final t IN_REVIEW;
    public static final t REJECTED;

    static {
        t tVar = new t("IN_REVIEW", 0);
        IN_REVIEW = tVar;
        t tVar2 = new t("APPROVED", 1);
        APPROVED = tVar2;
        t tVar3 = new t("REJECTED", 2);
        REJECTED = tVar3;
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
