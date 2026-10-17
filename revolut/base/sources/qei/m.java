package qei;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m CONFIRMED;
    public static final m FAILED;
    public static final m PENDING;
    public static final m UNKNOWN;

    static {
        m mVar = new m("PENDING", 0);
        PENDING = mVar;
        m mVar2 = new m("CONFIRMED", 1);
        CONFIRMED = mVar2;
        m mVar3 = new m("FAILED", 2);
        FAILED = mVar3;
        m mVar4 = new m("UNKNOWN", 3);
        UNKNOWN = mVar4;
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
