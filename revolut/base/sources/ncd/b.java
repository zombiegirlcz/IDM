package ncd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CHECK_VERIFICATION;
    public static final b GLOBE;
    public static final b REFINANCING;
    public static final b UNKNOWN;

    static {
        b bVar = new b("CHECK_VERIFICATION", 0);
        CHECK_VERIFICATION = bVar;
        b bVar2 = new b("GLOBE", 1);
        GLOBE = bVar2;
        b bVar3 = new b("REFINANCING", 2);
        REFINANCING = bVar3;
        b bVar4 = new b("UNKNOWN", 3);
        UNKNOWN = bVar4;
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
