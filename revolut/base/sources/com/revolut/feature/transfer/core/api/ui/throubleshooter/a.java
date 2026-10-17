package com.revolut.feature.transfer.core.api.ui.throubleshooter;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AFTER_BUFFER;
    public static final a BEFORE_BUFFER;
    public static final a PENDING;
    public static final a RECALL;

    static {
        a aVar = new a("PENDING", 0);
        PENDING = aVar;
        a aVar2 = new a("BEFORE_BUFFER", 1);
        BEFORE_BUFFER = aVar2;
        a aVar3 = new a("AFTER_BUFFER", 2);
        AFTER_BUFFER = aVar3;
        a aVar4 = new a("RECALL", 3);
        RECALL = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
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
