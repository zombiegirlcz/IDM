package d6e;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l JOINT;
    public static final l PERSONAL;

    static {
        l lVar = new l("PERSONAL", 0);
        PERSONAL = lVar;
        l lVar2 = new l("JOINT", 1);
        JOINT = lVar2;
        l[] lVarArr = {lVar, lVar2};
        $VALUES = lVarArr;
        $ENTRIES = vc.s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
