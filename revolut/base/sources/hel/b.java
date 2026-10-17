package hel;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b AU;
    public static final b BR;
    public static final b EEA;
    public static final b GB;
    public static final b MX;
    public static final b SG;
    public static final b US;

    static {
        b bVar = new b("US", 0);
        US = bVar;
        b bVar2 = new b("GB", 1);
        GB = bVar2;
        b bVar3 = new b("AU", 2);
        AU = bVar3;
        b bVar4 = new b("EEA", 3);
        EEA = bVar4;
        b bVar5 = new b("SG", 4);
        SG = bVar5;
        b bVar6 = new b("MX", 5);
        MX = bVar6;
        b bVar7 = new b("BR", 6);
        BR = bVar7;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
