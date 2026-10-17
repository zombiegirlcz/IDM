package rd0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c DEBUG;
    public static final c ERROR;
    public static final c INFO;
    public static final c VERBOSE;
    public static final c WARNING;
    public static final c WTF;

    static {
        c cVar = new c("DEBUG", 0);
        DEBUG = cVar;
        c cVar2 = new c("VERBOSE", 1);
        VERBOSE = cVar2;
        c cVar3 = new c("INFO", 2);
        INFO = cVar3;
        c cVar4 = new c("WARNING", 3);
        WARNING = cVar4;
        c cVar5 = new c("ERROR", 4);
        ERROR = cVar5;
        c cVar6 = new c("WTF", 5);
        WTF = cVar6;
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
