package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class nf {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ nf[] $VALUES;
    public static final nf DP_16;
    public static final nf DP_20;

    static {
        nf nfVar = new nf("DP_16", 0);
        DP_16 = nfVar;
        nf nfVar2 = new nf("DP_20", 1);
        DP_20 = nfVar2;
        nf[] nfVarArr = {nfVar, nfVar2};
        $VALUES = nfVarArr;
        $ENTRIES = vc.s.n(nfVarArr);
    }

    public static nf valueOf(String str) {
        return (nf) Enum.valueOf(nf.class, str);
    }

    public static nf[] values() {
        return (nf[]) $VALUES.clone();
    }
}
