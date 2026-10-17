package b99;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b OCCUPATION;
    public static final b PLACE_OF_BIRTH;
    public static final b QES;
    public static final b TERMS;

    static {
        b bVar = new b("OCCUPATION", 0);
        OCCUPATION = bVar;
        b bVar2 = new b("PLACE_OF_BIRTH", 1);
        PLACE_OF_BIRTH = bVar2;
        b bVar3 = new b("QES", 2);
        QES = bVar3;
        b bVar4 = new b("TERMS", 3);
        TERMS = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
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
