package t3l;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BY_DISMISS_METHOD_CALL;
    public static final a BY_NEXT_SNACKBAR;
    public static final a BY_SWIPE;
    public static final a BY_TIMEOUT;

    static {
        a aVar = new a("BY_SWIPE", 0);
        BY_SWIPE = aVar;
        a aVar2 = new a("BY_TIMEOUT", 1);
        BY_TIMEOUT = aVar2;
        a aVar3 = new a("BY_DISMISS_METHOD_CALL", 2);
        BY_DISMISS_METHOD_CALL = aVar3;
        a aVar4 = new a("BY_NEXT_SNACKBAR", 3);
        BY_NEXT_SNACKBAR = aVar4;
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
