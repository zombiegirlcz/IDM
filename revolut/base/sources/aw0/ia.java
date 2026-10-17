package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ia {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ia[] $VALUES;
    public static final ia BACKGROUND;
    public static final ia BOLD;

    static {
        ia iaVar = new ia("BOLD", 0);
        BOLD = iaVar;
        ia iaVar2 = new ia("BACKGROUND", 1);
        BACKGROUND = iaVar2;
        ia[] iaVarArr = {iaVar, iaVar2};
        $VALUES = iaVarArr;
        $ENTRIES = vc.s.n(iaVarArr);
    }

    public static ia valueOf(String str) {
        return (ia) Enum.valueOf(ia.class, str);
    }

    public static ia[] values() {
        return (ia[]) $VALUES.clone();
    }
}
