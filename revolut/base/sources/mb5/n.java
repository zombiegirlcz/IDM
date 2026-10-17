package mb5;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n CREATED;
    public static final n EXPIRED;

    static {
        n nVar = new n("EXPIRED", 0);
        EXPIRED = nVar;
        n nVar2 = new n("CREATED", 1);
        CREATED = nVar2;
        n[] nVarArr = {nVar, nVar2};
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
