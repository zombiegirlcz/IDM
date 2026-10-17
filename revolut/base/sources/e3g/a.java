package e3g;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ENUM;
    public static final a HEIGHT;
    public static final a TIME;
    public static final a WEIGHT;

    static {
        a aVar = new a("ENUM", 0);
        ENUM = aVar;
        a aVar2 = new a("WEIGHT", 1);
        WEIGHT = aVar2;
        a aVar3 = new a("HEIGHT", 2);
        HEIGHT = aVar3;
        a aVar4 = new a("TIME", 3);
        TIME = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
