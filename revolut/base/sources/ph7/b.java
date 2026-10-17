package ph7;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ASSETS_TYPE;
    public static final b COLLECTION_KEY_FILTER;
    public static final b TIMEFRAME;

    static {
        b bVar = new b("ASSETS_TYPE", 0);
        ASSETS_TYPE = bVar;
        b bVar2 = new b("COLLECTION_KEY_FILTER", 1);
        COLLECTION_KEY_FILTER = bVar2;
        b bVar3 = new b("TIMEFRAME", 2);
        TIMEFRAME = bVar3;
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
