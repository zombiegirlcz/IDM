package or0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i ENSURE_MINIMAL;
    public static final i INCREASE;
    public static final i NONE;

    static {
        i iVar = new i("NONE", 0);
        NONE = iVar;
        i iVar2 = new i("INCREASE", 1);
        INCREASE = iVar2;
        i iVar3 = new i("ENSURE_MINIMAL", 2);
        ENSURE_MINIMAL = iVar3;
        i[] iVarArr = {iVar, iVar2, iVar3};
        $VALUES = iVarArr;
        $ENTRIES = vc.s.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
