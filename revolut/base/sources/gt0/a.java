package gt0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a NO_SELECTION;
    public static final a OTHER_SELECTED;
    public static final a SELECTED;

    static {
        a aVar = new a("SELECTED", 0);
        SELECTED = aVar;
        a aVar2 = new a("OTHER_SELECTED", 1);
        OTHER_SELECTED = aVar2;
        a aVar3 = new a("NO_SELECTION", 2);
        NO_SELECTION = aVar3;
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
