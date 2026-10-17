package pcd;

import java.util.Set;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class l0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l0[] $VALUES;

    @NotNull
    public static final k0 Companion;
    public static final l0 GROUP;
    public static final l0 MONEY_MARKET_FUND_SAVINGS;
    public static final l0 PRO_REGULAR;
    public static final l0 PRO_TAX;
    public static final l0 REGULAR;
    public static final l0 SAVINGS;
    public static final l0 SAVINGS_FIXED_TERM;
    public static final l0 UNDETERMINED;

    @NotNull
    private static final Set<l0> proVaults;

    static {
        l0 l0Var = new l0("SAVINGS", 0);
        SAVINGS = l0Var;
        l0 l0Var2 = new l0("SAVINGS_FIXED_TERM", 1);
        SAVINGS_FIXED_TERM = l0Var2;
        l0 l0Var3 = new l0("REGULAR", 2);
        REGULAR = l0Var3;
        l0 l0Var4 = new l0("GROUP", 3);
        GROUP = l0Var4;
        l0 l0Var5 = new l0("MONEY_MARKET_FUND_SAVINGS", 4);
        MONEY_MARKET_FUND_SAVINGS = l0Var5;
        l0 l0Var6 = new l0("PRO_REGULAR", 5);
        PRO_REGULAR = l0Var6;
        l0 l0Var7 = new l0("PRO_TAX", 6);
        PRO_TAX = l0Var7;
        l0 l0Var8 = new l0("UNDETERMINED", 7);
        UNDETERMINED = l0Var8;
        l0[] l0VarArr = {l0Var, l0Var2, l0Var3, l0Var4, l0Var5, l0Var6, l0Var7, l0Var8};
        $VALUES = l0VarArr;
        $ENTRIES = vc.s.n(l0VarArr);
        Companion = new k0();
        l0[] elements = {l0Var6, l0Var7};
        Intrinsics.checkNotNullParameter(elements, "elements");
        proVaults = kotlin.collections.d.y0(elements);
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) $VALUES.clone();
    }
}
