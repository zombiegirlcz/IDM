package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class bw {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ bw[] $VALUES;
    public static final bw COMPACT;
    public static final bw LARGE;

    static {
        bw bwVar = new bw("COMPACT", 0);
        COMPACT = bwVar;
        bw bwVar2 = new bw("LARGE", 1);
        LARGE = bwVar2;
        bw[] bwVarArr = {bwVar, bwVar2};
        $VALUES = bwVarArr;
        $ENTRIES = vc.s.n(bwVarArr);
    }

    public static bw valueOf(String str) {
        return (bw) Enum.valueOf(bw.class, str);
    }

    public static bw[] values() {
        return (bw[]) $VALUES.clone();
    }
}
