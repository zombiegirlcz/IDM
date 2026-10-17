package com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g CLEARBANK;
    public static final g FLAGSTONE;
    public static final g REVOLUT;

    static {
        g gVar = new g("REVOLUT", 0);
        REVOLUT = gVar;
        g gVar2 = new g("CLEARBANK", 1);
        CLEARBANK = gVar2;
        g gVar3 = new g("FLAGSTONE", 2);
        FLAGSTONE = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
