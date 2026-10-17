package sdl;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class l0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l0[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final k0 Companion;
    public static final l0 PERSONAL;
    public static final l0 PERSONAL_JOINT;
    public static final l0 YOUTH;

    static {
        l0 l0Var = new l0("PERSONAL", 0);
        PERSONAL = l0Var;
        l0 l0Var2 = new l0("PERSONAL_JOINT", 1);
        PERSONAL_JOINT = l0Var2;
        l0 l0Var3 = new l0("YOUTH", 2);
        YOUTH = l0Var3;
        l0[] l0VarArr = {l0Var, l0Var2, l0Var3};
        $VALUES = l0VarArr;
        $ENTRIES = vc.s.n(l0VarArr);
        Companion = new k0();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new y(5));
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) $VALUES.clone();
    }
}
