package wtd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b COMPLETED;
    public static final b REQUESTED;
    public static final b UNKNOWN;

    static {
        b bVar = new b("REQUESTED", 0);
        REQUESTED = bVar;
        b bVar2 = new b("COMPLETED", 1);
        COMPLETED = bVar2;
        b bVar3 = new b("UNKNOWN", 2);
        UNKNOWN = bVar3;
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
