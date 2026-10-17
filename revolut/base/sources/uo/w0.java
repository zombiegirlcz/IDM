package uo;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class w0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w0[] $VALUES;

    @NotNull
    public static final v0 Companion;
    public static final w0 START_REASON_ALARM;
    public static final w0 START_REASON_BACKUP;
    public static final w0 START_REASON_BOOT_COMPLETE;
    public static final w0 START_REASON_BROADCAST;
    public static final w0 START_REASON_CONTENT_PROVIDER;
    public static final w0 START_REASON_JOB;
    public static final w0 START_REASON_LAUNCHER;
    public static final w0 START_REASON_LAUNCHER_RECENTS;
    public static final w0 START_REASON_OTHER;
    public static final w0 START_REASON_PUSH;
    public static final w0 START_REASON_SERVICE;
    public static final w0 START_REASON_START_ACTIVITY;

    @NotNull
    private final String stringName;

    static {
        w0 w0Var = new w0("START_REASON_ALARM", 0, "ALARM");
        START_REASON_ALARM = w0Var;
        w0 w0Var2 = new w0("START_REASON_BACKUP", 1, "BACKUP");
        START_REASON_BACKUP = w0Var2;
        w0 w0Var3 = new w0("START_REASON_BOOT_COMPLETE", 2, "BOOT_COMPLETE");
        START_REASON_BOOT_COMPLETE = w0Var3;
        w0 w0Var4 = new w0("START_REASON_BROADCAST", 3, "BROADCAST");
        START_REASON_BROADCAST = w0Var4;
        w0 w0Var5 = new w0("START_REASON_CONTENT_PROVIDER", 4, "CONTENT_PROVIDER");
        START_REASON_CONTENT_PROVIDER = w0Var5;
        w0 w0Var6 = new w0("START_REASON_JOB", 5, "JOB");
        START_REASON_JOB = w0Var6;
        w0 w0Var7 = new w0("START_REASON_LAUNCHER", 6, "LAUNCHER");
        START_REASON_LAUNCHER = w0Var7;
        w0 w0Var8 = new w0("START_REASON_LAUNCHER_RECENTS", 7, "LAUNCHER_RECENTS");
        START_REASON_LAUNCHER_RECENTS = w0Var8;
        w0 w0Var9 = new w0("START_REASON_OTHER", 8, "OTHER");
        START_REASON_OTHER = w0Var9;
        w0 w0Var10 = new w0("START_REASON_PUSH", 9, "PUSH");
        START_REASON_PUSH = w0Var10;
        w0 w0Var11 = new w0("START_REASON_SERVICE", 10, "SERVICE");
        START_REASON_SERVICE = w0Var11;
        w0 w0Var12 = new w0("START_REASON_START_ACTIVITY", 11, "START_ACTIVITY");
        START_REASON_START_ACTIVITY = w0Var12;
        w0[] w0VarArr = {w0Var, w0Var2, w0Var3, w0Var4, w0Var5, w0Var6, w0Var7, w0Var8, w0Var9, w0Var10, w0Var11, w0Var12};
        $VALUES = w0VarArr;
        $ENTRIES = vc.s.n(w0VarArr);
        Companion = new v0();
    }

    public w0(String str, int i, String str2) {
        this.stringName = str2;
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) $VALUES.clone();
    }

    public final String a() {
        return this.stringName;
    }
}
