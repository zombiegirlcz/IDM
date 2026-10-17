package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ni {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ni[] $VALUES;

    @yhm.d
    public static final ni DARK;

    @yhm.d
    public static final ni LIGHT;
    public static final ni WIDGET;
    public static final ni WINDOW;

    static {
        ni niVar = new ni("LIGHT", 0);
        LIGHT = niVar;
        ni niVar2 = new ni("WIDGET", 1);
        WIDGET = niVar2;
        ni niVar3 = new ni("DARK", 2);
        DARK = niVar3;
        ni niVar4 = new ni("WINDOW", 3);
        WINDOW = niVar4;
        ni[] niVarArr = {niVar, niVar2, niVar3, niVar4};
        $VALUES = niVarArr;
        $ENTRIES = vc.s.n(niVarArr);
    }

    public static ni valueOf(String str) {
        return (ni) Enum.valueOf(ni.class, str);
    }

    public static ni[] values() {
        return (ni[]) $VALUES.clone();
    }
}
