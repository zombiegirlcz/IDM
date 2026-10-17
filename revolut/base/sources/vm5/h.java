package vm5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h EMPTY;
    public static final h FUTURE_DATE;
    public static final h TOO_OLD;
    public static final h TOO_YOUNG;
    public static final h VALID;

    static {
        h hVar = new h("TOO_YOUNG", 0);
        TOO_YOUNG = hVar;
        h hVar2 = new h("TOO_OLD", 1);
        TOO_OLD = hVar2;
        h hVar3 = new h("FUTURE_DATE", 2);
        FUTURE_DATE = hVar3;
        h hVar4 = new h("EMPTY", 3);
        EMPTY = hVar4;
        h hVar5 = new h("VALID", 4);
        VALID = hVar5;
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
