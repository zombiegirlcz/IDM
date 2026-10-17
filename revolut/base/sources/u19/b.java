package u19;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b LIFESTYLE;
    public static final b NOT_AVAILABLE;
    public static final b POINTS;

    static {
        b bVar = new b("LIFESTYLE", 0);
        LIFESTYLE = bVar;
        b bVar2 = new b("POINTS", 1);
        POINTS = bVar2;
        b bVar3 = new b("NOT_AVAILABLE", 2);
        NOT_AVAILABLE = bVar3;
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
