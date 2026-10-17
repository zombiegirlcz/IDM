package com.revolut.feature.pricingplans.models;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a accent;
    public static final a danger;
    public static final a inactive;
    public static final a onMedia;
    public static final a success;
    public static final a warning;

    static {
        a aVar = new a("accent", 0);
        accent = aVar;
        a aVar2 = new a("success", 1);
        success = aVar2;
        a aVar3 = new a("warning", 2);
        warning = aVar3;
        a aVar4 = new a("danger", 3);
        danger = aVar4;
        a aVar5 = new a("inactive", 4);
        inactive = aVar5;
        a aVar6 = new a("onMedia", 5);
        onMedia = aVar6;
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
