package pjb;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DEFAULT;
    public static final a METAL;
    public static final a PLUS;
    public static final a PREMIUM;
    public static final a ULTRA;
    public static final a UNKNOWN;

    static {
        a aVar = new a("ULTRA", 0);
        ULTRA = aVar;
        a aVar2 = new a("METAL", 1);
        METAL = aVar2;
        a aVar3 = new a("PREMIUM", 2);
        PREMIUM = aVar3;
        a aVar4 = new a("PLUS", 3);
        PLUS = aVar4;
        a aVar5 = new a("DEFAULT", 4);
        DEFAULT = aVar5;
        a aVar6 = new a("UNKNOWN", 5);
        UNKNOWN = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
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
