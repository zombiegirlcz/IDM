package hjl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BANK_ID;
    public static final c DAP;
    public static final c GOOGLE;
    public static final c UAE_PASS;

    static {
        c cVar = new c("BANK_ID", 0);
        BANK_ID = cVar;
        c cVar2 = new c("GOOGLE", 1);
        GOOGLE = cVar2;
        c cVar3 = new c("DAP", 2);
        DAP = cVar3;
        c cVar4 = new c("UAE_PASS", 3);
        UAE_PASS = cVar4;
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
