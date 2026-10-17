package jia;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c APPLE_PAY;
    public static final c CARD_READER;
    public static final c ECOMMERCE;
    public static final c INVOICE;
    public static final c PAYMENT_LINK;
    public static final c POS;
    public static final c QR_CODE;

    static {
        c cVar = new c("APPLE_PAY", 0);
        APPLE_PAY = cVar;
        c cVar2 = new c("CARD_READER", 1);
        CARD_READER = cVar2;
        c cVar3 = new c("POS", 2);
        POS = cVar3;
        c cVar4 = new c("ECOMMERCE", 3);
        ECOMMERCE = cVar4;
        c cVar5 = new c("INVOICE", 4);
        INVOICE = cVar5;
        c cVar6 = new c("PAYMENT_LINK", 5);
        PAYMENT_LINK = cVar6;
        c cVar7 = new c("QR_CODE", 6);
        QR_CODE = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
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
