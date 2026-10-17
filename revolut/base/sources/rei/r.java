package rei;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r COMPLETED;
    public static final r NOT_INITIATED;
    public static final r PENDING;

    static {
        r rVar = new r("NOT_INITIATED", 0);
        NOT_INITIATED = rVar;
        r rVar2 = new r("PENDING", 1);
        PENDING = rVar2;
        r rVar3 = new r("COMPLETED", 2);
        COMPLETED = rVar3;
        r[] rVarArr = {rVar, rVar2, rVar3};
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
