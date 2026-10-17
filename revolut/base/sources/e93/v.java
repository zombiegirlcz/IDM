package e93;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v DEEPLINK_PHYSICAL;
    public static final v DEEPLINK_VIRTUAL;
    public static final v GET_PHYSICAL_CARD;

    static {
        v vVar = new v("DEEPLINK_PHYSICAL", 0);
        DEEPLINK_PHYSICAL = vVar;
        v vVar2 = new v("GET_PHYSICAL_CARD", 1);
        GET_PHYSICAL_CARD = vVar2;
        v vVar3 = new v("DEEPLINK_VIRTUAL", 2);
        DEEPLINK_VIRTUAL = vVar3;
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
