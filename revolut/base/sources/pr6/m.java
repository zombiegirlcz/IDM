package pr6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m ACTIVE;
    public static final m CREATED;
    public static final m FAILED;
    public static final m RELEASED;

    static {
        m mVar = new m("CREATED", 0);
        CREATED = mVar;
        m mVar2 = new m("ACTIVE", 1);
        ACTIVE = mVar2;
        m mVar3 = new m("RELEASED", 2);
        RELEASED = mVar3;
        m mVar4 = new m("FAILED", 3);
        FAILED = mVar4;
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
