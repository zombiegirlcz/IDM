package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class tp {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ tp[] $VALUES;
    public static final tp CIRCLE;
    public static final tp RECT;

    static {
        tp tpVar = new tp("CIRCLE", 0);
        CIRCLE = tpVar;
        tp tpVar2 = new tp("RECT", 1);
        RECT = tpVar2;
        tp[] tpVarArr = {tpVar, tpVar2};
        $VALUES = tpVarArr;
        $ENTRIES = vc.s.n(tpVarArr);
    }

    public static tp valueOf(String str) {
        return (tp) Enum.valueOf(tp.class, str);
    }

    public static tp[] values() {
        return (tp[]) $VALUES.clone();
    }
}
