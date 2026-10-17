package fmg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class w {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w CONTENT_IMAGE;
    public static final w CONTENT_PROGRESS;

    static {
        w wVar = new w("CONTENT_IMAGE", 0);
        CONTENT_IMAGE = wVar;
        w wVar2 = new w("CONTENT_PROGRESS", 1);
        CONTENT_PROGRESS = wVar2;
        w[] wVarArr = {wVar, wVar2};
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
