package wf0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class k0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k0[] $VALUES;
    public static final k0 Lightened;
    public static final k0 Pigeon;

    static {
        k0 k0Var = new k0("Lightened", 0);
        Lightened = k0Var;
        k0 k0Var2 = new k0("Pigeon", 1);
        Pigeon = k0Var2;
        k0[] k0VarArr = {k0Var, k0Var2};
        $VALUES = k0VarArr;
        $ENTRIES = vc.s.n(k0VarArr);
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }
}
