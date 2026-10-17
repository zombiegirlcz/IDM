package l4a;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a FREELANCER;
    public static final a ONBOARD_FREELANCER;
    public static final a REQUEST_MONEY;
    public static final a SEND_MONEY;

    static {
        a aVar = new a("SEND_MONEY", 0);
        SEND_MONEY = aVar;
        a aVar2 = new a("REQUEST_MONEY", 1);
        REQUEST_MONEY = aVar2;
        a aVar3 = new a("FREELANCER", 2);
        FREELANCER = aVar3;
        a aVar4 = new a("ONBOARD_FREELANCER", 3);
        ONBOARD_FREELANCER = aVar4;
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
