package j00;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BLUR;
    public static final a BRIGHT;
    public static final a DARK;
    public static final a GLARE;

    static {
        a aVar = new a("BLUR", 0);
        BLUR = aVar;
        a aVar2 = new a("DARK", 1);
        DARK = aVar2;
        a aVar3 = new a("BRIGHT", 2);
        BRIGHT = aVar3;
        a aVar4 = new a("GLARE", 3);
        GLARE = aVar4;
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
