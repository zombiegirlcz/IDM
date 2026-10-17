package dx4;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class p0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p0[] $VALUES;

    @NotNull
    public static final o0 Companion;
    public static final p0 PENDING;
    public static final p0 SUCCESS;

    static {
        p0 p0Var = new p0("PENDING", 0);
        PENDING = p0Var;
        p0 p0Var2 = new p0("SUCCESS", 1);
        SUCCESS = p0Var2;
        p0[] p0VarArr = {p0Var, p0Var2};
        $VALUES = p0VarArr;
        $ENTRIES = vc.s.n(p0VarArr);
        Companion = new o0();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) $VALUES.clone();
    }
}
