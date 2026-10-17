package xod;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v ARROW_DOWN_ON_INCREASE;
    public static final v ARROW_UP_ON_INCREASE;

    static {
        v vVar = new v("ARROW_UP_ON_INCREASE", 0);
        ARROW_UP_ON_INCREASE = vVar;
        v vVar2 = new v("ARROW_DOWN_ON_INCREASE", 1);
        ARROW_DOWN_ON_INCREASE = vVar2;
        v[] vVarArr = {vVar, vVar2};
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
