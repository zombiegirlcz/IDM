package tig;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a WITHOUT_SUCCESS_DESCRIPTION;
    public static final a WITH_SPARE_CHANGE;
    public static final a WITH_SUCCESS_DESCRIPTION;

    static {
        a aVar = new a("WITH_SUCCESS_DESCRIPTION", 0);
        WITH_SUCCESS_DESCRIPTION = aVar;
        a aVar2 = new a("WITHOUT_SUCCESS_DESCRIPTION", 1);
        WITHOUT_SUCCESS_DESCRIPTION = aVar2;
        a aVar3 = new a("WITH_SPARE_CHANGE", 2);
        WITH_SPARE_CHANGE = aVar3;
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
