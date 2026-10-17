package dx4;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class h0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;

    @NotNull
    public static final g0 Companion;
    public static final h0 NEW_APPLICATION_RFL;

    static {
        h0 h0Var = new h0("NEW_APPLICATION_RFL", 0);
        NEW_APPLICATION_RFL = h0Var;
        h0[] h0VarArr = {h0Var};
        $VALUES = h0VarArr;
        $ENTRIES = vc.s.n(h0VarArr);
        Companion = new g0();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }
}
