package q6c;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m AUTHORISED;
    public static final m CANCELLED;
    public static final m COMPLETED;
    public static final m FAILED;
    public static final m PENDING;
    public static final m PROCESSING;

    static {
        m mVar = new m("PENDING", 0);
        PENDING = mVar;
        m mVar2 = new m("PROCESSING", 1);
        PROCESSING = mVar2;
        m mVar3 = new m("AUTHORISED", 2);
        AUTHORISED = mVar3;
        m mVar4 = new m("COMPLETED", 3);
        COMPLETED = mVar4;
        m mVar5 = new m("CANCELLED", 4);
        CANCELLED = mVar5;
        m mVar6 = new m("FAILED", 5);
        FAILED = mVar6;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5, mVar6};
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
