package pu0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d BOTH;
    public static final d BOTTOM;
    public static final d NONE;
    public static final d TOP;

    static {
        d dVar = new d("TOP", 0);
        TOP = dVar;
        d dVar2 = new d("BOTTOM", 1);
        BOTTOM = dVar2;
        d dVar3 = new d("BOTH", 2);
        BOTH = dVar3;
        d dVar4 = new d("NONE", 3);
        NONE = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
