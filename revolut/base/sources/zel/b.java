package zel;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b MOST_OWNED;
    public static final b MOST_TRADED;
    public static final b TOP_MOVERS;

    static {
        b bVar = new b("TOP_MOVERS", 0);
        TOP_MOVERS = bVar;
        b bVar2 = new b("MOST_TRADED", 1);
        MOST_TRADED = bVar2;
        b bVar3 = new b("MOST_OWNED", 2);
        MOST_OWNED = bVar3;
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
