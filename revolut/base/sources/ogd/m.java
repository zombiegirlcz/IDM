package ogd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m ALPHABETICAL;
    public static final m CHANGE_24H;
    public static final m MANUAL;
    public static final m PRICE;
    public static final m PRICE_CHANGE;
    public static final m VOLUME;

    static {
        m mVar = new m("MANUAL", 0);
        MANUAL = mVar;
        m mVar2 = new m("PRICE_CHANGE", 1);
        PRICE_CHANGE = mVar2;
        m mVar3 = new m("ALPHABETICAL", 2);
        ALPHABETICAL = mVar3;
        m mVar4 = new m("VOLUME", 3);
        VOLUME = mVar4;
        m mVar5 = new m("CHANGE_24H", 4);
        CHANGE_24H = mVar5;
        m mVar6 = new m("PRICE", 5);
        PRICE = mVar6;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5, mVar6};
        $VALUES = mVarArr;
        $ENTRIES = s.n(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
