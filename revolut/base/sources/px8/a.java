package px8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CANCEL;
    public static final a COMPLETE;
    public static final a DECLINE;
    public static final a DISABLED;
    public static final a MISMATCH;
    public static final a NO_AGENTS_AVAILABLE;

    static {
        a aVar = new a("DISABLED", 0);
        DISABLED = aVar;
        a aVar2 = new a("CANCEL", 1);
        CANCEL = aVar2;
        a aVar3 = new a("COMPLETE", 2);
        COMPLETE = aVar3;
        a aVar4 = new a("MISMATCH", 3);
        MISMATCH = aVar4;
        a aVar5 = new a("DECLINE", 4);
        DECLINE = aVar5;
        a aVar6 = new a("NO_AGENTS_AVAILABLE", 5);
        NO_AGENTS_AVAILABLE = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
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
