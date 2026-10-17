package uo;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class e0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;

    @NotNull
    public static final d0 Companion;
    public static final e0 REASON_ANR;
    public static final e0 REASON_CRASH;
    public static final e0 REASON_CRASH_NATIVE;
    public static final e0 REASON_DEPENDENCY_DIED;
    public static final e0 REASON_EXCESSIVE_RESOURCE_USAGE;
    public static final e0 REASON_EXIT_SELF;
    public static final e0 REASON_FREEZER;
    public static final e0 REASON_INITIALIZATION_FAILURE;
    public static final e0 REASON_LOW_MEMORY;
    public static final e0 REASON_OTHER;
    public static final e0 REASON_PACKAGE_STATE_CHANGE;
    public static final e0 REASON_PACKAGE_UPDATED;
    public static final e0 REASON_PERMISSION_CHANGE;
    public static final e0 REASON_SIGNALED;
    public static final e0 REASON_UNKNOWN;
    public static final e0 REASON_USER_REQUESTED;
    public static final e0 REASON_USER_STOPPED;

    @NotNull
    private final String stringName;

    static {
        e0 e0Var = new e0("REASON_ANR", 0, "ANR");
        REASON_ANR = e0Var;
        e0 e0Var2 = new e0("REASON_CRASH", 1, "CRASH");
        REASON_CRASH = e0Var2;
        e0 e0Var3 = new e0("REASON_CRASH_NATIVE", 2, "CRASH_NATIVE");
        REASON_CRASH_NATIVE = e0Var3;
        e0 e0Var4 = new e0("REASON_DEPENDENCY_DIED", 3, "DEPENDENCY_DIED");
        REASON_DEPENDENCY_DIED = e0Var4;
        e0 e0Var5 = new e0("REASON_EXCESSIVE_RESOURCE_USAGE", 4, "EXCESSIVE_RESOURCE_USAGE");
        REASON_EXCESSIVE_RESOURCE_USAGE = e0Var5;
        e0 e0Var6 = new e0("REASON_EXIT_SELF", 5, "EXIT_SELF");
        REASON_EXIT_SELF = e0Var6;
        e0 e0Var7 = new e0("REASON_FREEZER", 6, "FREEZER");
        REASON_FREEZER = e0Var7;
        e0 e0Var8 = new e0("REASON_INITIALIZATION_FAILURE", 7, "INITIALIZATION_FAILURE");
        REASON_INITIALIZATION_FAILURE = e0Var8;
        e0 e0Var9 = new e0("REASON_LOW_MEMORY", 8, "LOW_MEMORY");
        REASON_LOW_MEMORY = e0Var9;
        e0 e0Var10 = new e0("REASON_OTHER", 9, "OTHER");
        REASON_OTHER = e0Var10;
        e0 e0Var11 = new e0("REASON_PACKAGE_STATE_CHANGE", 10, "PACKAGE_STATE_CHANGE");
        REASON_PACKAGE_STATE_CHANGE = e0Var11;
        e0 e0Var12 = new e0("REASON_PACKAGE_UPDATED", 11, "PACKAGE_UPDATED");
        REASON_PACKAGE_UPDATED = e0Var12;
        e0 e0Var13 = new e0("REASON_PERMISSION_CHANGE", 12, "PERMISSION_CHANGE");
        REASON_PERMISSION_CHANGE = e0Var13;
        e0 e0Var14 = new e0("REASON_SIGNALED", 13, "SIGNALED");
        REASON_SIGNALED = e0Var14;
        e0 e0Var15 = new e0("REASON_UNKNOWN", 14, "UNKNOWN");
        REASON_UNKNOWN = e0Var15;
        e0 e0Var16 = new e0("REASON_USER_REQUESTED", 15, "USER_REQUESTED");
        REASON_USER_REQUESTED = e0Var16;
        e0 e0Var17 = new e0("REASON_USER_STOPPED", 16, "USER_STOPPED");
        REASON_USER_STOPPED = e0Var17;
        e0[] e0VarArr = {e0Var, e0Var2, e0Var3, e0Var4, e0Var5, e0Var6, e0Var7, e0Var8, e0Var9, e0Var10, e0Var11, e0Var12, e0Var13, e0Var14, e0Var15, e0Var16, e0Var17};
        $VALUES = e0VarArr;
        $ENTRIES = vc.s.n(e0VarArr);
        Companion = new d0();
    }

    public e0(String str, int i, String str2) {
        this.stringName = str2;
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }

    public final String a() {
        return this.stringName;
    }
}
