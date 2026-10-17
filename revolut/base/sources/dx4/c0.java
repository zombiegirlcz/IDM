package dx4;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class c0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c0[] $VALUES;

    @NotNull
    public static final a0 Companion;
    public static final c0 RETAIL_REVOLUT;
    public static final c0 SUCCESS;

    static {
        c0 c0Var = new c0("SUCCESS", 0);
        SUCCESS = c0Var;
        c0 c0Var2 = new c0("RETAIL_REVOLUT", 1);
        RETAIL_REVOLUT = c0Var2;
        c0[] c0VarArr = {c0Var, c0Var2};
        $VALUES = c0VarArr;
        $ENTRIES = vc.s.n(c0VarArr);
        Companion = new a0();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }
}
