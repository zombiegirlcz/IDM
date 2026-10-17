package kel;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f FREE;
    public static final f HARD;
    public static final f SOFT;

    static {
        f fVar = new f("FREE", 0);
        FREE = fVar;
        f fVar2 = new f("SOFT", 1);
        SOFT = fVar2;
        f fVar3 = new f("HARD", 2);
        HARD = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
