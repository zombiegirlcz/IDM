package tof;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class v5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v5[] $VALUES;
    public static final v5 AANI;
    public static final v5 BLIK_P2P;
    public static final v5 GIRO_ALIAS;
    public static final v5 NZ_BILLS;
    public static final v5 PIX_CHANGE;
    public static final v5 PIX_WITHDRAW;
    public static final v5 WERO;

    @NotNull
    private final String value;

    static {
        v5 v5Var = new v5("BLIK_P2P", 0, "BLIK_P2P");
        BLIK_P2P = v5Var;
        v5 v5Var2 = new v5("GIRO_ALIAS", 1, "GIRO_ALIAS");
        GIRO_ALIAS = v5Var2;
        v5 v5Var3 = new v5("WERO", 2, "WERO");
        WERO = v5Var3;
        v5 v5Var4 = new v5("PIX_CHANGE", 3, "PIX_CHANGE");
        PIX_CHANGE = v5Var4;
        v5 v5Var5 = new v5("PIX_WITHDRAW", 4, "PIX_WITHDRAW");
        PIX_WITHDRAW = v5Var5;
        v5 v5Var6 = new v5("NZ_BILLS", 5, "NZ_BILLS");
        NZ_BILLS = v5Var6;
        v5 v5Var7 = new v5("AANI", 6, "AANI");
        AANI = v5Var7;
        v5[] v5VarArr = {v5Var, v5Var2, v5Var3, v5Var4, v5Var5, v5Var6, v5Var7};
        $VALUES = v5VarArr;
        $ENTRIES = vc.s.n(v5VarArr);
    }

    public v5(String str, int i, String str2) {
        this.value = str2;
    }

    public static v5 valueOf(String str) {
        return (v5) Enum.valueOf(v5.class, str);
    }

    public static v5[] values() {
        return (v5[]) $VALUES.clone();
    }
}
