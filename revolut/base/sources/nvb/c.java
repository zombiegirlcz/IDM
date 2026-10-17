package nvb;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c COMING_SOON;
    public static final c SOLD_OUT;

    static {
        c cVar = new c("SOLD_OUT", 0);
        SOLD_OUT = cVar;
        c cVar2 = new c("COMING_SOON", 1);
        COMING_SOON = cVar2;
        c[] cVarArr = {cVar, cVar2};
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
