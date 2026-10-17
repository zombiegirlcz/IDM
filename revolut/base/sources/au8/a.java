package au8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ELIGIBLE;
    public static final a NOT_ELIGIBLE;
    public static final a PENDING;

    static {
        a aVar = new a("NOT_ELIGIBLE", 0);
        NOT_ELIGIBLE = aVar;
        a aVar2 = new a("PENDING", 1);
        PENDING = aVar2;
        a aVar3 = new a("ELIGIBLE", 2);
        ELIGIBLE = aVar3;
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
