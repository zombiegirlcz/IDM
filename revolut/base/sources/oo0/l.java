package oo0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l CancelledByUser;
    public static final l Error;
    public static final l MaxDurationReached;
    public static final l StoppedByLifecycle;
    public static final l StoppedByUser;

    static {
        l lVar = new l("MaxDurationReached", 0);
        MaxDurationReached = lVar;
        l lVar2 = new l("Error", 1);
        Error = lVar2;
        l lVar3 = new l("StoppedByUser", 2);
        StoppedByUser = lVar3;
        l lVar4 = new l("CancelledByUser", 3);
        CancelledByUser = lVar4;
        l lVar5 = new l("StoppedByLifecycle", 4);
        StoppedByLifecycle = lVar5;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5};
        $VALUES = lVarArr;
        $ENTRIES = s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
