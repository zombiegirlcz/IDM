package yw;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e FHD;
    public static final e HD;
    public static final e HIGHEST;
    public static final e SD;
    public static final e UHD;

    static {
        e eVar = new e("SD", 0);
        SD = eVar;
        e eVar2 = new e("HD", 1);
        HD = eVar2;
        e eVar3 = new e("FHD", 2);
        FHD = eVar3;
        e eVar4 = new e("UHD", 3);
        UHD = eVar4;
        e eVar5 = new e("HIGHEST", 4);
        HIGHEST = eVar5;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
