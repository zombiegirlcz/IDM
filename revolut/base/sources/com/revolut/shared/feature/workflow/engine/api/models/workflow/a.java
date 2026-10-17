package com.revolut.shared.feature.workflow.engine.api.models.workflow;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DAY;
    public static final a MONTH;
    public static final a YEAR;

    static {
        a aVar = new a("DAY", 0);
        DAY = aVar;
        a aVar2 = new a("MONTH", 1);
        MONTH = aVar2;
        a aVar3 = new a("YEAR", 2);
        YEAR = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
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
