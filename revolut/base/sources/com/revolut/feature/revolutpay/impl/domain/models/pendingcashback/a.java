package com.revolut.feature.revolutpay.impl.domain.models.pendingcashback;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a Done;
    public static final a Failed;
    public static final a Pending;

    static {
        a aVar = new a("Pending", 0);
        Pending = aVar;
        a aVar2 = new a("Failed", 1);
        Failed = aVar2;
        a aVar3 = new a("Done", 2);
        Done = aVar3;
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
