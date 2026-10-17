package iha;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v DISCOUNT_PERIOD;
    public static final v FREE_PERIOD;
    public static final v NO_OFFER;

    static {
        v vVar = new v("FREE_PERIOD", 0);
        FREE_PERIOD = vVar;
        v vVar2 = new v("NO_OFFER", 1);
        NO_OFFER = vVar2;
        v vVar3 = new v("DISCOUNT_PERIOD", 2);
        DISCOUNT_PERIOD = vVar3;
        v[] vVarArr = {vVar, vVar2, vVar3};
        $VALUES = vVarArr;
        $ENTRIES = vc.s.n(vVarArr);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
