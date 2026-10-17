package sp0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l DARK_TO_LIGHT;
    public static final l LIGHT_TO_DARK;
    public static final l LIGHT_TO_DARK_TO_LIGHT;

    static {
        l lVar = new l("LIGHT_TO_DARK", 0);
        LIGHT_TO_DARK = lVar;
        l lVar2 = new l("DARK_TO_LIGHT", 1);
        DARK_TO_LIGHT = lVar2;
        l lVar3 = new l("LIGHT_TO_DARK_TO_LIGHT", 2);
        LIGHT_TO_DARK_TO_LIGHT = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
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
