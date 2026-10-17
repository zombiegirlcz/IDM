package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class t3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t3[] $VALUES;
    public static final t3 GET_CONTRACT_SUMMARY;

    static {
        t3 t3Var = new t3("GET_CONTRACT_SUMMARY", 0);
        GET_CONTRACT_SUMMARY = t3Var;
        t3[] t3VarArr = {t3Var};
        $VALUES = t3VarArr;
        $ENTRIES = vc.s.n(t3VarArr);
    }

    public static t3 valueOf(String str) {
        return (t3) Enum.valueOf(t3.class, str);
    }

    public static t3[] values() {
        return (t3[]) $VALUES.clone();
    }
}
