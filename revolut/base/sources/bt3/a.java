package bt3;

import kotlin.enums.EnumEntries;
import ks3.c;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class a implements c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CHECKING;
    public static final a FAILED;
    public static final a PARTNER_DECLINED;
    public static final a PARTNER_NOT_MATCHED;
    public static final a WAITING;

    static {
        a aVar = new a("FAILED", 0);
        FAILED = aVar;
        a aVar2 = new a("WAITING", 1);
        WAITING = aVar2;
        a aVar3 = new a("PARTNER_NOT_MATCHED", 2);
        PARTNER_NOT_MATCHED = aVar3;
        a aVar4 = new a("PARTNER_DECLINED", 3);
        PARTNER_DECLINED = aVar4;
        a aVar5 = new a("CHECKING", 4);
        CHECKING = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
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
