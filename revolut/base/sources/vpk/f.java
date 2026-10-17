package vpk;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f ASK_LINE;
    public static final f BID_LINE;
    public static final f MID_CANDLE;
    public static final f MID_LINE;

    static {
        f fVar = new f("MID_LINE", 0);
        MID_LINE = fVar;
        f fVar2 = new f("BID_LINE", 1);
        BID_LINE = fVar2;
        f fVar3 = new f("ASK_LINE", 2);
        ASK_LINE = fVar3;
        f fVar4 = new f("MID_CANDLE", 3);
        MID_CANDLE = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        $VALUES = fVarArr;
        $ENTRIES = vc.s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
