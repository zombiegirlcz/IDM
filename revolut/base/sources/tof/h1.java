package tof;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class h1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h1[] $VALUES;
    public static final h1 OSKO;

    @NotNull
    private final String value = "OSKO";

    static {
        h1 h1Var = new h1();
        OSKO = h1Var;
        h1[] h1VarArr = {h1Var};
        $VALUES = h1VarArr;
        $ENTRIES = vc.s.n(h1VarArr);
    }

    public static h1 valueOf(String str) {
        return (h1) Enum.valueOf(h1.class, str);
    }

    public static h1[] values() {
        return (h1[]) $VALUES.clone();
    }
}
