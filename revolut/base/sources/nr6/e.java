package nr6;

import java.util.Set;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e APPLE_TAP_TO_PAY;
    public static final e CARD_READER;

    @NotNull
    public static final d Companion;

    @NotNull
    private static final Set<e> E_COMMERCE_CHANNELS;
    public static final e INVOICE;

    @NotNull
    private static final Set<e> IN_PERSON_CHANNELS;
    public static final e LINK;
    public static final e POS;
    public static final e PRESTASHOP;
    public static final e QR;
    public static final e SHOPIFY;
    public static final e SHOPIFY_RPAY;
    public static final e WOOCOMMERCE;

    static {
        e eVar = new e("CARD_READER", 0);
        CARD_READER = eVar;
        e eVar2 = new e("INVOICE", 1);
        INVOICE = eVar2;
        e eVar3 = new e("LINK", 2);
        LINK = eVar3;
        e eVar4 = new e("POS", 3);
        POS = eVar4;
        e eVar5 = new e("PRESTASHOP", 4);
        PRESTASHOP = eVar5;
        e eVar6 = new e("QR", 5);
        QR = eVar6;
        e eVar7 = new e("SHOPIFY", 6);
        SHOPIFY = eVar7;
        e eVar8 = new e("SHOPIFY_RPAY", 7);
        SHOPIFY_RPAY = eVar8;
        e eVar9 = new e("APPLE_TAP_TO_PAY", 8);
        APPLE_TAP_TO_PAY = eVar9;
        e eVar10 = new e("WOOCOMMERCE", 9);
        WOOCOMMERCE = eVar10;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10};
        $VALUES = eVarArr;
        $ENTRIES = vc.s.n(eVarArr);
        Companion = new d();
        e[] elements = {eVar5, eVar7, eVar8, eVar10};
        Intrinsics.checkNotNullParameter(elements, "elements");
        E_COMMERCE_CHANNELS = kotlin.collections.d.y0(elements);
        e[] elements2 = {eVar9, eVar, eVar4, eVar6};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        IN_PERSON_CHANNELS = kotlin.collections.d.y0(elements2);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final boolean c() {
        return E_COMMERCE_CHANNELS.contains(this);
    }

    public final boolean d() {
        return IN_PERSON_CHANNELS.contains(this);
    }
}
