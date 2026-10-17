package com.revolut.retail.feature.impl.budgeting.ui.rev10.flow;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c UPDATE_BUDGET;
    public static final c UPDATE_CATEGORY_BUDGET;

    static {
        c cVar = new c("UPDATE_BUDGET", 0);
        UPDATE_BUDGET = cVar;
        c cVar2 = new c("UPDATE_CATEGORY_BUDGET", 1);
        UPDATE_CATEGORY_BUDGET = cVar2;
        c[] cVarArr = {cVar, cVar2};
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
