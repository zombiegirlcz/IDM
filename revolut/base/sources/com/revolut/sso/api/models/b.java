package com.revolut.sso.api.models;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b PENDING_CONSENTING_DEVICE_LOCATION;
    public static final b PENDING_VERIFICATION;

    static {
        b bVar = new b("PENDING_CONSENTING_DEVICE_LOCATION", 0);
        PENDING_CONSENTING_DEVICE_LOCATION = bVar;
        b bVar2 = new b("PENDING_VERIFICATION", 1);
        PENDING_VERIFICATION = bVar2;
        b[] bVarArr = {bVar, bVar2};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
