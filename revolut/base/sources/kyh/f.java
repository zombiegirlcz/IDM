package kyh;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f AED_BALANCE_LIMIT_EXCEEDED;
    public static final f AMOUNT_TOO_SMALL;
    public static final f BRL_LOWER_LIMIT_EXCEEDED;
    public static final f BRL_UPPER_LIMIT_EXCEEDED;
    public static final f BRL_USAGE_LIMIT_EXCEEDED;
    public static final f ESTIMATED;
    public static final f EXCEEDED_BALANCE;
    public static final f EXCEEDED_CRYPTO_LIMIT;
    public static final f FAILED_CRYPTO_LOWER_LIMIT;
    public static final f MX_BALANCE_LIMIT_EXCEEDED;
    public static final f UNKNOWN;

    static {
        f fVar = new f("EXCEEDED_BALANCE", 0);
        EXCEEDED_BALANCE = fVar;
        f fVar2 = new f("AMOUNT_TOO_SMALL", 1);
        AMOUNT_TOO_SMALL = fVar2;
        f fVar3 = new f("ESTIMATED", 2);
        ESTIMATED = fVar3;
        f fVar4 = new f("EXCEEDED_CRYPTO_LIMIT", 3);
        EXCEEDED_CRYPTO_LIMIT = fVar4;
        f fVar5 = new f("FAILED_CRYPTO_LOWER_LIMIT", 4);
        FAILED_CRYPTO_LOWER_LIMIT = fVar5;
        f fVar6 = new f("MX_BALANCE_LIMIT_EXCEEDED", 5);
        MX_BALANCE_LIMIT_EXCEEDED = fVar6;
        f fVar7 = new f("BRL_USAGE_LIMIT_EXCEEDED", 6);
        BRL_USAGE_LIMIT_EXCEEDED = fVar7;
        f fVar8 = new f("BRL_UPPER_LIMIT_EXCEEDED", 7);
        BRL_UPPER_LIMIT_EXCEEDED = fVar8;
        f fVar9 = new f("BRL_LOWER_LIMIT_EXCEEDED", 8);
        BRL_LOWER_LIMIT_EXCEEDED = fVar9;
        f fVar10 = new f("AED_BALANCE_LIMIT_EXCEEDED", 9);
        AED_BALANCE_LIMIT_EXCEEDED = fVar10;
        f fVar11 = new f("UNKNOWN", 10);
        UNKNOWN = fVar11;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
