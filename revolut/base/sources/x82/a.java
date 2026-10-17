package x82;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACTIVE_ATM;
    public static final a ACTIVE_CANCEL;
    public static final a ACTIVE_INSTRUCTIONS;
    public static final a HELP;

    static {
        a aVar = new a("ACTIVE_INSTRUCTIONS", 0);
        ACTIVE_INSTRUCTIONS = aVar;
        a aVar2 = new a("ACTIVE_ATM", 1);
        ACTIVE_ATM = aVar2;
        a aVar3 = new a("ACTIVE_CANCEL", 2);
        ACTIVE_CANCEL = aVar3;
        a aVar4 = new a("HELP", 3);
        HELP = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
