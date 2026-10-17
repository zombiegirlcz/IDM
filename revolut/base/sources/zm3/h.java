package zm3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ESSENTIALS;
    public static final h METAL;
    public static final h PLUS;
    public static final h PREMIUM;
    public static final h PRIVATE;
    public static final h STANDARD;
    public static final h ULTRA;

    static {
        h hVar = new h("PRIVATE", 0);
        PRIVATE = hVar;
        h hVar2 = new h("ULTRA", 1);
        ULTRA = hVar2;
        h hVar3 = new h("METAL", 2);
        METAL = hVar3;
        h hVar4 = new h("PREMIUM", 3);
        PREMIUM = hVar4;
        h hVar5 = new h("PLUS", 4);
        PLUS = hVar5;
        h hVar6 = new h("STANDARD", 5);
        STANDARD = hVar6;
        h hVar7 = new h("ESSENTIALS", 6);
        ESSENTIALS = hVar7;
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
