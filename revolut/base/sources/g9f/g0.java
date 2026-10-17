package g9f;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class g0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final g0 CANCELLED;
    public static final g0 COMPLETED;
    public static final g0 CREATED;

    @NotNull
    public static final f0 Companion;
    public static final g0 FAILED;
    public static final g0 SUBMITTED;
    public static final g0 UNKNOWN;

    static {
        g0 g0Var = new g0("CREATED", 0);
        CREATED = g0Var;
        g0 g0Var2 = new g0("SUBMITTED", 1);
        SUBMITTED = g0Var2;
        g0 g0Var3 = new g0("COMPLETED", 2);
        COMPLETED = g0Var3;
        g0 g0Var4 = new g0("CANCELLED", 3);
        CANCELLED = g0Var4;
        g0 g0Var5 = new g0("FAILED", 4);
        FAILED = g0Var5;
        g0 g0Var6 = new g0("UNKNOWN", 5);
        UNKNOWN = g0Var6;
        g0[] g0VarArr = {g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6};
        $VALUES = g0VarArr;
        $ENTRIES = vc.s.n(g0VarArr);
        Companion = new f0();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new g53.e(25));
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }
}
