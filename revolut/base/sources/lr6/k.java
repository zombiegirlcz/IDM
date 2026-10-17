package lr6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k APPLE_TAP_TO_PAY;
    public static final k CARD_READER;
    public static final k INVOICE;
    public static final k LINK;
    public static final k POS;
    public static final k PRESTASHOP;
    public static final k QR;
    public static final k SHOPIFY_CHECKOUT;
    public static final k SHOPIFY_RPAY;
    public static final k WOOCOMMERCE;

    static {
        k kVar = new k("LINK", 0);
        LINK = kVar;
        k kVar2 = new k("QR", 1);
        QR = kVar2;
        k kVar3 = new k("INVOICE", 2);
        INVOICE = kVar3;
        k kVar4 = new k("CARD_READER", 3);
        CARD_READER = kVar4;
        k kVar5 = new k("POS", 4);
        POS = kVar5;
        k kVar6 = new k("APPLE_TAP_TO_PAY", 5);
        APPLE_TAP_TO_PAY = kVar6;
        k kVar7 = new k("SHOPIFY_CHECKOUT", 6);
        SHOPIFY_CHECKOUT = kVar7;
        k kVar8 = new k("SHOPIFY_RPAY", 7);
        SHOPIFY_RPAY = kVar8;
        k kVar9 = new k("PRESTASHOP", 8);
        PRESTASHOP = kVar9;
        k kVar10 = new k("WOOCOMMERCE", 9);
        WOOCOMMERCE = kVar10;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10};
        $VALUES = kVarArr;
        $ENTRIES = vc.s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
