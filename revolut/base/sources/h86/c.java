package h86;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BROWSER;
    public static final c MOBILE_APP;
    public static final c MOBILE_BROWSER;

    static {
        c cVar = new c("BROWSER", 0);
        BROWSER = cVar;
        c cVar2 = new c("MOBILE_APP", 1);
        MOBILE_APP = cVar2;
        c cVar3 = new c("MOBILE_BROWSER", 2);
        MOBILE_BROWSER = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
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
