package my8;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t CANCEL;
    public static final t ERROR;
    public static final t SKIP;
    public static final t SUCCESS;

    static {
        t tVar = new t("CANCEL", 0);
        CANCEL = tVar;
        t tVar2 = new t("ERROR", 1);
        ERROR = tVar2;
        t tVar3 = new t("SUCCESS", 2);
        SUCCESS = tVar3;
        t tVar4 = new t("SKIP", 3);
        SKIP = tVar4;
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
