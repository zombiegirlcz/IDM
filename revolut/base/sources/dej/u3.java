package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class u3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u3[] $VALUES;
    public static final u3 CONNECTIVITY;
    public static final u3 INSTALLATION;

    static {
        u3 u3Var = new u3("INSTALLATION", 0);
        INSTALLATION = u3Var;
        u3 u3Var2 = new u3("CONNECTIVITY", 1);
        CONNECTIVITY = u3Var2;
        u3[] u3VarArr = {u3Var, u3Var2};
        $VALUES = u3VarArr;
        $ENTRIES = vc.s.n(u3VarArr);
    }

    public static u3 valueOf(String str) {
        return (u3) Enum.valueOf(u3.class, str);
    }

    public static u3[] values() {
        return (u3[]) $VALUES.clone();
    }
}
