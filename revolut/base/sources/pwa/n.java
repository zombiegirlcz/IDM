package pwa;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n CRYPTO_INTERNAL;
    public static final n JUNIOR_TO_JUNIOR;
    public static final n PAPER_TRADING;
    public static final n PRO_INTERNAL;
    public static final n RETAIL_TO_BUSINESS;
    public static final n SALARY;
    public static final n STANDARD;

    static {
        n nVar = new n("CRYPTO_INTERNAL", 0);
        CRYPTO_INTERNAL = nVar;
        n nVar2 = new n("STANDARD", 1);
        STANDARD = nVar2;
        n nVar3 = new n("RETAIL_TO_BUSINESS", 2);
        RETAIL_TO_BUSINESS = nVar3;
        n nVar4 = new n("SALARY", 3);
        SALARY = nVar4;
        n nVar5 = new n("JUNIOR_TO_JUNIOR", 4);
        JUNIOR_TO_JUNIOR = nVar5;
        n nVar6 = new n("PRO_INTERNAL", 5);
        PRO_INTERNAL = nVar6;
        n nVar7 = new n("PAPER_TRADING", 6);
        PAPER_TRADING = nVar7;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7};
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
