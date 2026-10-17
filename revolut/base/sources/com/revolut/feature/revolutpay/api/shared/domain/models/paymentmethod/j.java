package com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j BUSINESS;
    public static final j PERSONAL;
    public static final j PERSONAL_JOINT;

    static {
        j jVar = new j("BUSINESS", 0);
        BUSINESS = jVar;
        j jVar2 = new j("PERSONAL", 1);
        PERSONAL = jVar2;
        j jVar3 = new j("PERSONAL_JOINT", 2);
        PERSONAL_JOINT = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
