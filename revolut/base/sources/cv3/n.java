package cv3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n DEFAULT;
    public static final n SAVE_FOR_LATER;
    private final String actionId;

    static {
        n nVar = new n("DEFAULT", 0, null);
        DEFAULT = nVar;
        n nVar2 = new n("SAVE_FOR_LATER", 1, "saveForLater");
        SAVE_FOR_LATER = nVar2;
        n[] nVarArr = {nVar, nVar2};
        $VALUES = nVarArr;
        $ENTRIES = vc.s.n(nVarArr);
    }

    public n(String str, int i, String str2) {
        this.actionId = str2;
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    public final String a() {
        return this.actionId;
    }
}
