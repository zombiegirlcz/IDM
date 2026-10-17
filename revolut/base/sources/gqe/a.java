package gqe;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DETAILS;
    public static final a MANAGE;
    public static final a SEND_MONEY;
    public static final a STATEMENT;

    static {
        a aVar = new a("SEND_MONEY", 0);
        SEND_MONEY = aVar;
        a aVar2 = new a("DETAILS", 1);
        DETAILS = aVar2;
        a aVar3 = new a("MANAGE", 2);
        MANAGE = aVar3;
        a aVar4 = new a("STATEMENT", 3);
        STATEMENT = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
