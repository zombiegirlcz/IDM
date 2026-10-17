package jl;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class j0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final i0 Companion;
    public static final j0 OFF;
    public static final j0 ONLY;
    public static final j0 OPTIONAL;

    @NotNull
    private final String rawName;

    static {
        j0 j0Var = new j0("OFF", 0, "off");
        OFF = j0Var;
        j0 j0Var2 = new j0("OPTIONAL", 1, "optional");
        OPTIONAL = j0Var2;
        j0 j0Var3 = new j0("ONLY", 2, "required");
        ONLY = j0Var3;
        j0[] j0VarArr = {j0Var, j0Var2, j0Var3};
        $VALUES = j0VarArr;
        $ENTRIES = vc.s.n(j0VarArr);
        Companion = new i0();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, h0.f175537h);
    }

    public j0(String str, int i, String str2) {
        this.rawName = str2;
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }
}
