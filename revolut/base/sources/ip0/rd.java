package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class rd {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ rd[] $VALUES;
    public static final rd LARGE;
    public static final rd SMALL;

    static {
        rd rdVar = new rd("LARGE", 0);
        LARGE = rdVar;
        rd rdVar2 = new rd("SMALL", 1);
        SMALL = rdVar2;
        rd[] rdVarArr = {rdVar, rdVar2};
        $VALUES = rdVarArr;
        $ENTRIES = vc.s.n(rdVarArr);
    }

    public static rd valueOf(String str) {
        return (rd) Enum.valueOf(rd.class, str);
    }

    public static rd[] values() {
        return (rd[]) $VALUES.clone();
    }
}
