package cu9;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CANCEL;
    public static final c DECLINE;
    public static final c REMIND;
    public static final c SEND;

    static {
        c cVar = new c("DECLINE", 0);
        DECLINE = cVar;
        c cVar2 = new c("SEND", 1);
        SEND = cVar2;
        c cVar3 = new c("REMIND", 2);
        REMIND = cVar3;
        c cVar4 = new c("CANCEL", 3);
        CANCEL = cVar4;
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
