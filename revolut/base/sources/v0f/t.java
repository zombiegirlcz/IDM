package v0f;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t CARD;
    public static final t CVV;
    public static final t EXPIRE_DATE;
    public static final t NONE;
    public static final t POSTCODE;

    static {
        t tVar = new t("CARD", 0);
        CARD = tVar;
        t tVar2 = new t("EXPIRE_DATE", 1);
        EXPIRE_DATE = tVar2;
        t tVar3 = new t("CVV", 2);
        CVV = tVar3;
        t tVar4 = new t("POSTCODE", 3);
        POSTCODE = tVar4;
        t tVar5 = new t("NONE", 4);
        NONE = tVar5;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4, tVar5};
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
