package ruk;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ANALYST_RATINGS;
    public static final h ANALYST_TARGETS;
    private final int order;

    static {
        h hVar = new h("ANALYST_RATINGS", 0, 0);
        ANALYST_RATINGS = hVar;
        h hVar2 = new h("ANALYST_TARGETS", 1, 1);
        ANALYST_TARGETS = hVar2;
        h[] hVarArr = {hVar, hVar2};
        $VALUES = hVarArr;
        $ENTRIES = vc.s.n(hVarArr);
    }

    public h(String str, int i, int i2) {
        this.order = i2;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final int a() {
        return this.order;
    }
}
