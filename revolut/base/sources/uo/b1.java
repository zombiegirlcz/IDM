package uo;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class b1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b1[] $VALUES;

    @NotNull
    public static final a1 Companion;
    public static final b1 STARTUP_STATE_ERROR;
    public static final b1 STARTUP_STATE_FIRST_FRAME_DRAWN;
    public static final b1 STARTUP_STATE_STARTED;

    @NotNull
    private final String stringName;

    static {
        b1 b1Var = new b1("STARTUP_STATE_ERROR", 0, "ERROR");
        STARTUP_STATE_ERROR = b1Var;
        b1 b1Var2 = new b1("STARTUP_STATE_FIRST_FRAME_DRAWN", 1, "FIRST_FRAME_DRAWN");
        STARTUP_STATE_FIRST_FRAME_DRAWN = b1Var2;
        b1 b1Var3 = new b1("STARTUP_STATE_STARTED", 2, "STARTED");
        STARTUP_STATE_STARTED = b1Var3;
        b1[] b1VarArr = {b1Var, b1Var2, b1Var3};
        $VALUES = b1VarArr;
        $ENTRIES = vc.s.n(b1VarArr);
        Companion = new a1();
    }

    public b1(String str, int i, String str2) {
        this.stringName = str2;
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) $VALUES.clone();
    }

    public final String a() {
        return this.stringName;
    }
}
