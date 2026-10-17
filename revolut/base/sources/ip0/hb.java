package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class hb {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ hb[] $VALUES;
    public static final hb CENTER_HORIZONTAL;
    public static final hb START;
    private final int androidGravity;

    static {
        hb hbVar = new hb("START", 0, 8388611);
        START = hbVar;
        hb hbVar2 = new hb("CENTER_HORIZONTAL", 1, 1);
        CENTER_HORIZONTAL = hbVar2;
        hb[] hbVarArr = {hbVar, hbVar2};
        $VALUES = hbVarArr;
        $ENTRIES = vc.s.n(hbVarArr);
    }

    public hb(String str, int i, int i2) {
        this.androidGravity = i2;
    }

    public static hb valueOf(String str) {
        return (hb) Enum.valueOf(hb.class, str);
    }

    public static hb[] values() {
        return (hb[]) $VALUES.clone();
    }

    public final int a() {
        return this.androidGravity;
    }
}
