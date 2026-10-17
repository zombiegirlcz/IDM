package a3f;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ANNUALLY;
    public static final d MONTHLY;
    public static final d OTHER;
    public static final d QUARTERLY;
    public static final d SEMI_ANNUALLY;

    static {
        d dVar = new d("MONTHLY", 0);
        MONTHLY = dVar;
        d dVar2 = new d("QUARTERLY", 1);
        QUARTERLY = dVar2;
        d dVar3 = new d("SEMI_ANNUALLY", 2);
        SEMI_ANNUALLY = dVar3;
        d dVar4 = new d("ANNUALLY", 3);
        ANNUALLY = dVar4;
        d dVar5 = new d("OTHER", 4);
        OTHER = dVar5;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
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
