package sdl;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class i0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final i0 ACTIVE;
    public static final i0 AVAILABLE;

    @NotNull
    public static final h0 Companion;
    public static final i0 DISABLED;
    public static final i0 OFFBOARDED;
    public static final i0 OFFBOARDING;
    public static final i0 ONBOARDING;
    public static final i0 REMEDIATION_REQUIRED;

    static {
        i0 i0Var = new i0("DISABLED", 0);
        DISABLED = i0Var;
        i0 i0Var2 = new i0("AVAILABLE", 1);
        AVAILABLE = i0Var2;
        i0 i0Var3 = new i0("ONBOARDING", 2);
        ONBOARDING = i0Var3;
        i0 i0Var4 = new i0("ACTIVE", 3);
        ACTIVE = i0Var4;
        i0 i0Var5 = new i0("REMEDIATION_REQUIRED", 4);
        REMEDIATION_REQUIRED = i0Var5;
        i0 i0Var6 = new i0("OFFBOARDING", 5);
        OFFBOARDING = i0Var6;
        i0 i0Var7 = new i0("OFFBOARDED", 6);
        OFFBOARDED = i0Var7;
        i0[] i0VarArr = {i0Var, i0Var2, i0Var3, i0Var4, i0Var5, i0Var6, i0Var7};
        $VALUES = i0VarArr;
        $ENTRIES = vc.s.n(i0VarArr);
        Companion = new h0();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new y(2));
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) $VALUES.clone();
    }
}
