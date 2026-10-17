package qh0;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class j0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final i0 Companion;
    public static final j0 PUBLIC_KEY;

    static {
        j0 j0Var = new j0("PUBLIC_KEY", 0);
        PUBLIC_KEY = j0Var;
        j0[] j0VarArr = {j0Var};
        $VALUES = j0VarArr;
        $ENTRIES = vc.s.n(j0VarArr);
        Companion = new i0();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new d(8));
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }
}
