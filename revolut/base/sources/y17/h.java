package y17;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ACCOUNT_RESTRICTION;
    public static final h ALL_CHECKS_PASSED;
    public static final h ANNUAL_INBOUND_VOLUME_BLOCK;
    public static final h KYM_NOT_PASSED;
    public static final h PRODUCT_ARTICLE;
    public static final h SALE_VISIBILITY;
    public static final h WEBSITE_URL;

    static {
        h hVar = new h("SALE_VISIBILITY", 0);
        SALE_VISIBILITY = hVar;
        h hVar2 = new h("PRODUCT_ARTICLE", 1);
        PRODUCT_ARTICLE = hVar2;
        h hVar3 = new h("WEBSITE_URL", 2);
        WEBSITE_URL = hVar3;
        h hVar4 = new h("KYM_NOT_PASSED", 3);
        KYM_NOT_PASSED = hVar4;
        h hVar5 = new h("ANNUAL_INBOUND_VOLUME_BLOCK", 4);
        ANNUAL_INBOUND_VOLUME_BLOCK = hVar5;
        h hVar6 = new h("ACCOUNT_RESTRICTION", 5);
        ACCOUNT_RESTRICTION = hVar6;
        h hVar7 = new h("ALL_CHECKS_PASSED", 6);
        ALL_CHECKS_PASSED = hVar7;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
