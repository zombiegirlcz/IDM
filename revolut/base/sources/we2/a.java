package we2;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a QR_SCAN;
    public static final a QR_UPLOAD;
    public static final a REGULAR;

    static {
        a aVar = new a("QR_SCAN", 0);
        QR_SCAN = aVar;
        a aVar2 = new a("QR_UPLOAD", 1);
        QR_UPLOAD = aVar2;
        a aVar3 = new a("REGULAR", 2);
        REGULAR = aVar3;
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
