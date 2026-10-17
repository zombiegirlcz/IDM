package tgi;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c GOOD_AFTERNOON;
    public static final c GOOD_EVENING;
    public static final c GOOD_MORNING;

    static {
        c cVar = new c("GOOD_MORNING", 0);
        GOOD_MORNING = cVar;
        c cVar2 = new c("GOOD_AFTERNOON", 1);
        GOOD_AFTERNOON = cVar2;
        c cVar3 = new c("GOOD_EVENING", 2);
        GOOD_EVENING = cVar3;
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
