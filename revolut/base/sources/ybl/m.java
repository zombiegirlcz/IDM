package ybl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m COMMODITIES;
    public static final m CRYPTO;
    public static final m STOCKS;

    static {
        m mVar = new m("STOCKS", 0);
        STOCKS = mVar;
        m mVar2 = new m("CRYPTO", 1);
        CRYPTO = mVar2;
        m mVar3 = new m("COMMODITIES", 2);
        COMMODITIES = mVar3;
        m[] mVarArr = {mVar, mVar2, mVar3};
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
