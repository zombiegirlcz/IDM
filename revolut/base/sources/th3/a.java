package th3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DISPOSABLE_CARD_ALREADY_EXISTS;
    public static final a METAL_CARDS_LIMIT_REACHED;
    public static final a PHYSICAL_CARD_LIMIT_REACHED;
    public static final a VIRTUAL_CARD_LIMIT_REACHED;

    static {
        a aVar = new a("PHYSICAL_CARD_LIMIT_REACHED", 0);
        PHYSICAL_CARD_LIMIT_REACHED = aVar;
        a aVar2 = new a("VIRTUAL_CARD_LIMIT_REACHED", 1);
        VIRTUAL_CARD_LIMIT_REACHED = aVar2;
        a aVar3 = new a("DISPOSABLE_CARD_ALREADY_EXISTS", 2);
        DISPOSABLE_CARD_ALREADY_EXISTS = aVar3;
        a aVar4 = new a("METAL_CARDS_LIMIT_REACHED", 3);
        METAL_CARDS_LIMIT_REACHED = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
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
