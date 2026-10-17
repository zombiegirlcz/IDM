package kl4;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a FACILITY_IS_LATE;
    public static final a FACILITY_RECENTLY_OPENED;
    public static final a OFFER_NOT_AFFORDABLE;
    public static final a RECENT_CREDIT_LIMIT_CHANGE;

    static {
        a aVar = new a("FACILITY_RECENTLY_OPENED", 0);
        FACILITY_RECENTLY_OPENED = aVar;
        a aVar2 = new a("RECENT_CREDIT_LIMIT_CHANGE", 1);
        RECENT_CREDIT_LIMIT_CHANGE = aVar2;
        a aVar3 = new a("FACILITY_IS_LATE", 2);
        FACILITY_IS_LATE = aVar3;
        a aVar4 = new a("OFFER_NOT_AFFORDABLE", 3);
        OFFER_NOT_AFFORDABLE = aVar4;
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
