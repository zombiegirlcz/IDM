package xr6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h AMERICAN_EXPRESS;
    public static final h DISCOVER;
    public static final h JCB;
    public static final h MASTERCARD;
    public static final h PRIVATE_LABEL;
    public static final h VISA;

    static {
        h hVar = new h("AMERICAN_EXPRESS", 0);
        AMERICAN_EXPRESS = hVar;
        h hVar2 = new h("DISCOVER", 1);
        DISCOVER = hVar2;
        h hVar3 = new h("JCB", 2);
        JCB = hVar3;
        h hVar4 = new h("MASTERCARD", 3);
        MASTERCARD = hVar4;
        h hVar5 = new h("PRIVATE_LABEL", 4);
        PRIVATE_LABEL = hVar5;
        h hVar6 = new h("VISA", 5);
        VISA = hVar6;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6};
        $VALUES = hVarArr;
        $ENTRIES = vc.s.n(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
