package tvb;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d COMPLETED;
    public static final d PENDING;
    public static final d UNKNOWN;
    public static final d USED;

    static {
        d dVar = new d("PENDING", 0);
        PENDING = dVar;
        d dVar2 = new d("COMPLETED", 1);
        COMPLETED = dVar2;
        d dVar3 = new d("USED", 2);
        USED = dVar3;
        d dVar4 = new d("UNKNOWN", 3);
        UNKNOWN = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
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
