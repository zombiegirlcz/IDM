package lgd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b FX;
    public static final b GENERIC_SECURITY;
    public static final b SECURITY;

    static {
        b bVar = new b("GENERIC_SECURITY", 0);
        GENERIC_SECURITY = bVar;
        b bVar2 = new b("SECURITY", 1);
        SECURITY = bVar2;
        b bVar3 = new b("FX", 2);
        FX = bVar3;
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
