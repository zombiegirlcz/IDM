package r5b;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m COMPLETED;
    public static final m PENDING;
    public static final m UNKNOWN;

    static {
        m mVar = new m("PENDING", 0);
        PENDING = mVar;
        m mVar2 = new m("COMPLETED", 1);
        COMPLETED = mVar2;
        m mVar3 = new m("UNKNOWN", 2);
        UNKNOWN = mVar3;
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
