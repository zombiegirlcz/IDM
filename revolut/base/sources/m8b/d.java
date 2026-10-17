package m8b;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d IMPACT;
    public static final d OTHERS;
    public static final d OVERVIEW;
    public static final d RATIONALE;

    static {
        d dVar = new d("OVERVIEW", 0);
        OVERVIEW = dVar;
        d dVar2 = new d("IMPACT", 1);
        IMPACT = dVar2;
        d dVar3 = new d("RATIONALE", 2);
        RATIONALE = dVar3;
        d dVar4 = new d("OTHERS", 3);
        OTHERS = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
