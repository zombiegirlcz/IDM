package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class pa {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ pa[] $VALUES;
    public static final pa LIGHT;
    public static final pa NORMAL;
    public static final pa PRODUCT_ARTICLE;

    static {
        pa paVar = new pa("NORMAL", 0);
        NORMAL = paVar;
        pa paVar2 = new pa("LIGHT", 1);
        LIGHT = paVar2;
        pa paVar3 = new pa("PRODUCT_ARTICLE", 2);
        PRODUCT_ARTICLE = paVar3;
        pa[] paVarArr = {paVar, paVar2, paVar3};
        $VALUES = paVarArr;
        $ENTRIES = vc.s.n(paVarArr);
    }

    public static pa valueOf(String str) {
        return (pa) Enum.valueOf(pa.class, str);
    }

    public static pa[] values() {
        return (pa[]) $VALUES.clone();
    }
}
