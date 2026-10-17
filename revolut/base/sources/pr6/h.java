package pr6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ACQUIRING;
    public static final h ACQUIRING_LOYALTY;
    public static final h FX;
    public static final h OTHER;
    public static final h TRANSFER;

    static {
        h hVar = new h("ACQUIRING_LOYALTY", 0);
        ACQUIRING_LOYALTY = hVar;
        h hVar2 = new h("ACQUIRING", 1);
        ACQUIRING = hVar2;
        h hVar3 = new h("FX", 2);
        FX = hVar3;
        h hVar4 = new h("TRANSFER", 3);
        TRANSFER = hVar4;
        h hVar5 = new h("OTHER", 4);
        OTHER = hVar5;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5};
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
