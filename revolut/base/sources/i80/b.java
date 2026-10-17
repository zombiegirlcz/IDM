package i80;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BARCODE_CODE_128;
    public static final b BARCODE_CODE_39;
    public static final b BARCODE_EAN_13;
    public static final b QR_CODE;

    static {
        b bVar = new b("QR_CODE", 0);
        QR_CODE = bVar;
        b bVar2 = new b("BARCODE_CODE_39", 1);
        BARCODE_CODE_39 = bVar2;
        b bVar3 = new b("BARCODE_CODE_128", 2);
        BARCODE_CODE_128 = bVar3;
        b bVar4 = new b("BARCODE_EAN_13", 3);
        BARCODE_EAN_13 = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
