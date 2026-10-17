package wd6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ALL;
    public static final c COMMODITY_ONLY;
    public static final c CRYPTO_ONLY;
    public static final c FIAT_ONLY;
    public static final c FREELANCER_ONLY;

    static {
        c cVar = new c("ALL", 0);
        ALL = cVar;
        c cVar2 = new c("CRYPTO_ONLY", 1);
        CRYPTO_ONLY = cVar2;
        c cVar3 = new c("COMMODITY_ONLY", 2);
        COMMODITY_ONLY = cVar3;
        c cVar4 = new c("FREELANCER_ONLY", 3);
        FREELANCER_ONLY = cVar4;
        c cVar5 = new c("FIAT_ONLY", 4);
        FIAT_ONLY = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final boolean a() {
        return this == FIAT_ONLY || this == FREELANCER_ONLY;
    }
}
