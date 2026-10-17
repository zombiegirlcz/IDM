package com.revolut.retail.feature.pricing_plans.ui.api.models;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CENTERED;
    public static final c LEFT_ALIGNED;
    public static final c LEGACY;

    static {
        c cVar = new c("LEGACY", 0);
        LEGACY = cVar;
        c cVar2 = new c("CENTERED", 1);
        CENTERED = cVar2;
        c cVar3 = new c("LEFT_ALIGNED", 2);
        LEFT_ALIGNED = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
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
