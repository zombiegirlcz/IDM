package jz8;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class b1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b1[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final a1 Companion;
    public static final b1 NO_REWARD;
    public static final b1 TO_INVEST_ACCOUNT;
    public static final b1 TO_POCKET;

    static {
        b1 b1Var = new b1("TO_POCKET", 0);
        TO_POCKET = b1Var;
        b1 b1Var2 = new b1("TO_INVEST_ACCOUNT", 1);
        TO_INVEST_ACCOUNT = b1Var2;
        b1 b1Var3 = new b1("NO_REWARD", 2);
        NO_REWARD = b1Var3;
        b1[] b1VarArr = {b1Var, b1Var2, b1Var3};
        $VALUES = b1VarArr;
        $ENTRIES = vc.s.n(b1VarArr);
        Companion = new a1();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new jxi.a(25));
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) $VALUES.clone();
    }
}
