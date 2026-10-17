package a3f;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b GOOD;
    public static final b HIGH;
    public static final b HIGHEST;
    public static final b VERY_HIGH;

    static {
        b bVar = new b("HIGHEST", 0);
        HIGHEST = bVar;
        b bVar2 = new b("VERY_HIGH", 1);
        VERY_HIGH = bVar2;
        b bVar3 = new b("HIGH", 2);
        HIGH = bVar3;
        b bVar4 = new b("GOOD", 3);
        GOOD = bVar4;
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
