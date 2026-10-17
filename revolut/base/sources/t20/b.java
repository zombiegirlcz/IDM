package t20;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ANONYMOUS_CACHE;
    public static final b ANONYMOUS_FRESH;
    public static final b CACHE;
    public static final b FRESH;

    static {
        b bVar = new b("CACHE", 0);
        CACHE = bVar;
        b bVar2 = new b("FRESH", 1);
        FRESH = bVar2;
        b bVar3 = new b("ANONYMOUS_CACHE", 2);
        ANONYMOUS_CACHE = bVar3;
        b bVar4 = new b("ANONYMOUS_FRESH", 3);
        ANONYMOUS_FRESH = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
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
