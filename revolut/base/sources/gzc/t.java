package gzc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t APPROVED;
    public static final t REJECTED;
    public static final t UNDER_REVIEW;
    public static final t UNKNOWN;
    public static final t UPDATE_REQUIRED;
    public static final t UPLOADED;

    static {
        t tVar = new t("UPLOADED", 0);
        UPLOADED = tVar;
        t tVar2 = new t("UNDER_REVIEW", 1);
        UNDER_REVIEW = tVar2;
        t tVar3 = new t("UPDATE_REQUIRED", 2);
        UPDATE_REQUIRED = tVar3;
        t tVar4 = new t("APPROVED", 3);
        APPROVED = tVar4;
        t tVar5 = new t("REJECTED", 4);
        REJECTED = tVar5;
        t tVar6 = new t("UNKNOWN", 5);
        UNKNOWN = tVar6;
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
