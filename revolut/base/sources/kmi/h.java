package kmi;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h DISABLED;
    public static final h ENABLED;
    public static final h UNAVAILABLE;

    static {
        h hVar = new h("ENABLED", 0);
        ENABLED = hVar;
        h hVar2 = new h("DISABLED", 1);
        DISABLED = hVar2;
        h hVar3 = new h("UNAVAILABLE", 2);
        UNAVAILABLE = hVar3;
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
