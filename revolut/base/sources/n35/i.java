package n35;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i ExactDueAmount;
    public static final i LessThanDue;
    public static final i MoreThanDue;

    static {
        i iVar = new i("ExactDueAmount", 0);
        ExactDueAmount = iVar;
        i iVar2 = new i("LessThanDue", 1);
        LessThanDue = iVar2;
        i iVar3 = new i("MoreThanDue", 2);
        MoreThanDue = iVar3;
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
