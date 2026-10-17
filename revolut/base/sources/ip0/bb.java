package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class bb {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ bb[] $VALUES;
    public static final bb CENTER_HORIZONTAL;
    public static final bb START;

    static {
        bb bbVar = new bb("START", 0);
        START = bbVar;
        bb bbVar2 = new bb("CENTER_HORIZONTAL", 1);
        CENTER_HORIZONTAL = bbVar2;
        bb[] bbVarArr = {bbVar, bbVar2};
        $VALUES = bbVarArr;
        $ENTRIES = vc.s.n(bbVarArr);
    }

    public static bb valueOf(String str) {
        return (bb) Enum.valueOf(bb.class, str);
    }

    public static bb[] values() {
        return (bb[]) $VALUES.clone();
    }
}
