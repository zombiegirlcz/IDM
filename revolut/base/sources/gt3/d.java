package gt3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class d implements f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d HOME_IMPROVEMENT;
    public static final d LOAN;
    public static final d REFINANCING;

    static {
        d dVar = new d("LOAN", 0);
        LOAN = dVar;
        d dVar2 = new d("REFINANCING", 1);
        REFINANCING = dVar2;
        d dVar3 = new d("HOME_IMPROVEMENT", 2);
        HOME_IMPROVEMENT = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
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
