package e93;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class d0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d0[] $VALUES;
    public static final d0 BACK;

    @NotNull
    public static final c0 Companion;
    public static final d0 FRONT;

    static {
        d0 d0Var = new d0("FRONT", 0);
        FRONT = d0Var;
        d0 d0Var2 = new d0("BACK", 1);
        BACK = d0Var2;
        d0[] d0VarArr = {d0Var, d0Var2};
        $VALUES = d0VarArr;
        $ENTRIES = vc.s.n(d0VarArr);
        Companion = new c0();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) $VALUES.clone();
    }
}
