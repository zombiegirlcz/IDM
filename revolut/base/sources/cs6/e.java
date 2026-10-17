package cs6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e APPLE_TAP_TO_PAY;
    public static final e CARD_READER;
    public static final e ECOMMERCE;
    public static final e INVOICE;
    public static final e LINK;
    public static final e POS;
    public static final e QR_CODE;

    static {
        e eVar = new e("LINK", 0);
        LINK = eVar;
        e eVar2 = new e("QR_CODE", 1);
        QR_CODE = eVar2;
        e eVar3 = new e("INVOICE", 2);
        INVOICE = eVar3;
        e eVar4 = new e("CARD_READER", 3);
        CARD_READER = eVar4;
        e eVar5 = new e("POS", 4);
        POS = eVar5;
        e eVar6 = new e("APPLE_TAP_TO_PAY", 5);
        APPLE_TAP_TO_PAY = eVar6;
        e eVar7 = new e("ECOMMERCE", 6);
        ECOMMERCE = eVar7;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
