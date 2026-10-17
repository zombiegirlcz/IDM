package fh4;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o AGREEMENT_DATE;
    public static final o AGREEMENT_NUMBER;
    public static final o BANK_NAME;

    @NotNull
    public static final n Companion;
    public static final o DOCUMENTS;
    public static final o IBAN;
    public static final o UNKNOWN;

    static {
        o oVar = new o("IBAN", 0);
        IBAN = oVar;
        o oVar2 = new o("AGREEMENT_NUMBER", 1);
        AGREEMENT_NUMBER = oVar2;
        o oVar3 = new o("AGREEMENT_DATE", 2);
        AGREEMENT_DATE = oVar3;
        o oVar4 = new o("BANK_NAME", 3);
        BANK_NAME = oVar4;
        o oVar5 = new o("DOCUMENTS", 4);
        DOCUMENTS = oVar5;
        o oVar6 = new o("UNKNOWN", 5);
        UNKNOWN = oVar6;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5, oVar6};
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
