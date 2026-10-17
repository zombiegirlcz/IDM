package uz;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class w {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w CAPTURE;
    public static final w FACE_MATCH;
    public static final w FRAME;

    static {
        w wVar = new w("FACE_MATCH", 0);
        FACE_MATCH = wVar;
        w wVar2 = new w("CAPTURE", 1);
        CAPTURE = wVar2;
        w wVar3 = new w("FRAME", 2);
        FRAME = wVar3;
        w[] wVarArr = {wVar, wVar2, wVar3};
        $VALUES = wVarArr;
        $ENTRIES = vc.s.n(wVarArr);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}
