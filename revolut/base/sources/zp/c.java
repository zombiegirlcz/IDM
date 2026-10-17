package zp;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BLOCKER;
    public static final c COSMETIC;
    public static final c CRITICAL;
    public static final c MAJOR;
    public static final c MINOR;
    public static final c SIGNIFICANT;

    static {
        c cVar = new c("COSMETIC", 0);
        COSMETIC = cVar;
        c cVar2 = new c("MINOR", 1);
        MINOR = cVar2;
        c cVar3 = new c("SIGNIFICANT", 2);
        SIGNIFICANT = cVar3;
        c cVar4 = new c("MAJOR", 3);
        MAJOR = cVar4;
        c cVar5 = new c("CRITICAL", 4);
        CRITICAL = cVar5;
        c cVar6 = new c("BLOCKER", 5);
        BLOCKER = cVar6;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
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
