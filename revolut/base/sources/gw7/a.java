package gw7;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CAR_INSURANCE;
    public static final a EMBEDDED_INSURANCE;
    public static final a PET_INSURANCE;

    static {
        a aVar = new a("CAR_INSURANCE", 0);
        CAR_INSURANCE = aVar;
        a aVar2 = new a("PET_INSURANCE", 1);
        PET_INSURANCE = aVar2;
        a aVar3 = new a("EMBEDDED_INSURANCE", 2);
        EMBEDDED_INSURANCE = aVar3;
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
