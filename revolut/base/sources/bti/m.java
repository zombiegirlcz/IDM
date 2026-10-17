package bti;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m CODE;
    public static final m IMAGE;
    public static final m NONE;
    public static final m UNKNOWN;

    static {
        m mVar = new m("CODE", 0);
        CODE = mVar;
        m mVar2 = new m("IMAGE", 1);
        IMAGE = mVar2;
        m mVar3 = new m("NONE", 2);
        NONE = mVar3;
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
