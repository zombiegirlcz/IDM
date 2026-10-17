package cd7;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m Joint;
    public static final m Personal;

    static {
        m mVar = new m("Personal", 0);
        Personal = mVar;
        m mVar2 = new m("Joint", 1);
        Joint = mVar2;
        m[] mVarArr = {mVar, mVar2};
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
