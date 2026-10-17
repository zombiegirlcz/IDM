package ncd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m ACTIVE;
    public static final m INACTIVE;
    public static final m SUSPENDED;

    static {
        m mVar = new m("ACTIVE", 0);
        ACTIVE = mVar;
        m mVar2 = new m("INACTIVE", 1);
        INACTIVE = mVar2;
        m mVar3 = new m("SUSPENDED", 2);
        SUSPENDED = mVar3;
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
