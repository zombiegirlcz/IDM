package u09;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v APP_TIPS;
    public static final v CRYPTO;
    public static final v FRAUD;
    public static final v PRO;
    public static final v TRADING;
    public static final v YOUTH_TRADING;

    static {
        v vVar = new v("CRYPTO", 0);
        CRYPTO = vVar;
        v vVar2 = new v("TRADING", 1);
        TRADING = vVar2;
        v vVar3 = new v("FRAUD", 2);
        FRAUD = vVar3;
        v vVar4 = new v("APP_TIPS", 3);
        APP_TIPS = vVar4;
        v vVar5 = new v("PRO", 4);
        PRO = vVar5;
        v vVar6 = new v("YOUTH_TRADING", 5);
        YOUTH_TRADING = vVar6;
        v[] vVarArr = {vVar, vVar2, vVar3, vVar4, vVar5, vVar6};
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
