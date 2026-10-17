package cs6;

import java.util.Set;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.y0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CARD_READER;

    @NotNull
    public static final b Companion;
    public static final c INVOICE;
    public static final c PAYMENT_LINK;

    @NotNull
    private static final Set<c> inPersonSaleTypes;

    static {
        c cVar = new c("PAYMENT_LINK", 0);
        PAYMENT_LINK = cVar;
        c cVar2 = new c("INVOICE", 1);
        INVOICE = cVar2;
        c cVar3 = new c("CARD_READER", 2);
        CARD_READER = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
        Companion = new b();
        inPersonSaleTypes = y0.b(cVar3);
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
