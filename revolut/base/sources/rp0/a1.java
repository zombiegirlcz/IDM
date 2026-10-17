package rp0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class a1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a1[] $VALUES;
    public static final a1 INDEFINITE;
    public static final a1 LONG;
    public static final a1 SHORT;

    static {
        a1 a1Var = new a1("SHORT", 0);
        SHORT = a1Var;
        a1 a1Var2 = new a1("LONG", 1);
        LONG = a1Var2;
        a1 a1Var3 = new a1("INDEFINITE", 2);
        INDEFINITE = a1Var3;
        a1[] a1VarArr = {a1Var, a1Var2, a1Var3};
        $VALUES = a1VarArr;
        $ENTRIES = vc.s.n(a1VarArr);
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) $VALUES.clone();
    }

    public final int a() {
        int i = z0.f256229a[ordinal()];
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return 0;
        }
        if (i == 3) {
            return -2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
