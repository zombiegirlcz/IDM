package cjm;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h DEPRECATED_LIST_METHODS;
    public static final h DROP;
    public static final h HIDDEN;
    public static final h NOT_CONSIDERED;
    public static final h VISIBLE;

    static {
        h hVar = new h("HIDDEN", 0);
        HIDDEN = hVar;
        h hVar2 = new h("VISIBLE", 1);
        VISIBLE = hVar2;
        h hVar3 = new h("DEPRECATED_LIST_METHODS", 2);
        DEPRECATED_LIST_METHODS = hVar3;
        h hVar4 = new h("NOT_CONSIDERED", 3);
        NOT_CONSIDERED = hVar4;
        h hVar5 = new h("DROP", 4);
        DROP = hVar5;
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
