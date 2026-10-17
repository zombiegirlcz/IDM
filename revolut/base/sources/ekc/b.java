package ekc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b NEEDS_AUTOMATIC;
    public static final b NEEDS_MANUAL;
    public static final b NOT_NEEDED;

    static {
        b bVar = new b("NOT_NEEDED", 0);
        NOT_NEEDED = bVar;
        b bVar2 = new b("NEEDS_AUTOMATIC", 1);
        NEEDS_AUTOMATIC = bVar2;
        b bVar3 = new b("NEEDS_MANUAL", 2);
        NEEDS_MANUAL = bVar3;
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
