package com.revolut.shared.feature.suspicious_transaction.api.models;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DELETE;
    public static final a PATCH;
    public static final a POST;
    public static final a PUT;

    static {
        a aVar = new a("POST", 0);
        POST = aVar;
        a aVar2 = new a("PUT", 1);
        PUT = aVar2;
        a aVar3 = new a("PATCH", 2);
        PATCH = aVar3;
        a aVar4 = new a("DELETE", 3);
        DELETE = aVar4;
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
