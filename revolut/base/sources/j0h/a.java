package j0h;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ONE_OFF_OR_RECURRING_DEPOSIT;
    public static final a REQUIRE_ONE_OFF_DEPOSIT;
    public static final a REQUIRE_RECURRING_DEPOSIT;

    static {
        a aVar = new a("REQUIRE_RECURRING_DEPOSIT", 0);
        REQUIRE_RECURRING_DEPOSIT = aVar;
        a aVar2 = new a("REQUIRE_ONE_OFF_DEPOSIT", 1);
        REQUIRE_ONE_OFF_DEPOSIT = aVar2;
        a aVar3 = new a("ONE_OFF_OR_RECURRING_DEPOSIT", 2);
        ONE_OFF_OR_RECURRING_DEPOSIT = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
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
