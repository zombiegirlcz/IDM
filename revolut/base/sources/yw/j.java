package yw;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j BEST_LOSSLESS;
    public static final j LOSSY;
    public static final j PNG;

    static {
        j jVar = new j("LOSSY", 0);
        LOSSY = jVar;
        j jVar2 = new j("BEST_LOSSLESS", 1);
        BEST_LOSSLESS = jVar2;
        j jVar3 = new j("PNG", 2);
        PNG = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
