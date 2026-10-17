package h3b;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m ACCOUNT_VALUE;
    public static final m AVAILABLE_TO_INVEST;
    public static final m MARGIN_RESERVED;
    public static final m PNL;

    static {
        m mVar = new m("ACCOUNT_VALUE", 0);
        ACCOUNT_VALUE = mVar;
        m mVar2 = new m("PNL", 1);
        PNL = mVar2;
        m mVar3 = new m("MARGIN_RESERVED", 2);
        MARGIN_RESERVED = mVar3;
        m mVar4 = new m("AVAILABLE_TO_INVEST", 3);
        AVAILABLE_TO_INVEST = mVar4;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4};
        $VALUES = mVarArr;
        $ENTRIES = vc.s.n(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
