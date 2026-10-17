package hyc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a APPROVED;
    public static final a NONE;
    public static final a REJECTED;
    public static final a REQUESTED;
    public static final a REQUESTED_UNDER_REVIEW;
    public static final a REQUIRED;
    public static final a REQUIRED_UNDER_REVIEW;

    static {
        a aVar = new a("NONE", 0);
        NONE = aVar;
        a aVar2 = new a("APPROVED", 1);
        APPROVED = aVar2;
        a aVar3 = new a("REJECTED", 2);
        REJECTED = aVar3;
        a aVar4 = new a("REQUIRED", 3);
        REQUIRED = aVar4;
        a aVar5 = new a("REQUESTED", 4);
        REQUESTED = aVar5;
        a aVar6 = new a("REQUIRED_UNDER_REVIEW", 5);
        REQUIRED_UNDER_REVIEW = aVar6;
        a aVar7 = new a("REQUESTED_UNDER_REVIEW", 6);
        REQUESTED_UNDER_REVIEW = aVar7;
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
