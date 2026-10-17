package myf;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class w {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w AIRPORT;
    public static final w HOTEL;
    public static final w LOCATION;
    public static final w OTHER;
    public static final w PORT;

    static {
        w wVar = new w("AIRPORT", 0);
        AIRPORT = wVar;
        w wVar2 = new w("HOTEL", 1);
        HOTEL = wVar2;
        w wVar3 = new w("PORT", 2);
        PORT = wVar3;
        w wVar4 = new w("LOCATION", 3);
        LOCATION = wVar4;
        w wVar5 = new w("OTHER", 4);
        OTHER = wVar5;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4, wVar5};
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
