package ew9;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DETAILS;
    public static final a QR_SCANNER;
    public static final a USERNAME;

    static {
        a aVar = new a("DETAILS", 0);
        DETAILS = aVar;
        a aVar2 = new a("USERNAME", 1);
        USERNAME = aVar2;
        a aVar3 = new a("QR_SCANNER", 2);
        QR_SCANNER = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
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
