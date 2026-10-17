package n2m;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c FAILED;
    public static final c FINISHED;
    public static final c PREPARED;
    public static final c SCANNING;

    static {
        c cVar = new c("PREPARED", 0);
        PREPARED = cVar;
        c cVar2 = new c("SCANNING", 1);
        SCANNING = cVar2;
        c cVar3 = new c("FINISHED", 2);
        FINISHED = cVar3;
        c cVar4 = new c("FAILED", 3);
        FAILED = cVar4;
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
