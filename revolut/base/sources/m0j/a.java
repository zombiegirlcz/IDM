package m0j;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a FINISHED;
    public static final a IN_PROGRESS;
    public static final a NOT_STARTED;

    static {
        a aVar = new a("NOT_STARTED", 0);
        NOT_STARTED = aVar;
        a aVar2 = new a("IN_PROGRESS", 1);
        IN_PROGRESS = aVar2;
        a aVar3 = new a("FINISHED", 2);
        FINISHED = aVar3;
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
