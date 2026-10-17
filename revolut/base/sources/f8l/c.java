package f8l;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c COMMODITY;
    public static final c CRYPTO;
    public static final c FIAT;
    public static final c SECURITY;
    public static final c UNDEFINED;

    static {
        c cVar = new c("FIAT", 0);
        FIAT = cVar;
        c cVar2 = new c("CRYPTO", 1);
        CRYPTO = cVar2;
        c cVar3 = new c("COMMODITY", 2);
        COMMODITY = cVar3;
        c cVar4 = new c("SECURITY", 3);
        SECURITY = cVar4;
        c cVar5 = new c("UNDEFINED", 4);
        UNDEFINED = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
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
