package i20;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 CALL;
    public static final h0 IN_APP_CALL;
    public static final h0 MASS;
    public static final h0 MESSAGE;
    public static final h0 NOTE;
    public static final h0 SERVICE;
    public static final h0 UNKNOWN;
    public static final h0 VOICE;

    @NotNull
    private final String serializedName;

    static {
        h0 h0Var = new h0("MESSAGE", 0, "message");
        MESSAGE = h0Var;
        h0 h0Var2 = new h0("VOICE", 1, "voice");
        VOICE = h0Var2;
        h0 h0Var3 = new h0("NOTE", 2, "note");
        NOTE = h0Var3;
        h0 h0Var4 = new h0("SERVICE", 3, "service");
        SERVICE = h0Var4;
        h0 h0Var5 = new h0("MASS", 4, "mass");
        MASS = h0Var5;
        h0 h0Var6 = new h0("IN_APP_CALL", 5, "inappcall");
        IN_APP_CALL = h0Var6;
        h0 h0Var7 = new h0("CALL", 6, "call");
        CALL = h0Var7;
        h0 h0Var8 = new h0("UNKNOWN", 7, "unknown");
        UNKNOWN = h0Var8;
        h0[] h0VarArr = {h0Var, h0Var2, h0Var3, h0Var4, h0Var5, h0Var6, h0Var7, h0Var8};
        $VALUES = h0VarArr;
        $ENTRIES = vc.s.n(h0VarArr);
    }

    public h0(String str, int i, String str2) {
        this.serializedName = str2;
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }

    public final String a() {
        return this.serializedName;
    }
}
