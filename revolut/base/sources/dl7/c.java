package dl7;

import java.io.Serializable;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements Serializable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CANCELLATION_FOR_ANY_CAUSE;
    public static final c EVERYDAY_PROTECTION;
    public static final c TRAVEL_INSURANCE;
    public static final c UNKNOWN;

    static {
        c cVar = new c("TRAVEL_INSURANCE", 0);
        TRAVEL_INSURANCE = cVar;
        c cVar2 = new c("EVERYDAY_PROTECTION", 1);
        EVERYDAY_PROTECTION = cVar2;
        c cVar3 = new c("CANCELLATION_FOR_ANY_CAUSE", 2);
        CANCELLATION_FOR_ANY_CAUSE = cVar3;
        c cVar4 = new c("UNKNOWN", 3);
        UNKNOWN = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
