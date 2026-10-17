package g9f;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class l0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l0[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final l0 COMPLETED;

    @NotNull
    public static final k0 Companion;
    public static final l0 FAILED;
    public static final l0 IN_PROGRESS;
    public static final l0 PENDING;
    public static final l0 UNKNOWN;

    static {
        l0 l0Var = new l0("COMPLETED", 0);
        COMPLETED = l0Var;
        l0 l0Var2 = new l0("IN_PROGRESS", 1);
        IN_PROGRESS = l0Var2;
        l0 l0Var3 = new l0("PENDING", 2);
        PENDING = l0Var3;
        l0 l0Var4 = new l0("FAILED", 3);
        FAILED = l0Var4;
        l0 l0Var5 = new l0("UNKNOWN", 4);
        UNKNOWN = l0Var5;
        l0[] l0VarArr = {l0Var, l0Var2, l0Var3, l0Var4, l0Var5};
        $VALUES = l0VarArr;
        $ENTRIES = vc.s.n(l0VarArr);
        Companion = new k0();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new g53.e(27));
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) $VALUES.clone();
    }
}
