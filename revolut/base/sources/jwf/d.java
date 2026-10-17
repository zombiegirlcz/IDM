package jwf;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CHOOSE_CITY;
    public static final d PERMISSION;
    public static final d RETRY;

    static {
        d dVar = new d("RETRY", 0);
        RETRY = dVar;
        d dVar2 = new d("PERMISSION", 1);
        PERMISSION = dVar2;
        d dVar3 = new d("CHOOSE_CITY", 2);
        CHOOSE_CITY = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
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
