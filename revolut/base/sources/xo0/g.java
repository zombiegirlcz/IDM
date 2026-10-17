package xo0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g INCOMING;
    public static final g INCOMING_FIRST;
    public static final g INCOMING_LAST;
    public static final g INCOMING_MIDDLE;
    public static final g INCOMING_TAIL;
    public static final g INCOMING_UNCONTAINED;
    public static final g OUTGOING;
    public static final g OUTGOING_FIRST;
    public static final g OUTGOING_LAST;
    public static final g OUTGOING_MIDDLE;
    public static final g OUTGOING_TAIL;
    public static final g OUTGOING_UNCONTAINED;
    private final boolean hasTail;

    static {
        g gVar = new g("INCOMING", 0, false);
        INCOMING = gVar;
        g gVar2 = new g("INCOMING_TAIL", 1, true);
        INCOMING_TAIL = gVar2;
        g gVar3 = new g("INCOMING_FIRST", 2, false);
        INCOMING_FIRST = gVar3;
        g gVar4 = new g("INCOMING_MIDDLE", 3, false);
        INCOMING_MIDDLE = gVar4;
        g gVar5 = new g("INCOMING_LAST", 4, true);
        INCOMING_LAST = gVar5;
        g gVar6 = new g("INCOMING_UNCONTAINED", 5, false);
        INCOMING_UNCONTAINED = gVar6;
        g gVar7 = new g("OUTGOING", 6, false);
        OUTGOING = gVar7;
        g gVar8 = new g("OUTGOING_TAIL", 7, true);
        OUTGOING_TAIL = gVar8;
        g gVar9 = new g("OUTGOING_FIRST", 8, false);
        OUTGOING_FIRST = gVar9;
        g gVar10 = new g("OUTGOING_MIDDLE", 9, false);
        OUTGOING_MIDDLE = gVar10;
        g gVar11 = new g("OUTGOING_LAST", 10, true);
        OUTGOING_LAST = gVar11;
        g gVar12 = new g("OUTGOING_UNCONTAINED", 11, false);
        OUTGOING_UNCONTAINED = gVar12;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
    }

    public g(String str, int i, boolean z) {
        this.hasTail = z;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final boolean b() {
        return this.hasTail;
    }
}
