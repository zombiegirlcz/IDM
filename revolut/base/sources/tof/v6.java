package tof;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class v6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v6[] $VALUES;
    public static final v6 CANCELLED;
    public static final v6 COMPLETED;
    public static final v6 CREATED;

    @NotNull
    public static final u6 Companion;
    public static final v6 DECLINED;
    public static final v6 FAILED;
    public static final v6 PENDING;
    public static final v6 RECORDED;
    public static final v6 REVERTED;
    public static final v6 UNKNOWN;

    static {
        v6 v6Var = new v6("PENDING", 0);
        PENDING = v6Var;
        v6 v6Var2 = new v6("COMPLETED", 1);
        COMPLETED = v6Var2;
        v6 v6Var3 = new v6("REVERTED", 2);
        REVERTED = v6Var3;
        v6 v6Var4 = new v6("DECLINED", 3);
        DECLINED = v6Var4;
        v6 v6Var5 = new v6("CANCELLED", 4);
        CANCELLED = v6Var5;
        v6 v6Var6 = new v6("FAILED", 5);
        FAILED = v6Var6;
        v6 v6Var7 = new v6("RECORDED", 6);
        RECORDED = v6Var7;
        v6 v6Var8 = new v6("CREATED", 7);
        CREATED = v6Var8;
        v6 v6Var9 = new v6("UNKNOWN", 8);
        UNKNOWN = v6Var9;
        v6[] v6VarArr = {v6Var, v6Var2, v6Var3, v6Var4, v6Var5, v6Var6, v6Var7, v6Var8, v6Var9};
        $VALUES = v6VarArr;
        $ENTRIES = vc.s.n(v6VarArr);
        Companion = new u6();
    }

    public static v6 valueOf(String str) {
        return (v6) Enum.valueOf(v6.class, str);
    }

    public static v6[] values() {
        return (v6[]) $VALUES.clone();
    }
}
