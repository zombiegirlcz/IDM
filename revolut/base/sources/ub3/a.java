package ub3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DepositCash;
    public static final a Navigate;
    public static final a SelectLocation;
    public static final a ShowBarcode;

    static {
        a aVar = new a("DepositCash", 0);
        DepositCash = aVar;
        a aVar2 = new a("ShowBarcode", 1);
        ShowBarcode = aVar2;
        a aVar3 = new a("Navigate", 2);
        Navigate = aVar3;
        a aVar4 = new a("SelectLocation", 3);
        SelectLocation = aVar4;
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
