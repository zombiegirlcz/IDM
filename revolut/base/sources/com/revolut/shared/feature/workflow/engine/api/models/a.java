package com.revolut.shared.feature.workflow.engine.api.models;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a PROHIBITED_RESIDENCY_CONFIRMED;
    public static final a TAX_RESIDENCY_SELF_CERTIFICATION_AGREED;

    static {
        a aVar = new a("TAX_RESIDENCY_SELF_CERTIFICATION_AGREED", 0);
        TAX_RESIDENCY_SELF_CERTIFICATION_AGREED = aVar;
        a aVar2 = new a("PROHIBITED_RESIDENCY_CONFIRMED", 1);
        PROHIBITED_RESIDENCY_CONFIRMED = aVar2;
        a[] aVarArr = {aVar, aVar2};
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
