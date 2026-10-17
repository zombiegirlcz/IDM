package kl7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class z1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z1[] $VALUES;
    public static final z1 DRIVING_LICENCE;
    public static final z1 NO_CLAIMS_STATEMENT;
    public static final z1 OTHER;
    public static final z1 PROOF_OF_DRIVING_EXPERIENCE;

    static {
        z1 z1Var = new z1("DRIVING_LICENCE", 0);
        DRIVING_LICENCE = z1Var;
        z1 z1Var2 = new z1("NO_CLAIMS_STATEMENT", 1);
        NO_CLAIMS_STATEMENT = z1Var2;
        z1 z1Var3 = new z1("PROOF_OF_DRIVING_EXPERIENCE", 2);
        PROOF_OF_DRIVING_EXPERIENCE = z1Var3;
        z1 z1Var4 = new z1("OTHER", 3);
        OTHER = z1Var4;
        z1[] z1VarArr = {z1Var, z1Var2, z1Var3, z1Var4};
        $VALUES = z1VarArr;
        $ENTRIES = vc.s.n(z1VarArr);
    }

    public static z1 valueOf(String str) {
        return (z1) Enum.valueOf(z1.class, str);
    }

    public static z1[] values() {
        return (z1[]) $VALUES.clone();
    }
}
