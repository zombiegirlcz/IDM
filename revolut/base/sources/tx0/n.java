package tx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n CONTEXTUAL;
    public static final n REFLECTIVE_SURFACE;
    public static final n WHITE_OR_BLACK_INVERTED;

    static {
        n nVar = new n("CONTEXTUAL", 0);
        CONTEXTUAL = nVar;
        n nVar2 = new n("WHITE_OR_BLACK_INVERTED", 1);
        WHITE_OR_BLACK_INVERTED = nVar2;
        n nVar3 = new n("REFLECTIVE_SURFACE", 2);
        REFLECTIVE_SURFACE = nVar3;
        n[] nVarArr = {nVar, nVar2, nVar3};
        $VALUES = nVarArr;
        $ENTRIES = vc.s.n(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
