package htj;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class c0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c0[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final c0 CUSTOM;

    @NotNull
    public static final b0 Companion;
    public static final c0 PREDEFINED;

    static {
        c0 c0Var = new c0("PREDEFINED", 0);
        PREDEFINED = c0Var;
        c0 c0Var2 = new c0("CUSTOM", 1);
        CUSTOM = c0Var2;
        c0[] c0VarArr = {c0Var, c0Var2};
        $VALUES = c0VarArr;
        $ENTRIES = vc.s.n(c0VarArr);
        Companion = new b0();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new ht1.e(7));
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }
}
