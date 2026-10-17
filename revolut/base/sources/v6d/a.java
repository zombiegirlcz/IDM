package v6d;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BLANK_CARD_DELIVERY;
    public static final a FIRST_PARTY_MARKETING;
    public static final a FIRST_PARTY_NFC_PAYMENTS;
    public static final a PAYMENT_LINKS;
    public static final a PERSONAL_DATA_PROCESSING;
    public static final a THIRD_PARTY_MARKETING;

    static {
        a aVar = new a("FIRST_PARTY_MARKETING", 0);
        FIRST_PARTY_MARKETING = aVar;
        a aVar2 = new a("THIRD_PARTY_MARKETING", 1);
        THIRD_PARTY_MARKETING = aVar2;
        a aVar3 = new a("PERSONAL_DATA_PROCESSING", 2);
        PERSONAL_DATA_PROCESSING = aVar3;
        a aVar4 = new a("PAYMENT_LINKS", 3);
        PAYMENT_LINKS = aVar4;
        a aVar5 = new a("BLANK_CARD_DELIVERY", 4);
        BLANK_CARD_DELIVERY = aVar5;
        a aVar6 = new a("FIRST_PARTY_NFC_PAYMENTS", 5);
        FIRST_PARTY_NFC_PAYMENTS = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
