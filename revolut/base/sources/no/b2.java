package no;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class b2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b2[] $VALUES;
    public static final b2 COLD;
    public static final b2 HOT;

    @NotNull
    private final String value;

    static {
        b2 b2Var = new b2("COLD", 0, "cold");
        COLD = b2Var;
        b2 b2Var2 = new b2("HOT", 1, "hot");
        HOT = b2Var2;
        b2[] b2VarArr = {b2Var, b2Var2};
        $VALUES = b2VarArr;
        $ENTRIES = vc.s.n(b2VarArr);
    }

    public b2(String str, int i, String str2) {
        this.value = str2;
    }

    public static b2 valueOf(String str) {
        return (b2) Enum.valueOf(b2.class, str);
    }

    public static b2[] values() {
        return (b2[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
