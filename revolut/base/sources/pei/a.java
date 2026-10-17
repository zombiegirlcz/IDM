package pei;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CANCELLED;
    public static final a CONFIRMED;
    public static final a CREATED;
    public static final a FAILED;

    static {
        a aVar = new a("CREATED", 0);
        CREATED = aVar;
        a aVar2 = new a("CONFIRMED", 1);
        CONFIRMED = aVar2;
        a aVar3 = new a("FAILED", 2);
        FAILED = aVar3;
        a aVar4 = new a("CANCELLED", 3);
        CANCELLED = aVar4;
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
