package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class yg {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ yg[] $VALUES;
    public static final yg DEFAULT;
    public static final yg NO_HEADER_IMAGE;

    static {
        yg ygVar = new yg("DEFAULT", 0);
        DEFAULT = ygVar;
        yg ygVar2 = new yg("NO_HEADER_IMAGE", 1);
        NO_HEADER_IMAGE = ygVar2;
        yg[] ygVarArr = {ygVar, ygVar2};
        $VALUES = ygVarArr;
        $ENTRIES = vc.s.n(ygVarArr);
    }

    public static yg valueOf(String str) {
        return (yg) Enum.valueOf(yg.class, str);
    }

    public static yg[] values() {
        return (yg[]) $VALUES.clone();
    }
}
