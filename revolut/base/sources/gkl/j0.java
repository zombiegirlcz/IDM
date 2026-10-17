package gkl;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class j0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;

    @NotNull
    public static final i0 Companion;
    public static final j0 DRIVING_LICENCE;
    public static final j0 NATIONAL_IDENTITY_CARD;
    public static final j0 PASSPORT;
    public static final j0 RESIDENCE_PERMIT;
    public static final j0 TAX_ID;
    public static final j0 UNKNOWN;

    static {
        j0 j0Var = new j0("PASSPORT", 0);
        PASSPORT = j0Var;
        j0 j0Var2 = new j0("NATIONAL_IDENTITY_CARD", 1);
        NATIONAL_IDENTITY_CARD = j0Var2;
        j0 j0Var3 = new j0("DRIVING_LICENCE", 2);
        DRIVING_LICENCE = j0Var3;
        j0 j0Var4 = new j0("RESIDENCE_PERMIT", 3);
        RESIDENCE_PERMIT = j0Var4;
        j0 j0Var5 = new j0("TAX_ID", 4);
        TAX_ID = j0Var5;
        j0 j0Var6 = new j0("UNKNOWN", 5);
        UNKNOWN = j0Var6;
        j0[] j0VarArr = {j0Var, j0Var2, j0Var3, j0Var4, j0Var5, j0Var6};
        $VALUES = j0VarArr;
        $ENTRIES = vc.s.n(j0VarArr);
        Companion = new i0();
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }
}
