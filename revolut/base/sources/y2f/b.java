package y2f;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b HISTORY_ONLY;
    public static final b WAIT_FOR_INCREMENTAL_UPDATE;

    static {
        b bVar = new b("HISTORY_ONLY", 0);
        HISTORY_ONLY = bVar;
        b bVar2 = new b("WAIT_FOR_INCREMENTAL_UPDATE", 1);
        WAIT_FOR_INCREMENTAL_UPDATE = bVar2;
        b[] bVarArr = {bVar, bVar2};
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
