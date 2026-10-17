package i20;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t0[] $VALUES;
    public static final t0 BOOLEAN;
    public static final t0 BUTTON;
    public static final t0 DATE;
    public static final t0 DATE_TIME;
    public static final t0 FILE;
    public static final t0 MONEY;
    public static final t0 PHONE;
    public static final t0 TEXT;
    public static final t0 TIME;

    @NotNull
    private final String value;

    static {
        t0 t0Var = new t0("TEXT", 0, "text");
        TEXT = t0Var;
        t0 t0Var2 = new t0("FILE", 1, "file");
        FILE = t0Var2;
        t0 t0Var3 = new t0("DATE_TIME", 2, "dateTime");
        DATE_TIME = t0Var3;
        t0 t0Var4 = new t0("TIME", 3, "time");
        TIME = t0Var4;
        t0 t0Var5 = new t0("PHONE", 4, "phone");
        PHONE = t0Var5;
        t0 t0Var6 = new t0("MONEY", 5, "money");
        MONEY = t0Var6;
        t0 t0Var7 = new t0("DATE", 6, "date");
        DATE = t0Var7;
        t0 t0Var8 = new t0("BOOLEAN", 7, "boolean");
        BOOLEAN = t0Var8;
        t0 t0Var9 = new t0("BUTTON", 8, "button");
        BUTTON = t0Var9;
        t0[] t0VarArr = {t0Var, t0Var2, t0Var3, t0Var4, t0Var5, t0Var6, t0Var7, t0Var8, t0Var9};
        $VALUES = t0VarArr;
        $ENTRIES = vc.s.n(t0VarArr);
    }

    public t0(String str, int i, String str2) {
        this.value = str2;
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
