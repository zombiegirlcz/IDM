package xjb;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b NOT_ELIGIBLE_FOR_PRIZES;
    public static final b ON_TRACK;
    public static final b PAUSED;
    public static final b TWO_WEEKS_IN_DANGER;
    public static final b WEEK_IN_DANGER;

    static {
        b bVar = new b("PAUSED", 0);
        PAUSED = bVar;
        b bVar2 = new b("ON_TRACK", 1);
        ON_TRACK = bVar2;
        b bVar3 = new b("WEEK_IN_DANGER", 2);
        WEEK_IN_DANGER = bVar3;
        b bVar4 = new b("TWO_WEEKS_IN_DANGER", 3);
        TWO_WEEKS_IN_DANGER = bVar4;
        b bVar5 = new b("NOT_ELIGIBLE_FOR_PRIZES", 4);
        NOT_ELIGIBLE_FOR_PRIZES = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
