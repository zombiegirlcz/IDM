package q35;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class b0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 CREDIT;

    static {
        b0 b0Var = new b0("CREDIT", 0);
        CREDIT = b0Var;
        b0[] b0VarArr = {b0Var};
        $VALUES = b0VarArr;
        $ENTRIES = vc.s.n(b0VarArr);
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }
}
