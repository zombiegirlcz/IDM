package ll4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m CHANGE_DUE_DATE_BUTTON;
    public static final m INSTALMENTS_BUTTON;

    static {
        m mVar = new m("INSTALMENTS_BUTTON", 0);
        INSTALMENTS_BUTTON = mVar;
        m mVar2 = new m("CHANGE_DUE_DATE_BUTTON", 1);
        CHANGE_DUE_DATE_BUTTON = mVar2;
        m[] mVarArr = {mVar, mVar2};
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
