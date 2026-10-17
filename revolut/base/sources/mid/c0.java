package mid;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class c0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 CAMPAIGN;

    @NotNull
    public static final b0 Companion;
    public static final c0 DEEPLINK;
    public static final c0 UNKNOWN;

    @NotNull
    private final String key;

    static {
        c0 c0Var = new c0("CAMPAIGN", 0, "CAMPAIGN");
        CAMPAIGN = c0Var;
        c0 c0Var2 = new c0("DEEPLINK", 1, "DEEPLINK");
        DEEPLINK = c0Var2;
        c0 c0Var3 = new c0("UNKNOWN", 2, "UNKNOWN");
        UNKNOWN = c0Var3;
        c0[] c0VarArr = {c0Var, c0Var2, c0Var3};
        $VALUES = c0VarArr;
        $ENTRIES = vc.s.n(c0VarArr);
        Companion = new b0();
    }

    public c0(String str, int i, String str2) {
        this.key = str2;
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

    public final String b() {
        return this.key;
    }
}
