package x3g;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CANCELLABLE_IF_BAD_WEATHER;
    public static final a CANCELLABLE_IF_MIN_VISITORS_NOT_MET;

    static {
        a aVar = new a("CANCELLABLE_IF_BAD_WEATHER", 0);
        CANCELLABLE_IF_BAD_WEATHER = aVar;
        a aVar2 = new a("CANCELLABLE_IF_MIN_VISITORS_NOT_MET", 1);
        CANCELLABLE_IF_MIN_VISITORS_NOT_MET = aVar2;
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
