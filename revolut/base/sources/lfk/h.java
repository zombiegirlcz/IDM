package lfk;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ACCEPTED;
    public static final h CANCELLED;
    public static final h REJECTED;

    static {
        h hVar = new h("ACCEPTED", 0);
        ACCEPTED = hVar;
        h hVar2 = new h("REJECTED", 1);
        REJECTED = hVar2;
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
