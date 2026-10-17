package bgf;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c IN_PROGRESS;
    public static final c UNKNOWN;
    public static final c WARNING;

    static {
        c cVar = new c("IN_PROGRESS", 0);
        IN_PROGRESS = cVar;
        c cVar2 = new c("WARNING", 1);
        WARNING = cVar2;
        c cVar3 = new c("UNKNOWN", 2);
        UNKNOWN = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
