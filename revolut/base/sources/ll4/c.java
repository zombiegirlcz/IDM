package ll4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CARDS_LIST;
    public static final c CARDS_WIDGET;
    public static final c CARD_ORDERING;
    public static final c PRODUCTS_WIDGET;

    static {
        c cVar = new c("CARDS_WIDGET", 0);
        CARDS_WIDGET = cVar;
        c cVar2 = new c("PRODUCTS_WIDGET", 1);
        PRODUCTS_WIDGET = cVar2;
        c cVar3 = new c("CARDS_LIST", 2);
        CARDS_LIST = cVar3;
        c cVar4 = new c("CARD_ORDERING", 3);
        CARD_ORDERING = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        $VALUES = cVarArr;
        $ENTRIES = vc.s.n(cVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
