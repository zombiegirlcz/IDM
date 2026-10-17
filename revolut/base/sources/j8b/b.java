package j8b;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b NORMAL;
    public static final b PAST_EVENTS;
    public static final b SHORT;

    static {
        b bVar = new b("NORMAL", 0);
        NORMAL = bVar;
        b bVar2 = new b("SHORT", 1);
        SHORT = bVar2;
        b bVar3 = new b("PAST_EVENTS", 2);
        PAST_EVENTS = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
