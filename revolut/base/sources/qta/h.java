package qta;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ACTIVE;
    public static final h CANCELLED;
    public static final h COMPLETED;

    static {
        h hVar = new h("ACTIVE", 0);
        ACTIVE = hVar;
        h hVar2 = new h("COMPLETED", 1);
        COMPLETED = hVar2;
        h hVar3 = new h("CANCELLED", 2);
        CANCELLED = hVar3;
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
