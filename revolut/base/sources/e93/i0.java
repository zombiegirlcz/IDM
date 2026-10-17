package e93;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class i0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;
    public static final i0 COMPLETED;

    @NotNull
    public static final h0 Companion;
    public static final i0 FAILED;
    public static final i0 PENDING;
    public static final i0 REJECTED;

    static {
        i0 i0Var = new i0("PENDING", 0);
        PENDING = i0Var;
        i0 i0Var2 = new i0("REJECTED", 1);
        REJECTED = i0Var2;
        i0 i0Var3 = new i0("COMPLETED", 2);
        COMPLETED = i0Var3;
        i0 i0Var4 = new i0("FAILED", 3);
        FAILED = i0Var4;
        i0[] i0VarArr = {i0Var, i0Var2, i0Var3, i0Var4};
        $VALUES = i0VarArr;
        $ENTRIES = vc.s.n(i0VarArr);
        Companion = new h0();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) $VALUES.clone();
    }
}
