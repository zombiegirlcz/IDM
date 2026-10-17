package n38;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class w {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w ACCEPTED;
    public static final w CANCELLED;
    public static final w PENDING;
    public static final w REJECTED;

    static {
        w wVar = new w("ACCEPTED", 0);
        ACCEPTED = wVar;
        w wVar2 = new w("PENDING", 1);
        PENDING = wVar2;
        w wVar3 = new w("REJECTED", 2);
        REJECTED = wVar3;
        w wVar4 = new w("CANCELLED", 3);
        CANCELLED = wVar4;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4};
        $VALUES = wVarArr;
        $ENTRIES = vc.s.n(wVarArr);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}
