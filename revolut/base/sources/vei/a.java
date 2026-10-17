package vei;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a METAL;
    public static final a PLUS;
    public static final a PREMIUM;
    public static final a STANDARD;
    public static final a ULTRA;

    static {
        a aVar = new a("STANDARD", 0);
        STANDARD = aVar;
        a aVar2 = new a("PLUS", 1);
        PLUS = aVar2;
        a aVar3 = new a("PREMIUM", 2);
        PREMIUM = aVar3;
        a aVar4 = new a("METAL", 3);
        METAL = aVar4;
        a aVar5 = new a("ULTRA", 4);
        ULTRA = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
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
