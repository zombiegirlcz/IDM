package xu3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class o0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o0[] $VALUES;
    public static final o0 CO_APPLICANT;
    public static final o0 JOINT_APPLICANTS;
    public static final o0 MAIN_APPLICANT;

    static {
        o0 o0Var = new o0("MAIN_APPLICANT", 0);
        MAIN_APPLICANT = o0Var;
        o0 o0Var2 = new o0("CO_APPLICANT", 1);
        CO_APPLICANT = o0Var2;
        o0 o0Var3 = new o0("JOINT_APPLICANTS", 2);
        JOINT_APPLICANTS = o0Var3;
        o0[] o0VarArr = {o0Var, o0Var2, o0Var3};
        $VALUES = o0VarArr;
        $ENTRIES = vc.s.n(o0VarArr);
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) $VALUES.clone();
    }
}
