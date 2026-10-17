package zel;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f BOND;
    public static final f CFD;
    public static final f ETP;
    public static final f STOCKS;

    static {
        f fVar = new f("STOCKS", 0);
        STOCKS = fVar;
        f fVar2 = new f("ETP", 1);
        ETP = fVar2;
        f fVar3 = new f("BOND", 2);
        BOND = fVar3;
        f fVar4 = new f("CFD", 3);
        CFD = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
