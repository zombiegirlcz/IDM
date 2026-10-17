package hfg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m COMPLETED;
    public static final m FAILED;
    public static final m IN_PROGRESS;
    public static final m UNKNOWN;

    static {
        m mVar = new m("COMPLETED", 0);
        COMPLETED = mVar;
        m mVar2 = new m("FAILED", 1);
        FAILED = mVar2;
        m mVar3 = new m("IN_PROGRESS", 2);
        IN_PROGRESS = mVar3;
        m mVar4 = new m("UNKNOWN", 3);
        UNKNOWN = mVar4;
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
