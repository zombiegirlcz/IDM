package c93;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o CGST;

    @NotNull
    public static final n Companion;
    public static final o GMF;
    public static final o IGST;
    public static final o SGST;
    public static final o STAMP_DUTY;
    public static final o UNKNOWN;
    public static final o VAT;

    static {
        o oVar = new o("VAT", 0);
        VAT = oVar;
        o oVar2 = new o("IGST", 1);
        IGST = oVar2;
        o oVar3 = new o("CGST", 2);
        CGST = oVar3;
        o oVar4 = new o("SGST", 3);
        SGST = oVar4;
        o oVar5 = new o("GMF", 4);
        GMF = oVar5;
        o oVar6 = new o("STAMP_DUTY", 5);
        STAMP_DUTY = oVar6;
        o oVar7 = new o("UNKNOWN", 6);
        UNKNOWN = oVar7;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7};
        $VALUES = oVarArr;
        $ENTRIES = vc.s.n(oVarArr);
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
}
