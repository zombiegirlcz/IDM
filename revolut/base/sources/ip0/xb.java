package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class xb {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ xb[] $VALUES;
    public static final xb CENTER;
    public static final xb END;
    public static final xb START;
    private final int value;

    static {
        xb xbVar = new xb("START", 0, 8388611);
        START = xbVar;
        xb xbVar2 = new xb("CENTER", 1, 1);
        CENTER = xbVar2;
        xb xbVar3 = new xb("END", 2, 8388613);
        END = xbVar3;
        xb[] xbVarArr = {xbVar, xbVar2, xbVar3};
        $VALUES = xbVarArr;
        $ENTRIES = vc.s.n(xbVarArr);
    }

    public xb(String str, int i, int i2) {
        this.value = i2;
    }

    public static xb valueOf(String str) {
        return (xb) Enum.valueOf(xb.class, str);
    }

    public static xb[] values() {
        return (xb[]) $VALUES.clone();
    }

    public final int a() {
        return this.value;
    }
}
