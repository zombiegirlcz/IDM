package zyl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ANCHORED;
    public static final c COLLAPSED;
    public static final c DRAGGING;
    public static final c EXPANDED;
    public static final c HIDDEN;
    public static final c SETTLING;

    static {
        c cVar = new c("EXPANDED", 0);
        EXPANDED = cVar;
        c cVar2 = new c("COLLAPSED", 1);
        COLLAPSED = cVar2;
        c cVar3 = new c("HIDDEN", 2);
        HIDDEN = cVar3;
        c cVar4 = new c("ANCHORED", 3);
        ANCHORED = cVar4;
        c cVar5 = new c("DRAGGING", 4);
        DRAGGING = cVar5;
        c cVar6 = new c("SETTLING", 5);
        SETTLING = cVar6;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
