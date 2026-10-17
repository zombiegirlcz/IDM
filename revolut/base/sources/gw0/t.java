package gw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t FIRST;
    public static final t LAST;
    public static final t MIDDLE;
    public static final t SINGLE;
    public static final t SINGLE_TAIL;
    private final boolean hasTail;

    static {
        t tVar = new t("FIRST", 0, false);
        FIRST = tVar;
        t tVar2 = new t("MIDDLE", 1, false);
        MIDDLE = tVar2;
        t tVar3 = new t("LAST", 2, true);
        LAST = tVar3;
        t tVar4 = new t("SINGLE", 3, false);
        SINGLE = tVar4;
        t tVar5 = new t("SINGLE_TAIL", 4, true);
        SINGLE_TAIL = tVar5;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4, tVar5};
        $VALUES = tVarArr;
        $ENTRIES = vc.s.n(tVarArr);
    }

    public t(String str, int i, boolean z) {
        this.hasTail = z;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.hasTail;
    }
}
