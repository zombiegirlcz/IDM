package oag;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c POPULAR;
    public static final c RECENT_LOCATION;
    public static final c RECENT_PROPERTY;
    public static final c RECENT_SMART_SEARCH;
    public static final c SEARCHED_LOCATION;
    public static final c SEARCHED_PROPERTY;

    static {
        c cVar = new c("SEARCHED_LOCATION", 0);
        SEARCHED_LOCATION = cVar;
        c cVar2 = new c("POPULAR", 1);
        POPULAR = cVar2;
        c cVar3 = new c("RECENT_LOCATION", 2);
        RECENT_LOCATION = cVar3;
        c cVar4 = new c("SEARCHED_PROPERTY", 3);
        SEARCHED_PROPERTY = cVar4;
        c cVar5 = new c("RECENT_PROPERTY", 4);
        RECENT_PROPERTY = cVar5;
        c cVar6 = new c("RECENT_SMART_SEARCH", 5);
        RECENT_SMART_SEARCH = cVar6;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
