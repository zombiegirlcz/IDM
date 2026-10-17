package ali;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i HORIZONTAL;
    public static final i PAGER;
    public static final i VERTICAL;

    static {
        i iVar = new i("HORIZONTAL", 0);
        HORIZONTAL = iVar;
        i iVar2 = new i("VERTICAL", 1);
        VERTICAL = iVar2;
        i iVar3 = new i("PAGER", 2);
        PAGER = iVar3;
        i[] iVarArr = {iVar, iVar2, iVar3};
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
