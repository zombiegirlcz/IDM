package u8f;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ACAT_FULL;
    public static final h ACAT_PARTIAL;
    public static final h DRS;
    public static final h DTC;
    public static final h FOP;
    public static final h ISA;

    static {
        h hVar = new h("ACAT_FULL", 0);
        ACAT_FULL = hVar;
        h hVar2 = new h("ACAT_PARTIAL", 1);
        ACAT_PARTIAL = hVar2;
        h hVar3 = new h("DRS", 2);
        DRS = hVar3;
        h hVar4 = new h("DTC", 3);
        DTC = hVar4;
        h hVar5 = new h("ISA", 4);
        ISA = hVar5;
        h hVar6 = new h("FOP", 5);
        FOP = hVar6;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6};
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
