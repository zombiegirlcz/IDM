package f11;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a INELIGIBLE;
    public static final a MAINTAIN_BALANCE;
    public static final a READY_TO_CLAIM;
    public static final a REWARD_ACTIVE;

    static {
        a aVar = new a("INELIGIBLE", 0);
        INELIGIBLE = aVar;
        a aVar2 = new a("READY_TO_CLAIM", 1);
        READY_TO_CLAIM = aVar2;
        a aVar3 = new a("MAINTAIN_BALANCE", 2);
        MAINTAIN_BALANCE = aVar3;
        a aVar4 = new a("REWARD_ACTIVE", 3);
        REWARD_ACTIVE = aVar4;
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
