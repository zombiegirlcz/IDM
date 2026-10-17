package zxc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACTION_REQUIRED;
    public static final a INITIAL;
    public static final a IN_REVIEW;
    public static final a PENDING;
    public static final a TO_BE_REVIEWED;
    public static final a UNKNOWN;
    public static final a VERIFIED;

    static {
        a aVar = new a("INITIAL", 0);
        INITIAL = aVar;
        a aVar2 = new a("PENDING", 1);
        PENDING = aVar2;
        a aVar3 = new a("ACTION_REQUIRED", 2);
        ACTION_REQUIRED = aVar3;
        a aVar4 = new a("TO_BE_REVIEWED", 3);
        TO_BE_REVIEWED = aVar4;
        a aVar5 = new a("IN_REVIEW", 4);
        IN_REVIEW = aVar5;
        a aVar6 = new a("VERIFIED", 5);
        VERIFIED = aVar6;
        a aVar7 = new a("UNKNOWN", 6);
        UNKNOWN = aVar7;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
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
