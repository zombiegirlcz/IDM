package ts0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i FULL;
    public static final i HORIZONTAL;
    private final boolean drawVerticalLines;

    static {
        i iVar = new i("FULL", 0, true);
        FULL = iVar;
        i iVar2 = new i("HORIZONTAL", 1, false);
        HORIZONTAL = iVar2;
        i[] iVarArr = {iVar, iVar2};
        $VALUES = iVarArr;
        $ENTRIES = vc.s.n(iVarArr);
    }

    public i(String str, int i, boolean z) {
        this.drawVerticalLines = z;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.drawVerticalLines;
    }
}
