package dej;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class c4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c4[] $VALUES;
    public static final c4 ACTIVE;
    public static final c4 EXPIRED;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f113514id;

    static {
        c4 c4Var = new c4("ACTIVE", 0, "ID_TAB_ACTIVE");
        ACTIVE = c4Var;
        c4 c4Var2 = new c4("EXPIRED", 1, "ID_TAB_EXPIRED");
        EXPIRED = c4Var2;
        c4[] c4VarArr = {c4Var, c4Var2};
        $VALUES = c4VarArr;
        $ENTRIES = vc.s.n(c4VarArr);
    }

    public c4(String str, int i, String str2) {
        this.f113514id = str2;
    }

    public static c4 valueOf(String str) {
        return (c4) Enum.valueOf(c4.class, str);
    }

    public static c4[] values() {
        return (c4[]) $VALUES.clone();
    }
}
