package ev0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ONLY_DAYS;
    public static final c UP_TO_DAYS;
    public static final c UP_TO_HOURS;

    static {
        c cVar = new c("ONLY_DAYS", 0);
        ONLY_DAYS = cVar;
        c cVar2 = new c("UP_TO_HOURS", 1);
        UP_TO_HOURS = cVar2;
        c cVar3 = new c("UP_TO_DAYS", 2);
        UP_TO_DAYS = cVar3;
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
