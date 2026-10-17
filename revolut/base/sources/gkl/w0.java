package gkl;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class w0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w0[] $VALUES;
    public static final w0 ADDRESS;
    public static final w0 BIRTHDATE;
    public static final w0 CITIZENSHIP;
    public static final w0 EMAIL;
    public static final w0 NAME;
    public static final w0 OPENID;
    public static final w0 PHONE;
    public static final w0 PROFILE;

    static {
        w0 w0Var = new w0("ADDRESS", 0);
        ADDRESS = w0Var;
        w0 w0Var2 = new w0("BIRTHDATE", 1);
        BIRTHDATE = w0Var2;
        w0 w0Var3 = new w0("CITIZENSHIP", 2);
        CITIZENSHIP = w0Var3;
        w0 w0Var4 = new w0("EMAIL", 3);
        EMAIL = w0Var4;
        w0 w0Var5 = new w0("NAME", 4);
        NAME = w0Var5;
        w0 w0Var6 = new w0("OPENID", 5);
        OPENID = w0Var6;
        w0 w0Var7 = new w0("PHONE", 6);
        PHONE = w0Var7;
        w0 w0Var8 = new w0("PROFILE", 7);
        PROFILE = w0Var8;
        w0[] w0VarArr = {w0Var, w0Var2, w0Var3, w0Var4, w0Var5, w0Var6, w0Var7, w0Var8};
        $VALUES = w0VarArr;
        $ENTRIES = vc.s.n(w0VarArr);
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) $VALUES.clone();
    }
}
