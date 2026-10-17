package h93;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class e0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 ANDROID_PAY;
    public static final e0 APPLE_PAY;
    public static final e0 CLICK_TO_PAY;

    @NotNull
    public static final d0 Companion;

    @NotNull
    private final String value;

    static {
        e0 e0Var = new e0("ANDROID_PAY", 0, "ANDROID_PAY");
        ANDROID_PAY = e0Var;
        e0 e0Var2 = new e0("APPLE_PAY", 1, "APPLE_PAY");
        APPLE_PAY = e0Var2;
        e0 e0Var3 = new e0("CLICK_TO_PAY", 2, "CLICK_TO_PAY");
        CLICK_TO_PAY = e0Var3;
        e0[] e0VarArr = {e0Var, e0Var2, e0Var3};
        $VALUES = e0VarArr;
        $ENTRIES = vc.s.n(e0VarArr);
        Companion = new d0();
    }

    public e0(String str, int i, String str2) {
        this.value = str2;
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
