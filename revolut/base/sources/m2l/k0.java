package m2l;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class k0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k0[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final k0 BUY;

    @NotNull
    public static final j0 Companion;
    public static final k0 HOLD;
    public static final k0 SELL;
    public static final k0 STRONG_BUY;
    public static final k0 STRONG_SELL;

    static {
        k0 k0Var = new k0("STRONG_BUY", 0);
        STRONG_BUY = k0Var;
        k0 k0Var2 = new k0("BUY", 1);
        BUY = k0Var2;
        k0 k0Var3 = new k0("HOLD", 2);
        HOLD = k0Var3;
        k0 k0Var4 = new k0("SELL", 3);
        SELL = k0Var4;
        k0 k0Var5 = new k0("STRONG_SELL", 4);
        STRONG_SELL = k0Var5;
        k0[] k0VarArr = {k0Var, k0Var2, k0Var3, k0Var4, k0Var5};
        $VALUES = k0VarArr;
        $ENTRIES = vc.s.n(k0VarArr);
        Companion = new j0();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new m05.d(28));
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }
}
