package xdh;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ACTIVE;
    public static final c CREATED;
    public static final c OFFBOARDING;
    public static final c SUSPENDED;
    public static final c TERMINATED;

    static {
        c cVar = new c("CREATED", 0);
        CREATED = cVar;
        c cVar2 = new c("ACTIVE", 1);
        ACTIVE = cVar2;
        c cVar3 = new c("SUSPENDED", 2);
        SUSPENDED = cVar3;
        c cVar4 = new c("OFFBOARDING", 3);
        OFFBOARDING = cVar4;
        c cVar5 = new c("TERMINATED", 4);
        TERMINATED = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
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
