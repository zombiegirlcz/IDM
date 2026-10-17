package fmg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n COMPLETED;
    public static final n NOT_STARTED;
    public static final n PENDING;

    static {
        n nVar = new n("NOT_STARTED", 0);
        NOT_STARTED = nVar;
        n nVar2 = new n("PENDING", 1);
        PENDING = nVar2;
        n nVar3 = new n("COMPLETED", 2);
        COMPLETED = nVar3;
        n[] nVarArr = {nVar, nVar2, nVar3};
        $VALUES = nVarArr;
        $ENTRIES = vc.s.n(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
