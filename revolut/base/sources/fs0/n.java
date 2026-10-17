package fs0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n AWAITING_LONG_PRESS;
    public static final n DRAG_EXPANDING;
    public static final n HANDLE_DRAGGING;
    public static final n IDLE;
    public static final n SELECTION_ANCHORED;

    static {
        n nVar = new n("IDLE", 0);
        IDLE = nVar;
        n nVar2 = new n("AWAITING_LONG_PRESS", 1);
        AWAITING_LONG_PRESS = nVar2;
        n nVar3 = new n("SELECTION_ANCHORED", 2);
        SELECTION_ANCHORED = nVar3;
        n nVar4 = new n("DRAG_EXPANDING", 3);
        DRAG_EXPANDING = nVar4;
        n nVar5 = new n("HANDLE_DRAGGING", 4);
        HANDLE_DRAGGING = nVar5;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5};
        $VALUES = nVarArr;
        $ENTRIES = s.n(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
