package b00;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c NORMAL;
    public static final c TOO_BRIGHT;
    public static final c TOO_DARK;

    static {
        c cVar = new c("TOO_DARK", 0);
        TOO_DARK = cVar;
        c cVar2 = new c("TOO_BRIGHT", 1);
        TOO_BRIGHT = cVar2;
        c cVar3 = new c("NORMAL", 2);
        NORMAL = cVar3;
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
