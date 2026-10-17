package jg1;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g APPLE_PAY;
    public static final g GOOGLE_PAY;
    public static final g SAMSUNG_WALLET;

    static {
        g gVar = new g("GOOGLE_PAY", 0);
        GOOGLE_PAY = gVar;
        g gVar2 = new g("APPLE_PAY", 1);
        APPLE_PAY = gVar2;
        g gVar3 = new g("SAMSUNG_WALLET", 2);
        SAMSUNG_WALLET = gVar3;
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
