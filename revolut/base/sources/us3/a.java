package us3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a INCOME_CHECK_FAILED;
    public static final a INCOME_CHECK_PASSED;
    public static final a INCOME_CHECK_SKIPPED;
    public static final a INCOME_FETCH_BLOCKED;
    public static final a INCOME_FETCH_FAILED;
    public static final a INCOME_FETCH_FINISHED;
    public static final a INCOME_FETCH_READY;
    public static final a INCOME_FETCH_STARTED;

    static {
        a aVar = new a("INCOME_FETCH_READY", 0);
        INCOME_FETCH_READY = aVar;
        a aVar2 = new a("INCOME_FETCH_STARTED", 1);
        INCOME_FETCH_STARTED = aVar2;
        a aVar3 = new a("INCOME_FETCH_FINISHED", 2);
        INCOME_FETCH_FINISHED = aVar3;
        a aVar4 = new a("INCOME_FETCH_FAILED", 3);
        INCOME_FETCH_FAILED = aVar4;
        a aVar5 = new a("INCOME_FETCH_BLOCKED", 4);
        INCOME_FETCH_BLOCKED = aVar5;
        a aVar6 = new a("INCOME_CHECK_PASSED", 5);
        INCOME_CHECK_PASSED = aVar6;
        a aVar7 = new a("INCOME_CHECK_FAILED", 6);
        INCOME_CHECK_FAILED = aVar7;
        a aVar8 = new a("INCOME_CHECK_SKIPPED", 7);
        INCOME_CHECK_SKIPPED = aVar8;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
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
