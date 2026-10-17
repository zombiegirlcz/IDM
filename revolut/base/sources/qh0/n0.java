package qh0;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class n0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final m0 Companion;
    public static final n0 DISCOURAGED;
    public static final n0 PREFERRED;
    public static final n0 REQUIRED;

    static {
        n0 n0Var = new n0("DISCOURAGED", 0);
        DISCOURAGED = n0Var;
        n0 n0Var2 = new n0("PREFERRED", 1);
        PREFERRED = n0Var2;
        n0 n0Var3 = new n0("REQUIRED", 2);
        REQUIRED = n0Var3;
        n0[] n0VarArr = {n0Var, n0Var2, n0Var3};
        $VALUES = n0VarArr;
        $ENTRIES = vc.s.n(n0VarArr);
        Companion = new m0();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new d(9));
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }
}
