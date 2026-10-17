package lr6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c NOT_AVAILABLE;
    public static final c ONBOARDED;
    public static final c PENDING;
    public static final c UNKNOWN;

    static {
        c cVar = new c("PENDING", 0);
        PENDING = cVar;
        c cVar2 = new c("ONBOARDED", 1);
        ONBOARDED = cVar2;
        c cVar3 = new c("NOT_AVAILABLE", 2);
        NOT_AVAILABLE = cVar3;
        c cVar4 = new c("UNKNOWN", 3);
        UNKNOWN = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        $VALUES = cVarArr;
        $ENTRIES = vc.s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
