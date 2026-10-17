package uo;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class g0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;

    @NotNull
    public static final f0 Companion;
    public static final g0 LAUNCH_MODE_SINGLE_INSTANCE;
    public static final g0 LAUNCH_MODE_SINGLE_INSTANCE_PER_TASK;
    public static final g0 LAUNCH_MODE_SINGLE_TASK;
    public static final g0 LAUNCH_MODE_SINGLE_TOP;
    public static final g0 LAUNCH_MODE_STANDARD;

    @NotNull
    private final String stringName;

    static {
        g0 g0Var = new g0("LAUNCH_MODE_SINGLE_INSTANCE", 0, "SINGLE_INSTANCE");
        LAUNCH_MODE_SINGLE_INSTANCE = g0Var;
        g0 g0Var2 = new g0("LAUNCH_MODE_SINGLE_INSTANCE_PER_TASK", 1, "SINGLE_INSTANCE_PER_TASK");
        LAUNCH_MODE_SINGLE_INSTANCE_PER_TASK = g0Var2;
        g0 g0Var3 = new g0("LAUNCH_MODE_SINGLE_TASK", 2, "SINGLE_TASK");
        LAUNCH_MODE_SINGLE_TASK = g0Var3;
        g0 g0Var4 = new g0("LAUNCH_MODE_SINGLE_TOP", 3, "SINGLE_TOP");
        LAUNCH_MODE_SINGLE_TOP = g0Var4;
        g0 g0Var5 = new g0("LAUNCH_MODE_STANDARD", 4, "STANDARD");
        LAUNCH_MODE_STANDARD = g0Var5;
        g0[] g0VarArr = {g0Var, g0Var2, g0Var3, g0Var4, g0Var5};
        $VALUES = g0VarArr;
        $ENTRIES = vc.s.n(g0VarArr);
        Companion = new f0();
    }

    public g0(String str, int i, String str2) {
        this.stringName = str2;
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }

    public final String a() {
        return this.stringName;
    }
}
