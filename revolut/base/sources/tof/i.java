package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i PAYID_ALIAS;
    public static final i SPIN_ALIAS;
    public static final i UNKNOWN;

    static {
        i iVar = new i("UNKNOWN", 0);
        UNKNOWN = iVar;
        i iVar2 = new i("PAYID_ALIAS", 1);
        PAYID_ALIAS = iVar2;
        i iVar3 = new i("SPIN_ALIAS", 2);
        SPIN_ALIAS = iVar3;
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
