package bgb;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c DEEPLINK;
    public static final c PRODUCT_ARTICLE;
    public static final c SALARY_HUB;

    static {
        c cVar = new c("PRODUCT_ARTICLE", 0);
        PRODUCT_ARTICLE = cVar;
        c cVar2 = new c("SALARY_HUB", 1);
        SALARY_HUB = cVar2;
        c cVar3 = new c("DEEPLINK", 2);
        DEEPLINK = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
