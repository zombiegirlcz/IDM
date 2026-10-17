package iu9;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CHARACTER_LIMIT_EXCEED;
    public static final c CONTAINS_LINKS;
    public static final c VALID;

    static {
        c cVar = new c("VALID", 0);
        VALID = cVar;
        c cVar2 = new c("CONTAINS_LINKS", 1);
        CONTAINS_LINKS = cVar2;
        c cVar3 = new c("CHARACTER_LIMIT_EXCEED", 2);
        CHARACTER_LIMIT_EXCEED = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
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
