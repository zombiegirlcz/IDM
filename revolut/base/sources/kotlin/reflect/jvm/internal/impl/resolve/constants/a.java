package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a COMMON_SUPER_TYPE;
    public static final a INTERSECTION_TYPE;

    static {
        a aVar = new a("COMMON_SUPER_TYPE", 0);
        COMMON_SUPER_TYPE = aVar;
        a aVar2 = new a("INTERSECTION_TYPE", 1);
        INTERSECTION_TYPE = aVar2;
        a[] aVarArr = {aVar, aVar2};
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
