package h93;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class l0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l0[] $VALUES;
    public static final l0 BRAZIL_GLOBAL;
    public static final l0 BRAZIL_LOCAL;
    public static final l0 CREDIT;
    public static final l0 CRYPTO;

    @NotNull
    public static final k0 Companion;
    public static final l0 DEBIT;
    public static final l0 INDIA_GLOBAL;
    public static final l0 INDIA_LOCAL;
    public static final l0 INSTALMENT;
    public static final l0 MEXICO_MCY;
    public static final l0 UNKNOWN;
    public static final l0 US_SECURED_CREDIT;

    static {
        l0 l0Var = new l0("BRAZIL_LOCAL", 0);
        BRAZIL_LOCAL = l0Var;
        l0 l0Var2 = new l0("BRAZIL_GLOBAL", 1);
        BRAZIL_GLOBAL = l0Var2;
        l0 l0Var3 = new l0("INDIA_LOCAL", 2);
        INDIA_LOCAL = l0Var3;
        l0 l0Var4 = new l0("INDIA_GLOBAL", 3);
        INDIA_GLOBAL = l0Var4;
        l0 l0Var5 = new l0("MEXICO_MCY", 4);
        MEXICO_MCY = l0Var5;
        l0 l0Var6 = new l0("DEBIT", 5);
        DEBIT = l0Var6;
        l0 l0Var7 = new l0("CREDIT", 6);
        CREDIT = l0Var7;
        l0 l0Var8 = new l0("INSTALMENT", 7);
        INSTALMENT = l0Var8;
        l0 l0Var9 = new l0("CRYPTO", 8);
        CRYPTO = l0Var9;
        l0 l0Var10 = new l0("US_SECURED_CREDIT", 9);
        US_SECURED_CREDIT = l0Var10;
        l0 l0Var11 = new l0("UNKNOWN", 10);
        UNKNOWN = l0Var11;
        l0[] l0VarArr = {l0Var, l0Var2, l0Var3, l0Var4, l0Var5, l0Var6, l0Var7, l0Var8, l0Var9, l0Var10, l0Var11};
        $VALUES = l0VarArr;
        $ENTRIES = vc.s.n(l0VarArr);
        Companion = new k0();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) $VALUES.clone();
    }
}
