package ggc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m ACTIVATED;
    public static final m NOT_ACTIVATED;
    public static final m REACTIVATION_REQUIRED;

    static {
        m mVar = new m("ACTIVATED", 0);
        ACTIVATED = mVar;
        m mVar2 = new m("REACTIVATION_REQUIRED", 1);
        REACTIVATION_REQUIRED = mVar2;
        m mVar3 = new m("NOT_ACTIVATED", 2);
        NOT_ACTIVATED = mVar3;
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
