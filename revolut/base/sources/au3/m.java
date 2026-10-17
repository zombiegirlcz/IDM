package au3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m SUBSCRIBED;
    public static final m UNKNOWN;
    public static final m UNSUBSCRIBED;

    static {
        m mVar = new m("SUBSCRIBED", 0);
        SUBSCRIBED = mVar;
        m mVar2 = new m("UNSUBSCRIBED", 1);
        UNSUBSCRIBED = mVar2;
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
