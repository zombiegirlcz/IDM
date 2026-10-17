package kl7;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b2[] $VALUES;
    public static final b2 IN_REVIEW;
    public static final b2 PENDING;
    public static final b2 REJECTED;
    public static final b2 VALIDATED;

    static {
        b2 b2Var = new b2("PENDING", 0);
        PENDING = b2Var;
        b2 b2Var2 = new b2("IN_REVIEW", 1);
        IN_REVIEW = b2Var2;
        b2 b2Var3 = new b2("VALIDATED", 2);
        VALIDATED = b2Var3;
        b2 b2Var4 = new b2("REJECTED", 3);
        REJECTED = b2Var4;
        b2[] b2VarArr = {b2Var, b2Var2, b2Var3, b2Var4};
        $VALUES = b2VarArr;
        $ENTRIES = vc.s.n(b2VarArr);
    }

    public static b2 valueOf(String str) {
        return (b2) Enum.valueOf(b2.class, str);
    }

    public static b2[] values() {
        return (b2[]) $VALUES.clone();
    }

    public final boolean a() {
        int i = a2.f185291a[ordinal()];
        if (i == 1 || i == 2) {
            return false;
        }
        if (i == 3 || i == 4) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
