package ogd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ALPHABETICAL;
    public static final d LAST_ADDED;

    static {
        d dVar = new d("LAST_ADDED", 0);
        LAST_ADDED = dVar;
        d dVar2 = new d("ALPHABETICAL", 1);
        ALPHABETICAL = dVar2;
        d[] dVarArr = {dVar, dVar2};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
