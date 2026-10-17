package lq0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d BOTTOM_TO_TOP;
    public static final d TOP_TO_BOTTOM;

    static {
        d dVar = new d("BOTTOM_TO_TOP", 0);
        BOTTOM_TO_TOP = dVar;
        d dVar2 = new d("TOP_TO_BOTTOM", 1);
        TOP_TO_BOTTOM = dVar2;
        d[] dVarArr = {dVar, dVar2};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
