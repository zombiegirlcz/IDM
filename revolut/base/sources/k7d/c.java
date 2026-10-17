package k7d;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CARD;
    public static final c PENDING_TRANSACTION;
    public static final c TRANSFER;
    public static final c UNKNOWN;

    static {
        c cVar = new c("TRANSFER", 0);
        TRANSFER = cVar;
        c cVar2 = new c("PENDING_TRANSACTION", 1);
        PENDING_TRANSACTION = cVar2;
        c cVar3 = new c("CARD", 2);
        CARD = cVar3;
        c cVar4 = new c("UNKNOWN", 3);
        UNKNOWN = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
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
