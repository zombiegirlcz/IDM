package m6j;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b LIMIT;
    public static final b MARKET;
    public static final b RECURRING;
    public static final b STOP;

    static {
        b bVar = new b("MARKET", 0);
        MARKET = bVar;
        b bVar2 = new b("LIMIT", 1);
        LIMIT = bVar2;
        b bVar3 = new b("STOP", 2);
        STOP = bVar3;
        b bVar4 = new b("RECURRING", 3);
        RECURRING = bVar4;
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
