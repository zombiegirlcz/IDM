package azl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m CLOSE;
    public static final m CLOSING;
    public static final m CLOSING_MANUALLY;
    public static final m DRAG_FULLY_OPENED;
    public static final m OPEN;
    public static final m OPENING;

    static {
        m mVar = new m("CLOSE", 0);
        CLOSE = mVar;
        m mVar2 = new m("CLOSING", 1);
        CLOSING = mVar2;
        m mVar3 = new m("CLOSING_MANUALLY", 2);
        CLOSING_MANUALLY = mVar3;
        m mVar4 = new m("OPEN", 3);
        OPEN = mVar4;
        m mVar5 = new m("OPENING", 4);
        OPENING = mVar5;
        m mVar6 = new m("DRAG_FULLY_OPENED", 5);
        DRAG_FULLY_OPENED = mVar6;
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
