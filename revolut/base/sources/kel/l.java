package kel;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l ACTIVE;
    public static final l CREATED;
    public static final l DECLINED;
    public static final l TERMINATED;
    public static final l TRADED;

    static {
        l lVar = new l("CREATED", 0);
        CREATED = lVar;
        l lVar2 = new l("ACTIVE", 1);
        ACTIVE = lVar2;
        l lVar3 = new l("TRADED", 2);
        TRADED = lVar3;
        l lVar4 = new l("TERMINATED", 3);
        TERMINATED = lVar4;
        l lVar5 = new l("DECLINED", 4);
        DECLINED = lVar5;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5};
        $VALUES = lVarArr;
        $ENTRIES = s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
