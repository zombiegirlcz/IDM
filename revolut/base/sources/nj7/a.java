package nj7;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ADD_CANCELLATION_DATE;
    public static final a ADD_START_DATE;
    public static final a REMOVE_DOCUMENT;
    public static final a REMOVE_EXPENSE;
    public static final a SELECT_CANCELLER;
    public static final a SELECT_PURPOSE;

    static {
        a aVar = new a("ADD_START_DATE", 0);
        ADD_START_DATE = aVar;
        a aVar2 = new a("ADD_CANCELLATION_DATE", 1);
        ADD_CANCELLATION_DATE = aVar2;
        a aVar3 = new a("SELECT_PURPOSE", 2);
        SELECT_PURPOSE = aVar3;
        a aVar4 = new a("SELECT_CANCELLER", 3);
        SELECT_CANCELLER = aVar4;
        a aVar5 = new a("REMOVE_DOCUMENT", 4);
        REMOVE_DOCUMENT = aVar5;
        a aVar6 = new a("REMOVE_EXPENSE", 5);
        REMOVE_EXPENSE = aVar6;
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
