package gu4;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ACTIVE;
    public static final c INACTIVE;
    public static final c NON_CONFIGURED;

    static {
        c cVar = new c("ACTIVE", 0);
        ACTIVE = cVar;
        c cVar2 = new c("INACTIVE", 1);
        INACTIVE = cVar2;
        c cVar3 = new c("NON_CONFIGURED", 2);
        NON_CONFIGURED = cVar3;
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
