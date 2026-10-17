package t1e;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m CARD;
    public static final m REVPAY;
    public static final m UNKNOWN;

    static {
        m mVar = new m("CARD", 0);
        CARD = mVar;
        m mVar2 = new m("REVPAY", 1);
        REVPAY = mVar2;
        m mVar3 = new m("UNKNOWN", 2);
        UNKNOWN = mVar3;
        m[] mVarArr = {mVar, mVar2, mVar3};
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
