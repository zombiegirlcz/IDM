package cr0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ANCHORED;
    public static final h COLLAPSED;
    public static final h DRAGGING;
    public static final h EXPANDED;
    public static final h HIDDEN;
    public static final h SETTLING;

    static {
        h hVar = new h("EXPANDED", 0);
        EXPANDED = hVar;
        h hVar2 = new h("COLLAPSED", 1);
        COLLAPSED = hVar2;
        h hVar3 = new h("HIDDEN", 2);
        HIDDEN = hVar3;
        h hVar4 = new h("ANCHORED", 3);
        ANCHORED = hVar4;
        h hVar5 = new h("DRAGGING", 4);
        DRAGGING = hVar5;
        h hVar6 = new h("SETTLING", 5);
        SETTLING = hVar6;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
