package vmh;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f BONDS;
    public static final f CFD;
    public static final f COMMODITY;
    public static final f ETFS;
    public static final f MUTUAL_FUNDS;
    public static final f PRIVATE_MARKETS;
    public static final f STOCKS;
    public static final f STRATEGIES;
    public static final f STRUCTURED_NOTES;

    static {
        f fVar = new f("STOCKS", 0);
        STOCKS = fVar;
        f fVar2 = new f("ETFS", 1);
        ETFS = fVar2;
        f fVar3 = new f("BONDS", 2);
        BONDS = fVar3;
        f fVar4 = new f("CFD", 3);
        CFD = fVar4;
        f fVar5 = new f("COMMODITY", 4);
        COMMODITY = fVar5;
        f fVar6 = new f("PRIVATE_MARKETS", 5);
        PRIVATE_MARKETS = fVar6;
        f fVar7 = new f("MUTUAL_FUNDS", 6);
        MUTUAL_FUNDS = fVar7;
        f fVar8 = new f("STRUCTURED_NOTES", 7);
        STRUCTURED_NOTES = fVar8;
        f fVar9 = new f("STRATEGIES", 8);
        STRATEGIES = fVar9;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
