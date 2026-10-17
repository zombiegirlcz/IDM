package j30;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b DISABLED;
    public static final b FULLY_ENABLED;
    public static final b PARTIALLY_ENABLED;

    static {
        b bVar = new b("DISABLED", 0);
        DISABLED = bVar;
        b bVar2 = new b("PARTIALLY_ENABLED", 1);
        PARTIALLY_ENABLED = bVar2;
        b bVar3 = new b("FULLY_ENABLED", 2);
        FULLY_ENABLED = bVar3;
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
