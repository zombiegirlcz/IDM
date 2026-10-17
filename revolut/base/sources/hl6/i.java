package hl6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i DISABLED;
    public static final i ENABLED;
    public static final i UNAVAILABLE;

    static {
        i iVar = new i("ENABLED", 0);
        ENABLED = iVar;
        i iVar2 = new i("DISABLED", 1);
        DISABLED = iVar2;
        i iVar3 = new i("UNAVAILABLE", 2);
        UNAVAILABLE = iVar3;
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
