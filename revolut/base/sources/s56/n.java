package s56;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n ASSET_OUT;
    public static final n SECONDARY;

    static {
        n nVar = new n("ASSET_OUT", 0);
        ASSET_OUT = nVar;
        n nVar2 = new n("SECONDARY", 1);
        SECONDARY = nVar2;
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
