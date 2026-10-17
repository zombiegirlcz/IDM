package cw0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h DEFAULT;
    public static final h EDITABLE;
    public static final h REMOVABLE;

    static {
        h hVar = new h("REMOVABLE", 0);
        REMOVABLE = hVar;
        h hVar2 = new h("EDITABLE", 1);
        EDITABLE = hVar2;
        h hVar3 = new h("DEFAULT", 2);
        DEFAULT = hVar3;
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
