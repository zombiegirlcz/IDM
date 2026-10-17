package ql4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d APR;
    public static final d CAT;
    public static final d TEC;
    public static final d UNKNOWN;

    static {
        d dVar = new d("APR", 0);
        APR = dVar;
        d dVar2 = new d("CAT", 1);
        CAT = dVar2;
        d dVar3 = new d("TEC", 2);
        TEC = dVar3;
        d dVar4 = new d("UNKNOWN", 3);
        UNKNOWN = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
