package sr6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o ACTIVE;
    public static final o AVAILABLE;
    public static final o PENDING;
    public static final o UNAVAILABLE;

    static {
        o oVar = new o("ACTIVE", 0);
        ACTIVE = oVar;
        o oVar2 = new o("PENDING", 1);
        PENDING = oVar2;
        o oVar3 = new o("AVAILABLE", 2);
        AVAILABLE = oVar3;
        o oVar4 = new o("UNAVAILABLE", 3);
        UNAVAILABLE = oVar4;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4};
        $VALUES = oVarArr;
        $ENTRIES = s.n(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
