package adg;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i ADULT;
    public static final i CHILD;

    static {
        i iVar = new i("ADULT", 0);
        ADULT = iVar;
        i iVar2 = new i("CHILD", 1);
        CHILD = iVar2;
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
