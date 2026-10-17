package io3;

import java.io.Serializable;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class n implements Serializable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n ACH_STANDARD;
    public static final n CZECH_DOMESTIC_STANDARD;
    public static final n FASTER_PAYMENTS;
    public static final n FAST_SG;
    public static final n JAPAN_DOMESTIC_STANDARD;
    public static final n NONE;
    public static final n PAY_TO;
    public static final n POLISH_DOMESTIC_EXPRESS;
    public static final n POLISH_DOMESTIC_STANDARD;
    public static final n SEPA_CREDIT;
    public static final n SEPA_INSTANT;

    static {
        n nVar = new n("FASTER_PAYMENTS", 0);
        FASTER_PAYMENTS = nVar;
        n nVar2 = new n("ACH_STANDARD", 1);
        ACH_STANDARD = nVar2;
        n nVar3 = new n("SEPA_INSTANT", 2);
        SEPA_INSTANT = nVar3;
        n nVar4 = new n("SEPA_CREDIT", 3);
        SEPA_CREDIT = nVar4;
        n nVar5 = new n("FAST_SG", 4);
        FAST_SG = nVar5;
        n nVar6 = new n("CZECH_DOMESTIC_STANDARD", 5);
        CZECH_DOMESTIC_STANDARD = nVar6;
        n nVar7 = new n("POLISH_DOMESTIC_STANDARD", 6);
        POLISH_DOMESTIC_STANDARD = nVar7;
        n nVar8 = new n("POLISH_DOMESTIC_EXPRESS", 7);
        POLISH_DOMESTIC_EXPRESS = nVar8;
        n nVar9 = new n("JAPAN_DOMESTIC_STANDARD", 8);
        JAPAN_DOMESTIC_STANDARD = nVar9;
        n nVar10 = new n("PAY_TO", 9);
        PAY_TO = nVar10;
        n nVar11 = new n("NONE", 10);
        NONE = nVar11;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10, nVar11};
        $VALUES = nVarArr;
        $ENTRIES = s.n(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
