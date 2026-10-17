package com.revolut.feature.transactions.api.navigation;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ACCEPT_ALERT;
    public static final c CANCEL;
    public static final c NONE;
    public static final c RATING;

    static {
        c cVar = new c("RATING", 0);
        RATING = cVar;
        c cVar2 = new c("CANCEL", 1);
        CANCEL = cVar2;
        c cVar3 = new c("ACCEPT_ALERT", 2);
        ACCEPT_ALERT = cVar3;
        c cVar4 = new c("NONE", 3);
        NONE = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
