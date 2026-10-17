package h1k;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m PREVIOUS;
    public static final m TODAY;
    public static final m YESTERDAY;

    static {
        m mVar = new m("TODAY", 0);
        TODAY = mVar;
        m mVar2 = new m("YESTERDAY", 1);
        YESTERDAY = mVar2;
        m mVar3 = new m("PREVIOUS", 2);
        PREVIOUS = mVar3;
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
