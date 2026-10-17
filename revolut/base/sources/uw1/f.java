package uw1;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f AANI;
    public static final f BLIK;
    public static final f BREB;
    public static final f IRIS;
    public static final f PAY_ID;
    public static final f QVIK;
    public static final f SPIN;
    public static final f SWISH;
    public static final f UPI;
    public static final f WERO;

    @NotNull
    private final String code;

    static {
        f fVar = new f("AANI", 0, "TRANSFER.aani");
        AANI = fVar;
        f fVar2 = new f("BLIK", 1, "TRANSFER.blik");
        BLIK = fVar2;
        f fVar3 = new f("BREB", 2, "TRANSFER.bre_b");
        BREB = fVar3;
        f fVar4 = new f("IRIS", 3, "TRANSFER.iris");
        IRIS = fVar4;
        f fVar5 = new f("PAY_ID", 4, "TRANSFER.payid");
        PAY_ID = fVar5;
        f fVar6 = new f("QVIK", 5, "TRANSFER.giro");
        QVIK = fVar6;
        f fVar7 = new f("SPIN", 6, "TRANSFER.spin");
        SPIN = fVar7;
        f fVar8 = new f("SWISH", 7, "TRANSFER.swish");
        SWISH = fVar8;
        f fVar9 = new f("UPI", 8, "TRANSFER.upi");
        UPI = fVar9;
        f fVar10 = new f("WERO", 9, "TRANSFER.wero_p2m");
        WERO = fVar10;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public f(String str, int i, String str2) {
        this.code = str2;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final String getCode() {
        return this.code;
    }
}
