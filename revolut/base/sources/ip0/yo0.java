package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class yo0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ yo0[] $VALUES;
    public static final yo0 LOADING_FINISHED;
    public static final yo0 LOADING_STARTED;

    static {
        yo0 yo0Var = new yo0("LOADING_STARTED", 0);
        LOADING_STARTED = yo0Var;
        yo0 yo0Var2 = new yo0("LOADING_FINISHED", 1);
        LOADING_FINISHED = yo0Var2;
        yo0[] yo0VarArr = {yo0Var, yo0Var2};
        $VALUES = yo0VarArr;
        $ENTRIES = vc.s.n(yo0VarArr);
    }

    public static yo0 valueOf(String str) {
        return (yo0) Enum.valueOf(yo0.class, str);
    }

    public static yo0[] values() {
        return (yo0[]) $VALUES.clone();
    }
}
