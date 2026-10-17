package ql4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v POST_PURCHASE;
    public static final v PRE_PURCHASE;
    public static final v STATEMENT_DEFERRAL;

    static {
        v vVar = new v("STATEMENT_DEFERRAL", 0);
        STATEMENT_DEFERRAL = vVar;
        v vVar2 = new v("POST_PURCHASE", 1);
        POST_PURCHASE = vVar2;
        v vVar3 = new v("PRE_PURCHASE", 2);
        PRE_PURCHASE = vVar3;
        v[] vVarArr = {vVar, vVar2, vVar3};
        $VALUES = vVarArr;
        $ENTRIES = vc.s.n(vVarArr);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
