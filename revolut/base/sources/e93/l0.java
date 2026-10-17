package e93;

import java.io.Serializable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class l0 implements Serializable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l0[] $VALUES;
    public static final l0 CRYPTO;
    public static final l0 DEFAULT;

    static {
        l0 l0Var = new l0("DEFAULT", 0);
        DEFAULT = l0Var;
        l0 l0Var2 = new l0("CRYPTO", 1);
        CRYPTO = l0Var2;
        l0[] l0VarArr = {l0Var, l0Var2};
        $VALUES = l0VarArr;
        $ENTRIES = vc.s.n(l0VarArr);
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) $VALUES.clone();
    }
}
