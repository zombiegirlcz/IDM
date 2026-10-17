package htk;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b FALL;
    public static final b LIMITED_INCREASE;
    public static final b RISE;

    static {
        b bVar = new b("RISE", 0);
        RISE = bVar;
        b bVar2 = new b("FALL", 1);
        FALL = bVar2;
        b bVar3 = new b("LIMITED_INCREASE", 2);
        LIMITED_INCREASE = bVar3;
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
