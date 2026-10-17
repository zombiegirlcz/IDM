package q0h;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m ONE_DAY;
    public static final m ONE_MONTH;
    public static final m ONE_WEEK;
    public static final m ONE_YEAR;

    static {
        m mVar = new m("ONE_DAY", 0);
        ONE_DAY = mVar;
        m mVar2 = new m("ONE_WEEK", 1);
        ONE_WEEK = mVar2;
        m mVar3 = new m("ONE_MONTH", 2);
        ONE_MONTH = mVar3;
        m mVar4 = new m("ONE_YEAR", 3);
        ONE_YEAR = mVar4;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4};
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
