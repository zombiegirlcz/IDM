package x02;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BILLS;
    public static final c BIZUM;
    public static final c CORAL;
    public static final c CORAL_PRO;

    static {
        c cVar = new c("BIZUM", 0);
        BIZUM = cVar;
        c cVar2 = new c("CORAL", 1);
        CORAL = cVar2;
        c cVar3 = new c("CORAL_PRO", 2);
        CORAL_PRO = cVar3;
        c cVar4 = new c("BILLS", 3);
        BILLS = cVar4;
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
