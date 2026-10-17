package md6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f AGGREGATED;
    public static final f SIMPLE;

    static {
        f fVar = new f("SIMPLE", 0);
        SIMPLE = fVar;
        f fVar2 = new f("AGGREGATED", 1);
        AGGREGATED = fVar2;
        f[] fVarArr = {fVar, fVar2};
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
