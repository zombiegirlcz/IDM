package hw3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o IMAGE;
    public static final o PDF;
    public static final o UNKNOWN;

    static {
        o oVar = new o("IMAGE", 0);
        IMAGE = oVar;
        o oVar2 = new o("PDF", 1);
        PDF = oVar2;
        o oVar3 = new o("UNKNOWN", 2);
        UNKNOWN = oVar3;
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
