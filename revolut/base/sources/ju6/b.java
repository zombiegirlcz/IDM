package ju6;

import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import nr6.e;
import vc.s;
import zhm.y0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CARD_READER;
    public static final b E_COMMERCE;
    public static final b INVOICE;
    public static final b PAYMENT_LINK;
    public static final b QR_CODE;
    public static final b REVOLUT_TERMINAL;
    public static final b TAP_TO_PAY;

    static {
        b bVar = new b("PAYMENT_LINK", 0);
        PAYMENT_LINK = bVar;
        b bVar2 = new b("QR_CODE", 1);
        QR_CODE = bVar2;
        b bVar3 = new b("INVOICE", 2);
        INVOICE = bVar3;
        b bVar4 = new b("CARD_READER", 3);
        CARD_READER = bVar4;
        b bVar5 = new b("TAP_TO_PAY", 4);
        TAP_TO_PAY = bVar5;
        b bVar6 = new b("REVOLUT_TERMINAL", 5);
        REVOLUT_TERMINAL = bVar6;
        b bVar7 = new b("E_COMMERCE", 6);
        E_COMMERCE = bVar7;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final Set b() {
        switch (a.f178627a[ordinal()]) {
            case 1:
                return y0.b(e.LINK);
            case 2:
                return y0.b(e.QR);
            case 3:
                return y0.b(e.INVOICE);
            case 4:
                return y0.b(e.CARD_READER);
            case 5:
                return y0.b(e.APPLE_TAP_TO_PAY);
            case 6:
                return y0.b(e.POS);
            case 7:
                e.Companion.getClass();
                return e.E_COMMERCE_CHANNELS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
