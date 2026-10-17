package kve;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f AKAHU;
    public static final f CARD;
    public static final f GMO_PG_BANK_DIRECT;
    public static final f MCY_NET_BANKING;
    public static final f MCY_UPI_APP;
    public static final f NET_BANKING;
    public static final f OPEN_BANKING;
    public static final f PAY_TO;
    public static final f PIX_SMART_TRANSFER;
    public static final f UPI_APP;

    static {
        f fVar = new f("CARD", 0);
        CARD = fVar;
        f fVar2 = new f("OPEN_BANKING", 1);
        OPEN_BANKING = fVar2;
        f fVar3 = new f("PAY_TO", 2);
        PAY_TO = fVar3;
        f fVar4 = new f("MCY_UPI_APP", 3);
        MCY_UPI_APP = fVar4;
        f fVar5 = new f("MCY_NET_BANKING", 4);
        MCY_NET_BANKING = fVar5;
        f fVar6 = new f("UPI_APP", 5);
        UPI_APP = fVar6;
        f fVar7 = new f("NET_BANKING", 6);
        NET_BANKING = fVar7;
        f fVar8 = new f("PIX_SMART_TRANSFER", 7);
        PIX_SMART_TRANSFER = fVar8;
        f fVar9 = new f("AKAHU", 8);
        AKAHU = fVar9;
        f fVar10 = new f("GMO_PG_BANK_DIRECT", 9);
        GMO_PG_BANK_DIRECT = fVar10;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10};
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
