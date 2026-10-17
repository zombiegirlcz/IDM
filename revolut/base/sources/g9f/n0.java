package g9f;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class n0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final n0 ACAT_FULL;
    public static final n0 ACAT_PARTIAL;

    @NotNull
    public static final m0 Companion;
    public static final n0 DRS;
    public static final n0 DTC;
    public static final n0 FOP;
    public static final n0 ISA;
    public static final n0 UNKNOWN;

    static {
        n0 n0Var = new n0("ACAT_FULL", 0);
        ACAT_FULL = n0Var;
        n0 n0Var2 = new n0("ACAT_PARTIAL", 1);
        ACAT_PARTIAL = n0Var2;
        n0 n0Var3 = new n0("DRS", 2);
        DRS = n0Var3;
        n0 n0Var4 = new n0("DTC", 3);
        DTC = n0Var4;
        n0 n0Var5 = new n0("ISA", 4);
        ISA = n0Var5;
        n0 n0Var6 = new n0("FOP", 5);
        FOP = n0Var6;
        n0 n0Var7 = new n0("UNKNOWN", 6);
        UNKNOWN = n0Var7;
        n0[] n0VarArr = {n0Var, n0Var2, n0Var3, n0Var4, n0Var5, n0Var6, n0Var7};
        $VALUES = n0VarArr;
        $ENTRIES = vc.s.n(n0VarArr);
        Companion = new m0();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new g53.e(28));
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }
}
