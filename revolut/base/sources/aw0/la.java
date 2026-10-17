package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class la {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ la[] $VALUES;
    public static final la FULL;
    public static final la SHORT;

    static {
        la laVar = new la("SHORT", 0);
        SHORT = laVar;
        la laVar2 = new la("FULL", 1);
        FULL = laVar2;
        la[] laVarArr = {laVar, laVar2};
        $VALUES = laVarArr;
        $ENTRIES = vc.s.n(laVarArr);
    }

    public static la valueOf(String str) {
        return (la) Enum.valueOf(la.class, str);
    }

    public static la[] values() {
        return (la[]) $VALUES.clone();
    }
}
