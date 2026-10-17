package com.revolut.feature.backend_flow.domain.models;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d DEFAULT;
    public static final d ERROR;
    public static final d PENDING;
    public static final d WARNING;

    static {
        d dVar = new d("ERROR", 0);
        ERROR = dVar;
        d dVar2 = new d("WARNING", 1);
        WARNING = dVar2;
        d dVar3 = new d("PENDING", 2);
        PENDING = dVar3;
        d dVar4 = new d("DEFAULT", 3);
        DEFAULT = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
