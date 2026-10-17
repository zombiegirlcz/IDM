package sr6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m ON_DUE_DATE;
    public static final m SEVEN_DAYS_BEFORE_DUE_DATE;
    public static final m THREE_DAYS_AFTER_DUE_DATE;

    static {
        m mVar = new m("SEVEN_DAYS_BEFORE_DUE_DATE", 0);
        SEVEN_DAYS_BEFORE_DUE_DATE = mVar;
        m mVar2 = new m("ON_DUE_DATE", 1);
        ON_DUE_DATE = mVar2;
        m mVar3 = new m("THREE_DAYS_AFTER_DUE_DATE", 2);
        THREE_DAYS_AFTER_DUE_DATE = mVar3;
        m[] mVarArr = {mVar, mVar2, mVar3};
        $VALUES = mVarArr;
        $ENTRIES = s.n(mVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
