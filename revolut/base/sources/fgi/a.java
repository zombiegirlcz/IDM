package fgi;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a EXPEDIA;
    public static final a NUITEE;
    public static final a UNKNOWN;
    public static final a VRBO;

    static {
        a aVar = new a("EXPEDIA", 0);
        EXPEDIA = aVar;
        a aVar2 = new a("VRBO", 1);
        VRBO = aVar2;
        a aVar3 = new a("NUITEE", 2);
        NUITEE = aVar3;
        a aVar4 = new a("UNKNOWN", 3);
        UNKNOWN = aVar4;
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
