package fh0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BARCODE;
    public static final b TEXT_RECOGNITION;
    public static final b TEXT_RECOGNITION_JAPANESE;

    static {
        b bVar = new b("BARCODE", 0);
        BARCODE = bVar;
        b bVar2 = new b("TEXT_RECOGNITION", 1);
        TEXT_RECOGNITION = bVar2;
        b bVar3 = new b("TEXT_RECOGNITION_JAPANESE", 2);
        TEXT_RECOGNITION_JAPANESE = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
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
