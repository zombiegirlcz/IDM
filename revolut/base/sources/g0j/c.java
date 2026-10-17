package g0j;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ALIPAY;
    public static final c ATM;
    public static final c BIZUM;
    public static final c ESIM;
    public static final c EXCHANGE_RATE;
    public static final c PIX;
    public static final c SPLIT_BILL;
    public static final c TRANSPORT_HUBS;

    static {
        c cVar = new c("EXCHANGE_RATE", 0);
        EXCHANGE_RATE = cVar;
        c cVar2 = new c("ESIM", 1);
        ESIM = cVar2;
        c cVar3 = new c("SPLIT_BILL", 2);
        SPLIT_BILL = cVar3;
        c cVar4 = new c("ATM", 3);
        ATM = cVar4;
        c cVar5 = new c("TRANSPORT_HUBS", 4);
        TRANSPORT_HUBS = cVar5;
        c cVar6 = new c("BIZUM", 5);
        BIZUM = cVar6;
        c cVar7 = new c("PIX", 6);
        PIX = cVar7;
        c cVar8 = new c("ALIPAY", 7);
        ALIPAY = cVar8;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
