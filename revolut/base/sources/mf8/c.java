package mf8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c FORBIDDEN_NAME;
    public static final c GUARDIAN_SYNC;
    public static final c SUSPICIOUS_DETAILS;
    public static final c UNKNOWN;

    static {
        c cVar = new c("GUARDIAN_SYNC", 0);
        GUARDIAN_SYNC = cVar;
        c cVar2 = new c("SUSPICIOUS_DETAILS", 1);
        SUSPICIOUS_DETAILS = cVar2;
        c cVar3 = new c("FORBIDDEN_NAME", 2);
        FORBIDDEN_NAME = cVar3;
        c cVar4 = new c("UNKNOWN", 3);
        UNKNOWN = cVar4;
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
}
