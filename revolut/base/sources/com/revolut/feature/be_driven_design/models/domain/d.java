package com.revolut.feature.be_driven_design.models.domain;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d DELETE;
    public static final d PATCH;
    public static final d POST;
    public static final d PUT;

    static {
        d dVar = new d("POST", 0);
        POST = dVar;
        d dVar2 = new d("PUT", 1);
        PUT = dVar2;
        d dVar3 = new d("PATCH", 2);
        PATCH = dVar3;
        d dVar4 = new d("DELETE", 3);
        DELETE = dVar4;
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
