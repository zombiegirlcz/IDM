package otc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b INVEST;
    public static final b RETAIL;
    public static final b REVOLUT_X;

    static {
        b bVar = new b("RETAIL", 0);
        RETAIL = bVar;
        b bVar2 = new b("REVOLUT_X", 1);
        REVOLUT_X = bVar2;
        b bVar3 = new b("INVEST", 2);
        INVEST = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
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
