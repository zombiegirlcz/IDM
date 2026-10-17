package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ju {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ju[] $VALUES;
    public static final ju NO_BLUR;
    public static final ju PROGRESSIVE_BLUR;

    static {
        ju juVar = new ju("NO_BLUR", 0);
        NO_BLUR = juVar;
        ju juVar2 = new ju("PROGRESSIVE_BLUR", 1);
        PROGRESSIVE_BLUR = juVar2;
        ju[] juVarArr = {juVar, juVar2};
        $VALUES = juVarArr;
        $ENTRIES = vc.s.n(juVarArr);
    }

    public static ju valueOf(String str) {
        return (ju) Enum.valueOf(ju.class, str);
    }

    public static ju[] values() {
        return (ju[]) $VALUES.clone();
    }
}
