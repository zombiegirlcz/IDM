package zel;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i ASC;
    public static final i DESC;

    static {
        i iVar = new i("ASC", 0);
        ASC = iVar;
        i iVar2 = new i("DESC", 1);
        DESC = iVar2;
        i[] iVarArr = {iVar, iVar2};
        $VALUES = iVarArr;
        $ENTRIES = s.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
