package jyg;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ALL;
    public static final a CRYPTO;
    public static final a INVEST;
    public static final a JISA;

    static {
        a aVar = new a("ALL", 0);
        ALL = aVar;
        a aVar2 = new a("CRYPTO", 1);
        CRYPTO = aVar2;
        a aVar3 = new a("INVEST", 2);
        INVEST = aVar3;
        a aVar4 = new a("JISA", 3);
        JISA = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
