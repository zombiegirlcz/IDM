package lr6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r AUTHORISED;
    public static final r CANCELLED;
    public static final r COMPLETED;
    public static final r FAILED;
    public static final r PENDING;
    public static final r PROCESSING;

    static {
        r rVar = new r("PENDING", 0);
        PENDING = rVar;
        r rVar2 = new r("PROCESSING", 1);
        PROCESSING = rVar2;
        r rVar3 = new r("AUTHORISED", 2);
        AUTHORISED = rVar3;
        r rVar4 = new r("COMPLETED", 3);
        COMPLETED = rVar4;
        r rVar5 = new r("CANCELLED", 4);
        CANCELLED = rVar5;
        r rVar6 = new r("FAILED", 5);
        FAILED = rVar6;
        r[] rVarArr = {rVar, rVar2, rVar3, rVar4, rVar5, rVar6};
        $VALUES = rVarArr;
        $ENTRIES = vc.s.n(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
