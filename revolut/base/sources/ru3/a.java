package ru3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a APPLICATION_REJECTED;
    public static final a IN_PROGRESS;
    public static final a OFFER;

    static {
        a aVar = new a("IN_PROGRESS", 0);
        IN_PROGRESS = aVar;
        a aVar2 = new a("APPLICATION_REJECTED", 1);
        APPLICATION_REJECTED = aVar2;
        a aVar3 = new a("OFFER", 2);
        OFFER = aVar3;
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
