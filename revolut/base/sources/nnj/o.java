package nnj;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o HIDDEN;
    public static final o VISIBLE_DISABLED;
    public static final o VISIBLE_ENABLED;

    static {
        o oVar = new o("HIDDEN", 0);
        HIDDEN = oVar;
        o oVar2 = new o("VISIBLE_ENABLED", 1);
        VISIBLE_ENABLED = oVar2;
        o oVar3 = new o("VISIBLE_DISABLED", 2);
        VISIBLE_DISABLED = oVar3;
        o[] oVarArr = {oVar, oVar2, oVar3};
        $VALUES = oVarArr;
        $ENTRIES = vc.s.n(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
