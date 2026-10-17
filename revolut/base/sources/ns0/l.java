package ns0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l FadeIn;
    public static final l FadeOut;
    public static final l Move;
    public static final l RollIn;
    public static final l RollOut;

    static {
        l lVar = new l("Move", 0);
        Move = lVar;
        l lVar2 = new l("FadeIn", 1);
        FadeIn = lVar2;
        l lVar3 = new l("FadeOut", 2);
        FadeOut = lVar3;
        l lVar4 = new l("RollIn", 3);
        RollIn = lVar4;
        l lVar5 = new l("RollOut", 4);
        RollOut = lVar5;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5};
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
