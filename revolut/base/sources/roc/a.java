package roc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACHIEVED;
    public static final a FAILED;
    public static final a OFF_TRACK;
    public static final a ON_TRACK;

    static {
        a aVar = new a("ON_TRACK", 0);
        ON_TRACK = aVar;
        a aVar2 = new a("OFF_TRACK", 1);
        OFF_TRACK = aVar2;
        a aVar3 = new a("ACHIEVED", 2);
        ACHIEVED = aVar3;
        a aVar4 = new a("FAILED", 3);
        FAILED = aVar4;
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
