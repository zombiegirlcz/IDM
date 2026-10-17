package fmg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 ACHROMATIC;
    public static final a0 ALERT;
    public static final a0 NEW;
    public static final a0 NEW_AVATAR;

    static {
        a0 a0Var = new a0("NEW", 0);
        NEW = a0Var;
        a0 a0Var2 = new a0("ALERT", 1);
        ALERT = a0Var2;
        a0 a0Var3 = new a0("NEW_AVATAR", 2);
        NEW_AVATAR = a0Var3;
        a0 a0Var4 = new a0("ACHROMATIC", 3);
        ACHROMATIC = a0Var4;
        a0[] a0VarArr = {a0Var, a0Var2, a0Var3, a0Var4};
        $VALUES = a0VarArr;
        $ENTRIES = vc.s.n(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }
}
