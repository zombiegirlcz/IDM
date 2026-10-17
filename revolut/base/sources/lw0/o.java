package lw0;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o AI_BORDER_AND_NEON_GLOW;
    public static final o AI_BORDER_ONLY;
    public static final o REGULAR;

    @NotNull
    private final n searchButtonMode;

    static {
        o oVar = new o("REGULAR", 0, n.REGULAR_SEARCH);
        REGULAR = oVar;
        n nVar = n.AI_SEARCH;
        o oVar2 = new o("AI_BORDER_ONLY", 1, nVar);
        AI_BORDER_ONLY = oVar2;
        o oVar3 = new o("AI_BORDER_AND_NEON_GLOW", 2, nVar);
        AI_BORDER_AND_NEON_GLOW = oVar3;
        o[] oVarArr = {oVar, oVar2, oVar3};
        $VALUES = oVarArr;
        $ENTRIES = s.n(oVarArr);
    }

    public o(String str, int i, n nVar) {
        this.searchButtonMode = nVar;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    public final n a() {
        return this.searchButtonMode;
    }
}
