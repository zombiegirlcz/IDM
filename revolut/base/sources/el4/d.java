package el4;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ADMIN;
    public static final d CARDHOLDER;
    public static final d UNKNOWN;

    static {
        d dVar = new d("ADMIN", 0);
        ADMIN = dVar;
        d dVar2 = new d("CARDHOLDER", 1);
        CARDHOLDER = dVar2;
        d dVar3 = new d("UNKNOWN", 2);
        UNKNOWN = dVar3;
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
