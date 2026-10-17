package com.revolut.feature.transport.api.navigation;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a NONE;
    public static final a TICKET_ACTIVATED;
    public static final a TICKET_EXTENDED;

    static {
        a aVar = new a("TICKET_ACTIVATED", 0);
        TICKET_ACTIVATED = aVar;
        a aVar2 = new a("TICKET_EXTENDED", 1);
        TICKET_EXTENDED = aVar2;
        a aVar3 = new a("NONE", 2);
        NONE = aVar3;
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
