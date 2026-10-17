package sdl;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class q0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q0[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final p0 Companion;
    public static final q0 TRANSFER_IN;
    public static final q0 TRANSFER_OUT;

    @NotNull
    private final String label;

    static {
        q0 q0Var = new q0("TRANSFER_IN", 0, "TRANSFER_IN");
        TRANSFER_IN = q0Var;
        q0 q0Var2 = new q0("TRANSFER_OUT", 1, "TRANSFER_OUT");
        TRANSFER_OUT = q0Var2;
        q0[] q0VarArr = {q0Var, q0Var2};
        $VALUES = q0VarArr;
        $ENTRIES = vc.s.n(q0VarArr);
        Companion = new p0();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new y(6));
    }

    public q0(String str, int i, String str2) {
        this.label = str2;
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) $VALUES.clone();
    }

    public final String getLabel() {
        return this.label;
    }
}
