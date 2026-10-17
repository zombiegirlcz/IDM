package tv;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m GUIDANCE;
    public static final m NEUTRAL;
    public static final m PROBLEM;

    static {
        m mVar = new m("GUIDANCE", 0);
        GUIDANCE = mVar;
        m mVar2 = new m("PROBLEM", 1);
        PROBLEM = mVar2;
        m mVar3 = new m("NEUTRAL", 2);
        NEUTRAL = mVar3;
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
