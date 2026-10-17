package l1g;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ADDITIONAL_INFORMATION;
    public static final c DEPARTURE_AND_RETURN;
    public static final c DESCRIPTION;
    public static final c FEATURES;

    static {
        c cVar = new c("ADDITIONAL_INFORMATION", 0);
        ADDITIONAL_INFORMATION = cVar;
        c cVar2 = new c("FEATURES", 1);
        FEATURES = cVar2;
        c cVar3 = new c("DESCRIPTION", 2);
        DESCRIPTION = cVar3;
        c cVar4 = new c("DEPARTURE_AND_RETURN", 3);
        DEPARTURE_AND_RETURN = cVar4;
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
