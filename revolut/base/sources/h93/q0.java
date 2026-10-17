package h93;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class q0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q0[] $VALUES;
    public static final q0 ANDROID_PAY;
    public static final q0 APPLE_PAY;
    public static final q0 CLICK_TO_PAY;

    @NotNull
    public static final p0 Companion;
    public static final q0 FITBIT_PAY;
    public static final q0 GARMIN_PAY;
    public static final q0 MERCHANT;
    public static final q0 REVOLUT_WALLET;
    public static final q0 SAMSUNG_PAY;
    public static final q0 UNKNOWN;

    static {
        q0 q0Var = new q0("ANDROID_PAY", 0);
        ANDROID_PAY = q0Var;
        q0 q0Var2 = new q0("APPLE_PAY", 1);
        APPLE_PAY = q0Var2;
        q0 q0Var3 = new q0("FITBIT_PAY", 2);
        FITBIT_PAY = q0Var3;
        q0 q0Var4 = new q0("GARMIN_PAY", 3);
        GARMIN_PAY = q0Var4;
        q0 q0Var5 = new q0("SAMSUNG_PAY", 4);
        SAMSUNG_PAY = q0Var5;
        q0 q0Var6 = new q0("MERCHANT", 5);
        MERCHANT = q0Var6;
        q0 q0Var7 = new q0("CLICK_TO_PAY", 6);
        CLICK_TO_PAY = q0Var7;
        q0 q0Var8 = new q0("REVOLUT_WALLET", 7);
        REVOLUT_WALLET = q0Var8;
        q0 q0Var9 = new q0("UNKNOWN", 8);
        UNKNOWN = q0Var9;
        q0[] q0VarArr = {q0Var, q0Var2, q0Var3, q0Var4, q0Var5, q0Var6, q0Var7, q0Var8, q0Var9};
        $VALUES = q0VarArr;
        $ENTRIES = vc.s.n(q0VarArr);
        Companion = new p0();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) $VALUES.clone();
    }
}
