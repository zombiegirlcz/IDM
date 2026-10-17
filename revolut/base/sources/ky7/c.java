package ky7;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ACTIVE;
    public static final c CANCELLED;
    public static final c IN_PROGRESS;

    static {
        c cVar = new c("ACTIVE", 0);
        ACTIVE = cVar;
        c cVar2 = new c("IN_PROGRESS", 1);
        IN_PROGRESS = cVar2;
        c cVar3 = new c("CANCELLED", 2);
        CANCELLED = cVar3;
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
