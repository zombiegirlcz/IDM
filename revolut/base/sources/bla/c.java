package bla;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c DISABLED;
    public static final c ENABLED;
    public static final c INACTIVE;
    public static final c NOT_AVAILABLE;

    static {
        c cVar = new c("ENABLED", 0);
        ENABLED = cVar;
        c cVar2 = new c("INACTIVE", 1);
        INACTIVE = cVar2;
        c cVar3 = new c("DISABLED", 2);
        DISABLED = cVar3;
        c cVar4 = new c("NOT_AVAILABLE", 3);
        NOT_AVAILABLE = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final boolean a() {
        return this == ENABLED;
    }
}
