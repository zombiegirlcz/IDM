package zr6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h DOMESTIC;
    public static final h INTERNATIONAL;
    public static final h REGIONAL;

    static {
        h hVar = new h("DOMESTIC", 0);
        DOMESTIC = hVar;
        h hVar2 = new h("REGIONAL", 1);
        REGIONAL = hVar2;
        h hVar3 = new h("INTERNATIONAL", 2);
        INTERNATIONAL = hVar3;
        h[] hVarArr = {hVar, hVar2, hVar3};
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
