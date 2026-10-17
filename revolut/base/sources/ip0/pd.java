package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class pd {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ pd[] $VALUES;
    public static final pd DEFAULT;
    public static final pd SUBTLE;

    static {
        pd pdVar = new pd("DEFAULT", 0);
        DEFAULT = pdVar;
        pd pdVar2 = new pd("SUBTLE", 1);
        SUBTLE = pdVar2;
        pd[] pdVarArr = {pdVar, pdVar2};
        $VALUES = pdVarArr;
        $ENTRIES = vc.s.n(pdVarArr);
    }

    public static pd valueOf(String str) {
        return (pd) Enum.valueOf(pd.class, str);
    }

    public static pd[] values() {
        return (pd[]) $VALUES.clone();
    }
}
