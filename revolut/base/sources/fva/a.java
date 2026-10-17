package fva;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CHANGE_AMOUNT;
    public static final a CHANGE_DATE;
    public static final a CHANGE_DESCRIPTION;
    public static final a CHANGE_FREQUENCY;
    public static final a CHANGE_POCKET_ID;
    public static final a CHANGE_RECURRENCY;

    static {
        a aVar = new a("CHANGE_FREQUENCY", 0);
        CHANGE_FREQUENCY = aVar;
        a aVar2 = new a("CHANGE_RECURRENCY", 1);
        CHANGE_RECURRENCY = aVar2;
        a aVar3 = new a("CHANGE_DATE", 2);
        CHANGE_DATE = aVar3;
        a aVar4 = new a("CHANGE_AMOUNT", 3);
        CHANGE_AMOUNT = aVar4;
        a aVar5 = new a("CHANGE_POCKET_ID", 4);
        CHANGE_POCKET_ID = aVar5;
        a aVar6 = new a("CHANGE_DESCRIPTION", 5);
        CHANGE_DESCRIPTION = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
