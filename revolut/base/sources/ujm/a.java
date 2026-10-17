package ujm;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AFTER_DOT;
    public static final a BEGINNING;
    public static final a MIDDLE;

    static {
        a aVar = new a("BEGINNING", 0);
        BEGINNING = aVar;
        a aVar2 = new a("MIDDLE", 1);
        MIDDLE = aVar2;
        a aVar3 = new a("AFTER_DOT", 2);
        AFTER_DOT = aVar3;
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
