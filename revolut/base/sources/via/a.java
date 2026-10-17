package via;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AFFILIATE;
    public static final a NONE;
    public static final a ORGANIC;
    public static final a PARTNERSHIP;
    public static final a REFERRAL;

    static {
        a aVar = new a("PARTNERSHIP", 0);
        PARTNERSHIP = aVar;
        a aVar2 = new a("ORGANIC", 1);
        ORGANIC = aVar2;
        a aVar3 = new a("AFFILIATE", 2);
        AFFILIATE = aVar3;
        a aVar4 = new a("REFERRAL", 3);
        REFERRAL = aVar4;
        a aVar5 = new a("NONE", 4);
        NONE = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
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
