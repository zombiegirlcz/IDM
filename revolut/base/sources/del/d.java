package del;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d Alphabetical;
    public static final d Performance;
    public static final d Products;
    public static final d TotalValue;

    static {
        d dVar = new d("TotalValue", 0);
        TotalValue = dVar;
        d dVar2 = new d("Performance", 1);
        Performance = dVar2;
        d dVar3 = new d("Alphabetical", 2);
        Alphabetical = dVar3;
        d dVar4 = new d("Products", 3);
        Products = dVar4;
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
