package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class o1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o1[] $VALUES;
    public static final o1 DOWNLOADED;
    public static final o1 FAILED;
    public static final o1 INACTIVE;
    public static final o1 INSTALLED;
    public static final o1 ORDERED;
    public static final o1 READY;
    public static final o1 UNINSTALLED;
    public static final o1 UNKNOWN;

    static {
        o1 o1Var = new o1("ORDERED", 0);
        ORDERED = o1Var;
        o1 o1Var2 = new o1("FAILED", 1);
        FAILED = o1Var2;
        o1 o1Var3 = new o1("READY", 2);
        READY = o1Var3;
        o1 o1Var4 = new o1("DOWNLOADED", 3);
        DOWNLOADED = o1Var4;
        o1 o1Var5 = new o1("INSTALLED", 4);
        INSTALLED = o1Var5;
        o1 o1Var6 = new o1("UNINSTALLED", 5);
        UNINSTALLED = o1Var6;
        o1 o1Var7 = new o1("INACTIVE", 6);
        INACTIVE = o1Var7;
        o1 o1Var8 = new o1("UNKNOWN", 7);
        UNKNOWN = o1Var8;
        o1[] o1VarArr = {o1Var, o1Var2, o1Var3, o1Var4, o1Var5, o1Var6, o1Var7, o1Var8};
        $VALUES = o1VarArr;
        $ENTRIES = vc.s.n(o1VarArr);
    }

    public static o1 valueOf(String str) {
        return (o1) Enum.valueOf(o1.class, str);
    }

    public static o1[] values() {
        return (o1[]) $VALUES.clone();
    }
}
