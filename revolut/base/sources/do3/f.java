package do3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f ACQUIRING;
    public static final f ADS;
    public static final f BANKING;
    public static final f CARD_PAYMENTS;
    public static final f CRYPTO;
    public static final f CRYPTO_RAMP;
    public static final f EMPLOYER_OF_RECORD;
    public static final f INSURANCE;
    public static final f INVESTMENT_MANAGEMENT;
    public static final f TRADING;
    public static final f UNKNOWN;

    static {
        f fVar = new f("BANKING", 0);
        BANKING = fVar;
        f fVar2 = new f("ADS", 1);
        ADS = fVar2;
        f fVar3 = new f("TRADING", 2);
        TRADING = fVar3;
        f fVar4 = new f("INVESTMENT_MANAGEMENT", 3);
        INVESTMENT_MANAGEMENT = fVar4;
        f fVar5 = new f("INSURANCE", 4);
        INSURANCE = fVar5;
        f fVar6 = new f("CARD_PAYMENTS", 5);
        CARD_PAYMENTS = fVar6;
        f fVar7 = new f("CRYPTO_RAMP", 6);
        CRYPTO_RAMP = fVar7;
        f fVar8 = new f("CRYPTO", 7);
        CRYPTO = fVar8;
        f fVar9 = new f("EMPLOYER_OF_RECORD", 8);
        EMPLOYER_OF_RECORD = fVar9;
        f fVar10 = new f("ACQUIRING", 9);
        ACQUIRING = fVar10;
        f fVar11 = new f("UNKNOWN", 10);
        UNKNOWN = fVar11;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11};
        $VALUES = fVarArr;
        $ENTRIES = vc.s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
