package as6;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;

    @NotNull
    public static final n Companion;
    public static final o E_COMMERCE;

    @NotNull
    private final String paramName = "eCommerce";

    static {
        o oVar = new o();
        E_COMMERCE = oVar;
        o[] oVarArr = {oVar};
        $VALUES = oVarArr;
        $ENTRIES = s.n(oVarArr);
        Companion = new n();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    public final String b() {
        return this.paramName;
    }
}
