package com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e COMMODITY;
    public static final e CRYPTO;
    public static final e FIAT;

    static {
        e eVar = new e("FIAT", 0);
        FIAT = eVar;
        e eVar2 = new e("CRYPTO", 1);
        CRYPTO = eVar2;
        e eVar3 = new e("COMMODITY", 2);
        COMMODITY = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
