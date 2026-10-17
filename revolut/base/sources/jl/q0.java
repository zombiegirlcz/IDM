package jl;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class q0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q0[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final q0 ABANDONED;

    @NotNull
    public static final p0 Companion;
    public static final q0 ERROR;
    public static final q0 FINISHED;
    public static final q0 RUNNING;

    @NotNull
    private final String value;

    static {
        q0 q0Var = new q0("ABANDONED", 0, "abandoned");
        ABANDONED = q0Var;
        q0 q0Var2 = new q0("ERROR", 1, "error");
        ERROR = q0Var2;
        q0 q0Var3 = new q0("FINISHED", 2, "finished");
        FINISHED = q0Var3;
        q0 q0Var4 = new q0("RUNNING", 3, "running");
        RUNNING = q0Var4;
        q0[] q0VarArr = {q0Var, q0Var2, q0Var3, q0Var4};
        $VALUES = q0VarArr;
        $ENTRIES = vc.s.n(q0VarArr);
        Companion = new p0();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, h0.i);
    }

    public q0(String str, int i, String str2) {
        this.value = str2;
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) $VALUES.clone();
    }
}
